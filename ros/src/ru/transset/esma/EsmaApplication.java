/**
 * 
 */
package ru.transset.esma;

import java.lang.reflect.Method;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.Vector;


import ru.funsys.avalanche.Application;
import ru.funsys.avalanche.sql.Adapter;
import ru.transinfocom.erto.suik.service.LoadDataRequest;

/**
 * @author Валерий Лиховских
 *
 */
public class EsmaApplication extends Application {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2109051805575507331L;

	public static final String SQL_MAX = "sqlMax";
	public static final String SQL_UPDATE = "sqlUpdate";
	
	/**
	 * Вектор обрабатываемых типов данных 
	 */
	private Vector<TypeData> types = new Vector<TypeData>();
	
	/**
	 * Адаптер манипулятора данных 
	 */
	public Adapter database;
	
	/**
	 * Группа потоков обработки полученных типов данных 
	 */
	public ThreadGroup group = new ThreadGroup("Executers");
	
	/**
	 * Идентификатор загрузки 
	 */
	private int max;
	
	/**
	 * Счетчик завершившихся потоков 
	 */
	private int counter = 0;
	
	/**
	 * Добавляет обрабатываемый тип данных
	 * 
	 * @param name имя типа
	 * @param type экземпляр типа данных
	 * @return {@code true}, если тип данных успешно добавлен, иначе {@code false} 
	 */
	public boolean addTypeData(String name, TypeData type) {
		types.add(type);
		return true;
	}
	
	public int getMax() {
		return max;
	}
	
	private boolean isWait() {
		return counter < types.size(); 
	}
	
	/**
	 * Сохранение распарсенного запроса в структуру объектов классов в БД
	 *  
	 * @param request распарсенная структура массивов сохраняемых данных
	 */
	public void store(LoadDataRequest request) {
		if (types.size() == 0) {
			logger.warn("Список обработчиков структур пуст!");
			return;
		}
		try {
			ResultSet resultSet = database.select(getParameter(SQL_MAX).getValue(), (Object[]) null);
			if (resultSet.next()) {
				max = resultSet.getInt(1);
			}
		} catch (Exception e) {
			logger.error("Ошибка чтения идентификатора загрузки!", e);
			return;
		}
		
		for (Enumeration<TypeData> enumeration = types.elements(); enumeration.hasMoreElements(); ) {
			TypeData typeData = enumeration.nextElement();
			Thread thread = new Thread(group, new Runnable() {
				public void run() {
					execute(typeData, request);
				}
			}, Thread.currentThread().getName() + '-' + typeData.getName());
			thread.start();
		}

		while (isWait()) {
			synchronized (this) {
				try {
					wait(1500L);
				} catch (Exception e) {
				}
			}
		}
		
		try {
			database.execute(getParameter(SQL_UPDATE).getValue(), max);
			logger.info("Обработка завершена!");
		} catch (Exception e) {
			logger.error("При выполнении выражения UPDATE произошла ошибка!", e);
		}
	}

	/**
	 * Сохранить переданный в параметре тип данных в БД
	 * 
	 * @param typeData сохраняемый тип данных
	 * @param request распарсенная структура массивов сохраняемых данных
	 */
	private void execute(TypeData typeData, LoadDataRequest request) {
		logger.info("Start: " + typeData.getName());
		String name  = "get"  + toUpperFirstChar(typeData.getName());
		Class<?> classRequest = request.getClass();
		try {
			Class<?> classTypeData = typeData.getClass();
			Class<?> classApplication = getClass();
			
			Method method = classRequest.getMethod(name,  (Class[]) null);
			Object[] records = (Object[]) method.invoke(request, (Object[]) null);
			if (records != null) {
				Class<?> classObject = null;
				for (int index = 0; index < records.length; index++) {
					Vector<Object> values = new Vector<Object>();
					Object record = records[index];
					if (classObject == null) classObject = record.getClass();
					for (Enumeration<Element> e = typeData.getElements().elements(); e.hasMoreElements(); ) {
						Element element = e.nextElement();
						String nameMethod = "get" + toUpperFirstChar(element.getName());
						Method fieldMethod;
						Object value;
						switch (element.getSource()) {
						case "application":
							fieldMethod = classApplication.getMethod(nameMethod, (Class[]) null);
							value = fieldMethod.invoke(this, (Object[]) null);
							break;
						case "typeData":
							fieldMethod = classTypeData.getMethod(nameMethod, (Class[]) null);
							value = fieldMethod.invoke(typeData, (Object[]) null);
							break;
						default:
							fieldMethod = classObject.getMethod(nameMethod, (Class[]) null);
							value = fieldMethod.invoke(record, (Object[]) null);
						}
						if (value instanceof java.util.Date) {
							// преобразовать тип java.util.Date в тип java.sql.Date 
							value = new Date(((java.util.Date) value).getTime());
						}
						values.add(value);
					}
					try {
						database.execute(typeData.getSql(), values);
					} catch (Exception e) {
						StringBuilder builder = new StringBuilder();
						builder.append("Error insert record[").append(index).append("]\r\n");
						int i = 0;
						for (Enumeration<Object> v = values.elements(); v.hasMoreElements(); i++) {
							if (i > 0) builder.append(", "); 
							builder.append(v.nextElement());
						}
						logger.error(builder.toString(), e); 
					}
				}
			}
		} catch (Exception e) {
			logger.error("Error for type " + typeData.getName(), e);
		}
		logger.info("Stop: " + typeData.getName());
		counter++;
		synchronized (this) {
			notifyAll();
		}
	}
	
}

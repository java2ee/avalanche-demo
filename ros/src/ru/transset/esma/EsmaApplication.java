/**
 * 
 */
package ru.transset.esma;

import java.lang.reflect.Method;
import java.sql.Date;
import java.util.Enumeration;
import java.util.Vector;

import ru.funsys.avalanche.Application;
import ru.funsys.avalanche.sql.Adapter;
import ru.transinfocom.erto.suik.service.LoadDataRequest;

/**
 * Класс приложения, обрабатывающий полученные сервисом данные и сохраняющий их
 * в таблицы БД
 *
 * @author Валерий Лиховских
 */
public class EsmaApplication extends Application {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2109051805575507331L;

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
	
	/**
	 * Сохранение распарсенного запроса в структуру объектов классов в БД
	 *  
	 * @param request распарсенная структура массивов сохраняемых данных
	 */
	public void store(LoadDataRequest request) {
		for (Enumeration<TypeData> enumeration = types.elements(); enumeration.hasMoreElements(); ) {
			TypeData typeData = enumeration.nextElement();
			Thread thread = new Thread(group, new Runnable() {
					public void run() {
						execute(typeData, request);
					}
			    }, Thread.currentThread().getName() + '-' + typeData.getName());
			thread.start();
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
			// Метод, возвращающий массив записей типа данных
			Method method = classRequest.getMethod(name,  (Class[]) null);
			// Массив записей типа данных
			Object[] records = (Object[]) method.invoke(request, (Object[]) null);
			if (records != null) {
				Class<?> classObject = null;
				for (int index = 0; index < records.length; index++) {
					// Вектор устанавливаемых значений в SQL выражение
					Vector<Object> values = new Vector<Object>();
					Object record = records[index];
					if (classObject == null) classObject = record.getClass();
					for (Enumeration<String> e = typeData.getElements().elements(); e.hasMoreElements(); ) {
						String nameMethod = "get" + toUpperFirstChar(e.nextElement());
						Method fieldMethod = classObject.getMethod(nameMethod, (Class[]) null);
						Object value = fieldMethod.invoke(record, (Object[]) null);
						if (value instanceof java.util.Date) {
							// преобразовать тип java.util.Date в тип java.sql.Date 
							value = new Date(((java.util.Date) value).getTime());
						}
						values.add(value);
					}
					try {
						// Выполнить SQL выражение
						database.execute(typeData.getSql(), values);
					} catch (Exception e) {
						// Формирование сообщения об ошибке с подробной информацией
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
	}
	
}

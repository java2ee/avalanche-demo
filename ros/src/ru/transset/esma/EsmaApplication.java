/**
 * 
 */
package ru.transset.esma;

import java.lang.reflect.Method;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import ru.funsys.avalanche.Application;
import ru.funsys.avalanche.sql.Adapter;
import ru.transinfocom.erto.suik.service.LoadDataRequest;

/**
 * @author ������� ���������
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
	 * ������ �������������� ����� ������ 
	 */
	private Vector<TypeData> types = new Vector<TypeData>();
	
	/**
<<<<<<< HEAD
	 * ������� ������������ ������ 
=======
	 * Адаптер манипулятора данных, инициируется из файла конфигурации 
>>>>>>> branch 'master' of https://github.com/java2ee/avalanche-demo.git
	 */
	public Adapter database;
	
	/**
	 * ������ ������� ��������� ���������� ����� ������ 
	 */
	public ThreadGroup group = new ThreadGroup("Executers");
	
	/**
<<<<<<< HEAD
	 * ������������� �������� 
	 */
	private int max;
	
	/**
	 * ������� ������������� ������� 
	 */
	private int counter = 0;
	
	/**
	 * ��������� �������������� ��� ������
=======
	 * Добавляет обрабатываемый тип данных. Этот метод вызывается при обработке
	 * файла конфигурации.
>>>>>>> branch 'master' of https://github.com/java2ee/avalanche-demo.git
	 * 
	 * @param name ��� ����
	 * @param type ��������� ���� ������
	 * @return {@code true}, ���� ��� ������ ������� ��������, ����� {@code false} 
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
	 * ���������� ������������� ������� � ��������� �������� ������� � ��
	 *  
	 * @param request ������������ ��������� �������� ����������� ������
	 */
	public void store(LoadDataRequest request) {
		if (types.size() == 0) {
			logger.warn("������ ������������ �������� ����!");
			return;
		}
		try {
			ResultSet resultSet = database.select(getParameter(SQL_MAX).getValue(), (Object[]) null);
			if (resultSet.next()) {
				max = resultSet.getInt(1);
			}
		} catch (Exception e) {
			logger.error("������ ������ �������������� ��������!", e);
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
			logger.info("��������� ���������!");
		} catch (Exception e) {
			logger.error("��� ���������� ��������� UPDATE ��������� ������!", e);
		}
	}

	/**
	 * ��������� ���������� � ��������� ��� ������ � ��
	 * 
	 * @param typeData ����������� ��� ������
	 * @param request ������������ ��������� �������� ����������� ������
	 */
	private void execute(TypeData typeData, LoadDataRequest request) {
		// Поле класса logger определено в родительском классе, инициируется из файла конфигурации
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
							// ������������� ��� java.util.Date � ��� java.sql.Date 
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

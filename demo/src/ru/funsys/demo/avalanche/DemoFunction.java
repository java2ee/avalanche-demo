package ru.funsys.demo.avalanche;

import java.lang.management.ManagementFactory;
import java.util.Hashtable;

/**
 * Демонстрационный класс реализации функции
 * 
 * @author Валерий Лиховских
 */
public class DemoFunction {

	/**
	 * Конструктор класса
	 */
	public DemoFunction() {
	}

	/**
	 * Получить информацию об операционной системе.<br>
	 * <br>
	 *  Из системных свойств выбираются значения<br>
	 * <b>os.name</b> - имя ОС,<br>
	 * <b>os.version</b> - версия ОС<br>
	 * и <b>PID@name</b> - идентификатор процесса и имя сервера 
	 * 
	 * @return именованный список с параметрами ОС
	 */
	public Hashtable<String, String> getInfo() {
		Hashtable<String, String> result = new Hashtable<String, String>();
		result.put("os.name", System.getProperty("os.name"));
		result.put("os.version", System.getProperty("os.version"));
		result.put("PID@name", ManagementFactory.getRuntimeMXBean().getName());
		return result;
	}
	
	/**
	 * При наличии публичного метода init() в классе функции, этот метод будет вызван при
	 * инициализации системы. В этом методе могут выполняться инициализационные
	 * действия для функции 
	 */
	public void init() {
		System.out.println("Init DemoFunction");
	}
	
	/**
	 * При наличии публичного метода done() в классе функции, этот метод будет вызван при
	 * завершении работы системы. В этом методе могут выполняться действия для
	 * освобождения ресурсов. 
	 */
	public void done() {
		System.out.println("Done DemoFunction");
	}
	
	
}

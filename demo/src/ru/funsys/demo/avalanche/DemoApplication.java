/**
 * Нижегородский ИВЦ
 */
package ru.funsys.demo.avalanche;

import java.util.Enumeration;
import java.util.Hashtable;

import ru.funsys.avalanche.Application;
import ru.funsys.avalanche.AvalancheRemote;

/**
 * @author Валерий Лиховских
 *
 */
public class DemoApplication extends Application {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2098562113534946778L;
	
	/**
	 * Определение поля для хранения экземпляра адаптера
	 */
	private DemoAdapter info;
	
	/**
	 * Конструктор класса по умолчанию 
	 */
	public DemoApplication() {
	}

	/**
	 * Метод вызова метода адаптера и форматирования полученного результата
	 * в текстовый формат или формат HTML в зависимости от параметра метода.
	 * 
	 * @param html true, если необходим формат HTML, иначе false
	 * 
	 * @return текс или таблицу HTML с параметрами ОС
	 */
	public String getInfo(boolean html) {
		StringBuilder builder = new StringBuilder();
		if (html) {
			builder.append("<table border=\"1\">");
			builder.append("<tr><th>key</th><th>value</th></tr>");
		}
		try {
			// Вызов метода адаптера
			Hashtable<String, String> result = info.getInfo();
			
			for (Enumeration<String> enumeration = result.keys(); enumeration.hasMoreElements(); ) {
				String key = enumeration.nextElement();
				String value = result.get(key);
				if (html) {
					builder.append("<tr><td>").append(key).append("</td><td>").append(value).append("</td></tr>");
				} else {
					builder.append(key).append(": ").append(value).append("\r\n");
				}
			}
		} catch (AvalancheRemote e) {
			if (html) {
				builder.append("<tr><td>").append("error").append("</td><td>").append(e.getLocalizedMessage()).append("</td></tr>");
			} else {
				builder.append("error").append(": ").append(e.getLocalizedMessage()).append("\r\n");
			}
		}
		if (html) builder.append("</table>");
		return builder.toString();
	}
	
}

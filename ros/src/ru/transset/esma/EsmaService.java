/**
 * 
 */
package ru.transset.esma;

import javax.naming.Context;
import javax.naming.InitialContext;

import ru.funsys.avalanche.Avalanche;
import ru.transinfocom.erto.suik.service.LoadDataRequest;

/**
 * Вспомогательный класс получения ссылки на класс обработки полученных сервисом
 * данных
 *
 * @author Валерий Лиховских
 */
public class EsmaService {
	
	/**
	 * Ссылка на экземпляр класса Avalanche
	 */
	private Avalanche avalanche;

	public EsmaService() {
		avalanche = null;
	}
	
	/**
	 * Инициализация поля {@code avalanche}
	 */
	private void init() throws Exception {
		Context initContext = new InitialContext();
		// JNDI имя экземпляра Avalanche определяется в конфигурации контекста
		// Для Tomcat полное JNDI имя - "java:comp/env/avalanche/ros" 
		avalanche = (Avalanche) initContext.lookup(Avalanche.JNDI_CONTEXT + "/avalanche/ros");
	}
	
	/**
	 * Обработка полученного сервисом массивов данны
	 */
	public void store(LoadDataRequest request) throws Exception {
		init();
		// Имя и тип приложения должно соответствовать значениям атрибутов name и class в файле конфигурации avalanche 
		EsmaApplication app = (EsmaApplication) avalanche.getApplication("ESMA");
		app.store(request);
	}

}

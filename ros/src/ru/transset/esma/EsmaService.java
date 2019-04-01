/**
 * 
 */
package ru.transset.esma;

import javax.naming.Context;
import javax.naming.InitialContext;

import ru.funsys.avalanche.Avalanche;
import ru.transinfocom.erto.suik.service.LoadDataRequest;

/**
 * @author likhovskikh_vv
 *
 */
public class EsmaService {
	
	private Avalanche avalanche;

	public EsmaService() {
		avalanche = null;
	}
	
	private void init() throws Exception {
		Context initContext = new InitialContext();
		// JNDI имя экземпляра Avalanche определяется в конфигурации контекста
		// Для Tomcat полное JNDI имя - "java:comp/env/avalanche/ros" 
		avalanche = (Avalanche) initContext.lookup(Avalanche.getJndiContext() + "/avalanche/ros");
	}
	
	public void store(LoadDataRequest request) throws Exception {
		init();
		// Имя и тип приложения должно соответствовать значениям атрибутов name и class в файле конфигурации avalanche 
		EsmaApplication app = (EsmaApplication) avalanche.getApplication("ESMA");
		app.store(request);
	}

}

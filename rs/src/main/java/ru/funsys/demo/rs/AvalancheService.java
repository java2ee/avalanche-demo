/**
 * 
 */
package ru.funsys.demo.rs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import ru.funsys.avalanche.Avalanche;
import ru.funsys.demo.avalanche.DemoService;

/**
 * @author Валерий Лиховских
 *
 * Инициализация класса Application спецификации JAX-RS 2.0 экземплярами классов 
 * реализованных сервисов, описанных в конфигурации Avalanche.
 *
 * Экземпляр этого класса создается в сервлете org.glassfish.jersey.servlet.ServletContainer
 * см. web.xml, параметр javax.ws.rs.Application
 */
public class AvalancheService extends Application {

	private Set<Object> singletons;

	public JsonApplication() throws Exception {
		Context initContext = new InitialContext();
		// JNDI имя экземпляра Avalanche определяется в конфигурации контекста (в секции <context>)
		// Для Tomcat полное JNDI имя - "java:comp/env/avalanche/rp" 
		Avalanche avalanche = (Avalanche) initContext.lookup(Avalanche.getJndiContext() + "/avalanche/rp");
		// Получить список реализованных сервисов
		singletons = avalanche.getSingletons();
	}

	@Override
	public Set<Object> getSingletons() {
	    	if (singletons == null) return super.getSingletons();
	    	else return singletons;
	}

}

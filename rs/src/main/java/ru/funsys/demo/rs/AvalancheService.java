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
 */
public class AvalancheService extends Application {

    Set<Object> singletons = new HashSet<Object>();

	public AvalancheService() {
		Object singleton = Avalanche.getAvalanche("RS Demo Application").getApplication("rest").getService();
		if (singleton != null) singletons.add(singleton);
	}

    @Override
    public Set<Object> getSingletons() {
    	return singletons;
    }
    
}

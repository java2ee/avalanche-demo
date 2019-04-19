/**
 * Нижегородский ИВЦ
 */
package ru.funsys.demo.avalanche;

import java.util.Hashtable;

import ru.funsys.avalanche.AvalancheRemote;

/**
 * Определение адаптера 
 * 
 * @author Валерий Лиховских
 *
 */
public interface DemoAdapter {

	public Hashtable<String, String> getInfo() throws AvalancheRemote;
	
}

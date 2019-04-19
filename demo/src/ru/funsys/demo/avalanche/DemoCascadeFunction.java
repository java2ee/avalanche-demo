/**
 * 
 */
package ru.funsys.demo.avalanche;

import java.util.Hashtable;

import ru.funsys.avalanche.Application;
import ru.funsys.avalanche.AvalancheRemote;

/**
 * Класс реализации каскадной функции,
 * имитирующей "балансировку" нагрузки
 * 
 * @author Валерий Лиховских
 *
 */
public class DemoCascadeFunction extends Application {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3795370073154475977L;

	/**
	 * Массив адаптеров функций, размещенных в разных копиях приложений. 
	 */
	public DemoAdapter[] infos;
	
	/**
	 * Индекс текущего адаптера. После каждого вызова метода индекс увеличивается
	 * на единицу. Если индекс станет равным размеру массива адаптеров, то его
	 * значение устанавливается в 0.    
	 */
	private int index = 0;
	
	/**
	 * Конструктор класса по умолчанию
	 */
	public DemoCascadeFunction() {
	}

	/**
	 * Каскадный вызов функции, получение информации об операционной системе.<br>
	 * <br>
	 * Реализация этой функции имитирует распределение нагрузки между различными
	 * узлами. При вызове это метода последовательно перебираются все зарегистрированные
	 * адаптеры.<br>  
	 * <br>
	 *  Из системных свойств выбираются значения<br>
	 * <b>os.name</b> - имя ОС,<br>
	 * <b>os.version</b> - версия ОС<br>
	 * и <b>PID@name</b> - идентификатор процесса и имя сервера 
	 * 
	 * @return именованный список с параметрами ОС
	 */
	public Hashtable<String, String> getInfo() throws AvalancheRemote {
		DemoAdapter info = infos[index];
		synchronized (this) {
			index++;
			if (index == infos.length) index = 0;
		}
		return info.getInfo();
	}

}

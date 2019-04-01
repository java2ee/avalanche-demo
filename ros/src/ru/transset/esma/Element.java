/**
 * 
 */
package ru.transset.esma;

import ru.funsys.avalanche.Brick;

/**
 * @author Валерий Лиховских
 *
 */
public class Element extends Brick {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3064193225771040927L;

	/**
	 * Описывает объект, из которого устанавливается значение поля
	 */
	private String source = "Element";
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public void done() {
	}

	@Override
	public void init() {
	}
	
}

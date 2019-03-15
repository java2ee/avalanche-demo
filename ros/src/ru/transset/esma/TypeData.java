/**
 * 
 */
package ru.transset.esma;

import java.util.Vector;

import ru.funsys.avalanche.Brick;

/**
 * Класс описания выполняемого SQL 
 * 
 * @author Валерий Лиховских
 */
public class TypeData extends Brick {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2338185397126773551L;

	/**
	 * Определяет порядок устанавливаемых значений полей в SQL выражении из комплексного типа, описанного в WSDL 
	 */
	private Vector<String> elements = new Vector<String>();
	
	/**
	 * SQL выражение вставки записи в таблицу
	 */
	private String sql;
	
	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	/**
	 * Добавляет поле типа данных. Этот метод вызывается при обработке
	 * файла конфигурации.
	 * 
	 * @param name имя поля типа данных
	 * @param element экземпляр поля типа данных
	 * @return {@code true}, если поле типа данных успешно добавлен, иначе {@code false} 
	 */
	public boolean addElement(String name, Element element) {
		// для установки значения поля требуется только имя элемента
		elements.add(name);
		return true;
	}
	
	public Vector<String> getElements() {
		return elements;
	}
	
	/* (non-Javadoc)
	 * @see ru.funsys.avalanche.Brick#done()
	 */
	@Override
	public void done() {
	}

	/* (non-Javadoc)
	 * @see ru.funsys.avalanche.Brick#init()
	 */
	@Override
	public void init() {
	}

}

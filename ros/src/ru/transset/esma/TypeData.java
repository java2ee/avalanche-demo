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
 *
 */
public class TypeData extends Brick {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2338185397126773551L;

	/**
	 * Определяет порядок устанавливаемых значений полей в SQL выражении из комплексного типа, описанного в WSDL 
	 */
	private Vector<Element> elements = new Vector<Element>();
	
	private String sql; // SQL выражения INSERT, добавляющее запись в таблицу 

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	/**
	 * Ð”Ð¾Ð±Ð°Ð²Ð»ÑÐµÑ‚ Ð¿Ð¾Ð»Ðµ Ñ‚Ð¸Ð¿Ð° Ð´Ð°Ð½Ð½Ñ‹Ñ…. Ð­Ñ‚Ð¾Ñ‚ Ð¼ÐµÑ‚Ð¾Ð´ Ð²Ñ‹Ð·Ñ‹Ð²Ð°ÐµÑ‚ÑÑ Ð¿Ñ€Ð¸ Ð¾Ð±Ñ€Ð°Ð±Ð¾Ñ‚ÐºÐµ
	 * Ñ„Ð°Ð¹Ð»Ð° ÐºÐ¾Ð½Ñ„Ð¸Ð³ÑƒÑ€Ð°Ñ†Ð¸Ð¸.
	 * 
	 * @param name Ð¸Ð¼Ñ Ð¿Ð¾Ð»Ñ Ñ‚Ð¸Ð¿Ð° Ð´Ð°Ð½Ð½Ñ‹Ñ…
	 * @param element ÑÐºÐ·ÐµÐ¼Ð¿Ð»ÑÑ€ Ð¿Ð¾Ð»Ñ Ñ‚Ð¸Ð¿Ð° Ð´Ð°Ð½Ð½Ñ‹Ñ…
	 * @return {@code true}, ÐµÑÐ»Ð¸ Ð¿Ð¾Ð»Ðµ Ñ‚Ð¸Ð¿Ð° Ð´Ð°Ð½Ð½Ñ‹Ñ… ÑƒÑÐ¿ÐµÑˆÐ½Ð¾ Ð´Ð¾Ð±Ð°Ð²Ð»ÐµÐ½, Ð¸Ð½Ð°Ñ‡Ðµ {@code false} 
	 */
	public boolean addElement(String name, Element element) {
		// для установки значения поля требуется только имя элемента
		elements.add(element);
		return true;
	}
	
	public Vector<Element> getElements() {
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

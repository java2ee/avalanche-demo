/**
 * 
 */
package ru.transset.esma;

import java.util.Vector;

import ru.funsys.avalanche.Brick;

/**
 * ����� �������� ������������ SQL 
 * 
 * @author ������� ���������
 *
 */
public class TypeData extends Brick {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2338185397126773551L;

	/**
	 * ���������� ������� ��������������� �������� ����� � SQL ��������� �� ������������ ����, ���������� � WSDL 
	 */
	private Vector<Element> elements = new Vector<Element>();
	
	private String sql; // SQL ��������� INSERT, ����������� ������ � ������� 

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public boolean addElement(String name, Element element) {
		// ��� ��������� �������� ���� ��������� ������ ��� ��������
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

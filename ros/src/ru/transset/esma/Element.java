/**
 * 
 */
package ru.transset.esma;

import ru.funsys.avalanche.Brick;

/**
<<<<<<< HEAD
 * @author ������� ���������
=======
 * Класс поля типа данных. Используется для определения порядка полей, устанавливаемых в SQL
 * выражение. Определение каких либо полей не требуется, поле {@code name} определено в родительском
 * классе.
>>>>>>> branch 'master' of https://github.com/java2ee/avalanche-demo.git
 *
 */
public class Element extends Brick {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3064193225771040927L;

	/**
	 * ��������� ������, �� �������� ��������������� �������� ����
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

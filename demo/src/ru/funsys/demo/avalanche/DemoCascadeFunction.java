/**
 * 
 */
package ru.funsys.demo.avalanche;

import java.util.Hashtable;

import ru.funsys.avalanche.Application;
import ru.funsys.avalanche.AvalancheRemote;

/**
 * ����� ���������� ��������� �������,
 * ����������� "������������" ��������
 * 
 * @author ������� ���������
 *
 */
public class DemoCascadeFunction extends Application {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3795370073154475977L;

	/**
	 * ������ ��������� �������, ����������� � ������ ������ ����������. 
	 */
	public DemoAdapter[] infos;
	
	/**
	 * ������ �������� ��������. ����� ������� ������ ������ ������ �������������
	 * �� �������. ���� ������ ������ ������ ������� ������� ���������, �� ���
	 * �������� ��������������� � 0.    
	 */
	private int index = 0;
	
	/**
	 * ����������� ������ �� ���������
	 */
	public DemoCascadeFunction() {
	}

	/**
	 * ��������� ����� �������, ��������� ���������� �� ������������ �������.<br>
	 * <br>
	 * ���������� ���� ������� ��������� ������������� �������� ����� ����������
	 * ������. ��� ������ ��� ������ ��������������� ������������ ��� ������������������
	 * ��������.<br>  
	 * <br>
	 *  �� ��������� ������� ���������� ��������<br>
	 * <b>os.name</b> - ��� ��,<br>
	 * <b>os.version</b> - ������ ��<br>
	 * � <b>PID@name</b> - ������������� �������� � ��� ������� 
	 * 
	 * @return ����������� ������ � ����������� ��
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

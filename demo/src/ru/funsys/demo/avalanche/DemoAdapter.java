/**
 * ������������� ���
 */
package ru.funsys.demo.avalanche;

import java.util.Hashtable;

import ru.funsys.avalanche.AvalancheRemote;

/**
 * ����������� �������� 
 * 
 * @author ������� ���������
 *
 */
public interface DemoAdapter {

	public Hashtable<String, String> getInfo() throws AvalancheRemote;
	
}

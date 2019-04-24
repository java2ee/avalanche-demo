package ru.funsys.demo.avalanche;

import java.lang.management.ManagementFactory;
import java.util.Hashtable;

import org.apache.logging.log4j.Logger;

/**
 * ���������������� ����� ���������� �������
 * 
 * @author ������� ���������
 */
public class DemoFunction {

	/**
	 * ��� ����������� ������ ����������� ������� � ��� ���������� ���������������� 
	 * ���� ������ logger. �� ��������� ����� ���������� ������ ������������� ��������
	 * � ����� ������������. ���� ������ �� ���������� �� � ������ �� ������������
	 * ��������� ������������, �� ������������ <b>root</b> ������ ������� �����������
	 * ������� log4j.
	 * </br></br>
	 * ��� ����������� ������ � ������ ������ ���������� ���������� ��������
	 * �������� <b>logger</b> � ������������ �������, ������ ��� ���������� �������
	 * �� ����� ������������ log4j.  
	 */
	private Logger logger;
	
	/**
	 * ����������� ������
	 */
	public DemoFunction() {
	}

	/**
	 * �������� ���������� �� ������������ �������.<br>
	 * <br>
	 *  �� ��������� ������� ���������� ��������<br>
	 * <b>os.name</b> - ��� ��,<br>
	 * <b>os.version</b> - ������ ��<br>
	 * � <b>PID@name</b> - ������������� �������� � ��� ������� 
	 * 
	 * @return ����������� ������ � ����������� ��
	 */
	public Hashtable<String, String> getInfo() {
		Hashtable<String, String> result = new Hashtable<String, String>();
		result.put("os.name", System.getProperty("os.name"));
		result.put("os.version", System.getProperty("os.version"));
		result.put("PID@name", ManagementFactory.getRuntimeMXBean().getName());
		return result;
	}
	
	/**
	 * ��� ������� ���������� ������ init() � ������ �������, ���� ����� ����� ������ ���
	 * ������������� �������. � ���� ������ ����� ����������� �����������������
	 * �������� ��� ������� 
	 */
	public void init() {
		logger.info("Init DemoFunction");
	}
	
	/**
	 * ��� ������� ���������� ������ done() � ������ �������, ���� ����� ����� ������ ���
	 * ���������� ������ �������. � ���� ������ ����� ����������� �������� ���
	 * ������������ ��������. 
	 */
	public void done() {
		logger.info("Done DemoFunction");
	}
	
	
}

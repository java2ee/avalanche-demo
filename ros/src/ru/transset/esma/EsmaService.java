/**
 * 
 */
package ru.transset.esma;

import javax.naming.Context;
import javax.naming.InitialContext;

import ru.funsys.avalanche.Avalanche;
import ru.transinfocom.erto.suik.service.LoadDataRequest;

/**
 * @author likhovskikh_vv
 *
 */
public class EsmaService {
	
	private Avalanche avalanche;

	public EsmaService() {
		avalanche = null;
	}
	
	private void init() throws Exception {
		Context initContext = new InitialContext();
		// JNDI ��� ���������� Avalanche ������������ � ������������ ���������
		// ��� Tomcat ������ JNDI ��� - "java:comp/env/avalanche/ros" 
		avalanche = (Avalanche) initContext.lookup(Avalanche.getJndiContext() + "/avalanche/ros");
	}
	
	public void store(LoadDataRequest request) throws Exception {
		init();
		// ��� � ��� ���������� ������ ��������������� ��������� ��������� name � class � ����� ������������ avalanche 
		EsmaApplication app = (EsmaApplication) avalanche.getApplication("ESMA");
		app.store(request);
	}

}

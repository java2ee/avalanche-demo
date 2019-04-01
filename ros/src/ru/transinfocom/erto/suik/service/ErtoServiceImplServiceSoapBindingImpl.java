/**
 * ErtoServiceImplServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.service;

import java.rmi.RemoteException;

import ru.transset.esma.EsmaService;

public class ErtoServiceImplServiceSoapBindingImpl implements ru.transinfocom.erto.suik.service.ErtoServiceApi{
    
	public ru.transinfocom.erto.suik.service.LoadDataResponse loadData(ru.transinfocom.erto.suik.service.LoadDataRequest request) throws java.rmi.RemoteException, ru.transinfocom.erto.suik.service.TiServerSoapException {
		// Добавленный код в сгенерированный класс
		try {
			EsmaService service = new EsmaService();
			service.store(request);
		} catch (Exception e) {
			throw new RemoteException("Error ESMA", e);
		}
		// Далее следует сгенерированный код
    	return new LoadDataResponse();
    }

}

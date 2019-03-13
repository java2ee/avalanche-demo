/**
 * ErtoServiceImplServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.service;

public class ErtoServiceImplServiceSoapBindingSkeleton implements ru.transinfocom.erto.suik.service.ErtoServiceApi, org.apache.axis.wsdl.Skeleton {
    private ru.transinfocom.erto.suik.service.ErtoServiceApi impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", "loadDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", ">loadDataRequest"), ru.transinfocom.erto.suik.service.LoadDataRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("loadData", _params, new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", "loadDataResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", ">loadDataResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "loadData"));
        _oper.setSoapAction("http://suik.erto.transinfocom.ru/service/loadData");
        _myOperationsList.add(_oper);
        if (_myOperations.get("loadData") == null) {
            _myOperations.put("loadData", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("loadData")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("TiServerSoapException");
        _fault.setQName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/fault/", "TiServerSoapPart"));
        _fault.setClassName("ru.transinfocom.erto.suik.service.TiServerSoapException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        _oper.addFault(_fault);
    }

    public ErtoServiceImplServiceSoapBindingSkeleton() {
        this.impl = new ru.transinfocom.erto.suik.service.ErtoServiceImplServiceSoapBindingImpl();
    }

    public ErtoServiceImplServiceSoapBindingSkeleton(ru.transinfocom.erto.suik.service.ErtoServiceApi impl) {
        this.impl = impl;
    }
    public ru.transinfocom.erto.suik.service.LoadDataResponse loadData(ru.transinfocom.erto.suik.service.LoadDataRequest request) throws java.rmi.RemoteException, ru.transinfocom.erto.suik.service.TiServerSoapException
    {
        ru.transinfocom.erto.suik.service.LoadDataResponse ret = impl.loadData(request);
        return ret;
    }

}

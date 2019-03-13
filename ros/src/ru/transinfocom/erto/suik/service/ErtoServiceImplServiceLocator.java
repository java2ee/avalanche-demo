/**
 * ErtoServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.service;

public class ErtoServiceImplServiceLocator extends org.apache.axis.client.Service implements ru.transinfocom.erto.suik.service.ErtoServiceImplService {

    public ErtoServiceImplServiceLocator() {
    }


    public ErtoServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ErtoServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ErtoServiceImplPort
    private java.lang.String ErtoServiceImplPort_address = "http://10.200.1.191:9090/erto-suik/services/suik";

    public java.lang.String getErtoServiceImplPortAddress() {
        return ErtoServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ErtoServiceImplPortWSDDServiceName = "ErtoServiceImplPort";

    public java.lang.String getErtoServiceImplPortWSDDServiceName() {
        return ErtoServiceImplPortWSDDServiceName;
    }

    public void setErtoServiceImplPortWSDDServiceName(java.lang.String name) {
        ErtoServiceImplPortWSDDServiceName = name;
    }

    public ru.transinfocom.erto.suik.service.ErtoServiceApi getErtoServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ErtoServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getErtoServiceImplPort(endpoint);
    }

    public ru.transinfocom.erto.suik.service.ErtoServiceApi getErtoServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ru.transinfocom.erto.suik.service.ErtoServiceImplServiceSoapBindingStub _stub = new ru.transinfocom.erto.suik.service.ErtoServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getErtoServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setErtoServiceImplPortEndpointAddress(java.lang.String address) {
        ErtoServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ru.transinfocom.erto.suik.service.ErtoServiceApi.class.isAssignableFrom(serviceEndpointInterface)) {
                ru.transinfocom.erto.suik.service.ErtoServiceImplServiceSoapBindingStub _stub = new ru.transinfocom.erto.suik.service.ErtoServiceImplServiceSoapBindingStub(new java.net.URL(ErtoServiceImplPort_address), this);
                _stub.setPortName(getErtoServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ErtoServiceImplPort".equals(inputPortName)) {
            return getErtoServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.suik.erto.transinfocom.ru/", "ErtoServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.suik.erto.transinfocom.ru/", "ErtoServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ErtoServiceImplPort".equals(portName)) {
            setErtoServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

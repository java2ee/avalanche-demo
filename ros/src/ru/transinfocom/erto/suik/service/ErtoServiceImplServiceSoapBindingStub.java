/**
 * ErtoServiceImplServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.service;

public class ErtoServiceImplServiceSoapBindingStub extends org.apache.axis.client.Stub implements ru.transinfocom.erto.suik.service.ErtoServiceApi {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loadData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", "loadDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", ">loadDataRequest"), ru.transinfocom.erto.suik.service.LoadDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", ">loadDataResponse"));
        oper.setReturnClass(ru.transinfocom.erto.suik.service.LoadDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", "loadDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/fault/", "TiServerSoapPart"),
                      "ru.transinfocom.erto.suik.service.TiServerSoapException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), 
                      false
                     ));
        _operations[0] = oper;

    }

    public ErtoServiceImplServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ErtoServiceImplServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ErtoServiceImplServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", ">loadDataRequest");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.service.LoadDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", ">loadDataResponse");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.service.LoadDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Area");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Area.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Contrct");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Contrct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Equip");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Equip.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Invi");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Invi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Krem");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Krem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Move");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Move.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Neud");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Neud.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Neuo");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Neuo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Osdan");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Osdan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "OsData");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.OsData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Oson");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Oson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Pere");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Pere.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Pern");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Pern.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Transfer");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Transfer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Value");
            cachedSerQNames.add(qName);
            cls = ru.transinfocom.erto.suik.types.Value.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ru.transinfocom.erto.suik.service.LoadDataResponse loadData(ru.transinfocom.erto.suik.service.LoadDataRequest request) throws java.rmi.RemoteException, ru.transinfocom.erto.suik.service.TiServerSoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://suik.erto.transinfocom.ru/service/loadData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "loadData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.transinfocom.erto.suik.service.LoadDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.transinfocom.erto.suik.service.LoadDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ru.transinfocom.erto.suik.service.LoadDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ru.transinfocom.erto.suik.service.TiServerSoapException) {
              throw (ru.transinfocom.erto.suik.service.TiServerSoapException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

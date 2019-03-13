/**
 * TiServerSoapException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.service;

public class TiServerSoapException extends org.apache.axis.AxisFault {
    public java.lang.Object tiServerSoapException;
    public java.lang.Object getTiServerSoapException() {
        return this.tiServerSoapException;
    }

    public TiServerSoapException() {
    }

    public TiServerSoapException(java.lang.Exception target) {
        super(target);
    }

    public TiServerSoapException(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public TiServerSoapException(java.lang.Object tiServerSoapException) {
        this.tiServerSoapException = tiServerSoapException;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, tiServerSoapException);
    }
}

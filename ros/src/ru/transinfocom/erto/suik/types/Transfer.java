/**
 * Transfer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.types;

public class Transfer  implements java.io.Serializable {
    private java.lang.String number_job;

    private java.util.Date zzdate;

    private java.lang.String status;

    private java.util.Date zzdate_fact;

    private java.lang.String zztime;

    private java.lang.String text1;

    private java.lang.String nfili;

    public Transfer() {
    }

    public Transfer(
           java.lang.String number_job,
           java.util.Date zzdate,
           java.lang.String status,
           java.util.Date zzdate_fact,
           java.lang.String zztime,
           java.lang.String text1,
           java.lang.String nfili) {
           this.number_job = number_job;
           this.zzdate = zzdate;
           this.status = status;
           this.zzdate_fact = zzdate_fact;
           this.zztime = zztime;
           this.text1 = text1;
           this.nfili = nfili;
    }


    /**
     * Gets the number_job value for this Transfer.
     * 
     * @return number_job
     */
    public java.lang.String getNumber_job() {
        return number_job;
    }


    /**
     * Sets the number_job value for this Transfer.
     * 
     * @param number_job
     */
    public void setNumber_job(java.lang.String number_job) {
        this.number_job = number_job;
    }


    /**
     * Gets the zzdate value for this Transfer.
     * 
     * @return zzdate
     */
    public java.util.Date getZzdate() {
        return zzdate;
    }


    /**
     * Sets the zzdate value for this Transfer.
     * 
     * @param zzdate
     */
    public void setZzdate(java.util.Date zzdate) {
        this.zzdate = zzdate;
    }


    /**
     * Gets the status value for this Transfer.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Transfer.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the zzdate_fact value for this Transfer.
     * 
     * @return zzdate_fact
     */
    public java.util.Date getZzdate_fact() {
        return zzdate_fact;
    }


    /**
     * Sets the zzdate_fact value for this Transfer.
     * 
     * @param zzdate_fact
     */
    public void setZzdate_fact(java.util.Date zzdate_fact) {
        this.zzdate_fact = zzdate_fact;
    }


    /**
     * Gets the zztime value for this Transfer.
     * 
     * @return zztime
     */
    public java.lang.String getZztime() {
        return zztime;
    }


    /**
     * Sets the zztime value for this Transfer.
     * 
     * @param zztime
     */
    public void setZztime(java.lang.String zztime) {
        this.zztime = zztime;
    }


    /**
     * Gets the text1 value for this Transfer.
     * 
     * @return text1
     */
    public java.lang.String getText1() {
        return text1;
    }


    /**
     * Sets the text1 value for this Transfer.
     * 
     * @param text1
     */
    public void setText1(java.lang.String text1) {
        this.text1 = text1;
    }


    /**
     * Gets the nfili value for this Transfer.
     * 
     * @return nfili
     */
    public java.lang.String getNfili() {
        return nfili;
    }


    /**
     * Sets the nfili value for this Transfer.
     * 
     * @param nfili
     */
    public void setNfili(java.lang.String nfili) {
        this.nfili = nfili;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transfer)) return false;
        Transfer other = (Transfer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number_job==null && other.getNumber_job()==null) || 
             (this.number_job!=null &&
              this.number_job.equals(other.getNumber_job()))) &&
            ((this.zzdate==null && other.getZzdate()==null) || 
             (this.zzdate!=null &&
              this.zzdate.equals(other.getZzdate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.zzdate_fact==null && other.getZzdate_fact()==null) || 
             (this.zzdate_fact!=null &&
              this.zzdate_fact.equals(other.getZzdate_fact()))) &&
            ((this.zztime==null && other.getZztime()==null) || 
             (this.zztime!=null &&
              this.zztime.equals(other.getZztime()))) &&
            ((this.text1==null && other.getText1()==null) || 
             (this.text1!=null &&
              this.text1.equals(other.getText1()))) &&
            ((this.nfili==null && other.getNfili()==null) || 
             (this.nfili!=null &&
              this.nfili.equals(other.getNfili())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNumber_job() != null) {
            _hashCode += getNumber_job().hashCode();
        }
        if (getZzdate() != null) {
            _hashCode += getZzdate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getZzdate_fact() != null) {
            _hashCode += getZzdate_fact().hashCode();
        }
        if (getZztime() != null) {
            _hashCode += getZztime().hashCode();
        }
        if (getText1() != null) {
            _hashCode += getText1().hashCode();
        }
        if (getNfili() != null) {
            _hashCode += getNfili().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Transfer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Transfer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_job");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "number_job"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "zzdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzdate_fact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "zzdate_fact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zztime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "zztime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "text1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfili");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "nfili"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

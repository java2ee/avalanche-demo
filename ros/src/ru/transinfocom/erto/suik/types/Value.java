/**
 * Value.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.types;

public class Value  implements java.io.Serializable {
    private java.lang.String bukrs;

    private java.lang.String werks;

    private java.lang.String anln1;

    private java.lang.String anln2;

    private java.util.Date zzdate;

    private java.math.BigDecimal gjeKansw;

    private java.math.BigDecimal gjeKnafa;

    private java.math.BigDecimal gjeBchwrt;

    public Value() {
    }

    public Value(
           java.lang.String bukrs,
           java.lang.String werks,
           java.lang.String anln1,
           java.lang.String anln2,
           java.util.Date zzdate,
           java.math.BigDecimal gjeKansw,
           java.math.BigDecimal gjeKnafa,
           java.math.BigDecimal gjeBchwrt) {
           this.bukrs = bukrs;
           this.werks = werks;
           this.anln1 = anln1;
           this.anln2 = anln2;
           this.zzdate = zzdate;
           this.gjeKansw = gjeKansw;
           this.gjeKnafa = gjeKnafa;
           this.gjeBchwrt = gjeBchwrt;
    }


    /**
     * Gets the bukrs value for this Value.
     * 
     * @return bukrs
     */
    public java.lang.String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Value.
     * 
     * @param bukrs
     */
    public void setBukrs(java.lang.String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the werks value for this Value.
     * 
     * @return werks
     */
    public java.lang.String getWerks() {
        return werks;
    }


    /**
     * Sets the werks value for this Value.
     * 
     * @param werks
     */
    public void setWerks(java.lang.String werks) {
        this.werks = werks;
    }


    /**
     * Gets the anln1 value for this Value.
     * 
     * @return anln1
     */
    public java.lang.String getAnln1() {
        return anln1;
    }


    /**
     * Sets the anln1 value for this Value.
     * 
     * @param anln1
     */
    public void setAnln1(java.lang.String anln1) {
        this.anln1 = anln1;
    }


    /**
     * Gets the anln2 value for this Value.
     * 
     * @return anln2
     */
    public java.lang.String getAnln2() {
        return anln2;
    }


    /**
     * Sets the anln2 value for this Value.
     * 
     * @param anln2
     */
    public void setAnln2(java.lang.String anln2) {
        this.anln2 = anln2;
    }


    /**
     * Gets the zzdate value for this Value.
     * 
     * @return zzdate
     */
    public java.util.Date getZzdate() {
        return zzdate;
    }


    /**
     * Sets the zzdate value for this Value.
     * 
     * @param zzdate
     */
    public void setZzdate(java.util.Date zzdate) {
        this.zzdate = zzdate;
    }


    /**
     * Gets the gjeKansw value for this Value.
     * 
     * @return gjeKansw
     */
    public java.math.BigDecimal getGjeKansw() {
        return gjeKansw;
    }


    /**
     * Sets the gjeKansw value for this Value.
     * 
     * @param gjeKansw
     */
    public void setGjeKansw(java.math.BigDecimal gjeKansw) {
        this.gjeKansw = gjeKansw;
    }


    /**
     * Gets the gjeKnafa value for this Value.
     * 
     * @return gjeKnafa
     */
    public java.math.BigDecimal getGjeKnafa() {
        return gjeKnafa;
    }


    /**
     * Sets the gjeKnafa value for this Value.
     * 
     * @param gjeKnafa
     */
    public void setGjeKnafa(java.math.BigDecimal gjeKnafa) {
        this.gjeKnafa = gjeKnafa;
    }


    /**
     * Gets the gjeBchwrt value for this Value.
     * 
     * @return gjeBchwrt
     */
    public java.math.BigDecimal getGjeBchwrt() {
        return gjeBchwrt;
    }


    /**
     * Sets the gjeBchwrt value for this Value.
     * 
     * @param gjeBchwrt
     */
    public void setGjeBchwrt(java.math.BigDecimal gjeBchwrt) {
        this.gjeBchwrt = gjeBchwrt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Value)) return false;
        Value other = (Value) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bukrs==null && other.getBukrs()==null) || 
             (this.bukrs!=null &&
              this.bukrs.equals(other.getBukrs()))) &&
            ((this.werks==null && other.getWerks()==null) || 
             (this.werks!=null &&
              this.werks.equals(other.getWerks()))) &&
            ((this.anln1==null && other.getAnln1()==null) || 
             (this.anln1!=null &&
              this.anln1.equals(other.getAnln1()))) &&
            ((this.anln2==null && other.getAnln2()==null) || 
             (this.anln2!=null &&
              this.anln2.equals(other.getAnln2()))) &&
            ((this.zzdate==null && other.getZzdate()==null) || 
             (this.zzdate!=null &&
              this.zzdate.equals(other.getZzdate()))) &&
            ((this.gjeKansw==null && other.getGjeKansw()==null) || 
             (this.gjeKansw!=null &&
              this.gjeKansw.equals(other.getGjeKansw()))) &&
            ((this.gjeKnafa==null && other.getGjeKnafa()==null) || 
             (this.gjeKnafa!=null &&
              this.gjeKnafa.equals(other.getGjeKnafa()))) &&
            ((this.gjeBchwrt==null && other.getGjeBchwrt()==null) || 
             (this.gjeBchwrt!=null &&
              this.gjeBchwrt.equals(other.getGjeBchwrt())));
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
        if (getBukrs() != null) {
            _hashCode += getBukrs().hashCode();
        }
        if (getWerks() != null) {
            _hashCode += getWerks().hashCode();
        }
        if (getAnln1() != null) {
            _hashCode += getAnln1().hashCode();
        }
        if (getAnln2() != null) {
            _hashCode += getAnln2().hashCode();
        }
        if (getZzdate() != null) {
            _hashCode += getZzdate().hashCode();
        }
        if (getGjeKansw() != null) {
            _hashCode += getGjeKansw().hashCode();
        }
        if (getGjeKnafa() != null) {
            _hashCode += getGjeKnafa().hashCode();
        }
        if (getGjeBchwrt() != null) {
            _hashCode += getGjeBchwrt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Value.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Value"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bukrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "bukrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("werks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "werks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anln1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "anln1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anln2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "anln2"));
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
        elemField.setFieldName("gjeKansw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "gjeKansw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gjeKnafa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "gjeKnafa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gjeBchwrt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "gjeBchwrt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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

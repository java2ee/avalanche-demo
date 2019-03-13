/**
 * Oson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.types;

public class Oson  implements java.io.Serializable {
    private java.lang.String bukrs;

    private java.lang.String werks;

    private java.lang.String anln1;

    private java.lang.String anln2;

    private java.lang.String reBukrs;

    private java.lang.String swenr;

    private java.lang.String sgenr;

    private java.lang.String xwerks;

    public Oson() {
    }

    public Oson(
           java.lang.String bukrs,
           java.lang.String werks,
           java.lang.String anln1,
           java.lang.String anln2,
           java.lang.String reBukrs,
           java.lang.String swenr,
           java.lang.String sgenr,
           java.lang.String xwerks) {
           this.bukrs = bukrs;
           this.werks = werks;
           this.anln1 = anln1;
           this.anln2 = anln2;
           this.reBukrs = reBukrs;
           this.swenr = swenr;
           this.sgenr = sgenr;
           this.xwerks = xwerks;
    }


    /**
     * Gets the bukrs value for this Oson.
     * 
     * @return bukrs
     */
    public java.lang.String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Oson.
     * 
     * @param bukrs
     */
    public void setBukrs(java.lang.String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the werks value for this Oson.
     * 
     * @return werks
     */
    public java.lang.String getWerks() {
        return werks;
    }


    /**
     * Sets the werks value for this Oson.
     * 
     * @param werks
     */
    public void setWerks(java.lang.String werks) {
        this.werks = werks;
    }


    /**
     * Gets the anln1 value for this Oson.
     * 
     * @return anln1
     */
    public java.lang.String getAnln1() {
        return anln1;
    }


    /**
     * Sets the anln1 value for this Oson.
     * 
     * @param anln1
     */
    public void setAnln1(java.lang.String anln1) {
        this.anln1 = anln1;
    }


    /**
     * Gets the anln2 value for this Oson.
     * 
     * @return anln2
     */
    public java.lang.String getAnln2() {
        return anln2;
    }


    /**
     * Sets the anln2 value for this Oson.
     * 
     * @param anln2
     */
    public void setAnln2(java.lang.String anln2) {
        this.anln2 = anln2;
    }


    /**
     * Gets the reBukrs value for this Oson.
     * 
     * @return reBukrs
     */
    public java.lang.String getReBukrs() {
        return reBukrs;
    }


    /**
     * Sets the reBukrs value for this Oson.
     * 
     * @param reBukrs
     */
    public void setReBukrs(java.lang.String reBukrs) {
        this.reBukrs = reBukrs;
    }


    /**
     * Gets the swenr value for this Oson.
     * 
     * @return swenr
     */
    public java.lang.String getSwenr() {
        return swenr;
    }


    /**
     * Sets the swenr value for this Oson.
     * 
     * @param swenr
     */
    public void setSwenr(java.lang.String swenr) {
        this.swenr = swenr;
    }


    /**
     * Gets the sgenr value for this Oson.
     * 
     * @return sgenr
     */
    public java.lang.String getSgenr() {
        return sgenr;
    }


    /**
     * Sets the sgenr value for this Oson.
     * 
     * @param sgenr
     */
    public void setSgenr(java.lang.String sgenr) {
        this.sgenr = sgenr;
    }


    /**
     * Gets the xwerks value for this Oson.
     * 
     * @return xwerks
     */
    public java.lang.String getXwerks() {
        return xwerks;
    }


    /**
     * Sets the xwerks value for this Oson.
     * 
     * @param xwerks
     */
    public void setXwerks(java.lang.String xwerks) {
        this.xwerks = xwerks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Oson)) return false;
        Oson other = (Oson) obj;
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
            ((this.reBukrs==null && other.getReBukrs()==null) || 
             (this.reBukrs!=null &&
              this.reBukrs.equals(other.getReBukrs()))) &&
            ((this.swenr==null && other.getSwenr()==null) || 
             (this.swenr!=null &&
              this.swenr.equals(other.getSwenr()))) &&
            ((this.sgenr==null && other.getSgenr()==null) || 
             (this.sgenr!=null &&
              this.sgenr.equals(other.getSgenr()))) &&
            ((this.xwerks==null && other.getXwerks()==null) || 
             (this.xwerks!=null &&
              this.xwerks.equals(other.getXwerks())));
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
        if (getReBukrs() != null) {
            _hashCode += getReBukrs().hashCode();
        }
        if (getSwenr() != null) {
            _hashCode += getSwenr().hashCode();
        }
        if (getSgenr() != null) {
            _hashCode += getSgenr().hashCode();
        }
        if (getXwerks() != null) {
            _hashCode += getXwerks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Oson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Oson"));
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
        elemField.setFieldName("reBukrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "reBukrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swenr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "swenr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sgenr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "sgenr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xwerks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "xwerks"));
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

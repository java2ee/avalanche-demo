/**
 * Equip.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.types;

public class Equip  implements java.io.Serializable {
    private java.lang.String bukrs;

    private java.lang.String werks;

    private java.lang.String swenr;

    private java.lang.String sgenr;

    private java.lang.String namecharact;

    public Equip() {
    }

    public Equip(
           java.lang.String bukrs,
           java.lang.String werks,
           java.lang.String swenr,
           java.lang.String sgenr,
           java.lang.String namecharact) {
           this.bukrs = bukrs;
           this.werks = werks;
           this.swenr = swenr;
           this.sgenr = sgenr;
           this.namecharact = namecharact;
    }


    /**
     * Gets the bukrs value for this Equip.
     * 
     * @return bukrs
     */
    public java.lang.String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Equip.
     * 
     * @param bukrs
     */
    public void setBukrs(java.lang.String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the werks value for this Equip.
     * 
     * @return werks
     */
    public java.lang.String getWerks() {
        return werks;
    }


    /**
     * Sets the werks value for this Equip.
     * 
     * @param werks
     */
    public void setWerks(java.lang.String werks) {
        this.werks = werks;
    }


    /**
     * Gets the swenr value for this Equip.
     * 
     * @return swenr
     */
    public java.lang.String getSwenr() {
        return swenr;
    }


    /**
     * Sets the swenr value for this Equip.
     * 
     * @param swenr
     */
    public void setSwenr(java.lang.String swenr) {
        this.swenr = swenr;
    }


    /**
     * Gets the sgenr value for this Equip.
     * 
     * @return sgenr
     */
    public java.lang.String getSgenr() {
        return sgenr;
    }


    /**
     * Sets the sgenr value for this Equip.
     * 
     * @param sgenr
     */
    public void setSgenr(java.lang.String sgenr) {
        this.sgenr = sgenr;
    }


    /**
     * Gets the namecharact value for this Equip.
     * 
     * @return namecharact
     */
    public java.lang.String getNamecharact() {
        return namecharact;
    }


    /**
     * Sets the namecharact value for this Equip.
     * 
     * @param namecharact
     */
    public void setNamecharact(java.lang.String namecharact) {
        this.namecharact = namecharact;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Equip)) return false;
        Equip other = (Equip) obj;
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
            ((this.swenr==null && other.getSwenr()==null) || 
             (this.swenr!=null &&
              this.swenr.equals(other.getSwenr()))) &&
            ((this.sgenr==null && other.getSgenr()==null) || 
             (this.sgenr!=null &&
              this.sgenr.equals(other.getSgenr()))) &&
            ((this.namecharact==null && other.getNamecharact()==null) || 
             (this.namecharact!=null &&
              this.namecharact.equals(other.getNamecharact())));
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
        if (getSwenr() != null) {
            _hashCode += getSwenr().hashCode();
        }
        if (getSgenr() != null) {
            _hashCode += getSgenr().hashCode();
        }
        if (getNamecharact() != null) {
            _hashCode += getNamecharact().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Equip.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Equip"));
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
        elemField.setFieldName("namecharact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "namecharact"));
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

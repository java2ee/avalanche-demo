/**
 * Area.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.types;

public class Area  implements java.io.Serializable {
    private java.lang.String bukrs;

    private java.lang.String werks;

    private java.lang.String swenr;

    private java.lang.String sgenr;

    private java.lang.String meas;

    private java.lang.String xmmeas;

    private java.lang.String measunit;

    private java.math.BigDecimal measvalue;

    public Area() {
    }

    public Area(
           java.lang.String bukrs,
           java.lang.String werks,
           java.lang.String swenr,
           java.lang.String sgenr,
           java.lang.String meas,
           java.lang.String xmmeas,
           java.lang.String measunit,
           java.math.BigDecimal measvalue) {
           this.bukrs = bukrs;
           this.werks = werks;
           this.swenr = swenr;
           this.sgenr = sgenr;
           this.meas = meas;
           this.xmmeas = xmmeas;
           this.measunit = measunit;
           this.measvalue = measvalue;
    }


    /**
     * Gets the bukrs value for this Area.
     * 
     * @return bukrs
     */
    public java.lang.String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Area.
     * 
     * @param bukrs
     */
    public void setBukrs(java.lang.String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the werks value for this Area.
     * 
     * @return werks
     */
    public java.lang.String getWerks() {
        return werks;
    }


    /**
     * Sets the werks value for this Area.
     * 
     * @param werks
     */
    public void setWerks(java.lang.String werks) {
        this.werks = werks;
    }


    /**
     * Gets the swenr value for this Area.
     * 
     * @return swenr
     */
    public java.lang.String getSwenr() {
        return swenr;
    }


    /**
     * Sets the swenr value for this Area.
     * 
     * @param swenr
     */
    public void setSwenr(java.lang.String swenr) {
        this.swenr = swenr;
    }


    /**
     * Gets the sgenr value for this Area.
     * 
     * @return sgenr
     */
    public java.lang.String getSgenr() {
        return sgenr;
    }


    /**
     * Sets the sgenr value for this Area.
     * 
     * @param sgenr
     */
    public void setSgenr(java.lang.String sgenr) {
        this.sgenr = sgenr;
    }


    /**
     * Gets the meas value for this Area.
     * 
     * @return meas
     */
    public java.lang.String getMeas() {
        return meas;
    }


    /**
     * Sets the meas value for this Area.
     * 
     * @param meas
     */
    public void setMeas(java.lang.String meas) {
        this.meas = meas;
    }


    /**
     * Gets the xmmeas value for this Area.
     * 
     * @return xmmeas
     */
    public java.lang.String getXmmeas() {
        return xmmeas;
    }


    /**
     * Sets the xmmeas value for this Area.
     * 
     * @param xmmeas
     */
    public void setXmmeas(java.lang.String xmmeas) {
        this.xmmeas = xmmeas;
    }


    /**
     * Gets the measunit value for this Area.
     * 
     * @return measunit
     */
    public java.lang.String getMeasunit() {
        return measunit;
    }


    /**
     * Sets the measunit value for this Area.
     * 
     * @param measunit
     */
    public void setMeasunit(java.lang.String measunit) {
        this.measunit = measunit;
    }


    /**
     * Gets the measvalue value for this Area.
     * 
     * @return measvalue
     */
    public java.math.BigDecimal getMeasvalue() {
        return measvalue;
    }


    /**
     * Sets the measvalue value for this Area.
     * 
     * @param measvalue
     */
    public void setMeasvalue(java.math.BigDecimal measvalue) {
        this.measvalue = measvalue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Area)) return false;
        Area other = (Area) obj;
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
            ((this.meas==null && other.getMeas()==null) || 
             (this.meas!=null &&
              this.meas.equals(other.getMeas()))) &&
            ((this.xmmeas==null && other.getXmmeas()==null) || 
             (this.xmmeas!=null &&
              this.xmmeas.equals(other.getXmmeas()))) &&
            ((this.measunit==null && other.getMeasunit()==null) || 
             (this.measunit!=null &&
              this.measunit.equals(other.getMeasunit()))) &&
            ((this.measvalue==null && other.getMeasvalue()==null) || 
             (this.measvalue!=null &&
              this.measvalue.equals(other.getMeasvalue())));
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
        if (getMeas() != null) {
            _hashCode += getMeas().hashCode();
        }
        if (getXmmeas() != null) {
            _hashCode += getXmmeas().hashCode();
        }
        if (getMeasunit() != null) {
            _hashCode += getMeasunit().hashCode();
        }
        if (getMeasvalue() != null) {
            _hashCode += getMeasvalue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Area.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Area"));
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
        elemField.setFieldName("meas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "meas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmmeas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "xmmeas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measunit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "measunit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "measvalue"));
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

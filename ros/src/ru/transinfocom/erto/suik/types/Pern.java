/**
 * Pern.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.types;

public class Pern  implements java.io.Serializable {
    private java.lang.String bukrs;

    private java.lang.String werks;

    private java.lang.String anln1;

    private java.lang.String anln2;

    private java.util.Date bdatu;

    private java.util.Date adatu;

    private java.lang.String pernrD;

    private java.lang.String ename;

    public Pern() {
    }

    public Pern(
           java.lang.String bukrs,
           java.lang.String werks,
           java.lang.String anln1,
           java.lang.String anln2,
           java.util.Date bdatu,
           java.util.Date adatu,
           java.lang.String pernrD,
           java.lang.String ename) {
           this.bukrs = bukrs;
           this.werks = werks;
           this.anln1 = anln1;
           this.anln2 = anln2;
           this.bdatu = bdatu;
           this.adatu = adatu;
           this.pernrD = pernrD;
           this.ename = ename;
    }


    /**
     * Gets the bukrs value for this Pern.
     * 
     * @return bukrs
     */
    public java.lang.String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Pern.
     * 
     * @param bukrs
     */
    public void setBukrs(java.lang.String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the werks value for this Pern.
     * 
     * @return werks
     */
    public java.lang.String getWerks() {
        return werks;
    }


    /**
     * Sets the werks value for this Pern.
     * 
     * @param werks
     */
    public void setWerks(java.lang.String werks) {
        this.werks = werks;
    }


    /**
     * Gets the anln1 value for this Pern.
     * 
     * @return anln1
     */
    public java.lang.String getAnln1() {
        return anln1;
    }


    /**
     * Sets the anln1 value for this Pern.
     * 
     * @param anln1
     */
    public void setAnln1(java.lang.String anln1) {
        this.anln1 = anln1;
    }


    /**
     * Gets the anln2 value for this Pern.
     * 
     * @return anln2
     */
    public java.lang.String getAnln2() {
        return anln2;
    }


    /**
     * Sets the anln2 value for this Pern.
     * 
     * @param anln2
     */
    public void setAnln2(java.lang.String anln2) {
        this.anln2 = anln2;
    }


    /**
     * Gets the bdatu value for this Pern.
     * 
     * @return bdatu
     */
    public java.util.Date getBdatu() {
        return bdatu;
    }


    /**
     * Sets the bdatu value for this Pern.
     * 
     * @param bdatu
     */
    public void setBdatu(java.util.Date bdatu) {
        this.bdatu = bdatu;
    }


    /**
     * Gets the adatu value for this Pern.
     * 
     * @return adatu
     */
    public java.util.Date getAdatu() {
        return adatu;
    }


    /**
     * Sets the adatu value for this Pern.
     * 
     * @param adatu
     */
    public void setAdatu(java.util.Date adatu) {
        this.adatu = adatu;
    }


    /**
     * Gets the pernrD value for this Pern.
     * 
     * @return pernrD
     */
    public java.lang.String getPernrD() {
        return pernrD;
    }


    /**
     * Sets the pernrD value for this Pern.
     * 
     * @param pernrD
     */
    public void setPernrD(java.lang.String pernrD) {
        this.pernrD = pernrD;
    }


    /**
     * Gets the ename value for this Pern.
     * 
     * @return ename
     */
    public java.lang.String getEname() {
        return ename;
    }


    /**
     * Sets the ename value for this Pern.
     * 
     * @param ename
     */
    public void setEname(java.lang.String ename) {
        this.ename = ename;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pern)) return false;
        Pern other = (Pern) obj;
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
            ((this.bdatu==null && other.getBdatu()==null) || 
             (this.bdatu!=null &&
              this.bdatu.equals(other.getBdatu()))) &&
            ((this.adatu==null && other.getAdatu()==null) || 
             (this.adatu!=null &&
              this.adatu.equals(other.getAdatu()))) &&
            ((this.pernrD==null && other.getPernrD()==null) || 
             (this.pernrD!=null &&
              this.pernrD.equals(other.getPernrD()))) &&
            ((this.ename==null && other.getEname()==null) || 
             (this.ename!=null &&
              this.ename.equals(other.getEname())));
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
        if (getBdatu() != null) {
            _hashCode += getBdatu().hashCode();
        }
        if (getAdatu() != null) {
            _hashCode += getAdatu().hashCode();
        }
        if (getPernrD() != null) {
            _hashCode += getPernrD().hashCode();
        }
        if (getEname() != null) {
            _hashCode += getEname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pern.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Pern"));
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
        elemField.setFieldName("bdatu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "bdatu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adatu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "adatu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pernrD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "pernrD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "ename"));
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

/**
 * Pere.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.types;

public class Pere  implements java.io.Serializable {
    private java.lang.String bukrs;

    private java.lang.String werks;

    private java.lang.String anln1;

    private java.lang.String anln2;

    private int gjahr;

    private int pstpo;

    private int koef;

    public Pere() {
    }

    public Pere(
           java.lang.String bukrs,
           java.lang.String werks,
           java.lang.String anln1,
           java.lang.String anln2,
           int gjahr,
           int pstpo,
           int koef) {
           this.bukrs = bukrs;
           this.werks = werks;
           this.anln1 = anln1;
           this.anln2 = anln2;
           this.gjahr = gjahr;
           this.pstpo = pstpo;
           this.koef = koef;
    }


    /**
     * Gets the bukrs value for this Pere.
     * 
     * @return bukrs
     */
    public java.lang.String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Pere.
     * 
     * @param bukrs
     */
    public void setBukrs(java.lang.String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the werks value for this Pere.
     * 
     * @return werks
     */
    public java.lang.String getWerks() {
        return werks;
    }


    /**
     * Sets the werks value for this Pere.
     * 
     * @param werks
     */
    public void setWerks(java.lang.String werks) {
        this.werks = werks;
    }


    /**
     * Gets the anln1 value for this Pere.
     * 
     * @return anln1
     */
    public java.lang.String getAnln1() {
        return anln1;
    }


    /**
     * Sets the anln1 value for this Pere.
     * 
     * @param anln1
     */
    public void setAnln1(java.lang.String anln1) {
        this.anln1 = anln1;
    }


    /**
     * Gets the anln2 value for this Pere.
     * 
     * @return anln2
     */
    public java.lang.String getAnln2() {
        return anln2;
    }


    /**
     * Sets the anln2 value for this Pere.
     * 
     * @param anln2
     */
    public void setAnln2(java.lang.String anln2) {
        this.anln2 = anln2;
    }


    /**
     * Gets the gjahr value for this Pere.
     * 
     * @return gjahr
     */
    public int getGjahr() {
        return gjahr;
    }


    /**
     * Sets the gjahr value for this Pere.
     * 
     * @param gjahr
     */
    public void setGjahr(int gjahr) {
        this.gjahr = gjahr;
    }


    /**
     * Gets the pstpo value for this Pere.
     * 
     * @return pstpo
     */
    public int getPstpo() {
        return pstpo;
    }


    /**
     * Sets the pstpo value for this Pere.
     * 
     * @param pstpo
     */
    public void setPstpo(int pstpo) {
        this.pstpo = pstpo;
    }


    /**
     * Gets the koef value for this Pere.
     * 
     * @return koef
     */
    public int getKoef() {
        return koef;
    }


    /**
     * Sets the koef value for this Pere.
     * 
     * @param koef
     */
    public void setKoef(int koef) {
        this.koef = koef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pere)) return false;
        Pere other = (Pere) obj;
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
            this.gjahr == other.getGjahr() &&
            this.pstpo == other.getPstpo() &&
            this.koef == other.getKoef();
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
        _hashCode += getGjahr();
        _hashCode += getPstpo();
        _hashCode += getKoef();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pere.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Pere"));
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
        elemField.setFieldName("gjahr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "gjahr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pstpo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "pstpo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "koef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

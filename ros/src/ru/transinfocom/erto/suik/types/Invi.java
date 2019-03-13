/**
 * Invi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.types;

public class Invi  implements java.io.Serializable {
    private java.lang.String bukrs;

    private java.lang.String werks;

    private java.lang.String anln1;

    private java.lang.String anln2;

    private int nomst;

    private java.lang.String text1;

    private java.lang.String text2;

    private java.lang.String text3;

    private java.lang.String text4;

    private java.lang.String text5;

    private java.lang.String text6;

    private java.lang.String text7;

    public Invi() {
    }

    public Invi(
           java.lang.String bukrs,
           java.lang.String werks,
           java.lang.String anln1,
           java.lang.String anln2,
           int nomst,
           java.lang.String text1,
           java.lang.String text2,
           java.lang.String text3,
           java.lang.String text4,
           java.lang.String text5,
           java.lang.String text6,
           java.lang.String text7) {
           this.bukrs = bukrs;
           this.werks = werks;
           this.anln1 = anln1;
           this.anln2 = anln2;
           this.nomst = nomst;
           this.text1 = text1;
           this.text2 = text2;
           this.text3 = text3;
           this.text4 = text4;
           this.text5 = text5;
           this.text6 = text6;
           this.text7 = text7;
    }


    /**
     * Gets the bukrs value for this Invi.
     * 
     * @return bukrs
     */
    public java.lang.String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Invi.
     * 
     * @param bukrs
     */
    public void setBukrs(java.lang.String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the werks value for this Invi.
     * 
     * @return werks
     */
    public java.lang.String getWerks() {
        return werks;
    }


    /**
     * Sets the werks value for this Invi.
     * 
     * @param werks
     */
    public void setWerks(java.lang.String werks) {
        this.werks = werks;
    }


    /**
     * Gets the anln1 value for this Invi.
     * 
     * @return anln1
     */
    public java.lang.String getAnln1() {
        return anln1;
    }


    /**
     * Sets the anln1 value for this Invi.
     * 
     * @param anln1
     */
    public void setAnln1(java.lang.String anln1) {
        this.anln1 = anln1;
    }


    /**
     * Gets the anln2 value for this Invi.
     * 
     * @return anln2
     */
    public java.lang.String getAnln2() {
        return anln2;
    }


    /**
     * Sets the anln2 value for this Invi.
     * 
     * @param anln2
     */
    public void setAnln2(java.lang.String anln2) {
        this.anln2 = anln2;
    }


    /**
     * Gets the nomst value for this Invi.
     * 
     * @return nomst
     */
    public int getNomst() {
        return nomst;
    }


    /**
     * Sets the nomst value for this Invi.
     * 
     * @param nomst
     */
    public void setNomst(int nomst) {
        this.nomst = nomst;
    }


    /**
     * Gets the text1 value for this Invi.
     * 
     * @return text1
     */
    public java.lang.String getText1() {
        return text1;
    }


    /**
     * Sets the text1 value for this Invi.
     * 
     * @param text1
     */
    public void setText1(java.lang.String text1) {
        this.text1 = text1;
    }


    /**
     * Gets the text2 value for this Invi.
     * 
     * @return text2
     */
    public java.lang.String getText2() {
        return text2;
    }


    /**
     * Sets the text2 value for this Invi.
     * 
     * @param text2
     */
    public void setText2(java.lang.String text2) {
        this.text2 = text2;
    }


    /**
     * Gets the text3 value for this Invi.
     * 
     * @return text3
     */
    public java.lang.String getText3() {
        return text3;
    }


    /**
     * Sets the text3 value for this Invi.
     * 
     * @param text3
     */
    public void setText3(java.lang.String text3) {
        this.text3 = text3;
    }


    /**
     * Gets the text4 value for this Invi.
     * 
     * @return text4
     */
    public java.lang.String getText4() {
        return text4;
    }


    /**
     * Sets the text4 value for this Invi.
     * 
     * @param text4
     */
    public void setText4(java.lang.String text4) {
        this.text4 = text4;
    }


    /**
     * Gets the text5 value for this Invi.
     * 
     * @return text5
     */
    public java.lang.String getText5() {
        return text5;
    }


    /**
     * Sets the text5 value for this Invi.
     * 
     * @param text5
     */
    public void setText5(java.lang.String text5) {
        this.text5 = text5;
    }


    /**
     * Gets the text6 value for this Invi.
     * 
     * @return text6
     */
    public java.lang.String getText6() {
        return text6;
    }


    /**
     * Sets the text6 value for this Invi.
     * 
     * @param text6
     */
    public void setText6(java.lang.String text6) {
        this.text6 = text6;
    }


    /**
     * Gets the text7 value for this Invi.
     * 
     * @return text7
     */
    public java.lang.String getText7() {
        return text7;
    }


    /**
     * Sets the text7 value for this Invi.
     * 
     * @param text7
     */
    public void setText7(java.lang.String text7) {
        this.text7 = text7;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Invi)) return false;
        Invi other = (Invi) obj;
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
            this.nomst == other.getNomst() &&
            ((this.text1==null && other.getText1()==null) || 
             (this.text1!=null &&
              this.text1.equals(other.getText1()))) &&
            ((this.text2==null && other.getText2()==null) || 
             (this.text2!=null &&
              this.text2.equals(other.getText2()))) &&
            ((this.text3==null && other.getText3()==null) || 
             (this.text3!=null &&
              this.text3.equals(other.getText3()))) &&
            ((this.text4==null && other.getText4()==null) || 
             (this.text4!=null &&
              this.text4.equals(other.getText4()))) &&
            ((this.text5==null && other.getText5()==null) || 
             (this.text5!=null &&
              this.text5.equals(other.getText5()))) &&
            ((this.text6==null && other.getText6()==null) || 
             (this.text6!=null &&
              this.text6.equals(other.getText6()))) &&
            ((this.text7==null && other.getText7()==null) || 
             (this.text7!=null &&
              this.text7.equals(other.getText7())));
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
        _hashCode += getNomst();
        if (getText1() != null) {
            _hashCode += getText1().hashCode();
        }
        if (getText2() != null) {
            _hashCode += getText2().hashCode();
        }
        if (getText3() != null) {
            _hashCode += getText3().hashCode();
        }
        if (getText4() != null) {
            _hashCode += getText4().hashCode();
        }
        if (getText5() != null) {
            _hashCode += getText5().hashCode();
        }
        if (getText6() != null) {
            _hashCode += getText6().hashCode();
        }
        if (getText7() != null) {
            _hashCode += getText7().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Invi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Invi"));
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
        elemField.setFieldName("nomst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "nomst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "text1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "text2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "text3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "text4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "text5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "text6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "text7"));
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

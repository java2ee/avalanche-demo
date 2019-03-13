/**
 * Contrct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.types;

public class Contrct  implements java.io.Serializable {
    private java.lang.String bukrs;

    private java.lang.String swenr;

    private java.lang.String werks;

    private java.lang.String sgenr;

    private java.lang.String recntype;

    private java.lang.String zzerpnum;

    private java.lang.String lifnr;

    private java.lang.String xmbez;

    private java.util.Date recndat;

    private java.lang.String name1;

    private java.lang.String srok;

    public Contrct() {
    }

    public Contrct(
           java.lang.String bukrs,
           java.lang.String swenr,
           java.lang.String werks,
           java.lang.String sgenr,
           java.lang.String recntype,
           java.lang.String zzerpnum,
           java.lang.String lifnr,
           java.lang.String xmbez,
           java.util.Date recndat,
           java.lang.String name1,
           java.lang.String srok) {
           this.bukrs = bukrs;
           this.swenr = swenr;
           this.werks = werks;
           this.sgenr = sgenr;
           this.recntype = recntype;
           this.zzerpnum = zzerpnum;
           this.lifnr = lifnr;
           this.xmbez = xmbez;
           this.recndat = recndat;
           this.name1 = name1;
           this.srok = srok;
    }


    /**
     * Gets the bukrs value for this Contrct.
     * 
     * @return bukrs
     */
    public java.lang.String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Contrct.
     * 
     * @param bukrs
     */
    public void setBukrs(java.lang.String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the swenr value for this Contrct.
     * 
     * @return swenr
     */
    public java.lang.String getSwenr() {
        return swenr;
    }


    /**
     * Sets the swenr value for this Contrct.
     * 
     * @param swenr
     */
    public void setSwenr(java.lang.String swenr) {
        this.swenr = swenr;
    }


    /**
     * Gets the werks value for this Contrct.
     * 
     * @return werks
     */
    public java.lang.String getWerks() {
        return werks;
    }


    /**
     * Sets the werks value for this Contrct.
     * 
     * @param werks
     */
    public void setWerks(java.lang.String werks) {
        this.werks = werks;
    }


    /**
     * Gets the sgenr value for this Contrct.
     * 
     * @return sgenr
     */
    public java.lang.String getSgenr() {
        return sgenr;
    }


    /**
     * Sets the sgenr value for this Contrct.
     * 
     * @param sgenr
     */
    public void setSgenr(java.lang.String sgenr) {
        this.sgenr = sgenr;
    }


    /**
     * Gets the recntype value for this Contrct.
     * 
     * @return recntype
     */
    public java.lang.String getRecntype() {
        return recntype;
    }


    /**
     * Sets the recntype value for this Contrct.
     * 
     * @param recntype
     */
    public void setRecntype(java.lang.String recntype) {
        this.recntype = recntype;
    }


    /**
     * Gets the zzerpnum value for this Contrct.
     * 
     * @return zzerpnum
     */
    public java.lang.String getZzerpnum() {
        return zzerpnum;
    }


    /**
     * Sets the zzerpnum value for this Contrct.
     * 
     * @param zzerpnum
     */
    public void setZzerpnum(java.lang.String zzerpnum) {
        this.zzerpnum = zzerpnum;
    }


    /**
     * Gets the lifnr value for this Contrct.
     * 
     * @return lifnr
     */
    public java.lang.String getLifnr() {
        return lifnr;
    }


    /**
     * Sets the lifnr value for this Contrct.
     * 
     * @param lifnr
     */
    public void setLifnr(java.lang.String lifnr) {
        this.lifnr = lifnr;
    }


    /**
     * Gets the xmbez value for this Contrct.
     * 
     * @return xmbez
     */
    public java.lang.String getXmbez() {
        return xmbez;
    }


    /**
     * Sets the xmbez value for this Contrct.
     * 
     * @param xmbez
     */
    public void setXmbez(java.lang.String xmbez) {
        this.xmbez = xmbez;
    }


    /**
     * Gets the recndat value for this Contrct.
     * 
     * @return recndat
     */
    public java.util.Date getRecndat() {
        return recndat;
    }


    /**
     * Sets the recndat value for this Contrct.
     * 
     * @param recndat
     */
    public void setRecndat(java.util.Date recndat) {
        this.recndat = recndat;
    }


    /**
     * Gets the name1 value for this Contrct.
     * 
     * @return name1
     */
    public java.lang.String getName1() {
        return name1;
    }


    /**
     * Sets the name1 value for this Contrct.
     * 
     * @param name1
     */
    public void setName1(java.lang.String name1) {
        this.name1 = name1;
    }


    /**
     * Gets the srok value for this Contrct.
     * 
     * @return srok
     */
    public java.lang.String getSrok() {
        return srok;
    }


    /**
     * Sets the srok value for this Contrct.
     * 
     * @param srok
     */
    public void setSrok(java.lang.String srok) {
        this.srok = srok;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contrct)) return false;
        Contrct other = (Contrct) obj;
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
            ((this.swenr==null && other.getSwenr()==null) || 
             (this.swenr!=null &&
              this.swenr.equals(other.getSwenr()))) &&
            ((this.werks==null && other.getWerks()==null) || 
             (this.werks!=null &&
              this.werks.equals(other.getWerks()))) &&
            ((this.sgenr==null && other.getSgenr()==null) || 
             (this.sgenr!=null &&
              this.sgenr.equals(other.getSgenr()))) &&
            ((this.recntype==null && other.getRecntype()==null) || 
             (this.recntype!=null &&
              this.recntype.equals(other.getRecntype()))) &&
            ((this.zzerpnum==null && other.getZzerpnum()==null) || 
             (this.zzerpnum!=null &&
              this.zzerpnum.equals(other.getZzerpnum()))) &&
            ((this.lifnr==null && other.getLifnr()==null) || 
             (this.lifnr!=null &&
              this.lifnr.equals(other.getLifnr()))) &&
            ((this.xmbez==null && other.getXmbez()==null) || 
             (this.xmbez!=null &&
              this.xmbez.equals(other.getXmbez()))) &&
            ((this.recndat==null && other.getRecndat()==null) || 
             (this.recndat!=null &&
              this.recndat.equals(other.getRecndat()))) &&
            ((this.name1==null && other.getName1()==null) || 
             (this.name1!=null &&
              this.name1.equals(other.getName1()))) &&
            ((this.srok==null && other.getSrok()==null) || 
             (this.srok!=null &&
              this.srok.equals(other.getSrok())));
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
        if (getSwenr() != null) {
            _hashCode += getSwenr().hashCode();
        }
        if (getWerks() != null) {
            _hashCode += getWerks().hashCode();
        }
        if (getSgenr() != null) {
            _hashCode += getSgenr().hashCode();
        }
        if (getRecntype() != null) {
            _hashCode += getRecntype().hashCode();
        }
        if (getZzerpnum() != null) {
            _hashCode += getZzerpnum().hashCode();
        }
        if (getLifnr() != null) {
            _hashCode += getLifnr().hashCode();
        }
        if (getXmbez() != null) {
            _hashCode += getXmbez().hashCode();
        }
        if (getRecndat() != null) {
            _hashCode += getRecndat().hashCode();
        }
        if (getName1() != null) {
            _hashCode += getName1().hashCode();
        }
        if (getSrok() != null) {
            _hashCode += getSrok().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contrct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Contrct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bukrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "bukrs"));
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
        elemField.setFieldName("werks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "werks"));
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
        elemField.setFieldName("recntype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "recntype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzerpnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "zzerpnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "lifnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmbez");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "xmbez"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recndat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "recndat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "name1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srok");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "srok"));
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

/**
 * Neuo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.types;

public class Neuo  implements java.io.Serializable {
    private java.lang.String bukrs;

    private java.lang.String swenr;

    private java.lang.String werks;

    private java.lang.String sgenr;

    private java.lang.String zznumnetcoi_n;

    private int planoptyear;

    private java.lang.String planoptquarter;

    private java.math.BigDecimal plandismountcost;

    private java.util.Date zzvalidto;

    private java.lang.String list_number;

    public Neuo() {
    }

    public Neuo(
           java.lang.String bukrs,
           java.lang.String swenr,
           java.lang.String werks,
           java.lang.String sgenr,
           java.lang.String zznumnetcoi_n,
           int planoptyear,
           java.lang.String planoptquarter,
           java.math.BigDecimal plandismountcost,
           java.util.Date zzvalidto,
           java.lang.String list_number) {
           this.bukrs = bukrs;
           this.swenr = swenr;
           this.werks = werks;
           this.sgenr = sgenr;
           this.zznumnetcoi_n = zznumnetcoi_n;
           this.planoptyear = planoptyear;
           this.planoptquarter = planoptquarter;
           this.plandismountcost = plandismountcost;
           this.zzvalidto = zzvalidto;
           this.list_number = list_number;
    }


    /**
     * Gets the bukrs value for this Neuo.
     * 
     * @return bukrs
     */
    public java.lang.String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Neuo.
     * 
     * @param bukrs
     */
    public void setBukrs(java.lang.String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the swenr value for this Neuo.
     * 
     * @return swenr
     */
    public java.lang.String getSwenr() {
        return swenr;
    }


    /**
     * Sets the swenr value for this Neuo.
     * 
     * @param swenr
     */
    public void setSwenr(java.lang.String swenr) {
        this.swenr = swenr;
    }


    /**
     * Gets the werks value for this Neuo.
     * 
     * @return werks
     */
    public java.lang.String getWerks() {
        return werks;
    }


    /**
     * Sets the werks value for this Neuo.
     * 
     * @param werks
     */
    public void setWerks(java.lang.String werks) {
        this.werks = werks;
    }


    /**
     * Gets the sgenr value for this Neuo.
     * 
     * @return sgenr
     */
    public java.lang.String getSgenr() {
        return sgenr;
    }


    /**
     * Sets the sgenr value for this Neuo.
     * 
     * @param sgenr
     */
    public void setSgenr(java.lang.String sgenr) {
        this.sgenr = sgenr;
    }


    /**
     * Gets the zznumnetcoi_n value for this Neuo.
     * 
     * @return zznumnetcoi_n
     */
    public java.lang.String getZznumnetcoi_n() {
        return zznumnetcoi_n;
    }


    /**
     * Sets the zznumnetcoi_n value for this Neuo.
     * 
     * @param zznumnetcoi_n
     */
    public void setZznumnetcoi_n(java.lang.String zznumnetcoi_n) {
        this.zznumnetcoi_n = zznumnetcoi_n;
    }


    /**
     * Gets the planoptyear value for this Neuo.
     * 
     * @return planoptyear
     */
    public int getPlanoptyear() {
        return planoptyear;
    }


    /**
     * Sets the planoptyear value for this Neuo.
     * 
     * @param planoptyear
     */
    public void setPlanoptyear(int planoptyear) {
        this.planoptyear = planoptyear;
    }


    /**
     * Gets the planoptquarter value for this Neuo.
     * 
     * @return planoptquarter
     */
    public java.lang.String getPlanoptquarter() {
        return planoptquarter;
    }


    /**
     * Sets the planoptquarter value for this Neuo.
     * 
     * @param planoptquarter
     */
    public void setPlanoptquarter(java.lang.String planoptquarter) {
        this.planoptquarter = planoptquarter;
    }


    /**
     * Gets the plandismountcost value for this Neuo.
     * 
     * @return plandismountcost
     */
    public java.math.BigDecimal getPlandismountcost() {
        return plandismountcost;
    }


    /**
     * Sets the plandismountcost value for this Neuo.
     * 
     * @param plandismountcost
     */
    public void setPlandismountcost(java.math.BigDecimal plandismountcost) {
        this.plandismountcost = plandismountcost;
    }


    /**
     * Gets the zzvalidto value for this Neuo.
     * 
     * @return zzvalidto
     */
    public java.util.Date getZzvalidto() {
        return zzvalidto;
    }


    /**
     * Sets the zzvalidto value for this Neuo.
     * 
     * @param zzvalidto
     */
    public void setZzvalidto(java.util.Date zzvalidto) {
        this.zzvalidto = zzvalidto;
    }


    /**
     * Gets the list_number value for this Neuo.
     * 
     * @return list_number
     */
    public java.lang.String getList_number() {
        return list_number;
    }


    /**
     * Sets the list_number value for this Neuo.
     * 
     * @param list_number
     */
    public void setList_number(java.lang.String list_number) {
        this.list_number = list_number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Neuo)) return false;
        Neuo other = (Neuo) obj;
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
            ((this.zznumnetcoi_n==null && other.getZznumnetcoi_n()==null) || 
             (this.zznumnetcoi_n!=null &&
              this.zznumnetcoi_n.equals(other.getZznumnetcoi_n()))) &&
            this.planoptyear == other.getPlanoptyear() &&
            ((this.planoptquarter==null && other.getPlanoptquarter()==null) || 
             (this.planoptquarter!=null &&
              this.planoptquarter.equals(other.getPlanoptquarter()))) &&
            ((this.plandismountcost==null && other.getPlandismountcost()==null) || 
             (this.plandismountcost!=null &&
              this.plandismountcost.equals(other.getPlandismountcost()))) &&
            ((this.zzvalidto==null && other.getZzvalidto()==null) || 
             (this.zzvalidto!=null &&
              this.zzvalidto.equals(other.getZzvalidto()))) &&
            ((this.list_number==null && other.getList_number()==null) || 
             (this.list_number!=null &&
              this.list_number.equals(other.getList_number())));
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
        if (getZznumnetcoi_n() != null) {
            _hashCode += getZznumnetcoi_n().hashCode();
        }
        _hashCode += getPlanoptyear();
        if (getPlanoptquarter() != null) {
            _hashCode += getPlanoptquarter().hashCode();
        }
        if (getPlandismountcost() != null) {
            _hashCode += getPlandismountcost().hashCode();
        }
        if (getZzvalidto() != null) {
            _hashCode += getZzvalidto().hashCode();
        }
        if (getList_number() != null) {
            _hashCode += getList_number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Neuo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Neuo"));
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
        elemField.setFieldName("zznumnetcoi_n");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "zznumnetcoi_n"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planoptyear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "planoptyear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planoptquarter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "planoptquarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plandismountcost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "plandismountcost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzvalidto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "zzvalidto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "list_number"));
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

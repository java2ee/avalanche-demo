/**
 * LoadDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.transinfocom.erto.suik.service;

public class LoadDataRequest  implements java.io.Serializable {
    private ru.transinfocom.erto.suik.types.OsData[] osData;

    private ru.transinfocom.erto.suik.types.Area[] area;

    private ru.transinfocom.erto.suik.types.Equip[] equip;

    private ru.transinfocom.erto.suik.types.Contrct[] contrct;

    private ru.transinfocom.erto.suik.types.Osdan[] osdan;

    private ru.transinfocom.erto.suik.types.Krem[] krem;

    private ru.transinfocom.erto.suik.types.Pere[] pere;

    private ru.transinfocom.erto.suik.types.Move[] move;

    private ru.transinfocom.erto.suik.types.Pern[] pern;

    private ru.transinfocom.erto.suik.types.Invi[] invi;

    private ru.transinfocom.erto.suik.types.Oson[] oson;

    private ru.transinfocom.erto.suik.types.Value[] value;

    private ru.transinfocom.erto.suik.types.Neuo[] neuo;

    private ru.transinfocom.erto.suik.types.Neud[] neud;

    private ru.transinfocom.erto.suik.types.Transfer[] transfer;

    public LoadDataRequest() {
    }

    public LoadDataRequest(
           ru.transinfocom.erto.suik.types.OsData[] osData,
           ru.transinfocom.erto.suik.types.Area[] area,
           ru.transinfocom.erto.suik.types.Equip[] equip,
           ru.transinfocom.erto.suik.types.Contrct[] contrct,
           ru.transinfocom.erto.suik.types.Osdan[] osdan,
           ru.transinfocom.erto.suik.types.Krem[] krem,
           ru.transinfocom.erto.suik.types.Pere[] pere,
           ru.transinfocom.erto.suik.types.Move[] move,
           ru.transinfocom.erto.suik.types.Pern[] pern,
           ru.transinfocom.erto.suik.types.Invi[] invi,
           ru.transinfocom.erto.suik.types.Oson[] oson,
           ru.transinfocom.erto.suik.types.Value[] value,
           ru.transinfocom.erto.suik.types.Neuo[] neuo,
           ru.transinfocom.erto.suik.types.Neud[] neud,
           ru.transinfocom.erto.suik.types.Transfer[] transfer) {
           this.osData = osData;
           this.area = area;
           this.equip = equip;
           this.contrct = contrct;
           this.osdan = osdan;
           this.krem = krem;
           this.pere = pere;
           this.move = move;
           this.pern = pern;
           this.invi = invi;
           this.oson = oson;
           this.value = value;
           this.neuo = neuo;
           this.neud = neud;
           this.transfer = transfer;
    }


    /**
     * Gets the osData value for this LoadDataRequest.
     * 
     * @return osData
     */
    public ru.transinfocom.erto.suik.types.OsData[] getOsData() {
        return osData;
    }


    /**
     * Sets the osData value for this LoadDataRequest.
     * 
     * @param osData
     */
    public void setOsData(ru.transinfocom.erto.suik.types.OsData[] osData) {
        this.osData = osData;
    }

    public ru.transinfocom.erto.suik.types.OsData getOsData(int i) {
        return this.osData[i];
    }

    public void setOsData(int i, ru.transinfocom.erto.suik.types.OsData _value) {
        this.osData[i] = _value;
    }


    /**
     * Gets the area value for this LoadDataRequest.
     * 
     * @return area
     */
    public ru.transinfocom.erto.suik.types.Area[] getArea() {
        return area;
    }


    /**
     * Sets the area value for this LoadDataRequest.
     * 
     * @param area
     */
    public void setArea(ru.transinfocom.erto.suik.types.Area[] area) {
        this.area = area;
    }

    public ru.transinfocom.erto.suik.types.Area getArea(int i) {
        return this.area[i];
    }

    public void setArea(int i, ru.transinfocom.erto.suik.types.Area _value) {
        this.area[i] = _value;
    }


    /**
     * Gets the equip value for this LoadDataRequest.
     * 
     * @return equip
     */
    public ru.transinfocom.erto.suik.types.Equip[] getEquip() {
        return equip;
    }


    /**
     * Sets the equip value for this LoadDataRequest.
     * 
     * @param equip
     */
    public void setEquip(ru.transinfocom.erto.suik.types.Equip[] equip) {
        this.equip = equip;
    }

    public ru.transinfocom.erto.suik.types.Equip getEquip(int i) {
        return this.equip[i];
    }

    public void setEquip(int i, ru.transinfocom.erto.suik.types.Equip _value) {
        this.equip[i] = _value;
    }


    /**
     * Gets the contrct value for this LoadDataRequest.
     * 
     * @return contrct
     */
    public ru.transinfocom.erto.suik.types.Contrct[] getContrct() {
        return contrct;
    }


    /**
     * Sets the contrct value for this LoadDataRequest.
     * 
     * @param contrct
     */
    public void setContrct(ru.transinfocom.erto.suik.types.Contrct[] contrct) {
        this.contrct = contrct;
    }

    public ru.transinfocom.erto.suik.types.Contrct getContrct(int i) {
        return this.contrct[i];
    }

    public void setContrct(int i, ru.transinfocom.erto.suik.types.Contrct _value) {
        this.contrct[i] = _value;
    }


    /**
     * Gets the osdan value for this LoadDataRequest.
     * 
     * @return osdan
     */
    public ru.transinfocom.erto.suik.types.Osdan[] getOsdan() {
        return osdan;
    }


    /**
     * Sets the osdan value for this LoadDataRequest.
     * 
     * @param osdan
     */
    public void setOsdan(ru.transinfocom.erto.suik.types.Osdan[] osdan) {
        this.osdan = osdan;
    }

    public ru.transinfocom.erto.suik.types.Osdan getOsdan(int i) {
        return this.osdan[i];
    }

    public void setOsdan(int i, ru.transinfocom.erto.suik.types.Osdan _value) {
        this.osdan[i] = _value;
    }


    /**
     * Gets the krem value for this LoadDataRequest.
     * 
     * @return krem
     */
    public ru.transinfocom.erto.suik.types.Krem[] getKrem() {
        return krem;
    }


    /**
     * Sets the krem value for this LoadDataRequest.
     * 
     * @param krem
     */
    public void setKrem(ru.transinfocom.erto.suik.types.Krem[] krem) {
        this.krem = krem;
    }

    public ru.transinfocom.erto.suik.types.Krem getKrem(int i) {
        return this.krem[i];
    }

    public void setKrem(int i, ru.transinfocom.erto.suik.types.Krem _value) {
        this.krem[i] = _value;
    }


    /**
     * Gets the pere value for this LoadDataRequest.
     * 
     * @return pere
     */
    public ru.transinfocom.erto.suik.types.Pere[] getPere() {
        return pere;
    }


    /**
     * Sets the pere value for this LoadDataRequest.
     * 
     * @param pere
     */
    public void setPere(ru.transinfocom.erto.suik.types.Pere[] pere) {
        this.pere = pere;
    }

    public ru.transinfocom.erto.suik.types.Pere getPere(int i) {
        return this.pere[i];
    }

    public void setPere(int i, ru.transinfocom.erto.suik.types.Pere _value) {
        this.pere[i] = _value;
    }


    /**
     * Gets the move value for this LoadDataRequest.
     * 
     * @return move
     */
    public ru.transinfocom.erto.suik.types.Move[] getMove() {
        return move;
    }


    /**
     * Sets the move value for this LoadDataRequest.
     * 
     * @param move
     */
    public void setMove(ru.transinfocom.erto.suik.types.Move[] move) {
        this.move = move;
    }

    public ru.transinfocom.erto.suik.types.Move getMove(int i) {
        return this.move[i];
    }

    public void setMove(int i, ru.transinfocom.erto.suik.types.Move _value) {
        this.move[i] = _value;
    }


    /**
     * Gets the pern value for this LoadDataRequest.
     * 
     * @return pern
     */
    public ru.transinfocom.erto.suik.types.Pern[] getPern() {
        return pern;
    }


    /**
     * Sets the pern value for this LoadDataRequest.
     * 
     * @param pern
     */
    public void setPern(ru.transinfocom.erto.suik.types.Pern[] pern) {
        this.pern = pern;
    }

    public ru.transinfocom.erto.suik.types.Pern getPern(int i) {
        return this.pern[i];
    }

    public void setPern(int i, ru.transinfocom.erto.suik.types.Pern _value) {
        this.pern[i] = _value;
    }


    /**
     * Gets the invi value for this LoadDataRequest.
     * 
     * @return invi
     */
    public ru.transinfocom.erto.suik.types.Invi[] getInvi() {
        return invi;
    }


    /**
     * Sets the invi value for this LoadDataRequest.
     * 
     * @param invi
     */
    public void setInvi(ru.transinfocom.erto.suik.types.Invi[] invi) {
        this.invi = invi;
    }

    public ru.transinfocom.erto.suik.types.Invi getInvi(int i) {
        return this.invi[i];
    }

    public void setInvi(int i, ru.transinfocom.erto.suik.types.Invi _value) {
        this.invi[i] = _value;
    }


    /**
     * Gets the oson value for this LoadDataRequest.
     * 
     * @return oson
     */
    public ru.transinfocom.erto.suik.types.Oson[] getOson() {
        return oson;
    }


    /**
     * Sets the oson value for this LoadDataRequest.
     * 
     * @param oson
     */
    public void setOson(ru.transinfocom.erto.suik.types.Oson[] oson) {
        this.oson = oson;
    }

    public ru.transinfocom.erto.suik.types.Oson getOson(int i) {
        return this.oson[i];
    }

    public void setOson(int i, ru.transinfocom.erto.suik.types.Oson _value) {
        this.oson[i] = _value;
    }


    /**
     * Gets the value value for this LoadDataRequest.
     * 
     * @return value
     */
    public ru.transinfocom.erto.suik.types.Value[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this LoadDataRequest.
     * 
     * @param value
     */
    public void setValue(ru.transinfocom.erto.suik.types.Value[] value) {
        this.value = value;
    }

    public ru.transinfocom.erto.suik.types.Value getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, ru.transinfocom.erto.suik.types.Value _value) {
        this.value[i] = _value;
    }


    /**
     * Gets the neuo value for this LoadDataRequest.
     * 
     * @return neuo
     */
    public ru.transinfocom.erto.suik.types.Neuo[] getNeuo() {
        return neuo;
    }


    /**
     * Sets the neuo value for this LoadDataRequest.
     * 
     * @param neuo
     */
    public void setNeuo(ru.transinfocom.erto.suik.types.Neuo[] neuo) {
        this.neuo = neuo;
    }

    public ru.transinfocom.erto.suik.types.Neuo getNeuo(int i) {
        return this.neuo[i];
    }

    public void setNeuo(int i, ru.transinfocom.erto.suik.types.Neuo _value) {
        this.neuo[i] = _value;
    }


    /**
     * Gets the neud value for this LoadDataRequest.
     * 
     * @return neud
     */
    public ru.transinfocom.erto.suik.types.Neud[] getNeud() {
        return neud;
    }


    /**
     * Sets the neud value for this LoadDataRequest.
     * 
     * @param neud
     */
    public void setNeud(ru.transinfocom.erto.suik.types.Neud[] neud) {
        this.neud = neud;
    }

    public ru.transinfocom.erto.suik.types.Neud getNeud(int i) {
        return this.neud[i];
    }

    public void setNeud(int i, ru.transinfocom.erto.suik.types.Neud _value) {
        this.neud[i] = _value;
    }


    /**
     * Gets the transfer value for this LoadDataRequest.
     * 
     * @return transfer
     */
    public ru.transinfocom.erto.suik.types.Transfer[] getTransfer() {
        return transfer;
    }


    /**
     * Sets the transfer value for this LoadDataRequest.
     * 
     * @param transfer
     */
    public void setTransfer(ru.transinfocom.erto.suik.types.Transfer[] transfer) {
        this.transfer = transfer;
    }

    public ru.transinfocom.erto.suik.types.Transfer getTransfer(int i) {
        return this.transfer[i];
    }

    public void setTransfer(int i, ru.transinfocom.erto.suik.types.Transfer _value) {
        this.transfer[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadDataRequest)) return false;
        LoadDataRequest other = (LoadDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.osData==null && other.getOsData()==null) || 
             (this.osData!=null &&
              java.util.Arrays.equals(this.osData, other.getOsData()))) &&
            ((this.area==null && other.getArea()==null) || 
             (this.area!=null &&
              java.util.Arrays.equals(this.area, other.getArea()))) &&
            ((this.equip==null && other.getEquip()==null) || 
             (this.equip!=null &&
              java.util.Arrays.equals(this.equip, other.getEquip()))) &&
            ((this.contrct==null && other.getContrct()==null) || 
             (this.contrct!=null &&
              java.util.Arrays.equals(this.contrct, other.getContrct()))) &&
            ((this.osdan==null && other.getOsdan()==null) || 
             (this.osdan!=null &&
              java.util.Arrays.equals(this.osdan, other.getOsdan()))) &&
            ((this.krem==null && other.getKrem()==null) || 
             (this.krem!=null &&
              java.util.Arrays.equals(this.krem, other.getKrem()))) &&
            ((this.pere==null && other.getPere()==null) || 
             (this.pere!=null &&
              java.util.Arrays.equals(this.pere, other.getPere()))) &&
            ((this.move==null && other.getMove()==null) || 
             (this.move!=null &&
              java.util.Arrays.equals(this.move, other.getMove()))) &&
            ((this.pern==null && other.getPern()==null) || 
             (this.pern!=null &&
              java.util.Arrays.equals(this.pern, other.getPern()))) &&
            ((this.invi==null && other.getInvi()==null) || 
             (this.invi!=null &&
              java.util.Arrays.equals(this.invi, other.getInvi()))) &&
            ((this.oson==null && other.getOson()==null) || 
             (this.oson!=null &&
              java.util.Arrays.equals(this.oson, other.getOson()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue()))) &&
            ((this.neuo==null && other.getNeuo()==null) || 
             (this.neuo!=null &&
              java.util.Arrays.equals(this.neuo, other.getNeuo()))) &&
            ((this.neud==null && other.getNeud()==null) || 
             (this.neud!=null &&
              java.util.Arrays.equals(this.neud, other.getNeud()))) &&
            ((this.transfer==null && other.getTransfer()==null) || 
             (this.transfer!=null &&
              java.util.Arrays.equals(this.transfer, other.getTransfer())));
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
        if (getOsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOsData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArea() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArea());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArea(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEquip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEquip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEquip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContrct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContrct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContrct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOsdan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOsdan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOsdan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKrem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKrem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKrem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPere() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPere());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPere(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMove() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMove());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMove(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPern() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPern());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPern(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvi());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvi(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOson() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOson());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOson(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNeuo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNeuo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNeuo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNeud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNeud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNeud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransfer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransfer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransfer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/service", ">loadDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "OsData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("area");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Area"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Equip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Equip"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contrct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Contrct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Contrct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osdan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Osdan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Osdan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("krem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Krem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Krem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pere");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Pere"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("move");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Move"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Move"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Pern"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Invi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Invi"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oson");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Oson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Oson"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Value"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neuo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Neuo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Neuo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Neud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Neud"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Transfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://suik.erto.transinfocom.ru/types", "Transfer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

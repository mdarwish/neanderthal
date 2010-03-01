//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:20:12 PM EST 
//


package org.acord.standards.pc_surety.acord1.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FarmSubLocation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarmSubLocation_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FarmRanchTypeCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OperationsDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LandArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LandUseCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LandOwnershipCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FarmedByCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NoStructuresInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HorseOperationsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="LocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="SubLocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarmSubLocation_Type", propOrder = {
    "farmRanchTypeCd",
    "operationsDesc",
    "landArea",
    "landUseCd",
    "landOwnershipCd",
    "farmedByCd",
    "noStructuresInd",
    "horseOperationsInfo"
})
public class FarmSubLocationType {

    @XmlElement(name = "FarmRanchTypeCd")
    protected List<FarmRanchType> farmRanchTypeCd;
    @XmlElement(name = "OperationsDesc")
    protected C255 operationsDesc;
    @XmlElement(name = "LandArea")
    protected MEASUREMENT landArea;
    @XmlElement(name = "LandUseCd")
    protected List<LandUse> landUseCd;
    @XmlElement(name = "LandOwnershipCd")
    protected Ownership landOwnershipCd;
    @XmlElement(name = "FarmedByCd")
    protected FarmedBy farmedByCd;
    @XmlElement(name = "NoStructuresInd")
    protected Boolean noStructuresInd;
    @XmlElement(name = "HorseOperationsInfo")
    protected List<HorseOperationsInfoType> horseOperationsInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "LocationRef")
    @XmlIDREF
    protected Object locationRef;
    @XmlAttribute(name = "SubLocationRef")
    @XmlIDREF
    protected Object subLocationRef;

    /**
     * Gets the value of the farmRanchTypeCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farmRanchTypeCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarmRanchTypeCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarmRanchType }
     * 
     * 
     */
    public List<FarmRanchType> getFarmRanchTypeCd() {
        if (farmRanchTypeCd == null) {
            farmRanchTypeCd = new ArrayList<FarmRanchType>();
        }
        return this.farmRanchTypeCd;
    }

    /**
     * Gets the value of the operationsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOperationsDesc() {
        return operationsDesc;
    }

    /**
     * Sets the value of the operationsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOperationsDesc(C255 value) {
        this.operationsDesc = value;
    }

    /**
     * Gets the value of the landArea property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLandArea() {
        return landArea;
    }

    /**
     * Sets the value of the landArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLandArea(MEASUREMENT value) {
        this.landArea = value;
    }

    /**
     * Gets the value of the landUseCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landUseCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandUseCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandUse }
     * 
     * 
     */
    public List<LandUse> getLandUseCd() {
        if (landUseCd == null) {
            landUseCd = new ArrayList<LandUse>();
        }
        return this.landUseCd;
    }

    /**
     * Gets the value of the landOwnershipCd property.
     * 
     * @return
     *     possible object is
     *     {@link Ownership }
     *     
     */
    public Ownership getLandOwnershipCd() {
        return landOwnershipCd;
    }

    /**
     * Sets the value of the landOwnershipCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ownership }
     *     
     */
    public void setLandOwnershipCd(Ownership value) {
        this.landOwnershipCd = value;
    }

    /**
     * Gets the value of the farmedByCd property.
     * 
     * @return
     *     possible object is
     *     {@link FarmedBy }
     *     
     */
    public FarmedBy getFarmedByCd() {
        return farmedByCd;
    }

    /**
     * Sets the value of the farmedByCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmedBy }
     *     
     */
    public void setFarmedByCd(FarmedBy value) {
        this.farmedByCd = value;
    }

    /**
     * Gets the value of the noStructuresInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNoStructuresInd() {
        return noStructuresInd;
    }

    /**
     * Sets the value of the noStructuresInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoStructuresInd(Boolean value) {
        this.noStructuresInd = value;
    }

    /**
     * Gets the value of the horseOperationsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horseOperationsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorseOperationsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorseOperationsInfoType }
     * 
     * 
     */
    public List<HorseOperationsInfoType> getHorseOperationsInfo() {
        if (horseOperationsInfo == null) {
            horseOperationsInfo = new ArrayList<HorseOperationsInfoType>();
        }
        return this.horseOperationsInfo;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocationRef(Object value) {
        this.locationRef = value;
    }

    /**
     * Gets the value of the subLocationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubLocationRef() {
        return subLocationRef;
    }

    /**
     * Sets the value of the subLocationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubLocationRef(Object value) {
        this.subLocationRef = value;
    }

}
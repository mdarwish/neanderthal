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
 * <p>Java class for CommlIMPropertyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommlIMPropertyInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PropertyClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PropertyClassCdDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PropertySubClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CreditOrSurcharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PremiumInfo" minOccurs="0"/>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}COMMLIMPROPERTYINFO_CHOICE" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PropertySummaryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CurrentTermAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NetChangeAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WrittenAmt" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="LocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="SubLocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="CommlIMLocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommlIMPropertyInfo_Type", propOrder = {
    "propertyClassCd",
    "propertyClassCdDesc",
    "propertySubClassCd",
    "classCd",
    "commlCoverage",
    "creditOrSurcharge",
    "premiumInfo",
    "accountsReceivableInfo",
    "buildersRiskInstallationInfo",
    "edpInfo",
    "equipmentInfo",
    "transportationInfo",
    "communicationsInfo",
    "propertySummaryInfo",
    "currentTermAmt",
    "netChangeAmt",
    "writtenAmt"
})
public class CommlIMPropertyInfoType {

    @XmlElement(name = "PropertyClassCd")
    protected Risk propertyClassCd;
    @XmlElement(name = "PropertyClassCdDesc")
    protected CInfinite propertyClassCdDesc;
    @XmlElement(name = "PropertySubClassCd")
    protected SubRisk propertySubClassCd;
    @XmlElement(name = "ClassCd")
    protected OpenEnum classCd;
    @XmlElement(name = "CommlCoverage")
    protected List<CommlCoverageType> commlCoverage;
    @XmlElement(name = "CreditOrSurcharge")
    protected List<PCCREDITSURCHARGE> creditOrSurcharge;
    @XmlElement(name = "PremiumInfo")
    protected PremiumInfoType premiumInfo;
    @XmlElement(name = "AccountsReceivableInfo")
    protected List<AccountsReceivableInfoType> accountsReceivableInfo;
    @XmlElement(name = "BuildersRiskInstallationInfo")
    protected List<BuildersRiskInstallationInfoType> buildersRiskInstallationInfo;
    @XmlElement(name = "EDPInfo")
    protected List<EDPInfoType> edpInfo;
    @XmlElement(name = "EquipmentInfo")
    protected List<EquipmentInfoType> equipmentInfo;
    @XmlElement(name = "TransportationInfo")
    protected List<TransportationInfoType> transportationInfo;
    @XmlElement(name = "CommunicationsInfo")
    protected List<CommunicationsInfoType> communicationsInfo;
    @XmlElement(name = "PropertySummaryInfo")
    protected List<PropertySummaryInfoType> propertySummaryInfo;
    @XmlElement(name = "CurrentTermAmt")
    protected CURRENCY currentTermAmt;
    @XmlElement(name = "NetChangeAmt")
    protected CURRENCY netChangeAmt;
    @XmlElement(name = "WrittenAmt")
    protected CURRENCY writtenAmt;
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
    @XmlAttribute(name = "CommlIMLocationRef")
    @XmlIDREF
    protected Object commlIMLocationRef;

    /**
     * Gets the value of the propertyClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link Risk }
     *     
     */
    public Risk getPropertyClassCd() {
        return propertyClassCd;
    }

    /**
     * Sets the value of the propertyClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Risk }
     *     
     */
    public void setPropertyClassCd(Risk value) {
        this.propertyClassCd = value;
    }

    /**
     * Gets the value of the propertyClassCdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getPropertyClassCdDesc() {
        return propertyClassCdDesc;
    }

    /**
     * Sets the value of the propertyClassCdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setPropertyClassCdDesc(CInfinite value) {
        this.propertyClassCdDesc = value;
    }

    /**
     * Gets the value of the propertySubClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link SubRisk }
     *     
     */
    public SubRisk getPropertySubClassCd() {
        return propertySubClassCd;
    }

    /**
     * Sets the value of the propertySubClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubRisk }
     *     
     */
    public void setPropertySubClassCd(SubRisk value) {
        this.propertySubClassCd = value;
    }

    /**
     * Gets the value of the classCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getClassCd() {
        return classCd;
    }

    /**
     * Sets the value of the classCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setClassCd(OpenEnum value) {
        this.classCd = value;
    }

    /**
     * Gets the value of the commlCoverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlCoverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlCoverageType }
     * 
     * 
     */
    public List<CommlCoverageType> getCommlCoverage() {
        if (commlCoverage == null) {
            commlCoverage = new ArrayList<CommlCoverageType>();
        }
        return this.commlCoverage;
    }

    /**
     * Gets the value of the creditOrSurcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditOrSurcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditOrSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCCREDITSURCHARGE }
     * 
     * 
     */
    public List<PCCREDITSURCHARGE> getCreditOrSurcharge() {
        if (creditOrSurcharge == null) {
            creditOrSurcharge = new ArrayList<PCCREDITSURCHARGE>();
        }
        return this.creditOrSurcharge;
    }

    /**
     * Gets the value of the premiumInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumInfoType }
     *     
     */
    public PremiumInfoType getPremiumInfo() {
        return premiumInfo;
    }

    /**
     * Sets the value of the premiumInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumInfoType }
     *     
     */
    public void setPremiumInfo(PremiumInfoType value) {
        this.premiumInfo = value;
    }

    /**
     * Gets the value of the accountsReceivableInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountsReceivableInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountsReceivableInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountsReceivableInfoType }
     * 
     * 
     */
    public List<AccountsReceivableInfoType> getAccountsReceivableInfo() {
        if (accountsReceivableInfo == null) {
            accountsReceivableInfo = new ArrayList<AccountsReceivableInfoType>();
        }
        return this.accountsReceivableInfo;
    }

    /**
     * Gets the value of the buildersRiskInstallationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildersRiskInstallationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuildersRiskInstallationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuildersRiskInstallationInfoType }
     * 
     * 
     */
    public List<BuildersRiskInstallationInfoType> getBuildersRiskInstallationInfo() {
        if (buildersRiskInstallationInfo == null) {
            buildersRiskInstallationInfo = new ArrayList<BuildersRiskInstallationInfoType>();
        }
        return this.buildersRiskInstallationInfo;
    }

    /**
     * Gets the value of the edpInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edpInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEDPInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EDPInfoType }
     * 
     * 
     */
    public List<EDPInfoType> getEDPInfo() {
        if (edpInfo == null) {
            edpInfo = new ArrayList<EDPInfoType>();
        }
        return this.edpInfo;
    }

    /**
     * Gets the value of the equipmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentInfoType }
     * 
     * 
     */
    public List<EquipmentInfoType> getEquipmentInfo() {
        if (equipmentInfo == null) {
            equipmentInfo = new ArrayList<EquipmentInfoType>();
        }
        return this.equipmentInfo;
    }

    /**
     * Gets the value of the transportationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationInfoType }
     * 
     * 
     */
    public List<TransportationInfoType> getTransportationInfo() {
        if (transportationInfo == null) {
            transportationInfo = new ArrayList<TransportationInfoType>();
        }
        return this.transportationInfo;
    }

    /**
     * Gets the value of the communicationsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationsInfoType }
     * 
     * 
     */
    public List<CommunicationsInfoType> getCommunicationsInfo() {
        if (communicationsInfo == null) {
            communicationsInfo = new ArrayList<CommunicationsInfoType>();
        }
        return this.communicationsInfo;
    }

    /**
     * Gets the value of the propertySummaryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertySummaryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertySummaryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertySummaryInfoType }
     * 
     * 
     */
    public List<PropertySummaryInfoType> getPropertySummaryInfo() {
        if (propertySummaryInfo == null) {
            propertySummaryInfo = new ArrayList<PropertySummaryInfoType>();
        }
        return this.propertySummaryInfo;
    }

    /**
     * Gets the value of the currentTermAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getCurrentTermAmt() {
        return currentTermAmt;
    }

    /**
     * Sets the value of the currentTermAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setCurrentTermAmt(CURRENCY value) {
        this.currentTermAmt = value;
    }

    /**
     * Gets the value of the netChangeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNetChangeAmt() {
        return netChangeAmt;
    }

    /**
     * Sets the value of the netChangeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNetChangeAmt(CURRENCY value) {
        this.netChangeAmt = value;
    }

    /**
     * Gets the value of the writtenAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getWrittenAmt() {
        return writtenAmt;
    }

    /**
     * Sets the value of the writtenAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setWrittenAmt(CURRENCY value) {
        this.writtenAmt = value;
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

    /**
     * Gets the value of the commlIMLocationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCommlIMLocationRef() {
        return commlIMLocationRef;
    }

    /**
     * Sets the value of the commlIMLocationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCommlIMLocationRef(Object value) {
        this.commlIMLocationRef = value;
    }

}

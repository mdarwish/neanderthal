//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:20:12 PM EST 
//


package org.acord.standards.pc_surety.acord1.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DriversLicense_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriversLicense_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicensedDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DriversLicenseNumber"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FirstLicensedCurrentStateDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicenseClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProvCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProv" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CountryCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PreviousLicensedStateProvCd" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriversLicense_Type", propOrder = {
    "licensedDt",
    "driversLicenseNumber",
    "firstLicensedCurrentStateDt",
    "licenseClassCd",
    "stateProvCd",
    "stateProv",
    "countryCd",
    "previousLicensedStateProvCd"
})
public class DriversLicenseType {

    @XmlElement(name = "LicensedDt")
    protected Date licensedDt;
    @XmlElement(name = "DriversLicenseNumber", required = true)
    protected C25 driversLicenseNumber;
    @XmlElement(name = "FirstLicensedCurrentStateDt")
    protected Date firstLicensedCurrentStateDt;
    @XmlElement(name = "LicenseClassCd")
    protected OpenEnum licenseClassCd;
    @XmlElement(name = "StateProvCd")
    protected OpenEnum stateProvCd;
    @XmlElement(name = "StateProv")
    protected C60 stateProv;
    @XmlElement(name = "CountryCd")
    protected OpenEnum countryCd;
    @XmlElement(name = "PreviousLicensedStateProvCd")
    protected OpenEnum previousLicensedStateProvCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the licensedDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLicensedDt() {
        return licensedDt;
    }

    /**
     * Sets the value of the licensedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLicensedDt(Date value) {
        this.licensedDt = value;
    }

    /**
     * Gets the value of the driversLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getDriversLicenseNumber() {
        return driversLicenseNumber;
    }

    /**
     * Sets the value of the driversLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setDriversLicenseNumber(C25 value) {
        this.driversLicenseNumber = value;
    }

    /**
     * Gets the value of the firstLicensedCurrentStateDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFirstLicensedCurrentStateDt() {
        return firstLicensedCurrentStateDt;
    }

    /**
     * Sets the value of the firstLicensedCurrentStateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFirstLicensedCurrentStateDt(Date value) {
        this.firstLicensedCurrentStateDt = value;
    }

    /**
     * Gets the value of the licenseClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getLicenseClassCd() {
        return licenseClassCd;
    }

    /**
     * Sets the value of the licenseClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setLicenseClassCd(OpenEnum value) {
        this.licenseClassCd = value;
    }

    /**
     * Gets the value of the stateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getStateProvCd() {
        return stateProvCd;
    }

    /**
     * Sets the value of the stateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setStateProvCd(OpenEnum value) {
        this.stateProvCd = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link C60 }
     *     
     */
    public C60 getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link C60 }
     *     
     */
    public void setStateProv(C60 value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the countryCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCountryCd() {
        return countryCd;
    }

    /**
     * Sets the value of the countryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCountryCd(OpenEnum value) {
        this.countryCd = value;
    }

    /**
     * Gets the value of the previousLicensedStateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getPreviousLicensedStateProvCd() {
        return previousLicensedStateProvCd;
    }

    /**
     * Sets the value of the previousLicensedStateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setPreviousLicensedStateProvCd(OpenEnum value) {
        this.previousLicensedStateProvCd = value;
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

}
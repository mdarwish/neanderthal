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
 * <p>Java class for FireplaceInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FireplaceInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FireplaceTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumFireplaces" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumHearths" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumChimneys" minOccurs="0"/>
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
@XmlType(name = "FireplaceInfo_Type", propOrder = {
    "fireplaceTypeCd",
    "numFireplaces",
    "numHearths",
    "numChimneys"
})
public class FireplaceInfoType {

    @XmlElement(name = "FireplaceTypeCd")
    protected FireplaceType fireplaceTypeCd;
    @XmlElement(name = "NumFireplaces")
    protected Long numFireplaces;
    @XmlElement(name = "NumHearths")
    protected Long numHearths;
    @XmlElement(name = "NumChimneys")
    protected Long numChimneys;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the fireplaceTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link FireplaceType }
     *     
     */
    public FireplaceType getFireplaceTypeCd() {
        return fireplaceTypeCd;
    }

    /**
     * Sets the value of the fireplaceTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FireplaceType }
     *     
     */
    public void setFireplaceTypeCd(FireplaceType value) {
        this.fireplaceTypeCd = value;
    }

    /**
     * Gets the value of the numFireplaces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumFireplaces() {
        return numFireplaces;
    }

    /**
     * Sets the value of the numFireplaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumFireplaces(Long value) {
        this.numFireplaces = value;
    }

    /**
     * Gets the value of the numHearths property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumHearths() {
        return numHearths;
    }

    /**
     * Sets the value of the numHearths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumHearths(Long value) {
        this.numHearths = value;
    }

    /**
     * Gets the value of the numChimneys property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumChimneys() {
        return numChimneys;
    }

    /**
     * Sets the value of the numChimneys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumChimneys(Long value) {
        this.numChimneys = value;
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
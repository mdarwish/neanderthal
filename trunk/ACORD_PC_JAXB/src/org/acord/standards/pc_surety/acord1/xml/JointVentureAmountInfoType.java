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
 * <p>Java class for JointVentureAmountInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JointVentureAmountInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CosuretyVentureAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BondAssumedPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MiscParty" minOccurs="0"/>
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
@XmlType(name = "JointVentureAmountInfo_Type", propOrder = {
    "cosuretyVentureAmt",
    "bondAssumedPct",
    "miscParty"
})
public class JointVentureAmountInfoType {

    @XmlElement(name = "CosuretyVentureAmt")
    protected CURRENCY cosuretyVentureAmt;
    @XmlElement(name = "BondAssumedPct")
    protected PercentDecimal bondAssumedPct;
    @XmlElement(name = "MiscParty")
    protected MiscPartyType miscParty;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the cosuretyVentureAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getCosuretyVentureAmt() {
        return cosuretyVentureAmt;
    }

    /**
     * Sets the value of the cosuretyVentureAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setCosuretyVentureAmt(CURRENCY value) {
        this.cosuretyVentureAmt = value;
    }

    /**
     * Gets the value of the bondAssumedPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getBondAssumedPct() {
        return bondAssumedPct;
    }

    /**
     * Sets the value of the bondAssumedPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setBondAssumedPct(PercentDecimal value) {
        this.bondAssumedPct = value;
    }

    /**
     * Gets the value of the miscParty property.
     * 
     * @return
     *     possible object is
     *     {@link MiscPartyType }
     *     
     */
    public MiscPartyType getMiscParty() {
        return miscParty;
    }

    /**
     * Sets the value of the miscParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscPartyType }
     *     
     */
    public void setMiscParty(MiscPartyType value) {
        this.miscParty = value;
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

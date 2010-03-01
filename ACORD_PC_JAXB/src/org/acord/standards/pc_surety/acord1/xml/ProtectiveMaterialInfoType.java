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
 * <p>Java class for ProtectiveMaterialInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtectiveMaterialInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProtectiveMaterialCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProtectiveMaterialSpacing" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProtectedAreaCd" minOccurs="0"/>
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
@XmlType(name = "ProtectiveMaterialInfo_Type", propOrder = {
    "protectiveMaterialCd",
    "protectiveMaterialSpacing",
    "protectedAreaCd"
})
public class ProtectiveMaterialInfoType {

    @XmlElement(name = "ProtectiveMaterialCd")
    protected ProtectiveMaterial protectiveMaterialCd;
    @XmlElement(name = "ProtectiveMaterialSpacing")
    protected MEASUREMENT protectiveMaterialSpacing;
    @XmlElement(name = "ProtectedAreaCd")
    protected ClearanceTo protectedAreaCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the protectiveMaterialCd property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectiveMaterial }
     *     
     */
    public ProtectiveMaterial getProtectiveMaterialCd() {
        return protectiveMaterialCd;
    }

    /**
     * Sets the value of the protectiveMaterialCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectiveMaterial }
     *     
     */
    public void setProtectiveMaterialCd(ProtectiveMaterial value) {
        this.protectiveMaterialCd = value;
    }

    /**
     * Gets the value of the protectiveMaterialSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getProtectiveMaterialSpacing() {
        return protectiveMaterialSpacing;
    }

    /**
     * Sets the value of the protectiveMaterialSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setProtectiveMaterialSpacing(MEASUREMENT value) {
        this.protectiveMaterialSpacing = value;
    }

    /**
     * Gets the value of the protectedAreaCd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearanceTo }
     *     
     */
    public ClearanceTo getProtectedAreaCd() {
        return protectedAreaCd;
    }

    /**
     * Sets the value of the protectedAreaCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearanceTo }
     *     
     */
    public void setProtectedAreaCd(ClearanceTo value) {
        this.protectedAreaCd = value;
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
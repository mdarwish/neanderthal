//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:20:12 PM EST 
//


package org.acord.standards.pc_surety.acord1.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PROXIMITY_NoID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROXIMITY_NoID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DirectionTypeCd"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Distance" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Description" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROXIMITY_NoID", propOrder = {
    "directionTypeCd",
    "distance",
    "description"
})
public class PROXIMITYNoID {

    @XmlElement(name = "DirectionTypeCd", required = true)
    protected BuildingExposure directionTypeCd;
    @XmlElement(name = "Distance")
    protected MEASUREMENT distance;
    @XmlElement(name = "Description")
    protected C255 description;

    /**
     * Gets the value of the directionTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingExposure }
     *     
     */
    public BuildingExposure getDirectionTypeCd() {
        return directionTypeCd;
    }

    /**
     * Sets the value of the directionTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingExposure }
     *     
     */
    public void setDirectionTypeCd(BuildingExposure value) {
        this.directionTypeCd = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setDistance(MEASUREMENT value) {
        this.distance = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setDescription(C255 value) {
        this.description = value;
    }

}
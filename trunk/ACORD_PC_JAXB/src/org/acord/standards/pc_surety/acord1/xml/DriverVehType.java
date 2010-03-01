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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DriverVeh_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriverVeh_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OwnedVehInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UsePct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DriverUseCd" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="DriverRef" use="required" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="VehRef" use="required" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverVeh_Type", propOrder = {
    "ownedVehInd",
    "usePct",
    "driverUseCd"
})
public class DriverVehType {

    @XmlElement(name = "OwnedVehInd")
    protected Boolean ownedVehInd;
    @XmlElement(name = "UsePct")
    protected PercentLong usePct;
    @XmlElement(name = "DriverUseCd")
    protected DriverUse driverUseCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "DriverRef", required = true)
    @XmlIDREF
    protected Object driverRef;
    @XmlAttribute(name = "VehRef", required = true)
    @XmlIDREF
    protected Object vehRef;

    /**
     * Gets the value of the ownedVehInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOwnedVehInd() {
        return ownedVehInd;
    }

    /**
     * Sets the value of the ownedVehInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnedVehInd(Boolean value) {
        this.ownedVehInd = value;
    }

    /**
     * Gets the value of the usePct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getUsePct() {
        return usePct;
    }

    /**
     * Sets the value of the usePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setUsePct(PercentLong value) {
        this.usePct = value;
    }

    /**
     * Gets the value of the driverUseCd property.
     * 
     * @return
     *     possible object is
     *     {@link DriverUse }
     *     
     */
    public DriverUse getDriverUseCd() {
        return driverUseCd;
    }

    /**
     * Sets the value of the driverUseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverUse }
     *     
     */
    public void setDriverUseCd(DriverUse value) {
        this.driverUseCd = value;
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
     * Gets the value of the driverRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDriverRef() {
        return driverRef;
    }

    /**
     * Sets the value of the driverRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDriverRef(Object value) {
        this.driverRef = value;
    }

    /**
     * Gets the value of the vehRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVehRef() {
        return vehRef;
    }

    /**
     * Sets the value of the vehRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVehRef(Object value) {
        this.vehRef = value;
    }

}

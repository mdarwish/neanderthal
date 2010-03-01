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
 * <p>Java class for SalvageInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalvageInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SalvageDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemAppraisedValueAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemValuePriorToLossAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemValueReceivedAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OwnerRetainingSalvageInd" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="ItemRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="SalvageAgencyRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="BuyerRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalvageInfo_Type", propOrder = {
    "salvageDt",
    "itemAppraisedValueAmt",
    "itemValuePriorToLossAmt",
    "itemValueReceivedAmt",
    "ownerRetainingSalvageInd"
})
public class SalvageInfoType {

    @XmlElement(name = "SalvageDt")
    protected Date salvageDt;
    @XmlElement(name = "ItemAppraisedValueAmt")
    protected CURRENCY itemAppraisedValueAmt;
    @XmlElement(name = "ItemValuePriorToLossAmt")
    protected CURRENCY itemValuePriorToLossAmt;
    @XmlElement(name = "ItemValueReceivedAmt")
    protected CURRENCY itemValueReceivedAmt;
    @XmlElement(name = "OwnerRetainingSalvageInd")
    protected Boolean ownerRetainingSalvageInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "ItemRef")
    @XmlIDREF
    protected Object itemRef;
    @XmlAttribute(name = "SalvageAgencyRef")
    @XmlIDREF
    protected Object salvageAgencyRef;
    @XmlAttribute(name = "BuyerRef")
    @XmlIDREF
    protected Object buyerRef;

    /**
     * Gets the value of the salvageDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getSalvageDt() {
        return salvageDt;
    }

    /**
     * Sets the value of the salvageDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setSalvageDt(Date value) {
        this.salvageDt = value;
    }

    /**
     * Gets the value of the itemAppraisedValueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getItemAppraisedValueAmt() {
        return itemAppraisedValueAmt;
    }

    /**
     * Sets the value of the itemAppraisedValueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setItemAppraisedValueAmt(CURRENCY value) {
        this.itemAppraisedValueAmt = value;
    }

    /**
     * Gets the value of the itemValuePriorToLossAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getItemValuePriorToLossAmt() {
        return itemValuePriorToLossAmt;
    }

    /**
     * Sets the value of the itemValuePriorToLossAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setItemValuePriorToLossAmt(CURRENCY value) {
        this.itemValuePriorToLossAmt = value;
    }

    /**
     * Gets the value of the itemValueReceivedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getItemValueReceivedAmt() {
        return itemValueReceivedAmt;
    }

    /**
     * Sets the value of the itemValueReceivedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setItemValueReceivedAmt(CURRENCY value) {
        this.itemValueReceivedAmt = value;
    }

    /**
     * Gets the value of the ownerRetainingSalvageInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOwnerRetainingSalvageInd() {
        return ownerRetainingSalvageInd;
    }

    /**
     * Sets the value of the ownerRetainingSalvageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerRetainingSalvageInd(Boolean value) {
        this.ownerRetainingSalvageInd = value;
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
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItemRef(Object value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the salvageAgencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSalvageAgencyRef() {
        return salvageAgencyRef;
    }

    /**
     * Sets the value of the salvageAgencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSalvageAgencyRef(Object value) {
        this.salvageAgencyRef = value;
    }

    /**
     * Gets the value of the buyerRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBuyerRef() {
        return buyerRef;
    }

    /**
     * Sets the value of the buyerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBuyerRef(Object value) {
        this.buyerRef = value;
    }

}

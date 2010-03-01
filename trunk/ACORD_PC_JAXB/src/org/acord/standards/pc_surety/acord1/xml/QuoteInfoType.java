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
 * <p>Java class for QuoteInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CompanysQuoteNumber"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IterationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InsuredFullToBePaidAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuoteDeclinedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuoteDeclinationReason" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuoteConditionsInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuoteConditionsReason" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CoverageDeclinedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CoverageDeclinationReason" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CoverageConditionsInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CoverageConditionsReason" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InitialQuoteRequestDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuotePreparedDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuoteValidUntilDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Description" minOccurs="0"/>
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
@XmlType(name = "QuoteInfo_Type", propOrder = {
    "companysQuoteNumber",
    "itemIdInfo",
    "iterationNumber",
    "insuredFullToBePaidAmt",
    "quoteDeclinedInd",
    "quoteDeclinationReason",
    "quoteConditionsInd",
    "quoteConditionsReason",
    "coverageDeclinedInd",
    "coverageDeclinationReason",
    "coverageConditionsInd",
    "coverageConditionsReason",
    "initialQuoteRequestDt",
    "quotePreparedDt",
    "quoteValidUntilDt",
    "description"
})
public class QuoteInfoType {

    @XmlElement(name = "CompanysQuoteNumber", required = true)
    protected C36 companysQuoteNumber;
    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfoType itemIdInfo;
    @XmlElement(name = "IterationNumber")
    protected Long iterationNumber;
    @XmlElement(name = "InsuredFullToBePaidAmt")
    protected CURRENCY insuredFullToBePaidAmt;
    @XmlElement(name = "QuoteDeclinedInd")
    protected Boolean quoteDeclinedInd;
    @XmlElement(name = "QuoteDeclinationReason")
    protected C255 quoteDeclinationReason;
    @XmlElement(name = "QuoteConditionsInd")
    protected Boolean quoteConditionsInd;
    @XmlElement(name = "QuoteConditionsReason")
    protected C255 quoteConditionsReason;
    @XmlElement(name = "CoverageDeclinedInd")
    protected Boolean coverageDeclinedInd;
    @XmlElement(name = "CoverageDeclinationReason")
    protected C255 coverageDeclinationReason;
    @XmlElement(name = "CoverageConditionsInd")
    protected Boolean coverageConditionsInd;
    @XmlElement(name = "CoverageConditionsReason")
    protected C255 coverageConditionsReason;
    @XmlElement(name = "InitialQuoteRequestDt")
    protected Date initialQuoteRequestDt;
    @XmlElement(name = "QuotePreparedDt")
    protected Date quotePreparedDt;
    @XmlElement(name = "QuoteValidUntilDt")
    protected Date quoteValidUntilDt;
    @XmlElement(name = "Description")
    protected C255 description;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the companysQuoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C36 }
     *     
     */
    public C36 getCompanysQuoteNumber() {
        return companysQuoteNumber;
    }

    /**
     * Sets the value of the companysQuoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C36 }
     *     
     */
    public void setCompanysQuoteNumber(C36 value) {
        this.companysQuoteNumber = value;
    }

    /**
     * Gets the value of the itemIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdInfoType }
     *     
     */
    public ItemIdInfoType getItemIdInfo() {
        return itemIdInfo;
    }

    /**
     * Sets the value of the itemIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdInfoType }
     *     
     */
    public void setItemIdInfo(ItemIdInfoType value) {
        this.itemIdInfo = value;
    }

    /**
     * Gets the value of the iterationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIterationNumber() {
        return iterationNumber;
    }

    /**
     * Sets the value of the iterationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIterationNumber(Long value) {
        this.iterationNumber = value;
    }

    /**
     * Gets the value of the insuredFullToBePaidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getInsuredFullToBePaidAmt() {
        return insuredFullToBePaidAmt;
    }

    /**
     * Sets the value of the insuredFullToBePaidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setInsuredFullToBePaidAmt(CURRENCY value) {
        this.insuredFullToBePaidAmt = value;
    }

    /**
     * Gets the value of the quoteDeclinedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getQuoteDeclinedInd() {
        return quoteDeclinedInd;
    }

    /**
     * Sets the value of the quoteDeclinedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuoteDeclinedInd(Boolean value) {
        this.quoteDeclinedInd = value;
    }

    /**
     * Gets the value of the quoteDeclinationReason property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getQuoteDeclinationReason() {
        return quoteDeclinationReason;
    }

    /**
     * Sets the value of the quoteDeclinationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setQuoteDeclinationReason(C255 value) {
        this.quoteDeclinationReason = value;
    }

    /**
     * Gets the value of the quoteConditionsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getQuoteConditionsInd() {
        return quoteConditionsInd;
    }

    /**
     * Sets the value of the quoteConditionsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuoteConditionsInd(Boolean value) {
        this.quoteConditionsInd = value;
    }

    /**
     * Gets the value of the quoteConditionsReason property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getQuoteConditionsReason() {
        return quoteConditionsReason;
    }

    /**
     * Sets the value of the quoteConditionsReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setQuoteConditionsReason(C255 value) {
        this.quoteConditionsReason = value;
    }

    /**
     * Gets the value of the coverageDeclinedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCoverageDeclinedInd() {
        return coverageDeclinedInd;
    }

    /**
     * Sets the value of the coverageDeclinedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoverageDeclinedInd(Boolean value) {
        this.coverageDeclinedInd = value;
    }

    /**
     * Gets the value of the coverageDeclinationReason property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getCoverageDeclinationReason() {
        return coverageDeclinationReason;
    }

    /**
     * Sets the value of the coverageDeclinationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setCoverageDeclinationReason(C255 value) {
        this.coverageDeclinationReason = value;
    }

    /**
     * Gets the value of the coverageConditionsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCoverageConditionsInd() {
        return coverageConditionsInd;
    }

    /**
     * Sets the value of the coverageConditionsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoverageConditionsInd(Boolean value) {
        this.coverageConditionsInd = value;
    }

    /**
     * Gets the value of the coverageConditionsReason property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getCoverageConditionsReason() {
        return coverageConditionsReason;
    }

    /**
     * Sets the value of the coverageConditionsReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setCoverageConditionsReason(C255 value) {
        this.coverageConditionsReason = value;
    }

    /**
     * Gets the value of the initialQuoteRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getInitialQuoteRequestDt() {
        return initialQuoteRequestDt;
    }

    /**
     * Sets the value of the initialQuoteRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setInitialQuoteRequestDt(Date value) {
        this.initialQuoteRequestDt = value;
    }

    /**
     * Gets the value of the quotePreparedDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getQuotePreparedDt() {
        return quotePreparedDt;
    }

    /**
     * Sets the value of the quotePreparedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setQuotePreparedDt(Date value) {
        this.quotePreparedDt = value;
    }

    /**
     * Gets the value of the quoteValidUntilDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getQuoteValidUntilDt() {
        return quoteValidUntilDt;
    }

    /**
     * Sets the value of the quoteValidUntilDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setQuoteValidUntilDt(Date value) {
        this.quoteValidUntilDt = value;
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

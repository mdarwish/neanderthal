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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LeaseHolderInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeaseHolderInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractTerm" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InterestRatePct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GrossLeaseholdInterestAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MonthlyLeaseholdInterestInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LeaseHolderInfo_Type", propOrder = {
    "contractTerm",
    "interestRatePct",
    "grossLeaseholdInterestAmt",
    "monthlyLeaseholdInterestInfo"
})
public class LeaseHolderInfoType {

    @XmlElement(name = "ContractTerm")
    protected DURATION contractTerm;
    @XmlElement(name = "InterestRatePct")
    protected PercentDecimal interestRatePct;
    @XmlElement(name = "GrossLeaseholdInterestAmt")
    protected CURRENCY grossLeaseholdInterestAmt;
    @XmlElement(name = "MonthlyLeaseholdInterestInfo")
    protected List<MonthlyLeaseholdInterestInfoType> monthlyLeaseholdInterestInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the contractTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getContractTerm() {
        return contractTerm;
    }

    /**
     * Sets the value of the contractTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setContractTerm(DURATION value) {
        this.contractTerm = value;
    }

    /**
     * Gets the value of the interestRatePct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getInterestRatePct() {
        return interestRatePct;
    }

    /**
     * Sets the value of the interestRatePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setInterestRatePct(PercentDecimal value) {
        this.interestRatePct = value;
    }

    /**
     * Gets the value of the grossLeaseholdInterestAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getGrossLeaseholdInterestAmt() {
        return grossLeaseholdInterestAmt;
    }

    /**
     * Sets the value of the grossLeaseholdInterestAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setGrossLeaseholdInterestAmt(CURRENCY value) {
        this.grossLeaseholdInterestAmt = value;
    }

    /**
     * Gets the value of the monthlyLeaseholdInterestInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyLeaseholdInterestInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyLeaseholdInterestInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthlyLeaseholdInterestInfoType }
     * 
     * 
     */
    public List<MonthlyLeaseholdInterestInfoType> getMonthlyLeaseholdInterestInfo() {
        if (monthlyLeaseholdInterestInfo == null) {
            monthlyLeaseholdInterestInfo = new ArrayList<MonthlyLeaseholdInterestInfoType>();
        }
        return this.monthlyLeaseholdInterestInfo;
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
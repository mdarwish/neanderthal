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
 * <p>Java class for WorkCompStateStatSummary_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkCompStateStatSummary_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalPayrollAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SubjectPremiumAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StandardPremiumAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumClaims" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsFinancialSummary" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "WorkCompStateStatSummary_Type", propOrder = {
    "totalPayrollAmt",
    "subjectPremiumAmt",
    "standardPremiumAmt",
    "numClaims",
    "claimsFinancialSummary"
})
public class WorkCompStateStatSummaryType {

    @XmlElement(name = "TotalPayrollAmt")
    protected CURRENCY totalPayrollAmt;
    @XmlElement(name = "SubjectPremiumAmt")
    protected CURRENCY subjectPremiumAmt;
    @XmlElement(name = "StandardPremiumAmt")
    protected CURRENCY standardPremiumAmt;
    @XmlElement(name = "NumClaims")
    protected Long numClaims;
    @XmlElement(name = "ClaimsFinancialSummary")
    protected List<ClaimsFinancialSummaryType> claimsFinancialSummary;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the totalPayrollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalPayrollAmt() {
        return totalPayrollAmt;
    }

    /**
     * Sets the value of the totalPayrollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalPayrollAmt(CURRENCY value) {
        this.totalPayrollAmt = value;
    }

    /**
     * Gets the value of the subjectPremiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getSubjectPremiumAmt() {
        return subjectPremiumAmt;
    }

    /**
     * Sets the value of the subjectPremiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setSubjectPremiumAmt(CURRENCY value) {
        this.subjectPremiumAmt = value;
    }

    /**
     * Gets the value of the standardPremiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getStandardPremiumAmt() {
        return standardPremiumAmt;
    }

    /**
     * Sets the value of the standardPremiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setStandardPremiumAmt(CURRENCY value) {
        this.standardPremiumAmt = value;
    }

    /**
     * Gets the value of the numClaims property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumClaims() {
        return numClaims;
    }

    /**
     * Sets the value of the numClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumClaims(Long value) {
        this.numClaims = value;
    }

    /**
     * Gets the value of the claimsFinancialSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimsFinancialSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimsFinancialSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimsFinancialSummaryType }
     * 
     * 
     */
    public List<ClaimsFinancialSummaryType> getClaimsFinancialSummary() {
        if (claimsFinancialSummary == null) {
            claimsFinancialSummary = new ArrayList<ClaimsFinancialSummaryType>();
        }
        return this.claimsFinancialSummary;
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

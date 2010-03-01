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
 * <p>Java class for UnderwritingDecisionInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderwritingDecisionInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UnderwritingDecisionCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UnderwritingDecisionDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SystemUnderwritingDecisionCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SystemUnderwritingDecisionDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UnderwritingRenewalDecisionCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UnderwritingRenewalDecisionDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UnderwritingScoreNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UnderwritingRuleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UnderwriterId" minOccurs="0"/>
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
@XmlType(name = "UnderwritingDecisionInfo_Type", propOrder = {
    "underwritingDecisionCd",
    "underwritingDecisionDt",
    "systemUnderwritingDecisionCd",
    "systemUnderwritingDecisionDt",
    "underwritingRenewalDecisionCd",
    "underwritingRenewalDecisionDt",
    "underwritingScoreNumber",
    "underwritingRuleInfo",
    "underwriterId"
})
public class UnderwritingDecisionInfoType {

    @XmlElement(name = "UnderwritingDecisionCd")
    protected UnderwritingDecision underwritingDecisionCd;
    @XmlElement(name = "UnderwritingDecisionDt")
    protected Date underwritingDecisionDt;
    @XmlElement(name = "SystemUnderwritingDecisionCd")
    protected UnderwritingDecision systemUnderwritingDecisionCd;
    @XmlElement(name = "SystemUnderwritingDecisionDt")
    protected Date systemUnderwritingDecisionDt;
    @XmlElement(name = "UnderwritingRenewalDecisionCd")
    protected UnderwritingDecision underwritingRenewalDecisionCd;
    @XmlElement(name = "UnderwritingRenewalDecisionDt")
    protected Date underwritingRenewalDecisionDt;
    @XmlElement(name = "UnderwritingScoreNumber")
    protected Long underwritingScoreNumber;
    @XmlElement(name = "UnderwritingRuleInfo")
    protected List<UnderwritingRuleInfoType> underwritingRuleInfo;
    @XmlElement(name = "UnderwriterId")
    protected AssignedIdentifier underwriterId;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the underwritingDecisionCd property.
     * 
     * @return
     *     possible object is
     *     {@link UnderwritingDecision }
     *     
     */
    public UnderwritingDecision getUnderwritingDecisionCd() {
        return underwritingDecisionCd;
    }

    /**
     * Sets the value of the underwritingDecisionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderwritingDecision }
     *     
     */
    public void setUnderwritingDecisionCd(UnderwritingDecision value) {
        this.underwritingDecisionCd = value;
    }

    /**
     * Gets the value of the underwritingDecisionDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getUnderwritingDecisionDt() {
        return underwritingDecisionDt;
    }

    /**
     * Sets the value of the underwritingDecisionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setUnderwritingDecisionDt(Date value) {
        this.underwritingDecisionDt = value;
    }

    /**
     * Gets the value of the systemUnderwritingDecisionCd property.
     * 
     * @return
     *     possible object is
     *     {@link UnderwritingDecision }
     *     
     */
    public UnderwritingDecision getSystemUnderwritingDecisionCd() {
        return systemUnderwritingDecisionCd;
    }

    /**
     * Sets the value of the systemUnderwritingDecisionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderwritingDecision }
     *     
     */
    public void setSystemUnderwritingDecisionCd(UnderwritingDecision value) {
        this.systemUnderwritingDecisionCd = value;
    }

    /**
     * Gets the value of the systemUnderwritingDecisionDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getSystemUnderwritingDecisionDt() {
        return systemUnderwritingDecisionDt;
    }

    /**
     * Sets the value of the systemUnderwritingDecisionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setSystemUnderwritingDecisionDt(Date value) {
        this.systemUnderwritingDecisionDt = value;
    }

    /**
     * Gets the value of the underwritingRenewalDecisionCd property.
     * 
     * @return
     *     possible object is
     *     {@link UnderwritingDecision }
     *     
     */
    public UnderwritingDecision getUnderwritingRenewalDecisionCd() {
        return underwritingRenewalDecisionCd;
    }

    /**
     * Sets the value of the underwritingRenewalDecisionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderwritingDecision }
     *     
     */
    public void setUnderwritingRenewalDecisionCd(UnderwritingDecision value) {
        this.underwritingRenewalDecisionCd = value;
    }

    /**
     * Gets the value of the underwritingRenewalDecisionDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getUnderwritingRenewalDecisionDt() {
        return underwritingRenewalDecisionDt;
    }

    /**
     * Sets the value of the underwritingRenewalDecisionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setUnderwritingRenewalDecisionDt(Date value) {
        this.underwritingRenewalDecisionDt = value;
    }

    /**
     * Gets the value of the underwritingScoreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnderwritingScoreNumber() {
        return underwritingScoreNumber;
    }

    /**
     * Sets the value of the underwritingScoreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnderwritingScoreNumber(Long value) {
        this.underwritingScoreNumber = value;
    }

    /**
     * Gets the value of the underwritingRuleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underwritingRuleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderwritingRuleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderwritingRuleInfoType }
     * 
     * 
     */
    public List<UnderwritingRuleInfoType> getUnderwritingRuleInfo() {
        if (underwritingRuleInfo == null) {
            underwritingRuleInfo = new ArrayList<UnderwritingRuleInfoType>();
        }
        return this.underwritingRuleInfo;
    }

    /**
     * Gets the value of the underwriterId property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getUnderwriterId() {
        return underwriterId;
    }

    /**
     * Sets the value of the underwriterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setUnderwriterId(AssignedIdentifier value) {
        this.underwriterId = value;
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
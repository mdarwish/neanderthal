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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PCLINEBUSINESS_NoID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCLINEBUSINESS_NoID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LOBCd"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LOBSubCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NAICCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CompanyProductCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CurrentTermAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NetChangeAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WrittenAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GroupId" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PMACd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RateEffectiveDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AdditionalInterest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MinPremInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HazardGradeCd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCLINEBUSINESS_NoID", propOrder = {
    "lobCd",
    "lobSubCd",
    "naicCd",
    "companyProductCd",
    "currentTermAmt",
    "netChangeAmt",
    "writtenAmt",
    "groupId",
    "pmaCd",
    "rateEffectiveDt",
    "additionalInterest",
    "minPremInd",
    "auditInfo",
    "hazardGradeCd"
})
public class PCLINEBUSINESSNoID {

    @XmlElement(name = "LOBCd", required = true)
    protected LineOfBusiness lobCd;
    @XmlElement(name = "LOBSubCd")
    protected LineOfBusinessSubCode lobSubCd;
    @XmlElement(name = "NAICCd")
    protected OpenEnum naicCd;
    @XmlElement(name = "CompanyProductCd")
    protected OpenEnum companyProductCd;
    @XmlElement(name = "CurrentTermAmt")
    protected CURRENCY currentTermAmt;
    @XmlElement(name = "NetChangeAmt")
    protected CURRENCY netChangeAmt;
    @XmlElement(name = "WrittenAmt")
    protected CURRENCY writtenAmt;
    @XmlElement(name = "GroupId")
    protected AssignedIdentifier groupId;
    @XmlElement(name = "PMACd")
    protected OpenEnum pmaCd;
    @XmlElement(name = "RateEffectiveDt")
    protected Date rateEffectiveDt;
    @XmlElement(name = "AdditionalInterest")
    protected List<AdditionalInterestType> additionalInterest;
    @XmlElement(name = "MinPremInd")
    protected Boolean minPremInd;
    @XmlElement(name = "AuditInfo")
    protected List<AuditInfoType> auditInfo;
    @XmlElement(name = "HazardGradeCd")
    protected OpenEnum hazardGradeCd;

    /**
     * Gets the value of the lobCd property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusiness }
     *     
     */
    public LineOfBusiness getLOBCd() {
        return lobCd;
    }

    /**
     * Sets the value of the lobCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusiness }
     *     
     */
    public void setLOBCd(LineOfBusiness value) {
        this.lobCd = value;
    }

    /**
     * Gets the value of the lobSubCd property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusinessSubCode }
     *     
     */
    public LineOfBusinessSubCode getLOBSubCd() {
        return lobSubCd;
    }

    /**
     * Sets the value of the lobSubCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusinessSubCode }
     *     
     */
    public void setLOBSubCd(LineOfBusinessSubCode value) {
        this.lobSubCd = value;
    }

    /**
     * Gets the value of the naicCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getNAICCd() {
        return naicCd;
    }

    /**
     * Sets the value of the naicCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setNAICCd(OpenEnum value) {
        this.naicCd = value;
    }

    /**
     * Gets the value of the companyProductCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCompanyProductCd() {
        return companyProductCd;
    }

    /**
     * Sets the value of the companyProductCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCompanyProductCd(OpenEnum value) {
        this.companyProductCd = value;
    }

    /**
     * Gets the value of the currentTermAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getCurrentTermAmt() {
        return currentTermAmt;
    }

    /**
     * Sets the value of the currentTermAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setCurrentTermAmt(CURRENCY value) {
        this.currentTermAmt = value;
    }

    /**
     * Gets the value of the netChangeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNetChangeAmt() {
        return netChangeAmt;
    }

    /**
     * Sets the value of the netChangeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNetChangeAmt(CURRENCY value) {
        this.netChangeAmt = value;
    }

    /**
     * Gets the value of the writtenAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getWrittenAmt() {
        return writtenAmt;
    }

    /**
     * Sets the value of the writtenAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setWrittenAmt(CURRENCY value) {
        this.writtenAmt = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setGroupId(AssignedIdentifier value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the pmaCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getPMACd() {
        return pmaCd;
    }

    /**
     * Sets the value of the pmaCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setPMACd(OpenEnum value) {
        this.pmaCd = value;
    }

    /**
     * Gets the value of the rateEffectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getRateEffectiveDt() {
        return rateEffectiveDt;
    }

    /**
     * Sets the value of the rateEffectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setRateEffectiveDt(Date value) {
        this.rateEffectiveDt = value;
    }

    /**
     * Gets the value of the additionalInterest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInterest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInterest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInterestType }
     * 
     * 
     */
    public List<AdditionalInterestType> getAdditionalInterest() {
        if (additionalInterest == null) {
            additionalInterest = new ArrayList<AdditionalInterestType>();
        }
        return this.additionalInterest;
    }

    /**
     * Gets the value of the minPremInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMinPremInd() {
        return minPremInd;
    }

    /**
     * Sets the value of the minPremInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinPremInd(Boolean value) {
        this.minPremInd = value;
    }

    /**
     * Gets the value of the auditInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditInfoType }
     * 
     * 
     */
    public List<AuditInfoType> getAuditInfo() {
        if (auditInfo == null) {
            auditInfo = new ArrayList<AuditInfoType>();
        }
        return this.auditInfo;
    }

    /**
     * Gets the value of the hazardGradeCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getHazardGradeCd() {
        return hazardGradeCd;
    }

    /**
     * Sets the value of the hazardGradeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setHazardGradeCd(OpenEnum value) {
        this.hazardGradeCd = value;
    }

}
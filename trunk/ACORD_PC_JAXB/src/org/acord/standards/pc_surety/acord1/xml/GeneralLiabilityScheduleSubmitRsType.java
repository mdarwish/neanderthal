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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GeneralLiabilityScheduleSubmitRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralLiabilityScheduleSubmitRs_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MSGSCHEDULERSINFO"/>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GENERALLIABILITYSCHEDULEINFO"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicySummaryInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralLiabilityScheduleSubmitRs_Type", propOrder = {
    "rqUID",
    "transactionEffectiveDt",
    "curCd",
    "codeList",
    "conversionRate",
    "msgStatus",
    "producer",
    "insuredOrPrincipal",
    "miscParty",
    "location",
    "generalLiabilityClassification",
    "itemIdInfo",
    "remarkText",
    "fileAttachmentInfo",
    "policySummaryInfo"
})
public class GeneralLiabilityScheduleSubmitRsType {

    @XmlElement(name = "RqUID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rqUID;
    @XmlElement(name = "TransactionEffectiveDt")
    protected DateTime transactionEffectiveDt;
    @XmlElement(name = "CurCd")
    protected OpenEnum curCd;
    @XmlElement(name = "CodeList")
    protected List<CodeListType> codeList;
    @XmlElement(name = "ConversionRate")
    protected List<ConversionRateType> conversionRate;
    @XmlElement(name = "MsgStatus", required = true)
    protected MsgStatusType msgStatus;
    @XmlElement(name = "Producer")
    protected List<ProducerType> producer;
    @XmlElement(name = "InsuredOrPrincipal", required = true)
    protected List<InsuredOrPrincipalType> insuredOrPrincipal;
    @XmlElement(name = "MiscParty")
    protected List<MiscPartyType> miscParty;
    @XmlElement(name = "Location")
    protected List<LocationType2> location;
    @XmlElement(name = "GeneralLiabilityClassification", required = true)
    protected List<GeneralLiabilityClassificationType> generalLiabilityClassification;
    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfoType itemIdInfo;
    @XmlElement(name = "RemarkText")
    protected List<RemarkText> remarkText;
    @XmlElement(name = "FileAttachmentInfo")
    protected List<FileAttachmentInfoType> fileAttachmentInfo;
    @XmlElement(name = "PolicySummaryInfo")
    protected PolicySummaryInfoType policySummaryInfo;

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the transactionEffectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTransactionEffectiveDt() {
        return transactionEffectiveDt;
    }

    /**
     * Sets the value of the transactionEffectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTransactionEffectiveDt(DateTime value) {
        this.transactionEffectiveDt = value;
    }

    /**
     * Gets the value of the curCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCurCd() {
        return curCd;
    }

    /**
     * Sets the value of the curCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCurCd(OpenEnum value) {
        this.curCd = value;
    }

    /**
     * Gets the value of the codeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeListType }
     * 
     * 
     */
    public List<CodeListType> getCodeList() {
        if (codeList == null) {
            codeList = new ArrayList<CodeListType>();
        }
        return this.codeList;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionRateType }
     * 
     * 
     */
    public List<ConversionRateType> getConversionRate() {
        if (conversionRate == null) {
            conversionRate = new ArrayList<ConversionRateType>();
        }
        return this.conversionRate;
    }

    /**
     * Gets the value of the msgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MsgStatusType }
     *     
     */
    public MsgStatusType getMsgStatus() {
        return msgStatus;
    }

    /**
     * Sets the value of the msgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgStatusType }
     *     
     */
    public void setMsgStatus(MsgStatusType value) {
        this.msgStatus = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerType }
     * 
     * 
     */
    public List<ProducerType> getProducer() {
        if (producer == null) {
            producer = new ArrayList<ProducerType>();
        }
        return this.producer;
    }

    /**
     * Gets the value of the insuredOrPrincipal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuredOrPrincipal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuredOrPrincipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuredOrPrincipalType }
     * 
     * 
     */
    public List<InsuredOrPrincipalType> getInsuredOrPrincipal() {
        if (insuredOrPrincipal == null) {
            insuredOrPrincipal = new ArrayList<InsuredOrPrincipalType>();
        }
        return this.insuredOrPrincipal;
    }

    /**
     * Gets the value of the miscParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscPartyType }
     * 
     * 
     */
    public List<MiscPartyType> getMiscParty() {
        if (miscParty == null) {
            miscParty = new ArrayList<MiscPartyType>();
        }
        return this.miscParty;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType2 }
     * 
     * 
     */
    public List<LocationType2> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationType2>();
        }
        return this.location;
    }

    /**
     * Gets the value of the generalLiabilityClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalLiabilityClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralLiabilityClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralLiabilityClassificationType }
     * 
     * 
     */
    public List<GeneralLiabilityClassificationType> getGeneralLiabilityClassification() {
        if (generalLiabilityClassification == null) {
            generalLiabilityClassification = new ArrayList<GeneralLiabilityClassificationType>();
        }
        return this.generalLiabilityClassification;
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
     * Gets the value of the remarkText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarkText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarkText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkText }
     * 
     * 
     */
    public List<RemarkText> getRemarkText() {
        if (remarkText == null) {
            remarkText = new ArrayList<RemarkText>();
        }
        return this.remarkText;
    }

    /**
     * Gets the value of the fileAttachmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileAttachmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileAttachmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileAttachmentInfoType }
     * 
     * 
     */
    public List<FileAttachmentInfoType> getFileAttachmentInfo() {
        if (fileAttachmentInfo == null) {
            fileAttachmentInfo = new ArrayList<FileAttachmentInfoType>();
        }
        return this.fileAttachmentInfo;
    }

    /**
     * Gets the value of the policySummaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PolicySummaryInfoType }
     *     
     */
    public PolicySummaryInfoType getPolicySummaryInfo() {
        return policySummaryInfo;
    }

    /**
     * Sets the value of the policySummaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicySummaryInfoType }
     *     
     */
    public void setPolicySummaryInfo(PolicySummaryInfoType value) {
        this.policySummaryInfo = value;
    }

}

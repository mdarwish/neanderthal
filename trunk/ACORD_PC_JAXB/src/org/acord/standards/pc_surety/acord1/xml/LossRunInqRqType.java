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
 * <p>Java class for LossRunInqRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LossRunInqRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CLAIMSMSGRQINFO"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Requestor"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LossRunInqInfo"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RemarkText" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LossRunInqRq_Type", propOrder = {
    "rqUID",
    "transactionRequestDt",
    "curCd",
    "codeList",
    "conversionRate",
    "broadLOBCd",
    "acordStandardVersionCd",
    "requestor",
    "lossRunInqInfo",
    "remarkText"
})
public class LossRunInqRqType {

    @XmlElement(name = "RqUID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rqUID;
    @XmlElement(name = "TransactionRequestDt", required = true)
    protected DateTime transactionRequestDt;
    @XmlElement(name = "CurCd", required = true)
    protected OpenEnum curCd;
    @XmlElement(name = "CodeList")
    protected List<CodeListType> codeList;
    @XmlElement(name = "ConversionRate")
    protected List<ConversionRateType> conversionRate;
    @XmlElement(name = "BroadLOBCd")
    protected BroadLineBusiness broadLOBCd;
    @XmlElement(name = "ACORDStandardVersionCd")
    protected ACORDStandardVersion acordStandardVersionCd;
    @XmlElement(name = "Requestor", required = true)
    protected RequestorType2 requestor;
    @XmlElement(name = "LossRunInqInfo", required = true)
    protected LossRunInqInfoType lossRunInqInfo;
    @XmlElement(name = "RemarkText")
    protected List<RemarkText> remarkText;

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
     * Gets the value of the transactionRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTransactionRequestDt() {
        return transactionRequestDt;
    }

    /**
     * Sets the value of the transactionRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTransactionRequestDt(DateTime value) {
        this.transactionRequestDt = value;
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
     * Gets the value of the broadLOBCd property.
     * 
     * @return
     *     possible object is
     *     {@link BroadLineBusiness }
     *     
     */
    public BroadLineBusiness getBroadLOBCd() {
        return broadLOBCd;
    }

    /**
     * Sets the value of the broadLOBCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadLineBusiness }
     *     
     */
    public void setBroadLOBCd(BroadLineBusiness value) {
        this.broadLOBCd = value;
    }

    /**
     * Gets the value of the acordStandardVersionCd property.
     * 
     * @return
     *     possible object is
     *     {@link ACORDStandardVersion }
     *     
     */
    public ACORDStandardVersion getACORDStandardVersionCd() {
        return acordStandardVersionCd;
    }

    /**
     * Sets the value of the acordStandardVersionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACORDStandardVersion }
     *     
     */
    public void setACORDStandardVersionCd(ACORDStandardVersion value) {
        this.acordStandardVersionCd = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorType2 }
     *     
     */
    public RequestorType2 getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorType2 }
     *     
     */
    public void setRequestor(RequestorType2 value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the lossRunInqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LossRunInqInfoType }
     *     
     */
    public LossRunInqInfoType getLossRunInqInfo() {
        return lossRunInqInfo;
    }

    /**
     * Sets the value of the lossRunInqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossRunInqInfoType }
     *     
     */
    public void setLossRunInqInfo(LossRunInqInfoType value) {
        this.lossRunInqInfo = value;
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

}

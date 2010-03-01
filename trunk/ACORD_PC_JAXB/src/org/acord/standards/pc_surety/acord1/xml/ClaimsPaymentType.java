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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ClaimsPayment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimsPayment_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PaymentTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsPaymentCovInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalPaymentAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LossCauseCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MethodPaymentCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CheckNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PaymentDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ServiceDuration" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InsuredOrPrincipal" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PaymentDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReserveChangeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="IdRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="ClaimsPartyRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimsPayment_Type", propOrder = {
    "itemIdInfo",
    "paymentTypeCd",
    "claimsPaymentCovInfo",
    "totalPaymentAmt",
    "lossCauseCd",
    "methodPaymentCd",
    "checkNumber",
    "paymentDt",
    "serviceDuration",
    "insuredOrPrincipal",
    "paymentDesc",
    "reserveChangeInfo"
})
public class ClaimsPaymentType {

    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfoType itemIdInfo;
    @XmlElement(name = "PaymentTypeCd")
    protected PaymentType paymentTypeCd;
    @XmlElement(name = "ClaimsPaymentCovInfo")
    protected List<ClaimsPaymentCovInfoType> claimsPaymentCovInfo;
    @XmlElement(name = "TotalPaymentAmt")
    protected CURRENCY totalPaymentAmt;
    @XmlElement(name = "LossCauseCd")
    protected OpenEnum lossCauseCd;
    @XmlElement(name = "MethodPaymentCd")
    protected MethodOfPayment methodPaymentCd;
    @XmlElement(name = "CheckNumber")
    protected C25 checkNumber;
    @XmlElement(name = "PaymentDt")
    protected Date paymentDt;
    @XmlElement(name = "ServiceDuration")
    protected DURATION serviceDuration;
    @XmlElement(name = "InsuredOrPrincipal")
    protected InsuredOrPrincipalType insuredOrPrincipal;
    @XmlElement(name = "PaymentDesc")
    protected C255 paymentDesc;
    @XmlElement(name = "ReserveChangeInfo")
    protected List<ReserveChangeInfoType> reserveChangeInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "IdRef")
    @XmlIDREF
    protected Object idRef;
    @XmlAttribute(name = "ClaimsPartyRef")
    @XmlIDREF
    protected Object claimsPartyRef;

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
     * Gets the value of the paymentTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentTypeCd() {
        return paymentTypeCd;
    }

    /**
     * Sets the value of the paymentTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentTypeCd(PaymentType value) {
        this.paymentTypeCd = value;
    }

    /**
     * Gets the value of the claimsPaymentCovInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimsPaymentCovInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimsPaymentCovInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimsPaymentCovInfoType }
     * 
     * 
     */
    public List<ClaimsPaymentCovInfoType> getClaimsPaymentCovInfo() {
        if (claimsPaymentCovInfo == null) {
            claimsPaymentCovInfo = new ArrayList<ClaimsPaymentCovInfoType>();
        }
        return this.claimsPaymentCovInfo;
    }

    /**
     * Gets the value of the totalPaymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalPaymentAmt() {
        return totalPaymentAmt;
    }

    /**
     * Sets the value of the totalPaymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalPaymentAmt(CURRENCY value) {
        this.totalPaymentAmt = value;
    }

    /**
     * Gets the value of the lossCauseCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getLossCauseCd() {
        return lossCauseCd;
    }

    /**
     * Sets the value of the lossCauseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setLossCauseCd(OpenEnum value) {
        this.lossCauseCd = value;
    }

    /**
     * Gets the value of the methodPaymentCd property.
     * 
     * @return
     *     possible object is
     *     {@link MethodOfPayment }
     *     
     */
    public MethodOfPayment getMethodPaymentCd() {
        return methodPaymentCd;
    }

    /**
     * Sets the value of the methodPaymentCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodOfPayment }
     *     
     */
    public void setMethodPaymentCd(MethodOfPayment value) {
        this.methodPaymentCd = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setCheckNumber(C25 value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the paymentDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPaymentDt() {
        return paymentDt;
    }

    /**
     * Sets the value of the paymentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPaymentDt(Date value) {
        this.paymentDt = value;
    }

    /**
     * Gets the value of the serviceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getServiceDuration() {
        return serviceDuration;
    }

    /**
     * Sets the value of the serviceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setServiceDuration(DURATION value) {
        this.serviceDuration = value;
    }

    /**
     * Gets the value of the insuredOrPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link InsuredOrPrincipalType }
     *     
     */
    public InsuredOrPrincipalType getInsuredOrPrincipal() {
        return insuredOrPrincipal;
    }

    /**
     * Sets the value of the insuredOrPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuredOrPrincipalType }
     *     
     */
    public void setInsuredOrPrincipal(InsuredOrPrincipalType value) {
        this.insuredOrPrincipal = value;
    }

    /**
     * Gets the value of the paymentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getPaymentDesc() {
        return paymentDesc;
    }

    /**
     * Sets the value of the paymentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setPaymentDesc(C255 value) {
        this.paymentDesc = value;
    }

    /**
     * Gets the value of the reserveChangeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reserveChangeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReserveChangeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReserveChangeInfoType }
     * 
     * 
     */
    public List<ReserveChangeInfoType> getReserveChangeInfo() {
        if (reserveChangeInfo == null) {
            reserveChangeInfo = new ArrayList<ReserveChangeInfoType>();
        }
        return this.reserveChangeInfo;
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
     * Gets the value of the idRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdRef() {
        return idRef;
    }

    /**
     * Sets the value of the idRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdRef(Object value) {
        this.idRef = value;
    }

    /**
     * Gets the value of the claimsPartyRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClaimsPartyRef() {
        return claimsPartyRef;
    }

    /**
     * Sets the value of the claimsPartyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClaimsPartyRef(Object value) {
        this.claimsPartyRef = value;
    }

}
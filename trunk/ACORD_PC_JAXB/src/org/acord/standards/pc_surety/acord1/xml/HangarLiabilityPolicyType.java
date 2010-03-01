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
 * <p>Java class for HangarLiabilityPolicy_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HangarLiabilityPolicy_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HANGARLIABILITYPOLINFO"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicySummaryInfo" minOccurs="0"/>
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
@XmlType(name = "HangarLiabilityPolicy_Type", propOrder = {
    "producer",
    "insuredOrPrincipal",
    "commlPolicy",
    "location",
    "hangarLiabilityLineBusiness",
    "remarkText",
    "fileAttachmentInfo",
    "policySummaryInfo"
})
public class HangarLiabilityPolicyType {

    @XmlElement(name = "Producer")
    protected List<ProducerType> producer;
    @XmlElement(name = "InsuredOrPrincipal", required = true)
    protected List<InsuredOrPrincipalType> insuredOrPrincipal;
    @XmlElement(name = "CommlPolicy", required = true)
    protected CommlPolicyType commlPolicy;
    @XmlElement(name = "Location")
    protected List<LocationType2> location;
    @XmlElement(name = "HangarLiabilityLineBusiness", required = true)
    protected HangarLiabilityLineBusinessType hangarLiabilityLineBusiness;
    @XmlElement(name = "RemarkText")
    protected List<RemarkText> remarkText;
    @XmlElement(name = "FileAttachmentInfo")
    protected List<FileAttachmentInfoType> fileAttachmentInfo;
    @XmlElement(name = "PolicySummaryInfo")
    protected PolicySummaryInfoType policySummaryInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

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
     * Gets the value of the commlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CommlPolicyType }
     *     
     */
    public CommlPolicyType getCommlPolicy() {
        return commlPolicy;
    }

    /**
     * Sets the value of the commlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommlPolicyType }
     *     
     */
    public void setCommlPolicy(CommlPolicyType value) {
        this.commlPolicy = value;
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
     * Gets the value of the hangarLiabilityLineBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link HangarLiabilityLineBusinessType }
     *     
     */
    public HangarLiabilityLineBusinessType getHangarLiabilityLineBusiness() {
        return hangarLiabilityLineBusiness;
    }

    /**
     * Sets the value of the hangarLiabilityLineBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link HangarLiabilityLineBusinessType }
     *     
     */
    public void setHangarLiabilityLineBusiness(HangarLiabilityLineBusinessType value) {
        this.hangarLiabilityLineBusiness = value;
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

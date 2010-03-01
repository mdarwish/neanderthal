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
 * <p>Java class for BusinessIncomeInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessIncomeInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InventoryAccountingMethodCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AnnualGrossReceiptsAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AnnualNetReceiptsAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RecoveryPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InsuranceToValuePct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BillableLostPeriod" minOccurs="0"/>
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
@XmlType(name = "BusinessIncomeInfo_Type", propOrder = {
    "inventoryAccountingMethodCd",
    "annualGrossReceiptsAmt",
    "annualNetReceiptsAmt",
    "recoveryPeriod",
    "insuranceToValuePct",
    "billableLostPeriod"
})
public class BusinessIncomeInfoType {

    @XmlElement(name = "InventoryAccountingMethodCd")
    protected InventoryAccountingMethod inventoryAccountingMethodCd;
    @XmlElement(name = "AnnualGrossReceiptsAmt")
    protected CURRENCY annualGrossReceiptsAmt;
    @XmlElement(name = "AnnualNetReceiptsAmt")
    protected CURRENCY annualNetReceiptsAmt;
    @XmlElement(name = "RecoveryPeriod")
    protected DURATION recoveryPeriod;
    @XmlElement(name = "InsuranceToValuePct")
    protected PercentLong insuranceToValuePct;
    @XmlElement(name = "BillableLostPeriod")
    protected DURATION billableLostPeriod;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the inventoryAccountingMethodCd property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryAccountingMethod }
     *     
     */
    public InventoryAccountingMethod getInventoryAccountingMethodCd() {
        return inventoryAccountingMethodCd;
    }

    /**
     * Sets the value of the inventoryAccountingMethodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryAccountingMethod }
     *     
     */
    public void setInventoryAccountingMethodCd(InventoryAccountingMethod value) {
        this.inventoryAccountingMethodCd = value;
    }

    /**
     * Gets the value of the annualGrossReceiptsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getAnnualGrossReceiptsAmt() {
        return annualGrossReceiptsAmt;
    }

    /**
     * Sets the value of the annualGrossReceiptsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setAnnualGrossReceiptsAmt(CURRENCY value) {
        this.annualGrossReceiptsAmt = value;
    }

    /**
     * Gets the value of the annualNetReceiptsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getAnnualNetReceiptsAmt() {
        return annualNetReceiptsAmt;
    }

    /**
     * Sets the value of the annualNetReceiptsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setAnnualNetReceiptsAmt(CURRENCY value) {
        this.annualNetReceiptsAmt = value;
    }

    /**
     * Gets the value of the recoveryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getRecoveryPeriod() {
        return recoveryPeriod;
    }

    /**
     * Sets the value of the recoveryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setRecoveryPeriod(DURATION value) {
        this.recoveryPeriod = value;
    }

    /**
     * Gets the value of the insuranceToValuePct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getInsuranceToValuePct() {
        return insuranceToValuePct;
    }

    /**
     * Sets the value of the insuranceToValuePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setInsuranceToValuePct(PercentLong value) {
        this.insuranceToValuePct = value;
    }

    /**
     * Gets the value of the billableLostPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getBillableLostPeriod() {
        return billableLostPeriod;
    }

    /**
     * Sets the value of the billableLostPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setBillableLostPeriod(DURATION value) {
        this.billableLostPeriod = value;
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

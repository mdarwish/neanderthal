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
 * <p>Java class for WorkCompRateClass_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkCompRateClass_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ActualRemunerationAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IfAnyRatingBasisInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEmployees" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEmployeesFullTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEmployeesPartTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Rate" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PremiumBasisCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RatingClassificationCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Exposure" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RatingClassificationDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RatingClassificationDescCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExposurePeriod" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CreditOrSurcharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CurrentTermAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WrittenAmt" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="LocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="CoverageRefs" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREFS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkCompRateClass_Type", propOrder = {
    "actualRemunerationAmt",
    "ifAnyRatingBasisInd",
    "numEmployees",
    "numEmployeesFullTime",
    "numEmployeesPartTime",
    "rate",
    "premiumBasisCd",
    "ratingClassificationCd",
    "exposure",
    "ratingClassificationDesc",
    "ratingClassificationDescCd",
    "exposurePeriod",
    "commlCoverage",
    "creditOrSurcharge",
    "currentTermAmt",
    "writtenAmt"
})
public class WorkCompRateClassType {

    @XmlElement(name = "ActualRemunerationAmt")
    protected CURRENCY actualRemunerationAmt;
    @XmlElement(name = "IfAnyRatingBasisInd")
    protected Boolean ifAnyRatingBasisInd;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "NumEmployeesFullTime")
    protected Long numEmployeesFullTime;
    @XmlElement(name = "NumEmployeesPartTime")
    protected Long numEmployeesPartTime;
    @XmlElement(name = "Rate")
    protected Decimal rate;
    @XmlElement(name = "PremiumBasisCd")
    protected PremiumBase premiumBasisCd;
    @XmlElement(name = "RatingClassificationCd")
    protected OpenEnum ratingClassificationCd;
    @XmlElement(name = "Exposure")
    protected Decimal exposure;
    @XmlElement(name = "RatingClassificationDesc")
    protected C255 ratingClassificationDesc;
    @XmlElement(name = "RatingClassificationDescCd")
    protected OpenEnum ratingClassificationDescCd;
    @XmlElement(name = "ExposurePeriod")
    protected List<DURATION> exposurePeriod;
    @XmlElement(name = "CommlCoverage")
    protected List<CommlCoverageType> commlCoverage;
    @XmlElement(name = "CreditOrSurcharge")
    protected List<PCCREDITSURCHARGE> creditOrSurcharge;
    @XmlElement(name = "CurrentTermAmt")
    protected CURRENCY currentTermAmt;
    @XmlElement(name = "WrittenAmt")
    protected CURRENCY writtenAmt;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "LocationRef")
    @XmlIDREF
    protected Object locationRef;
    @XmlAttribute(name = "CoverageRefs")
    @XmlIDREF
    protected List<Object> coverageRefs;

    /**
     * Gets the value of the actualRemunerationAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getActualRemunerationAmt() {
        return actualRemunerationAmt;
    }

    /**
     * Sets the value of the actualRemunerationAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setActualRemunerationAmt(CURRENCY value) {
        this.actualRemunerationAmt = value;
    }

    /**
     * Gets the value of the ifAnyRatingBasisInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIfAnyRatingBasisInd() {
        return ifAnyRatingBasisInd;
    }

    /**
     * Sets the value of the ifAnyRatingBasisInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIfAnyRatingBasisInd(Boolean value) {
        this.ifAnyRatingBasisInd = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployees(Long value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the numEmployeesFullTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployeesFullTime() {
        return numEmployeesFullTime;
    }

    /**
     * Sets the value of the numEmployeesFullTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployeesFullTime(Long value) {
        this.numEmployeesFullTime = value;
    }

    /**
     * Gets the value of the numEmployeesPartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployeesPartTime() {
        return numEmployeesPartTime;
    }

    /**
     * Sets the value of the numEmployeesPartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployeesPartTime(Long value) {
        this.numEmployeesPartTime = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setRate(Decimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the premiumBasisCd property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumBase }
     *     
     */
    public PremiumBase getPremiumBasisCd() {
        return premiumBasisCd;
    }

    /**
     * Sets the value of the premiumBasisCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumBase }
     *     
     */
    public void setPremiumBasisCd(PremiumBase value) {
        this.premiumBasisCd = value;
    }

    /**
     * Gets the value of the ratingClassificationCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getRatingClassificationCd() {
        return ratingClassificationCd;
    }

    /**
     * Sets the value of the ratingClassificationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setRatingClassificationCd(OpenEnum value) {
        this.ratingClassificationCd = value;
    }

    /**
     * Gets the value of the exposure property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setExposure(Decimal value) {
        this.exposure = value;
    }

    /**
     * Gets the value of the ratingClassificationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getRatingClassificationDesc() {
        return ratingClassificationDesc;
    }

    /**
     * Sets the value of the ratingClassificationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setRatingClassificationDesc(C255 value) {
        this.ratingClassificationDesc = value;
    }

    /**
     * Gets the value of the ratingClassificationDescCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getRatingClassificationDescCd() {
        return ratingClassificationDescCd;
    }

    /**
     * Sets the value of the ratingClassificationDescCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setRatingClassificationDescCd(OpenEnum value) {
        this.ratingClassificationDescCd = value;
    }

    /**
     * Gets the value of the exposurePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exposurePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExposurePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DURATION }
     * 
     * 
     */
    public List<DURATION> getExposurePeriod() {
        if (exposurePeriod == null) {
            exposurePeriod = new ArrayList<DURATION>();
        }
        return this.exposurePeriod;
    }

    /**
     * Gets the value of the commlCoverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlCoverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlCoverageType }
     * 
     * 
     */
    public List<CommlCoverageType> getCommlCoverage() {
        if (commlCoverage == null) {
            commlCoverage = new ArrayList<CommlCoverageType>();
        }
        return this.commlCoverage;
    }

    /**
     * Gets the value of the creditOrSurcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditOrSurcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditOrSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCCREDITSURCHARGE }
     * 
     * 
     */
    public List<PCCREDITSURCHARGE> getCreditOrSurcharge() {
        if (creditOrSurcharge == null) {
            creditOrSurcharge = new ArrayList<PCCREDITSURCHARGE>();
        }
        return this.creditOrSurcharge;
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
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocationRef(Object value) {
        this.locationRef = value;
    }

    /**
     * Gets the value of the coverageRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getCoverageRefs() {
        if (coverageRefs == null) {
            coverageRefs = new ArrayList<Object>();
        }
        return this.coverageRefs;
    }

}
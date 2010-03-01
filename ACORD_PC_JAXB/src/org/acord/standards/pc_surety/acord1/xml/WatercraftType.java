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
 * <p>Java class for Watercraft_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Watercraft_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PCBASICWATERCRAFT">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HullDesignTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HullMaterialTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SparMaterialCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NameBoat" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumOperatorsUnder21Yrs" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RegistrationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LayUpPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumBeds" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FuelTankCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PropulsionTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PrincipalOperatorInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AdditionalInterest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Coverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MinPremInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PrimarySeasonCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SecondarySeasonCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SurveyDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Watercraft_Type", propOrder = {
    "hullDesignTypeCd",
    "hullMaterialTypeCd",
    "sparMaterialCd",
    "nameBoat",
    "numOperatorsUnder21Yrs",
    "registrationNumber",
    "layUpPeriod",
    "numBeds",
    "fuelTankCd",
    "propulsionTypeCd",
    "principalOperatorInd",
    "additionalInterest",
    "coverage",
    "questionAnswer",
    "minPremInd",
    "primarySeasonCd",
    "secondarySeasonCd",
    "surveyDt"
})
public class WatercraftType
    extends PCBASICWATERCRAFT
{

    @XmlElement(name = "HullDesignTypeCd")
    protected HullDesignType hullDesignTypeCd;
    @XmlElement(name = "HullMaterialTypeCd")
    protected HullMaterialType hullMaterialTypeCd;
    @XmlElement(name = "SparMaterialCd")
    protected SparMaterial sparMaterialCd;
    @XmlElement(name = "NameBoat")
    protected C25 nameBoat;
    @XmlElement(name = "NumOperatorsUnder21Yrs")
    protected Long numOperatorsUnder21Yrs;
    @XmlElement(name = "RegistrationNumber")
    protected C14 registrationNumber;
    @XmlElement(name = "LayUpPeriod")
    protected LayUpPeriodType layUpPeriod;
    @XmlElement(name = "NumBeds")
    protected Long numBeds;
    @XmlElement(name = "FuelTankCd")
    protected FuelTank fuelTankCd;
    @XmlElement(name = "PropulsionTypeCd")
    protected PropulsionType propulsionTypeCd;
    @XmlElement(name = "PrincipalOperatorInd")
    protected Boolean principalOperatorInd;
    @XmlElement(name = "AdditionalInterest")
    protected List<AdditionalInterestType> additionalInterest;
    @XmlElement(name = "Coverage")
    protected List<CoverageType> coverage;
    @XmlElement(name = "QuestionAnswer")
    protected List<QuestionAnswerType> questionAnswer;
    @XmlElement(name = "MinPremInd")
    protected Boolean minPremInd;
    @XmlElement(name = "PrimarySeasonCd")
    protected Season primarySeasonCd;
    @XmlElement(name = "SecondarySeasonCd")
    protected Season secondarySeasonCd;
    @XmlElement(name = "SurveyDt")
    protected Date surveyDt;

    /**
     * Gets the value of the hullDesignTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link HullDesignType }
     *     
     */
    public HullDesignType getHullDesignTypeCd() {
        return hullDesignTypeCd;
    }

    /**
     * Sets the value of the hullDesignTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HullDesignType }
     *     
     */
    public void setHullDesignTypeCd(HullDesignType value) {
        this.hullDesignTypeCd = value;
    }

    /**
     * Gets the value of the hullMaterialTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link HullMaterialType }
     *     
     */
    public HullMaterialType getHullMaterialTypeCd() {
        return hullMaterialTypeCd;
    }

    /**
     * Sets the value of the hullMaterialTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HullMaterialType }
     *     
     */
    public void setHullMaterialTypeCd(HullMaterialType value) {
        this.hullMaterialTypeCd = value;
    }

    /**
     * Gets the value of the sparMaterialCd property.
     * 
     * @return
     *     possible object is
     *     {@link SparMaterial }
     *     
     */
    public SparMaterial getSparMaterialCd() {
        return sparMaterialCd;
    }

    /**
     * Sets the value of the sparMaterialCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SparMaterial }
     *     
     */
    public void setSparMaterialCd(SparMaterial value) {
        this.sparMaterialCd = value;
    }

    /**
     * Gets the value of the nameBoat property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getNameBoat() {
        return nameBoat;
    }

    /**
     * Sets the value of the nameBoat property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setNameBoat(C25 value) {
        this.nameBoat = value;
    }

    /**
     * Gets the value of the numOperatorsUnder21Yrs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOperatorsUnder21Yrs() {
        return numOperatorsUnder21Yrs;
    }

    /**
     * Sets the value of the numOperatorsUnder21Yrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOperatorsUnder21Yrs(Long value) {
        this.numOperatorsUnder21Yrs = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C14 }
     *     
     */
    public C14 getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C14 }
     *     
     */
    public void setRegistrationNumber(C14 value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the layUpPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link LayUpPeriodType }
     *     
     */
    public LayUpPeriodType getLayUpPeriod() {
        return layUpPeriod;
    }

    /**
     * Sets the value of the layUpPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayUpPeriodType }
     *     
     */
    public void setLayUpPeriod(LayUpPeriodType value) {
        this.layUpPeriod = value;
    }

    /**
     * Gets the value of the numBeds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumBeds() {
        return numBeds;
    }

    /**
     * Sets the value of the numBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumBeds(Long value) {
        this.numBeds = value;
    }

    /**
     * Gets the value of the fuelTankCd property.
     * 
     * @return
     *     possible object is
     *     {@link FuelTank }
     *     
     */
    public FuelTank getFuelTankCd() {
        return fuelTankCd;
    }

    /**
     * Sets the value of the fuelTankCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTank }
     *     
     */
    public void setFuelTankCd(FuelTank value) {
        this.fuelTankCd = value;
    }

    /**
     * Gets the value of the propulsionTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link PropulsionType }
     *     
     */
    public PropulsionType getPropulsionTypeCd() {
        return propulsionTypeCd;
    }

    /**
     * Sets the value of the propulsionTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropulsionType }
     *     
     */
    public void setPropulsionTypeCd(PropulsionType value) {
        this.propulsionTypeCd = value;
    }

    /**
     * Gets the value of the principalOperatorInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrincipalOperatorInd() {
        return principalOperatorInd;
    }

    /**
     * Sets the value of the principalOperatorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipalOperatorInd(Boolean value) {
        this.principalOperatorInd = value;
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
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageType }
     * 
     * 
     */
    public List<CoverageType> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<CoverageType>();
        }
        return this.coverage;
    }

    /**
     * Gets the value of the questionAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionAnswerType }
     * 
     * 
     */
    public List<QuestionAnswerType> getQuestionAnswer() {
        if (questionAnswer == null) {
            questionAnswer = new ArrayList<QuestionAnswerType>();
        }
        return this.questionAnswer;
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
     * Gets the value of the primarySeasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link Season }
     *     
     */
    public Season getPrimarySeasonCd() {
        return primarySeasonCd;
    }

    /**
     * Sets the value of the primarySeasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Season }
     *     
     */
    public void setPrimarySeasonCd(Season value) {
        this.primarySeasonCd = value;
    }

    /**
     * Gets the value of the secondarySeasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link Season }
     *     
     */
    public Season getSecondarySeasonCd() {
        return secondarySeasonCd;
    }

    /**
     * Sets the value of the secondarySeasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Season }
     *     
     */
    public void setSecondarySeasonCd(Season value) {
        this.secondarySeasonCd = value;
    }

    /**
     * Gets the value of the surveyDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getSurveyDt() {
        return surveyDt;
    }

    /**
     * Sets the value of the surveyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setSurveyDt(Date value) {
        this.surveyDt = value;
    }

}
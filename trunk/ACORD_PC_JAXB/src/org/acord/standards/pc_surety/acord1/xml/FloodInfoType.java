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
 * <p>Java class for FloodInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloodInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WaitingPeriodCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DisasterAssistCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DisasterAssistCaseId" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HighRiseInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContentsLocationCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SingleUnitCovInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FoundationCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EnclosureArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HeightAboveGround" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EnclosureWallCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EnclosureUsageCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RatingTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BldgDiagramNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LowFloorElevation" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BaseFloodElevation" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LowAdjacentGradeElevation" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FloodCommunityInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SmallBusinessRiskInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AreaBelowElevatedBldgObstructedCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PostFIRMConstructionInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ElevationCertificationDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WaveActionInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LowestFloorAboveBelowGrade" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GarageFloorAboveBelowGrade" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EquipmentBelowLowestFloor" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ShorelineDistanceCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FloodSourceCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumOpeningsBelowElevatedFloor" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EnclosedBelowElevatedFloorArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BasementAboveGradeInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AreaBelowElevatedFloorEnclosedCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FloodEquipmentInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FloodInfo_Type", propOrder = {
    "waitingPeriodCd",
    "disasterAssistCd",
    "disasterAssistCaseId",
    "highRiseInd",
    "contentsLocationCd",
    "singleUnitCovInd",
    "foundationCd",
    "enclosureArea",
    "heightAboveGround",
    "enclosureWallCd",
    "enclosureUsageCd",
    "ratingTypeCd",
    "bldgDiagramNumber",
    "lowFloorElevation",
    "baseFloodElevation",
    "lowAdjacentGradeElevation",
    "floodCommunityInfo",
    "smallBusinessRiskInd",
    "areaBelowElevatedBldgObstructedCd",
    "postFIRMConstructionInd",
    "elevationCertificationDt",
    "waveActionInd",
    "lowestFloorAboveBelowGrade",
    "garageFloorAboveBelowGrade",
    "equipmentBelowLowestFloor",
    "shorelineDistanceCd",
    "floodSourceCd",
    "numOpeningsBelowElevatedFloor",
    "enclosedBelowElevatedFloorArea",
    "basementAboveGradeInd",
    "areaBelowElevatedFloorEnclosedCd",
    "floodEquipmentInfo"
})
public class FloodInfoType {

    @XmlElement(name = "WaitingPeriodCd")
    protected WaitingPeriod waitingPeriodCd;
    @XmlElement(name = "DisasterAssistCd")
    protected DisasterAssistance disasterAssistCd;
    @XmlElement(name = "DisasterAssistCaseId")
    protected AssignedIdentifier disasterAssistCaseId;
    @XmlElement(name = "HighRiseInd")
    protected Boolean highRiseInd;
    @XmlElement(name = "ContentsLocationCd")
    protected ContentsLocation contentsLocationCd;
    @XmlElement(name = "SingleUnitCovInd")
    protected Boolean singleUnitCovInd;
    @XmlElement(name = "FoundationCd")
    protected Foundation foundationCd;
    @XmlElement(name = "EnclosureArea")
    protected MEASUREMENT enclosureArea;
    @XmlElement(name = "HeightAboveGround")
    protected MEASUREMENT heightAboveGround;
    @XmlElement(name = "EnclosureWallCd")
    protected WallType enclosureWallCd;
    @XmlElement(name = "EnclosureUsageCd")
    protected EnclosureUsage enclosureUsageCd;
    @XmlElement(name = "RatingTypeCd")
    protected RatingType ratingTypeCd;
    @XmlElement(name = "BldgDiagramNumber")
    protected Long bldgDiagramNumber;
    @XmlElement(name = "LowFloorElevation")
    protected MEASUREMENT lowFloorElevation;
    @XmlElement(name = "BaseFloodElevation")
    protected MEASUREMENT baseFloodElevation;
    @XmlElement(name = "LowAdjacentGradeElevation")
    protected MEASUREMENT lowAdjacentGradeElevation;
    @XmlElement(name = "FloodCommunityInfo")
    protected FloodCommunityInfoType floodCommunityInfo;
    @XmlElement(name = "SmallBusinessRiskInd")
    protected Boolean smallBusinessRiskInd;
    @XmlElement(name = "AreaBelowElevatedBldgObstructedCd")
    protected Obstruction areaBelowElevatedBldgObstructedCd;
    @XmlElement(name = "PostFIRMConstructionInd")
    protected Boolean postFIRMConstructionInd;
    @XmlElement(name = "ElevationCertificationDt")
    protected Date elevationCertificationDt;
    @XmlElement(name = "WaveActionInd")
    protected Boolean waveActionInd;
    @XmlElement(name = "LowestFloorAboveBelowGrade")
    protected MEASUREMENT lowestFloorAboveBelowGrade;
    @XmlElement(name = "GarageFloorAboveBelowGrade")
    protected MEASUREMENT garageFloorAboveBelowGrade;
    @XmlElement(name = "EquipmentBelowLowestFloor")
    protected MEASUREMENT equipmentBelowLowestFloor;
    @XmlElement(name = "ShorelineDistanceCd")
    protected ShorelineDistance shorelineDistanceCd;
    @XmlElement(name = "FloodSourceCd")
    protected FloodSource floodSourceCd;
    @XmlElement(name = "NumOpeningsBelowElevatedFloor")
    protected Long numOpeningsBelowElevatedFloor;
    @XmlElement(name = "EnclosedBelowElevatedFloorArea")
    protected MEASUREMENT enclosedBelowElevatedFloorArea;
    @XmlElement(name = "BasementAboveGradeInd")
    protected Boolean basementAboveGradeInd;
    @XmlElement(name = "AreaBelowElevatedFloorEnclosedCd")
    protected EnclosureStatus areaBelowElevatedFloorEnclosedCd;
    @XmlElement(name = "FloodEquipmentInfo")
    protected List<FloodEquipmentInfoType> floodEquipmentInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the waitingPeriodCd property.
     * 
     * @return
     *     possible object is
     *     {@link WaitingPeriod }
     *     
     */
    public WaitingPeriod getWaitingPeriodCd() {
        return waitingPeriodCd;
    }

    /**
     * Sets the value of the waitingPeriodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaitingPeriod }
     *     
     */
    public void setWaitingPeriodCd(WaitingPeriod value) {
        this.waitingPeriodCd = value;
    }

    /**
     * Gets the value of the disasterAssistCd property.
     * 
     * @return
     *     possible object is
     *     {@link DisasterAssistance }
     *     
     */
    public DisasterAssistance getDisasterAssistCd() {
        return disasterAssistCd;
    }

    /**
     * Sets the value of the disasterAssistCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisasterAssistance }
     *     
     */
    public void setDisasterAssistCd(DisasterAssistance value) {
        this.disasterAssistCd = value;
    }

    /**
     * Gets the value of the disasterAssistCaseId property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getDisasterAssistCaseId() {
        return disasterAssistCaseId;
    }

    /**
     * Sets the value of the disasterAssistCaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setDisasterAssistCaseId(AssignedIdentifier value) {
        this.disasterAssistCaseId = value;
    }

    /**
     * Gets the value of the highRiseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHighRiseInd() {
        return highRiseInd;
    }

    /**
     * Sets the value of the highRiseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighRiseInd(Boolean value) {
        this.highRiseInd = value;
    }

    /**
     * Gets the value of the contentsLocationCd property.
     * 
     * @return
     *     possible object is
     *     {@link ContentsLocation }
     *     
     */
    public ContentsLocation getContentsLocationCd() {
        return contentsLocationCd;
    }

    /**
     * Sets the value of the contentsLocationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentsLocation }
     *     
     */
    public void setContentsLocationCd(ContentsLocation value) {
        this.contentsLocationCd = value;
    }

    /**
     * Gets the value of the singleUnitCovInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSingleUnitCovInd() {
        return singleUnitCovInd;
    }

    /**
     * Sets the value of the singleUnitCovInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleUnitCovInd(Boolean value) {
        this.singleUnitCovInd = value;
    }

    /**
     * Gets the value of the foundationCd property.
     * 
     * @return
     *     possible object is
     *     {@link Foundation }
     *     
     */
    public Foundation getFoundationCd() {
        return foundationCd;
    }

    /**
     * Sets the value of the foundationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Foundation }
     *     
     */
    public void setFoundationCd(Foundation value) {
        this.foundationCd = value;
    }

    /**
     * Gets the value of the enclosureArea property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getEnclosureArea() {
        return enclosureArea;
    }

    /**
     * Sets the value of the enclosureArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setEnclosureArea(MEASUREMENT value) {
        this.enclosureArea = value;
    }

    /**
     * Gets the value of the heightAboveGround property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getHeightAboveGround() {
        return heightAboveGround;
    }

    /**
     * Sets the value of the heightAboveGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setHeightAboveGround(MEASUREMENT value) {
        this.heightAboveGround = value;
    }

    /**
     * Gets the value of the enclosureWallCd property.
     * 
     * @return
     *     possible object is
     *     {@link WallType }
     *     
     */
    public WallType getEnclosureWallCd() {
        return enclosureWallCd;
    }

    /**
     * Sets the value of the enclosureWallCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WallType }
     *     
     */
    public void setEnclosureWallCd(WallType value) {
        this.enclosureWallCd = value;
    }

    /**
     * Gets the value of the enclosureUsageCd property.
     * 
     * @return
     *     possible object is
     *     {@link EnclosureUsage }
     *     
     */
    public EnclosureUsage getEnclosureUsageCd() {
        return enclosureUsageCd;
    }

    /**
     * Sets the value of the enclosureUsageCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnclosureUsage }
     *     
     */
    public void setEnclosureUsageCd(EnclosureUsage value) {
        this.enclosureUsageCd = value;
    }

    /**
     * Gets the value of the ratingTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link RatingType }
     *     
     */
    public RatingType getRatingTypeCd() {
        return ratingTypeCd;
    }

    /**
     * Sets the value of the ratingTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingType }
     *     
     */
    public void setRatingTypeCd(RatingType value) {
        this.ratingTypeCd = value;
    }

    /**
     * Gets the value of the bldgDiagramNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBldgDiagramNumber() {
        return bldgDiagramNumber;
    }

    /**
     * Sets the value of the bldgDiagramNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBldgDiagramNumber(Long value) {
        this.bldgDiagramNumber = value;
    }

    /**
     * Gets the value of the lowFloorElevation property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLowFloorElevation() {
        return lowFloorElevation;
    }

    /**
     * Sets the value of the lowFloorElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLowFloorElevation(MEASUREMENT value) {
        this.lowFloorElevation = value;
    }

    /**
     * Gets the value of the baseFloodElevation property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getBaseFloodElevation() {
        return baseFloodElevation;
    }

    /**
     * Sets the value of the baseFloodElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setBaseFloodElevation(MEASUREMENT value) {
        this.baseFloodElevation = value;
    }

    /**
     * Gets the value of the lowAdjacentGradeElevation property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLowAdjacentGradeElevation() {
        return lowAdjacentGradeElevation;
    }

    /**
     * Sets the value of the lowAdjacentGradeElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLowAdjacentGradeElevation(MEASUREMENT value) {
        this.lowAdjacentGradeElevation = value;
    }

    /**
     * Gets the value of the floodCommunityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FloodCommunityInfoType }
     *     
     */
    public FloodCommunityInfoType getFloodCommunityInfo() {
        return floodCommunityInfo;
    }

    /**
     * Sets the value of the floodCommunityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloodCommunityInfoType }
     *     
     */
    public void setFloodCommunityInfo(FloodCommunityInfoType value) {
        this.floodCommunityInfo = value;
    }

    /**
     * Gets the value of the smallBusinessRiskInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSmallBusinessRiskInd() {
        return smallBusinessRiskInd;
    }

    /**
     * Sets the value of the smallBusinessRiskInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmallBusinessRiskInd(Boolean value) {
        this.smallBusinessRiskInd = value;
    }

    /**
     * Gets the value of the areaBelowElevatedBldgObstructedCd property.
     * 
     * @return
     *     possible object is
     *     {@link Obstruction }
     *     
     */
    public Obstruction getAreaBelowElevatedBldgObstructedCd() {
        return areaBelowElevatedBldgObstructedCd;
    }

    /**
     * Sets the value of the areaBelowElevatedBldgObstructedCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obstruction }
     *     
     */
    public void setAreaBelowElevatedBldgObstructedCd(Obstruction value) {
        this.areaBelowElevatedBldgObstructedCd = value;
    }

    /**
     * Gets the value of the postFIRMConstructionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPostFIRMConstructionInd() {
        return postFIRMConstructionInd;
    }

    /**
     * Sets the value of the postFIRMConstructionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostFIRMConstructionInd(Boolean value) {
        this.postFIRMConstructionInd = value;
    }

    /**
     * Gets the value of the elevationCertificationDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getElevationCertificationDt() {
        return elevationCertificationDt;
    }

    /**
     * Sets the value of the elevationCertificationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setElevationCertificationDt(Date value) {
        this.elevationCertificationDt = value;
    }

    /**
     * Gets the value of the waveActionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWaveActionInd() {
        return waveActionInd;
    }

    /**
     * Sets the value of the waveActionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaveActionInd(Boolean value) {
        this.waveActionInd = value;
    }

    /**
     * Gets the value of the lowestFloorAboveBelowGrade property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLowestFloorAboveBelowGrade() {
        return lowestFloorAboveBelowGrade;
    }

    /**
     * Sets the value of the lowestFloorAboveBelowGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLowestFloorAboveBelowGrade(MEASUREMENT value) {
        this.lowestFloorAboveBelowGrade = value;
    }

    /**
     * Gets the value of the garageFloorAboveBelowGrade property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getGarageFloorAboveBelowGrade() {
        return garageFloorAboveBelowGrade;
    }

    /**
     * Sets the value of the garageFloorAboveBelowGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setGarageFloorAboveBelowGrade(MEASUREMENT value) {
        this.garageFloorAboveBelowGrade = value;
    }

    /**
     * Gets the value of the equipmentBelowLowestFloor property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getEquipmentBelowLowestFloor() {
        return equipmentBelowLowestFloor;
    }

    /**
     * Sets the value of the equipmentBelowLowestFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setEquipmentBelowLowestFloor(MEASUREMENT value) {
        this.equipmentBelowLowestFloor = value;
    }

    /**
     * Gets the value of the shorelineDistanceCd property.
     * 
     * @return
     *     possible object is
     *     {@link ShorelineDistance }
     *     
     */
    public ShorelineDistance getShorelineDistanceCd() {
        return shorelineDistanceCd;
    }

    /**
     * Sets the value of the shorelineDistanceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShorelineDistance }
     *     
     */
    public void setShorelineDistanceCd(ShorelineDistance value) {
        this.shorelineDistanceCd = value;
    }

    /**
     * Gets the value of the floodSourceCd property.
     * 
     * @return
     *     possible object is
     *     {@link FloodSource }
     *     
     */
    public FloodSource getFloodSourceCd() {
        return floodSourceCd;
    }

    /**
     * Sets the value of the floodSourceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloodSource }
     *     
     */
    public void setFloodSourceCd(FloodSource value) {
        this.floodSourceCd = value;
    }

    /**
     * Gets the value of the numOpeningsBelowElevatedFloor property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOpeningsBelowElevatedFloor() {
        return numOpeningsBelowElevatedFloor;
    }

    /**
     * Sets the value of the numOpeningsBelowElevatedFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOpeningsBelowElevatedFloor(Long value) {
        this.numOpeningsBelowElevatedFloor = value;
    }

    /**
     * Gets the value of the enclosedBelowElevatedFloorArea property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getEnclosedBelowElevatedFloorArea() {
        return enclosedBelowElevatedFloorArea;
    }

    /**
     * Sets the value of the enclosedBelowElevatedFloorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setEnclosedBelowElevatedFloorArea(MEASUREMENT value) {
        this.enclosedBelowElevatedFloorArea = value;
    }

    /**
     * Gets the value of the basementAboveGradeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBasementAboveGradeInd() {
        return basementAboveGradeInd;
    }

    /**
     * Sets the value of the basementAboveGradeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasementAboveGradeInd(Boolean value) {
        this.basementAboveGradeInd = value;
    }

    /**
     * Gets the value of the areaBelowElevatedFloorEnclosedCd property.
     * 
     * @return
     *     possible object is
     *     {@link EnclosureStatus }
     *     
     */
    public EnclosureStatus getAreaBelowElevatedFloorEnclosedCd() {
        return areaBelowElevatedFloorEnclosedCd;
    }

    /**
     * Sets the value of the areaBelowElevatedFloorEnclosedCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnclosureStatus }
     *     
     */
    public void setAreaBelowElevatedFloorEnclosedCd(EnclosureStatus value) {
        this.areaBelowElevatedFloorEnclosedCd = value;
    }

    /**
     * Gets the value of the floodEquipmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floodEquipmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloodEquipmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FloodEquipmentInfoType }
     * 
     * 
     */
    public List<FloodEquipmentInfoType> getFloodEquipmentInfo() {
        if (floodEquipmentInfo == null) {
            floodEquipmentInfo = new ArrayList<FloodEquipmentInfoType>();
        }
        return this.floodEquipmentInfo;
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
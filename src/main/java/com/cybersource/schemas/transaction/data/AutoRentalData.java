
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AutoRentalData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AutoRentalData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adjustmentCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="adjustmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerServicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dailyRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="mileageCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="gasCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="insuranceCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="lateReturnCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="maximumFreeMiles" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="milesTraveled" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="oneWayCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="parkingViolationCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="pickUpCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ratePerMile" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="renterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="specialProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoRentalData", propOrder = {
    "adjustmentCost",
    "adjustmentCode",
    "agreementNumber",
    "classCode",
    "customerServicePhoneNumber",
    "dailyRate",
    "mileageCost",
    "gasCost",
    "insuranceCost",
    "lateReturnCost",
    "maximumFreeMiles",
    "milesTraveled",
    "oneWayCost",
    "parkingViolationCost",
    "pickUpCity",
    "pickUpCountry",
    "pickUpDate",
    "pickUpState",
    "pickUpTime",
    "ratePerMile",
    "renterName",
    "returnCity",
    "returnCountry",
    "returnDate",
    "returnLocationID",
    "returnState",
    "returnTime",
    "specialProgramCode"
})
public class AutoRentalData {

    protected String adjustmentCost;
    protected String adjustmentCode;
    protected String agreementNumber;
    protected String classCode;
    protected String customerServicePhoneNumber;
    protected String dailyRate;
    protected String mileageCost;
    protected String gasCost;
    protected String insuranceCost;
    protected String lateReturnCost;
    protected BigInteger maximumFreeMiles;
    protected BigInteger milesTraveled;
    protected String oneWayCost;
    protected String parkingViolationCost;
    protected String pickUpCity;
    protected String pickUpCountry;
    protected String pickUpDate;
    protected String pickUpState;
    protected BigInteger pickUpTime;
    protected String ratePerMile;
    protected String renterName;
    protected String returnCity;
    protected String returnCountry;
    protected String returnDate;
    protected String returnLocationID;
    protected String returnState;
    protected BigInteger returnTime;
    protected String specialProgramCode;

    /**
     * Obtiene el valor de la propiedad adjustmentCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentCost() {
        return adjustmentCost;
    }

    /**
     * Define el valor de la propiedad adjustmentCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentCost(String value) {
        this.adjustmentCost = value;
    }

    /**
     * Obtiene el valor de la propiedad adjustmentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentCode() {
        return adjustmentCode;
    }

    /**
     * Define el valor de la propiedad adjustmentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentCode(String value) {
        this.adjustmentCode = value;
    }

    /**
     * Obtiene el valor de la propiedad agreementNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Define el valor de la propiedad agreementNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad classCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Define el valor de la propiedad classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customerServicePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServicePhoneNumber() {
        return customerServicePhoneNumber;
    }

    /**
     * Define el valor de la propiedad customerServicePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServicePhoneNumber(String value) {
        this.customerServicePhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad dailyRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyRate() {
        return dailyRate;
    }

    /**
     * Define el valor de la propiedad dailyRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyRate(String value) {
        this.dailyRate = value;
    }

    /**
     * Obtiene el valor de la propiedad mileageCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileageCost() {
        return mileageCost;
    }

    /**
     * Define el valor de la propiedad mileageCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileageCost(String value) {
        this.mileageCost = value;
    }

    /**
     * Obtiene el valor de la propiedad gasCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGasCost() {
        return gasCost;
    }

    /**
     * Define el valor de la propiedad gasCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGasCost(String value) {
        this.gasCost = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Define el valor de la propiedad insuranceCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCost(String value) {
        this.insuranceCost = value;
    }

    /**
     * Obtiene el valor de la propiedad lateReturnCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateReturnCost() {
        return lateReturnCost;
    }

    /**
     * Define el valor de la propiedad lateReturnCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateReturnCost(String value) {
        this.lateReturnCost = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumFreeMiles.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumFreeMiles() {
        return maximumFreeMiles;
    }

    /**
     * Define el valor de la propiedad maximumFreeMiles.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumFreeMiles(BigInteger value) {
        this.maximumFreeMiles = value;
    }

    /**
     * Obtiene el valor de la propiedad milesTraveled.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMilesTraveled() {
        return milesTraveled;
    }

    /**
     * Define el valor de la propiedad milesTraveled.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMilesTraveled(BigInteger value) {
        this.milesTraveled = value;
    }

    /**
     * Obtiene el valor de la propiedad oneWayCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneWayCost() {
        return oneWayCost;
    }

    /**
     * Define el valor de la propiedad oneWayCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneWayCost(String value) {
        this.oneWayCost = value;
    }

    /**
     * Obtiene el valor de la propiedad parkingViolationCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingViolationCost() {
        return parkingViolationCost;
    }

    /**
     * Define el valor de la propiedad parkingViolationCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingViolationCost(String value) {
        this.parkingViolationCost = value;
    }

    /**
     * Obtiene el valor de la propiedad pickUpCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpCity() {
        return pickUpCity;
    }

    /**
     * Define el valor de la propiedad pickUpCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpCity(String value) {
        this.pickUpCity = value;
    }

    /**
     * Obtiene el valor de la propiedad pickUpCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpCountry() {
        return pickUpCountry;
    }

    /**
     * Define el valor de la propiedad pickUpCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpCountry(String value) {
        this.pickUpCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad pickUpDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDate() {
        return pickUpDate;
    }

    /**
     * Define el valor de la propiedad pickUpDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDate(String value) {
        this.pickUpDate = value;
    }

    /**
     * Obtiene el valor de la propiedad pickUpState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpState() {
        return pickUpState;
    }

    /**
     * Define el valor de la propiedad pickUpState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpState(String value) {
        this.pickUpState = value;
    }

    /**
     * Obtiene el valor de la propiedad pickUpTime.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPickUpTime() {
        return pickUpTime;
    }

    /**
     * Define el valor de la propiedad pickUpTime.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPickUpTime(BigInteger value) {
        this.pickUpTime = value;
    }

    /**
     * Obtiene el valor de la propiedad ratePerMile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePerMile() {
        return ratePerMile;
    }

    /**
     * Define el valor de la propiedad ratePerMile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePerMile(String value) {
        this.ratePerMile = value;
    }

    /**
     * Obtiene el valor de la propiedad renterName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenterName() {
        return renterName;
    }

    /**
     * Define el valor de la propiedad renterName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenterName(String value) {
        this.renterName = value;
    }

    /**
     * Obtiene el valor de la propiedad returnCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCity() {
        return returnCity;
    }

    /**
     * Define el valor de la propiedad returnCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCity(String value) {
        this.returnCity = value;
    }

    /**
     * Obtiene el valor de la propiedad returnCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCountry() {
        return returnCountry;
    }

    /**
     * Define el valor de la propiedad returnCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCountry(String value) {
        this.returnCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad returnDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Define el valor de la propiedad returnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

    /**
     * Obtiene el valor de la propiedad returnLocationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnLocationID() {
        return returnLocationID;
    }

    /**
     * Define el valor de la propiedad returnLocationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnLocationID(String value) {
        this.returnLocationID = value;
    }

    /**
     * Obtiene el valor de la propiedad returnState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnState() {
        return returnState;
    }

    /**
     * Define el valor de la propiedad returnState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnState(String value) {
        this.returnState = value;
    }

    /**
     * Obtiene el valor de la propiedad returnTime.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReturnTime() {
        return returnTime;
    }

    /**
     * Define el valor de la propiedad returnTime.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReturnTime(BigInteger value) {
        this.returnTime = value;
    }

    /**
     * Obtiene el valor de la propiedad specialProgramCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialProgramCode() {
        return specialProgramCode;
    }

    /**
     * Define el valor de la propiedad specialProgramCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialProgramCode(String value) {
        this.specialProgramCode = value;
    }

}


package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LodgingData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LodgingData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkInDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkOutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dailyRoomRate1" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="dailyRoomRate2" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="dailyRoomRate3" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="roomNights1" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="roomNights2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="roomNights3" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="guestSmokingPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRoomsBooked" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="numberOfGuests" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="roomBedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomTaxElements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerServicePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corporateClientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalCoupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="prepaidCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="foodAndBeverageCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="roomTax" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="adjustmentAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="phoneCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="restaurantCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="roomServiceCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="miniBarCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="laundryCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="miscellaneousCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="giftShopCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="movieCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="healthClubCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="valetParkingCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="cashDisbursementCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="nonRoomCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="businessCenterCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="loungeBarCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="transportationCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="gratuityCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="conferenceRoomCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="audioVisualCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="banquetCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="internetAccessCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="earlyCheckOutCost" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="nonRoomTax" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="travelAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="travelAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodgingData", propOrder = {
    "checkInDate",
    "checkOutDate",
    "dailyRoomRate1",
    "dailyRoomRate2",
    "dailyRoomRate3",
    "roomNights1",
    "roomNights2",
    "roomNights3",
    "guestSmokingPreference",
    "numberOfRoomsBooked",
    "numberOfGuests",
    "roomBedType",
    "roomTaxElements",
    "roomRateType",
    "guestName",
    "customerServicePhoneNumber",
    "corporateClientCode",
    "promotionalCode",
    "additionalCoupon",
    "roomLocation",
    "specialProgramCode",
    "tax",
    "prepaidCost",
    "foodAndBeverageCost",
    "roomTax",
    "adjustmentAmount",
    "phoneCost",
    "restaurantCost",
    "roomServiceCost",
    "miniBarCost",
    "laundryCost",
    "miscellaneousCost",
    "giftShopCost",
    "movieCost",
    "healthClubCost",
    "valetParkingCost",
    "cashDisbursementCost",
    "nonRoomCost",
    "businessCenterCost",
    "loungeBarCost",
    "transportationCost",
    "gratuityCost",
    "conferenceRoomCost",
    "audioVisualCost",
    "banquetCost",
    "internetAccessCost",
    "earlyCheckOutCost",
    "nonRoomTax",
    "travelAgencyCode",
    "travelAgencyName"
})
public class LodgingData {

    protected String checkInDate;
    protected String checkOutDate;
    protected String dailyRoomRate1;
    protected String dailyRoomRate2;
    protected String dailyRoomRate3;
    protected BigInteger roomNights1;
    protected BigInteger roomNights2;
    protected BigInteger roomNights3;
    protected String guestSmokingPreference;
    protected BigInteger numberOfRoomsBooked;
    protected BigInteger numberOfGuests;
    protected String roomBedType;
    protected String roomTaxElements;
    protected String roomRateType;
    protected String guestName;
    protected String customerServicePhoneNumber;
    protected String corporateClientCode;
    protected String promotionalCode;
    protected String additionalCoupon;
    protected String roomLocation;
    protected String specialProgramCode;
    protected String tax;
    protected String prepaidCost;
    protected String foodAndBeverageCost;
    protected String roomTax;
    protected String adjustmentAmount;
    protected String phoneCost;
    protected String restaurantCost;
    protected String roomServiceCost;
    protected String miniBarCost;
    protected String laundryCost;
    protected String miscellaneousCost;
    protected String giftShopCost;
    protected String movieCost;
    protected String healthClubCost;
    protected String valetParkingCost;
    protected String cashDisbursementCost;
    protected String nonRoomCost;
    protected String businessCenterCost;
    protected String loungeBarCost;
    protected String transportationCost;
    protected String gratuityCost;
    protected String conferenceRoomCost;
    protected String audioVisualCost;
    protected String banquetCost;
    protected String internetAccessCost;
    protected String earlyCheckOutCost;
    protected String nonRoomTax;
    protected String travelAgencyCode;
    protected String travelAgencyName;

    /**
     * Obtiene el valor de la propiedad checkInDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInDate() {
        return checkInDate;
    }

    /**
     * Define el valor de la propiedad checkInDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInDate(String value) {
        this.checkInDate = value;
    }

    /**
     * Obtiene el valor de la propiedad checkOutDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * Define el valor de la propiedad checkOutDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutDate(String value) {
        this.checkOutDate = value;
    }

    /**
     * Obtiene el valor de la propiedad dailyRoomRate1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyRoomRate1() {
        return dailyRoomRate1;
    }

    /**
     * Define el valor de la propiedad dailyRoomRate1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyRoomRate1(String value) {
        this.dailyRoomRate1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dailyRoomRate2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyRoomRate2() {
        return dailyRoomRate2;
    }

    /**
     * Define el valor de la propiedad dailyRoomRate2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyRoomRate2(String value) {
        this.dailyRoomRate2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dailyRoomRate3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyRoomRate3() {
        return dailyRoomRate3;
    }

    /**
     * Define el valor de la propiedad dailyRoomRate3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyRoomRate3(String value) {
        this.dailyRoomRate3 = value;
    }

    /**
     * Obtiene el valor de la propiedad roomNights1.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoomNights1() {
        return roomNights1;
    }

    /**
     * Define el valor de la propiedad roomNights1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoomNights1(BigInteger value) {
        this.roomNights1 = value;
    }

    /**
     * Obtiene el valor de la propiedad roomNights2.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoomNights2() {
        return roomNights2;
    }

    /**
     * Define el valor de la propiedad roomNights2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoomNights2(BigInteger value) {
        this.roomNights2 = value;
    }

    /**
     * Obtiene el valor de la propiedad roomNights3.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoomNights3() {
        return roomNights3;
    }

    /**
     * Define el valor de la propiedad roomNights3.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoomNights3(BigInteger value) {
        this.roomNights3 = value;
    }

    /**
     * Obtiene el valor de la propiedad guestSmokingPreference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestSmokingPreference() {
        return guestSmokingPreference;
    }

    /**
     * Define el valor de la propiedad guestSmokingPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestSmokingPreference(String value) {
        this.guestSmokingPreference = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfRoomsBooked.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRoomsBooked() {
        return numberOfRoomsBooked;
    }

    /**
     * Define el valor de la propiedad numberOfRoomsBooked.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRoomsBooked(BigInteger value) {
        this.numberOfRoomsBooked = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfGuests.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfGuests() {
        return numberOfGuests;
    }

    /**
     * Define el valor de la propiedad numberOfGuests.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfGuests(BigInteger value) {
        this.numberOfGuests = value;
    }

    /**
     * Obtiene el valor de la propiedad roomBedType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomBedType() {
        return roomBedType;
    }

    /**
     * Define el valor de la propiedad roomBedType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomBedType(String value) {
        this.roomBedType = value;
    }

    /**
     * Obtiene el valor de la propiedad roomTaxElements.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTaxElements() {
        return roomTaxElements;
    }

    /**
     * Define el valor de la propiedad roomTaxElements.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTaxElements(String value) {
        this.roomTaxElements = value;
    }

    /**
     * Obtiene el valor de la propiedad roomRateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomRateType() {
        return roomRateType;
    }

    /**
     * Define el valor de la propiedad roomRateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomRateType(String value) {
        this.roomRateType = value;
    }

    /**
     * Obtiene el valor de la propiedad guestName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * Define el valor de la propiedad guestName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestName(String value) {
        this.guestName = value;
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
     * Obtiene el valor de la propiedad corporateClientCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateClientCode() {
        return corporateClientCode;
    }

    /**
     * Define el valor de la propiedad corporateClientCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateClientCode(String value) {
        this.corporateClientCode = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalCode() {
        return promotionalCode;
    }

    /**
     * Define el valor de la propiedad promotionalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalCode(String value) {
        this.promotionalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalCoupon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCoupon() {
        return additionalCoupon;
    }

    /**
     * Define el valor de la propiedad additionalCoupon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCoupon(String value) {
        this.additionalCoupon = value;
    }

    /**
     * Obtiene el valor de la propiedad roomLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomLocation() {
        return roomLocation;
    }

    /**
     * Define el valor de la propiedad roomLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomLocation(String value) {
        this.roomLocation = value;
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

    /**
     * Obtiene el valor de la propiedad tax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax() {
        return tax;
    }

    /**
     * Define el valor de la propiedad tax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax(String value) {
        this.tax = value;
    }

    /**
     * Obtiene el valor de la propiedad prepaidCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidCost() {
        return prepaidCost;
    }

    /**
     * Define el valor de la propiedad prepaidCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidCost(String value) {
        this.prepaidCost = value;
    }

    /**
     * Obtiene el valor de la propiedad foodAndBeverageCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodAndBeverageCost() {
        return foodAndBeverageCost;
    }

    /**
     * Define el valor de la propiedad foodAndBeverageCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodAndBeverageCost(String value) {
        this.foodAndBeverageCost = value;
    }

    /**
     * Obtiene el valor de la propiedad roomTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTax() {
        return roomTax;
    }

    /**
     * Define el valor de la propiedad roomTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTax(String value) {
        this.roomTax = value;
    }

    /**
     * Obtiene el valor de la propiedad adjustmentAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Define el valor de la propiedad adjustmentAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentAmount(String value) {
        this.adjustmentAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCost() {
        return phoneCost;
    }

    /**
     * Define el valor de la propiedad phoneCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCost(String value) {
        this.phoneCost = value;
    }

    /**
     * Obtiene el valor de la propiedad restaurantCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurantCost() {
        return restaurantCost;
    }

    /**
     * Define el valor de la propiedad restaurantCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurantCost(String value) {
        this.restaurantCost = value;
    }

    /**
     * Obtiene el valor de la propiedad roomServiceCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomServiceCost() {
        return roomServiceCost;
    }

    /**
     * Define el valor de la propiedad roomServiceCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomServiceCost(String value) {
        this.roomServiceCost = value;
    }

    /**
     * Obtiene el valor de la propiedad miniBarCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiniBarCost() {
        return miniBarCost;
    }

    /**
     * Define el valor de la propiedad miniBarCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiniBarCost(String value) {
        this.miniBarCost = value;
    }

    /**
     * Obtiene el valor de la propiedad laundryCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaundryCost() {
        return laundryCost;
    }

    /**
     * Define el valor de la propiedad laundryCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaundryCost(String value) {
        this.laundryCost = value;
    }

    /**
     * Obtiene el valor de la propiedad miscellaneousCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscellaneousCost() {
        return miscellaneousCost;
    }

    /**
     * Define el valor de la propiedad miscellaneousCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscellaneousCost(String value) {
        this.miscellaneousCost = value;
    }

    /**
     * Obtiene el valor de la propiedad giftShopCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftShopCost() {
        return giftShopCost;
    }

    /**
     * Define el valor de la propiedad giftShopCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftShopCost(String value) {
        this.giftShopCost = value;
    }

    /**
     * Obtiene el valor de la propiedad movieCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieCost() {
        return movieCost;
    }

    /**
     * Define el valor de la propiedad movieCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieCost(String value) {
        this.movieCost = value;
    }

    /**
     * Obtiene el valor de la propiedad healthClubCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthClubCost() {
        return healthClubCost;
    }

    /**
     * Define el valor de la propiedad healthClubCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthClubCost(String value) {
        this.healthClubCost = value;
    }

    /**
     * Obtiene el valor de la propiedad valetParkingCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValetParkingCost() {
        return valetParkingCost;
    }

    /**
     * Define el valor de la propiedad valetParkingCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValetParkingCost(String value) {
        this.valetParkingCost = value;
    }

    /**
     * Obtiene el valor de la propiedad cashDisbursementCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashDisbursementCost() {
        return cashDisbursementCost;
    }

    /**
     * Define el valor de la propiedad cashDisbursementCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashDisbursementCost(String value) {
        this.cashDisbursementCost = value;
    }

    /**
     * Obtiene el valor de la propiedad nonRoomCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRoomCost() {
        return nonRoomCost;
    }

    /**
     * Define el valor de la propiedad nonRoomCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRoomCost(String value) {
        this.nonRoomCost = value;
    }

    /**
     * Obtiene el valor de la propiedad businessCenterCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCenterCost() {
        return businessCenterCost;
    }

    /**
     * Define el valor de la propiedad businessCenterCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCenterCost(String value) {
        this.businessCenterCost = value;
    }

    /**
     * Obtiene el valor de la propiedad loungeBarCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoungeBarCost() {
        return loungeBarCost;
    }

    /**
     * Define el valor de la propiedad loungeBarCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoungeBarCost(String value) {
        this.loungeBarCost = value;
    }

    /**
     * Obtiene el valor de la propiedad transportationCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationCost() {
        return transportationCost;
    }

    /**
     * Define el valor de la propiedad transportationCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationCost(String value) {
        this.transportationCost = value;
    }

    /**
     * Obtiene el valor de la propiedad gratuityCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGratuityCost() {
        return gratuityCost;
    }

    /**
     * Define el valor de la propiedad gratuityCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGratuityCost(String value) {
        this.gratuityCost = value;
    }

    /**
     * Obtiene el valor de la propiedad conferenceRoomCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceRoomCost() {
        return conferenceRoomCost;
    }

    /**
     * Define el valor de la propiedad conferenceRoomCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceRoomCost(String value) {
        this.conferenceRoomCost = value;
    }

    /**
     * Obtiene el valor de la propiedad audioVisualCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioVisualCost() {
        return audioVisualCost;
    }

    /**
     * Define el valor de la propiedad audioVisualCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioVisualCost(String value) {
        this.audioVisualCost = value;
    }

    /**
     * Obtiene el valor de la propiedad banquetCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanquetCost() {
        return banquetCost;
    }

    /**
     * Define el valor de la propiedad banquetCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanquetCost(String value) {
        this.banquetCost = value;
    }

    /**
     * Obtiene el valor de la propiedad internetAccessCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetAccessCost() {
        return internetAccessCost;
    }

    /**
     * Define el valor de la propiedad internetAccessCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetAccessCost(String value) {
        this.internetAccessCost = value;
    }

    /**
     * Obtiene el valor de la propiedad earlyCheckOutCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyCheckOutCost() {
        return earlyCheckOutCost;
    }

    /**
     * Define el valor de la propiedad earlyCheckOutCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyCheckOutCost(String value) {
        this.earlyCheckOutCost = value;
    }

    /**
     * Obtiene el valor de la propiedad nonRoomTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRoomTax() {
        return nonRoomTax;
    }

    /**
     * Define el valor de la propiedad nonRoomTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRoomTax(String value) {
        this.nonRoomTax = value;
    }

    /**
     * Obtiene el valor de la propiedad travelAgencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgencyCode() {
        return travelAgencyCode;
    }

    /**
     * Define el valor de la propiedad travelAgencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgencyCode(String value) {
        this.travelAgencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad travelAgencyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgencyName() {
        return travelAgencyName;
    }

    /**
     * Define el valor de la propiedad travelAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgencyName(String value) {
        this.travelAgencyName = value;
    }

}

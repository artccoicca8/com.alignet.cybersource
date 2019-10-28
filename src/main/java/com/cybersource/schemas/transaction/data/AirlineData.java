
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlineData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketIssuerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketIssuerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketIssuerPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketIssuerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketIssuerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketIssuerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketIssuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkDigit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="restrictedTicketIndicator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedPaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger" type="{urn:schemas-cybersource-com:transaction-data-1.159}Passenger" maxOccurs="1000" minOccurs="0"/>
 *         &lt;element name="customerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentNumberOfParts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookingReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalFee" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="clearingSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearingCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totalClearingAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="leg" type="{urn:schemas-cybersource-com:transaction-data-1.159}Leg" maxOccurs="1000" minOccurs="0"/>
 *         &lt;element name="numberOfPassengers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reservationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iataNumericCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electronicTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditReasonIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketUpdateIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketRestrictionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeTicketAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="exchangeTicketFee" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="journeyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardingFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineData", propOrder = {
    "agentCode",
    "agentName",
    "ticketIssuerCity",
    "ticketIssuerState",
    "ticketIssuerPostalCode",
    "ticketIssuerCountry",
    "ticketIssuerAddress",
    "ticketIssuerCode",
    "ticketIssuerName",
    "ticketNumber",
    "checkDigit",
    "restrictedTicketIndicator",
    "transactionType",
    "extendedPaymentCode",
    "carrierName",
    "passengerName",
    "passenger",
    "customerCode",
    "documentType",
    "documentNumber",
    "documentNumberOfParts",
    "invoiceNumber",
    "invoiceDate",
    "chargeDetails",
    "bookingReference",
    "totalFee",
    "clearingSequence",
    "clearingCount",
    "totalClearingAmount",
    "leg",
    "numberOfPassengers",
    "reservationSystem",
    "processIdentifier",
    "iataNumericCode",
    "ticketIssueDate",
    "electronicTicket",
    "originalTicketNumber",
    "purchaseType",
    "creditReasonIndicator",
    "ticketUpdateIndicator",
    "planNumber",
    "arrivalDate",
    "ticketRestrictionText",
    "exchangeTicketAmount",
    "exchangeTicketFee",
    "journeyType",
    "boardingFee"
})
public class AirlineData {

    protected String agentCode;
    protected String agentName;
    protected String ticketIssuerCity;
    protected String ticketIssuerState;
    protected String ticketIssuerPostalCode;
    protected String ticketIssuerCountry;
    protected String ticketIssuerAddress;
    protected String ticketIssuerCode;
    protected String ticketIssuerName;
    protected String ticketNumber;
    protected BigInteger checkDigit;
    protected BigInteger restrictedTicketIndicator;
    protected String transactionType;
    protected String extendedPaymentCode;
    protected String carrierName;
    protected String passengerName;
    protected List<Passenger> passenger;
    protected String customerCode;
    protected String documentType;
    protected String documentNumber;
    protected String documentNumberOfParts;
    protected String invoiceNumber;
    protected String invoiceDate;
    protected String chargeDetails;
    protected String bookingReference;
    protected String totalFee;
    protected String clearingSequence;
    protected BigInteger clearingCount;
    protected String totalClearingAmount;
    protected List<Leg> leg;
    protected String numberOfPassengers;
    protected String reservationSystem;
    protected String processIdentifier;
    protected String iataNumericCode;
    protected String ticketIssueDate;
    protected String electronicTicket;
    protected String originalTicketNumber;
    protected String purchaseType;
    protected String creditReasonIndicator;
    protected String ticketUpdateIndicator;
    protected String planNumber;
    protected String arrivalDate;
    protected String ticketRestrictionText;
    protected String exchangeTicketAmount;
    protected String exchangeTicketFee;
    protected String journeyType;
    protected String boardingFee;

    /**
     * Obtiene el valor de la propiedad agentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * Define el valor de la propiedad agentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * Obtiene el valor de la propiedad agentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Define el valor de la propiedad agentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketIssuerCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuerCity() {
        return ticketIssuerCity;
    }

    /**
     * Define el valor de la propiedad ticketIssuerCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuerCity(String value) {
        this.ticketIssuerCity = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketIssuerState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuerState() {
        return ticketIssuerState;
    }

    /**
     * Define el valor de la propiedad ticketIssuerState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuerState(String value) {
        this.ticketIssuerState = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketIssuerPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuerPostalCode() {
        return ticketIssuerPostalCode;
    }

    /**
     * Define el valor de la propiedad ticketIssuerPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuerPostalCode(String value) {
        this.ticketIssuerPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketIssuerCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuerCountry() {
        return ticketIssuerCountry;
    }

    /**
     * Define el valor de la propiedad ticketIssuerCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuerCountry(String value) {
        this.ticketIssuerCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketIssuerAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuerAddress() {
        return ticketIssuerAddress;
    }

    /**
     * Define el valor de la propiedad ticketIssuerAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuerAddress(String value) {
        this.ticketIssuerAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketIssuerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuerCode() {
        return ticketIssuerCode;
    }

    /**
     * Define el valor de la propiedad ticketIssuerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuerCode(String value) {
        this.ticketIssuerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketIssuerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuerName() {
        return ticketIssuerName;
    }

    /**
     * Define el valor de la propiedad ticketIssuerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuerName(String value) {
        this.ticketIssuerName = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Define el valor de la propiedad ticketNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad checkDigit.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCheckDigit() {
        return checkDigit;
    }

    /**
     * Define el valor de la propiedad checkDigit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCheckDigit(BigInteger value) {
        this.checkDigit = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictedTicketIndicator.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRestrictedTicketIndicator() {
        return restrictedTicketIndicator;
    }

    /**
     * Define el valor de la propiedad restrictedTicketIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRestrictedTicketIndicator(BigInteger value) {
        this.restrictedTicketIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Define el valor de la propiedad transactionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Obtiene el valor de la propiedad extendedPaymentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedPaymentCode() {
        return extendedPaymentCode;
    }

    /**
     * Define el valor de la propiedad extendedPaymentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedPaymentCode(String value) {
        this.extendedPaymentCode = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Define el valor de la propiedad carrierName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Define el valor de la propiedad passengerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Passenger }
     * 
     * 
     */
    public List<Passenger> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<Passenger>();
        }
        return this.passenger;
    }

    /**
     * Obtiene el valor de la propiedad customerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Define el valor de la propiedad customerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad documentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Define el valor de la propiedad documentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad documentNumberOfParts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumberOfParts() {
        return documentNumberOfParts;
    }

    /**
     * Define el valor de la propiedad documentNumberOfParts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumberOfParts(String value) {
        this.documentNumberOfParts = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define el valor de la propiedad invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Define el valor de la propiedad invoiceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeDetails() {
        return chargeDetails;
    }

    /**
     * Define el valor de la propiedad chargeDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeDetails(String value) {
        this.chargeDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingReference() {
        return bookingReference;
    }

    /**
     * Define el valor de la propiedad bookingReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingReference(String value) {
        this.bookingReference = value;
    }

    /**
     * Obtiene el valor de la propiedad totalFee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFee() {
        return totalFee;
    }

    /**
     * Define el valor de la propiedad totalFee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFee(String value) {
        this.totalFee = value;
    }

    /**
     * Obtiene el valor de la propiedad clearingSequence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingSequence() {
        return clearingSequence;
    }

    /**
     * Define el valor de la propiedad clearingSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingSequence(String value) {
        this.clearingSequence = value;
    }

    /**
     * Obtiene el valor de la propiedad clearingCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClearingCount() {
        return clearingCount;
    }

    /**
     * Define el valor de la propiedad clearingCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClearingCount(BigInteger value) {
        this.clearingCount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalClearingAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalClearingAmount() {
        return totalClearingAmount;
    }

    /**
     * Define el valor de la propiedad totalClearingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalClearingAmount(String value) {
        this.totalClearingAmount = value;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Leg }
     * 
     * 
     */
    public List<Leg> getLeg() {
        if (leg == null) {
            leg = new ArrayList<Leg>();
        }
        return this.leg;
    }

    /**
     * Obtiene el valor de la propiedad numberOfPassengers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * Define el valor de la propiedad numberOfPassengers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPassengers(String value) {
        this.numberOfPassengers = value;
    }

    /**
     * Obtiene el valor de la propiedad reservationSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationSystem() {
        return reservationSystem;
    }

    /**
     * Define el valor de la propiedad reservationSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationSystem(String value) {
        this.reservationSystem = value;
    }

    /**
     * Obtiene el valor de la propiedad processIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessIdentifier() {
        return processIdentifier;
    }

    /**
     * Define el valor de la propiedad processIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessIdentifier(String value) {
        this.processIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad iataNumericCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataNumericCode() {
        return iataNumericCode;
    }

    /**
     * Define el valor de la propiedad iataNumericCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataNumericCode(String value) {
        this.iataNumericCode = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketIssueDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssueDate() {
        return ticketIssueDate;
    }

    /**
     * Define el valor de la propiedad ticketIssueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssueDate(String value) {
        this.ticketIssueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad electronicTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicTicket() {
        return electronicTicket;
    }

    /**
     * Define el valor de la propiedad electronicTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicTicket(String value) {
        this.electronicTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad originalTicketNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTicketNumber() {
        return originalTicketNumber;
    }

    /**
     * Define el valor de la propiedad originalTicketNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTicketNumber(String value) {
        this.originalTicketNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * Define el valor de la propiedad purchaseType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseType(String value) {
        this.purchaseType = value;
    }

    /**
     * Obtiene el valor de la propiedad creditReasonIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReasonIndicator() {
        return creditReasonIndicator;
    }

    /**
     * Define el valor de la propiedad creditReasonIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReasonIndicator(String value) {
        this.creditReasonIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketUpdateIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketUpdateIndicator() {
        return ticketUpdateIndicator;
    }

    /**
     * Define el valor de la propiedad ticketUpdateIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketUpdateIndicator(String value) {
        this.ticketUpdateIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad planNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNumber() {
        return planNumber;
    }

    /**
     * Define el valor de la propiedad planNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNumber(String value) {
        this.planNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Define el valor de la propiedad arrivalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketRestrictionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketRestrictionText() {
        return ticketRestrictionText;
    }

    /**
     * Define el valor de la propiedad ticketRestrictionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketRestrictionText(String value) {
        this.ticketRestrictionText = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeTicketAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeTicketAmount() {
        return exchangeTicketAmount;
    }

    /**
     * Define el valor de la propiedad exchangeTicketAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeTicketAmount(String value) {
        this.exchangeTicketAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeTicketFee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeTicketFee() {
        return exchangeTicketFee;
    }

    /**
     * Define el valor de la propiedad exchangeTicketFee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeTicketFee(String value) {
        this.exchangeTicketFee = value;
    }

    /**
     * Obtiene el valor de la propiedad journeyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyType() {
        return journeyType;
    }

    /**
     * Define el valor de la propiedad journeyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyType(String value) {
        this.journeyType = value;
    }

    /**
     * Obtiene el valor de la propiedad boardingFee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingFee() {
        return boardingFee;
    }

    /**
     * Define el valor de la propiedad boardingFee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingFee(String value) {
        this.boardingFee = value;
    }

}

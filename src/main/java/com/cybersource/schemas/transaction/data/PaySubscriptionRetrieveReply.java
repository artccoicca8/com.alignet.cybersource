
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaySubscriptionRetrieveReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaySubscriptionRetrieveReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="approvalRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="automaticRenew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIssueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardStartMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardStartYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkBankTransitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkSecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkAuthenticateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentsRemaining" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="setupAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriptionIDNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPayments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDefinedDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDefinedDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDefinedDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDefinedDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantSecureDataField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantSecureDataField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantSecureDataField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantSecureDataField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driversLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driversLicenseState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrumentIdentifierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrumentIdentifierStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrumentIdentifierSuccessorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsequentAuthTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaySubscriptionRetrieveReply", propOrder = {
    "reasonCode",
    "approvalRequired",
    "automaticRenew",
    "cardAccountNumber",
    "cardExpirationMonth",
    "cardExpirationYear",
    "cardIssueNumber",
    "cardStartMonth",
    "cardStartYear",
    "cardType",
    "checkAccountNumber",
    "checkAccountType",
    "checkBankTransitNumber",
    "checkSecCode",
    "checkAuthenticateID",
    "city",
    "comments",
    "companyName",
    "country",
    "currency",
    "customerAccountID",
    "email",
    "endDate",
    "firstName",
    "frequency",
    "lastName",
    "merchantReferenceCode",
    "paymentMethod",
    "paymentsRemaining",
    "phoneNumber",
    "postalCode",
    "recurringAmount",
    "setupAmount",
    "startDate",
    "state",
    "status",
    "street1",
    "street2",
    "subscriptionID",
    "subscriptionIDNew",
    "title",
    "totalPayments",
    "shipToFirstName",
    "shipToLastName",
    "shipToStreet1",
    "shipToStreet2",
    "shipToCity",
    "shipToState",
    "shipToPostalCode",
    "shipToCompany",
    "shipToCountry",
    "billPayment",
    "merchantDefinedDataField1",
    "merchantDefinedDataField2",
    "merchantDefinedDataField3",
    "merchantDefinedDataField4",
    "merchantSecureDataField1",
    "merchantSecureDataField2",
    "merchantSecureDataField3",
    "merchantSecureDataField4",
    "ownerMerchantID",
    "companyTaxID",
    "driversLicenseNumber",
    "driversLicenseState",
    "dateOfBirth",
    "instrumentIdentifierID",
    "instrumentIdentifierStatus",
    "instrumentIdentifierSuccessorID",
    "subsequentAuthTransactionID"
})
public class PaySubscriptionRetrieveReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String approvalRequired;
    protected String automaticRenew;
    protected String cardAccountNumber;
    protected String cardExpirationMonth;
    protected String cardExpirationYear;
    protected String cardIssueNumber;
    protected String cardStartMonth;
    protected String cardStartYear;
    protected String cardType;
    protected String checkAccountNumber;
    protected String checkAccountType;
    protected String checkBankTransitNumber;
    protected String checkSecCode;
    protected String checkAuthenticateID;
    protected String city;
    protected String comments;
    protected String companyName;
    protected String country;
    protected String currency;
    protected String customerAccountID;
    protected String email;
    protected String endDate;
    protected String firstName;
    protected String frequency;
    protected String lastName;
    protected String merchantReferenceCode;
    protected String paymentMethod;
    protected String paymentsRemaining;
    protected String phoneNumber;
    protected String postalCode;
    protected String recurringAmount;
    protected String setupAmount;
    protected String startDate;
    protected String state;
    protected String status;
    protected String street1;
    protected String street2;
    protected String subscriptionID;
    protected String subscriptionIDNew;
    protected String title;
    protected String totalPayments;
    protected String shipToFirstName;
    protected String shipToLastName;
    protected String shipToStreet1;
    protected String shipToStreet2;
    protected String shipToCity;
    protected String shipToState;
    protected String shipToPostalCode;
    protected String shipToCompany;
    protected String shipToCountry;
    protected String billPayment;
    protected String merchantDefinedDataField1;
    protected String merchantDefinedDataField2;
    protected String merchantDefinedDataField3;
    protected String merchantDefinedDataField4;
    protected String merchantSecureDataField1;
    protected String merchantSecureDataField2;
    protected String merchantSecureDataField3;
    protected String merchantSecureDataField4;
    protected String ownerMerchantID;
    protected String companyTaxID;
    protected String driversLicenseNumber;
    protected String driversLicenseState;
    protected String dateOfBirth;
    protected String instrumentIdentifierID;
    protected String instrumentIdentifierStatus;
    protected String instrumentIdentifierSuccessorID;
    protected String subsequentAuthTransactionID;

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad approvalRequired.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalRequired() {
        return approvalRequired;
    }

    /**
     * Define el valor de la propiedad approvalRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalRequired(String value) {
        this.approvalRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad automaticRenew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticRenew() {
        return automaticRenew;
    }

    /**
     * Define el valor de la propiedad automaticRenew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticRenew(String value) {
        this.automaticRenew = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAccountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountNumber() {
        return cardAccountNumber;
    }

    /**
     * Define el valor de la propiedad cardAccountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountNumber(String value) {
        this.cardAccountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad cardExpirationMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationMonth() {
        return cardExpirationMonth;
    }

    /**
     * Define el valor de la propiedad cardExpirationMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationMonth(String value) {
        this.cardExpirationMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad cardExpirationYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationYear() {
        return cardExpirationYear;
    }

    /**
     * Define el valor de la propiedad cardExpirationYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationYear(String value) {
        this.cardExpirationYear = value;
    }

    /**
     * Obtiene el valor de la propiedad cardIssueNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssueNumber() {
        return cardIssueNumber;
    }

    /**
     * Define el valor de la propiedad cardIssueNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssueNumber(String value) {
        this.cardIssueNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad cardStartMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStartMonth() {
        return cardStartMonth;
    }

    /**
     * Define el valor de la propiedad cardStartMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStartMonth(String value) {
        this.cardStartMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad cardStartYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStartYear() {
        return cardStartYear;
    }

    /**
     * Define el valor de la propiedad cardStartYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStartYear(String value) {
        this.cardStartYear = value;
    }

    /**
     * Obtiene el valor de la propiedad cardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Define el valor de la propiedad cardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Obtiene el valor de la propiedad checkAccountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckAccountNumber() {
        return checkAccountNumber;
    }

    /**
     * Define el valor de la propiedad checkAccountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckAccountNumber(String value) {
        this.checkAccountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad checkAccountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckAccountType() {
        return checkAccountType;
    }

    /**
     * Define el valor de la propiedad checkAccountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckAccountType(String value) {
        this.checkAccountType = value;
    }

    /**
     * Obtiene el valor de la propiedad checkBankTransitNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckBankTransitNumber() {
        return checkBankTransitNumber;
    }

    /**
     * Define el valor de la propiedad checkBankTransitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckBankTransitNumber(String value) {
        this.checkBankTransitNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad checkSecCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSecCode() {
        return checkSecCode;
    }

    /**
     * Define el valor de la propiedad checkSecCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSecCode(String value) {
        this.checkSecCode = value;
    }

    /**
     * Obtiene el valor de la propiedad checkAuthenticateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckAuthenticateID() {
        return checkAuthenticateID;
    }

    /**
     * Define el valor de la propiedad checkAuthenticateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckAuthenticateID(String value) {
        this.checkAuthenticateID = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad companyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Define el valor de la propiedad companyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAccountID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountID() {
        return customerAccountID;
    }

    /**
     * Define el valor de la propiedad customerAccountID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountID(String value) {
        this.customerAccountID = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad frequency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Define el valor de la propiedad frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantReferenceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReferenceCode() {
        return merchantReferenceCode;
    }

    /**
     * Define el valor de la propiedad merchantReferenceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReferenceCode(String value) {
        this.merchantReferenceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define el valor de la propiedad paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentsRemaining.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentsRemaining() {
        return paymentsRemaining;
    }

    /**
     * Define el valor de la propiedad paymentsRemaining.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentsRemaining(String value) {
        this.paymentsRemaining = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define el valor de la propiedad postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad recurringAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringAmount() {
        return recurringAmount;
    }

    /**
     * Define el valor de la propiedad recurringAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringAmount(String value) {
        this.recurringAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad setupAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupAmount() {
        return setupAmount;
    }

    /**
     * Define el valor de la propiedad setupAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupAmount(String value) {
        this.setupAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad street1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Define el valor de la propiedad street1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Obtiene el valor de la propiedad street2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Define el valor de la propiedad street2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriptionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Define el valor de la propiedad subscriptionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionID(String value) {
        this.subscriptionID = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriptionIDNew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionIDNew() {
        return subscriptionIDNew;
    }

    /**
     * Define el valor de la propiedad subscriptionIDNew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionIDNew(String value) {
        this.subscriptionIDNew = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPayments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPayments() {
        return totalPayments;
    }

    /**
     * Define el valor de la propiedad totalPayments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPayments(String value) {
        this.totalPayments = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToFirstName() {
        return shipToFirstName;
    }

    /**
     * Define el valor de la propiedad shipToFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToFirstName(String value) {
        this.shipToFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToLastName() {
        return shipToLastName;
    }

    /**
     * Define el valor de la propiedad shipToLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToLastName(String value) {
        this.shipToLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToStreet1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToStreet1() {
        return shipToStreet1;
    }

    /**
     * Define el valor de la propiedad shipToStreet1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToStreet1(String value) {
        this.shipToStreet1 = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToStreet2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToStreet2() {
        return shipToStreet2;
    }

    /**
     * Define el valor de la propiedad shipToStreet2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToStreet2(String value) {
        this.shipToStreet2 = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Define el valor de la propiedad shipToCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Define el valor de la propiedad shipToState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToPostalCode() {
        return shipToPostalCode;
    }

    /**
     * Define el valor de la propiedad shipToPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToPostalCode(String value) {
        this.shipToPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCompany() {
        return shipToCompany;
    }

    /**
     * Define el valor de la propiedad shipToCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCompany(String value) {
        this.shipToCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Define el valor de la propiedad shipToCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountry(String value) {
        this.shipToCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad billPayment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPayment() {
        return billPayment;
    }

    /**
     * Define el valor de la propiedad billPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPayment(String value) {
        this.billPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDefinedDataField1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDefinedDataField1() {
        return merchantDefinedDataField1;
    }

    /**
     * Define el valor de la propiedad merchantDefinedDataField1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDefinedDataField1(String value) {
        this.merchantDefinedDataField1 = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDefinedDataField2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDefinedDataField2() {
        return merchantDefinedDataField2;
    }

    /**
     * Define el valor de la propiedad merchantDefinedDataField2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDefinedDataField2(String value) {
        this.merchantDefinedDataField2 = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDefinedDataField3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDefinedDataField3() {
        return merchantDefinedDataField3;
    }

    /**
     * Define el valor de la propiedad merchantDefinedDataField3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDefinedDataField3(String value) {
        this.merchantDefinedDataField3 = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDefinedDataField4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDefinedDataField4() {
        return merchantDefinedDataField4;
    }

    /**
     * Define el valor de la propiedad merchantDefinedDataField4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDefinedDataField4(String value) {
        this.merchantDefinedDataField4 = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantSecureDataField1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantSecureDataField1() {
        return merchantSecureDataField1;
    }

    /**
     * Define el valor de la propiedad merchantSecureDataField1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantSecureDataField1(String value) {
        this.merchantSecureDataField1 = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantSecureDataField2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantSecureDataField2() {
        return merchantSecureDataField2;
    }

    /**
     * Define el valor de la propiedad merchantSecureDataField2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantSecureDataField2(String value) {
        this.merchantSecureDataField2 = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantSecureDataField3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantSecureDataField3() {
        return merchantSecureDataField3;
    }

    /**
     * Define el valor de la propiedad merchantSecureDataField3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantSecureDataField3(String value) {
        this.merchantSecureDataField3 = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantSecureDataField4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantSecureDataField4() {
        return merchantSecureDataField4;
    }

    /**
     * Define el valor de la propiedad merchantSecureDataField4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantSecureDataField4(String value) {
        this.merchantSecureDataField4 = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerMerchantID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerMerchantID() {
        return ownerMerchantID;
    }

    /**
     * Define el valor de la propiedad ownerMerchantID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerMerchantID(String value) {
        this.ownerMerchantID = value;
    }

    /**
     * Obtiene el valor de la propiedad companyTaxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyTaxID() {
        return companyTaxID;
    }

    /**
     * Define el valor de la propiedad companyTaxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyTaxID(String value) {
        this.companyTaxID = value;
    }

    /**
     * Obtiene el valor de la propiedad driversLicenseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseNumber() {
        return driversLicenseNumber;
    }

    /**
     * Define el valor de la propiedad driversLicenseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseNumber(String value) {
        this.driversLicenseNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad driversLicenseState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseState() {
        return driversLicenseState;
    }

    /**
     * Define el valor de la propiedad driversLicenseState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseState(String value) {
        this.driversLicenseState = value;
    }

    /**
     * Obtiene el valor de la propiedad dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Define el valor de la propiedad dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Obtiene el valor de la propiedad instrumentIdentifierID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierID() {
        return instrumentIdentifierID;
    }

    /**
     * Define el valor de la propiedad instrumentIdentifierID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierID(String value) {
        this.instrumentIdentifierID = value;
    }

    /**
     * Obtiene el valor de la propiedad instrumentIdentifierStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierStatus() {
        return instrumentIdentifierStatus;
    }

    /**
     * Define el valor de la propiedad instrumentIdentifierStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierStatus(String value) {
        this.instrumentIdentifierStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad instrumentIdentifierSuccessorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierSuccessorID() {
        return instrumentIdentifierSuccessorID;
    }

    /**
     * Define el valor de la propiedad instrumentIdentifierSuccessorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierSuccessorID(String value) {
        this.instrumentIdentifierSuccessorID = value;
    }

    /**
     * Obtiene el valor de la propiedad subsequentAuthTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthTransactionID() {
        return subsequentAuthTransactionID;
    }

    /**
     * Define el valor de la propiedad subsequentAuthTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthTransactionID(String value) {
        this.subsequentAuthTransactionID = value;
    }

}

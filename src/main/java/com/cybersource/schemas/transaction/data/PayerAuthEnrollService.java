
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayerAuthEnrollService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayerAuthEnrollService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="httpAccept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="httpUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acquirerBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketingOptIn" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="marketingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultCard" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="shipAddressUsageDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionCountDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionCountYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addCardAttempts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountPurchases" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraudActivity" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="paymentAccountDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateAuthenticationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateAuthenticationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateAuthenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="challengeRequired" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="challengeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preorderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCardAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCardCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCardCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="npaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringOriginalPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantNewCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCCAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installmentTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="httpUserAccept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhoneDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pareqChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shoppingChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantTTPCredential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="run" use="required" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerAuthEnrollService", propOrder = {
    "httpAccept",
    "httpUserAgent",
    "merchantName",
    "merchantURL",
    "purchaseDescription",
    "purchaseTime",
    "countryCode",
    "acquirerBin",
    "loginID",
    "password",
    "merchantID",
    "overridePaymentMethod",
    "mobilePhone",
    "mcc",
    "productCode",
    "referenceID",
    "marketingOptIn",
    "marketingSource",
    "defaultCard",
    "shipAddressUsageDate",
    "transactionCountDay",
    "transactionCountYear",
    "addCardAttempts",
    "accountPurchases",
    "fraudActivity",
    "paymentAccountDate",
    "alternateAuthenticationMethod",
    "alternateAuthenticationDate",
    "alternateAuthenticationData",
    "challengeRequired",
    "challengeCode",
    "preorder",
    "reorder",
    "preorderDate",
    "giftCardAmount",
    "giftCardCurrency",
    "giftCardCount",
    "messageCategory",
    "npaCode",
    "recurringOriginalPurchaseDate",
    "transactionMode",
    "recurringEndDate",
    "recurringFrequency",
    "merchantNewCustomer",
    "customerCCAlias",
    "installmentTotalCount",
    "authenticationTransactionID",
    "httpUserAccept",
    "mobilePhoneDomestic",
    "pareqChannel",
    "shoppingChannel",
    "authenticationChannel",
    "merchantTTPCredential",
    "requestorID",
    "requestorName"
})
public class PayerAuthEnrollService {

    protected String httpAccept;
    protected String httpUserAgent;
    protected String merchantName;
    protected String merchantURL;
    protected String purchaseDescription;
    protected String purchaseTime;
    protected String countryCode;
    protected String acquirerBin;
    protected String loginID;
    protected String password;
    protected String merchantID;
    protected String overridePaymentMethod;
    protected String mobilePhone;
    @XmlElement(name = "MCC")
    protected String mcc;
    protected String productCode;
    protected String referenceID;
    protected String marketingOptIn;
    protected String marketingSource;
    protected String defaultCard;
    protected String shipAddressUsageDate;
    protected String transactionCountDay;
    protected String transactionCountYear;
    protected String addCardAttempts;
    protected String accountPurchases;
    protected String fraudActivity;
    protected String paymentAccountDate;
    protected String alternateAuthenticationMethod;
    protected String alternateAuthenticationDate;
    protected String alternateAuthenticationData;
    protected String challengeRequired;
    protected String challengeCode;
    protected String preorder;
    protected String reorder;
    protected String preorderDate;
    protected String giftCardAmount;
    protected String giftCardCurrency;
    protected String giftCardCount;
    protected String messageCategory;
    protected String npaCode;
    protected String recurringOriginalPurchaseDate;
    protected String transactionMode;
    protected String recurringEndDate;
    protected String recurringFrequency;
    protected String merchantNewCustomer;
    protected String customerCCAlias;
    protected String installmentTotalCount;
    protected String authenticationTransactionID;
    protected String httpUserAccept;
    protected String mobilePhoneDomestic;
    protected String pareqChannel;
    protected String shoppingChannel;
    protected String authenticationChannel;
    protected String merchantTTPCredential;
    protected String requestorID;
    protected String requestorName;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad httpAccept.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpAccept() {
        return httpAccept;
    }

    /**
     * Define el valor de la propiedad httpAccept.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpAccept(String value) {
        this.httpAccept = value;
    }

    /**
     * Obtiene el valor de la propiedad httpUserAgent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpUserAgent() {
        return httpUserAgent;
    }

    /**
     * Define el valor de la propiedad httpUserAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpUserAgent(String value) {
        this.httpUserAgent = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Define el valor de la propiedad merchantName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantURL() {
        return merchantURL;
    }

    /**
     * Define el valor de la propiedad merchantURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantURL(String value) {
        this.merchantURL = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDescription() {
        return purchaseDescription;
    }

    /**
     * Define el valor de la propiedad purchaseDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDescription(String value) {
        this.purchaseDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * Define el valor de la propiedad purchaseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseTime(String value) {
        this.purchaseTime = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad acquirerBin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerBin() {
        return acquirerBin;
    }

    /**
     * Define el valor de la propiedad acquirerBin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerBin(String value) {
        this.acquirerBin = value;
    }

    /**
     * Obtiene el valor de la propiedad loginID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginID() {
        return loginID;
    }

    /**
     * Define el valor de la propiedad loginID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginID(String value) {
        this.loginID = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Define el valor de la propiedad merchantID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

    /**
     * Obtiene el valor de la propiedad overridePaymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePaymentMethod() {
        return overridePaymentMethod;
    }

    /**
     * Define el valor de la propiedad overridePaymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePaymentMethod(String value) {
        this.overridePaymentMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad mobilePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Define el valor de la propiedad mobilePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad mcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCC() {
        return mcc;
    }

    /**
     * Define el valor de la propiedad mcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCC(String value) {
        this.mcc = value;
    }

    /**
     * Obtiene el valor de la propiedad productCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Define el valor de la propiedad productCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Define el valor de la propiedad referenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Obtiene el valor de la propiedad marketingOptIn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingOptIn() {
        return marketingOptIn;
    }

    /**
     * Define el valor de la propiedad marketingOptIn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingOptIn(String value) {
        this.marketingOptIn = value;
    }

    /**
     * Obtiene el valor de la propiedad marketingSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingSource() {
        return marketingSource;
    }

    /**
     * Define el valor de la propiedad marketingSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingSource(String value) {
        this.marketingSource = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCard() {
        return defaultCard;
    }

    /**
     * Define el valor de la propiedad defaultCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCard(String value) {
        this.defaultCard = value;
    }

    /**
     * Obtiene el valor de la propiedad shipAddressUsageDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddressUsageDate() {
        return shipAddressUsageDate;
    }

    /**
     * Define el valor de la propiedad shipAddressUsageDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddressUsageDate(String value) {
        this.shipAddressUsageDate = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionCountDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCountDay() {
        return transactionCountDay;
    }

    /**
     * Define el valor de la propiedad transactionCountDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCountDay(String value) {
        this.transactionCountDay = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionCountYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCountYear() {
        return transactionCountYear;
    }

    /**
     * Define el valor de la propiedad transactionCountYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCountYear(String value) {
        this.transactionCountYear = value;
    }

    /**
     * Obtiene el valor de la propiedad addCardAttempts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddCardAttempts() {
        return addCardAttempts;
    }

    /**
     * Define el valor de la propiedad addCardAttempts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddCardAttempts(String value) {
        this.addCardAttempts = value;
    }

    /**
     * Obtiene el valor de la propiedad accountPurchases.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPurchases() {
        return accountPurchases;
    }

    /**
     * Define el valor de la propiedad accountPurchases.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPurchases(String value) {
        this.accountPurchases = value;
    }

    /**
     * Obtiene el valor de la propiedad fraudActivity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudActivity() {
        return fraudActivity;
    }

    /**
     * Define el valor de la propiedad fraudActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudActivity(String value) {
        this.fraudActivity = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentAccountDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountDate() {
        return paymentAccountDate;
    }

    /**
     * Define el valor de la propiedad paymentAccountDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountDate(String value) {
        this.paymentAccountDate = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateAuthenticationMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateAuthenticationMethod() {
        return alternateAuthenticationMethod;
    }

    /**
     * Define el valor de la propiedad alternateAuthenticationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateAuthenticationMethod(String value) {
        this.alternateAuthenticationMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateAuthenticationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateAuthenticationDate() {
        return alternateAuthenticationDate;
    }

    /**
     * Define el valor de la propiedad alternateAuthenticationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateAuthenticationDate(String value) {
        this.alternateAuthenticationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateAuthenticationData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateAuthenticationData() {
        return alternateAuthenticationData;
    }

    /**
     * Define el valor de la propiedad alternateAuthenticationData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateAuthenticationData(String value) {
        this.alternateAuthenticationData = value;
    }

    /**
     * Obtiene el valor de la propiedad challengeRequired.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeRequired() {
        return challengeRequired;
    }

    /**
     * Define el valor de la propiedad challengeRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeRequired(String value) {
        this.challengeRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad challengeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeCode() {
        return challengeCode;
    }

    /**
     * Define el valor de la propiedad challengeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeCode(String value) {
        this.challengeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad preorder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreorder() {
        return preorder;
    }

    /**
     * Define el valor de la propiedad preorder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreorder(String value) {
        this.preorder = value;
    }

    /**
     * Obtiene el valor de la propiedad reorder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReorder() {
        return reorder;
    }

    /**
     * Define el valor de la propiedad reorder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReorder(String value) {
        this.reorder = value;
    }

    /**
     * Obtiene el valor de la propiedad preorderDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreorderDate() {
        return preorderDate;
    }

    /**
     * Define el valor de la propiedad preorderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreorderDate(String value) {
        this.preorderDate = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardAmount() {
        return giftCardAmount;
    }

    /**
     * Define el valor de la propiedad giftCardAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardAmount(String value) {
        this.giftCardAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardCurrency() {
        return giftCardCurrency;
    }

    /**
     * Define el valor de la propiedad giftCardCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardCurrency(String value) {
        this.giftCardCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardCount() {
        return giftCardCount;
    }

    /**
     * Define el valor de la propiedad giftCardCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardCount(String value) {
        this.giftCardCount = value;
    }

    /**
     * Obtiene el valor de la propiedad messageCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCategory() {
        return messageCategory;
    }

    /**
     * Define el valor de la propiedad messageCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCategory(String value) {
        this.messageCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad npaCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpaCode() {
        return npaCode;
    }

    /**
     * Define el valor de la propiedad npaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpaCode(String value) {
        this.npaCode = value;
    }

    /**
     * Obtiene el valor de la propiedad recurringOriginalPurchaseDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringOriginalPurchaseDate() {
        return recurringOriginalPurchaseDate;
    }

    /**
     * Define el valor de la propiedad recurringOriginalPurchaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringOriginalPurchaseDate(String value) {
        this.recurringOriginalPurchaseDate = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionMode() {
        return transactionMode;
    }

    /**
     * Define el valor de la propiedad transactionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionMode(String value) {
        this.transactionMode = value;
    }

    /**
     * Obtiene el valor de la propiedad recurringEndDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringEndDate() {
        return recurringEndDate;
    }

    /**
     * Define el valor de la propiedad recurringEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringEndDate(String value) {
        this.recurringEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad recurringFrequency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringFrequency() {
        return recurringFrequency;
    }

    /**
     * Define el valor de la propiedad recurringFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringFrequency(String value) {
        this.recurringFrequency = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantNewCustomer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantNewCustomer() {
        return merchantNewCustomer;
    }

    /**
     * Define el valor de la propiedad merchantNewCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantNewCustomer(String value) {
        this.merchantNewCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad customerCCAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCCAlias() {
        return customerCCAlias;
    }

    /**
     * Define el valor de la propiedad customerCCAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCCAlias(String value) {
        this.customerCCAlias = value;
    }

    /**
     * Obtiene el valor de la propiedad installmentTotalCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentTotalCount() {
        return installmentTotalCount;
    }

    /**
     * Define el valor de la propiedad installmentTotalCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentTotalCount(String value) {
        this.installmentTotalCount = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticationTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTransactionID() {
        return authenticationTransactionID;
    }

    /**
     * Define el valor de la propiedad authenticationTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTransactionID(String value) {
        this.authenticationTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad httpUserAccept.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpUserAccept() {
        return httpUserAccept;
    }

    /**
     * Define el valor de la propiedad httpUserAccept.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpUserAccept(String value) {
        this.httpUserAccept = value;
    }

    /**
     * Obtiene el valor de la propiedad mobilePhoneDomestic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneDomestic() {
        return mobilePhoneDomestic;
    }

    /**
     * Define el valor de la propiedad mobilePhoneDomestic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneDomestic(String value) {
        this.mobilePhoneDomestic = value;
    }

    /**
     * Obtiene el valor de la propiedad pareqChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPareqChannel() {
        return pareqChannel;
    }

    /**
     * Define el valor de la propiedad pareqChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPareqChannel(String value) {
        this.pareqChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad shoppingChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingChannel() {
        return shoppingChannel;
    }

    /**
     * Define el valor de la propiedad shoppingChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingChannel(String value) {
        this.shoppingChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticationChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationChannel() {
        return authenticationChannel;
    }

    /**
     * Define el valor de la propiedad authenticationChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationChannel(String value) {
        this.authenticationChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantTTPCredential.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTTPCredential() {
        return merchantTTPCredential;
    }

    /**
     * Define el valor de la propiedad merchantTTPCredential.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTTPCredential(String value) {
        this.merchantTTPCredential = value;
    }

    /**
     * Obtiene el valor de la propiedad requestorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorID() {
        return requestorID;
    }

    /**
     * Define el valor de la propiedad requestorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorID(String value) {
        this.requestorID = value;
    }

    /**
     * Obtiene el valor de la propiedad requestorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorName() {
        return requestorName;
    }

    /**
     * Define el valor de la propiedad requestorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorName(String value) {
        this.requestorName = value;
    }

    /**
     * Obtiene el valor de la propiedad run.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Define el valor de la propiedad run.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
    }

}

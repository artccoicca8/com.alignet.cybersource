
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCAuthReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCAuthReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalIDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizedDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="processorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bmlAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authFactorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundingTotals" type="{urn:schemas-cybersource-com:transaction-data-1.159}FundingTotals" minOccurs="0"/>
 *         &lt;element name="fxQuoteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fxQuoteRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="fxQuoteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fxQuoteExpirationDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="authRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantAdviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantAdviceCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavvResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavvResponseCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalance" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="forwardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enhancedDataEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referralResponseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvedTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentNetworkTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="requestCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affluenceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evEmailRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evPhoneNumberRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evPostalCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evNameRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evStreetRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIssuerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardRegulated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCommercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPrepaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPayroll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardHealthcare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardSignatureDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPINlessDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLevel3Eligible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerPassThroughData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerCVNResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerAVSResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerAcquirerBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentCardService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentCardServiceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionQualification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionIntegrity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emsTransactionRiskScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardReferenceData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCAuthReply", propOrder = {
    "reasonCode",
    "amount",
    "authorizationCode",
    "avsCode",
    "avsCodeRaw",
    "cvCode",
    "cvCodeRaw",
    "personalIDCode",
    "authorizedDateTime",
    "processorResponse",
    "bmlAccountNumber",
    "authFactorCode",
    "reconciliationID",
    "fundingTotals",
    "fxQuoteID",
    "fxQuoteRate",
    "fxQuoteType",
    "fxQuoteExpirationDateTime",
    "authRecord",
    "merchantAdviceCode",
    "merchantAdviceCodeRaw",
    "cavvResponseCode",
    "cavvResponseCodeRaw",
    "authenticationXID",
    "authorizationXID",
    "processorCardType",
    "accountBalance",
    "forwardCode",
    "enhancedDataEnabled",
    "referralResponseNumber",
    "subResponseCode",
    "approvedAmount",
    "creditLine",
    "approvedTerms",
    "paymentNetworkTransactionID",
    "cardCategory",
    "ownerMerchantID",
    "requestAmount",
    "requestCurrency",
    "accountBalanceCurrency",
    "accountBalanceSign",
    "amountType",
    "accountType",
    "affluenceIndicator",
    "evEmail",
    "evPhoneNumber",
    "evPostalCode",
    "evName",
    "evStreet",
    "evEmailRaw",
    "evPhoneNumberRaw",
    "evPostalCodeRaw",
    "evNameRaw",
    "evStreetRaw",
    "cardGroup",
    "posData",
    "transactionID",
    "cardIssuerCountry",
    "cardRegulated",
    "cardCommercial",
    "cardPrepaid",
    "cardPayroll",
    "cardHealthcare",
    "cardSignatureDebit",
    "cardPINlessDebit",
    "cardLevel3Eligible",
    "processorTransactionID",
    "providerReasonCode",
    "providerReasonDescription",
    "providerPassThroughData",
    "providerCVNResponseCode",
    "providerAVSResponseCode",
    "providerAcquirerBankCode",
    "paymentCardService",
    "paymentCardServiceResult",
    "transactionQualification",
    "transactionIntegrity",
    "emsTransactionRiskScore",
    "reconciliationReferenceNumber",
    "cardReferenceData"
})
public class CCAuthReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String amount;
    protected String authorizationCode;
    protected String avsCode;
    protected String avsCodeRaw;
    protected String cvCode;
    protected String cvCodeRaw;
    protected String personalIDCode;
    protected String authorizedDateTime;
    protected String processorResponse;
    protected String bmlAccountNumber;
    protected String authFactorCode;
    protected String reconciliationID;
    protected FundingTotals fundingTotals;
    protected String fxQuoteID;
    protected String fxQuoteRate;
    protected String fxQuoteType;
    protected String fxQuoteExpirationDateTime;
    protected String authRecord;
    protected String merchantAdviceCode;
    protected String merchantAdviceCodeRaw;
    protected String cavvResponseCode;
    protected String cavvResponseCodeRaw;
    protected String authenticationXID;
    protected String authorizationXID;
    protected String processorCardType;
    protected String accountBalance;
    protected String forwardCode;
    protected String enhancedDataEnabled;
    protected String referralResponseNumber;
    protected String subResponseCode;
    protected String approvedAmount;
    protected String creditLine;
    protected String approvedTerms;
    protected String paymentNetworkTransactionID;
    protected String cardCategory;
    protected String ownerMerchantID;
    protected String requestAmount;
    protected String requestCurrency;
    protected String accountBalanceCurrency;
    protected String accountBalanceSign;
    protected String amountType;
    protected String accountType;
    protected String affluenceIndicator;
    protected String evEmail;
    protected String evPhoneNumber;
    protected String evPostalCode;
    protected String evName;
    protected String evStreet;
    protected String evEmailRaw;
    protected String evPhoneNumberRaw;
    protected String evPostalCodeRaw;
    protected String evNameRaw;
    protected String evStreetRaw;
    protected String cardGroup;
    protected String posData;
    protected String transactionID;
    protected String cardIssuerCountry;
    protected String cardRegulated;
    protected String cardCommercial;
    protected String cardPrepaid;
    protected String cardPayroll;
    protected String cardHealthcare;
    protected String cardSignatureDebit;
    protected String cardPINlessDebit;
    protected String cardLevel3Eligible;
    protected String processorTransactionID;
    protected String providerReasonCode;
    protected String providerReasonDescription;
    protected String providerPassThroughData;
    protected String providerCVNResponseCode;
    protected String providerAVSResponseCode;
    protected String providerAcquirerBankCode;
    protected String paymentCardService;
    protected String paymentCardServiceResult;
    protected String transactionQualification;
    protected String transactionIntegrity;
    protected String emsTransactionRiskScore;
    protected String reconciliationReferenceNumber;
    protected String cardReferenceData;

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
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Define el valor de la propiedad authorizationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad avsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCode() {
        return avsCode;
    }

    /**
     * Define el valor de la propiedad avsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCode(String value) {
        this.avsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad avsCodeRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCodeRaw() {
        return avsCodeRaw;
    }

    /**
     * Define el valor de la propiedad avsCodeRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCodeRaw(String value) {
        this.avsCodeRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad cvCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvCode() {
        return cvCode;
    }

    /**
     * Define el valor de la propiedad cvCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvCode(String value) {
        this.cvCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cvCodeRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvCodeRaw() {
        return cvCodeRaw;
    }

    /**
     * Define el valor de la propiedad cvCodeRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvCodeRaw(String value) {
        this.cvCodeRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad personalIDCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalIDCode() {
        return personalIDCode;
    }

    /**
     * Define el valor de la propiedad personalIDCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalIDCode(String value) {
        this.personalIDCode = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizedDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedDateTime() {
        return authorizedDateTime;
    }

    /**
     * Define el valor de la propiedad authorizedDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedDateTime(String value) {
        this.authorizedDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad processorResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Define el valor de la propiedad processorResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorResponse(String value) {
        this.processorResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad bmlAccountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmlAccountNumber() {
        return bmlAccountNumber;
    }

    /**
     * Define el valor de la propiedad bmlAccountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmlAccountNumber(String value) {
        this.bmlAccountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad authFactorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthFactorCode() {
        return authFactorCode;
    }

    /**
     * Define el valor de la propiedad authFactorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthFactorCode(String value) {
        this.authFactorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad reconciliationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Define el valor de la propiedad reconciliationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

    /**
     * Obtiene el valor de la propiedad fundingTotals.
     * 
     * @return
     *     possible object is
     *     {@link FundingTotals }
     *     
     */
    public FundingTotals getFundingTotals() {
        return fundingTotals;
    }

    /**
     * Define el valor de la propiedad fundingTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingTotals }
     *     
     */
    public void setFundingTotals(FundingTotals value) {
        this.fundingTotals = value;
    }

    /**
     * Obtiene el valor de la propiedad fxQuoteID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteID() {
        return fxQuoteID;
    }

    /**
     * Define el valor de la propiedad fxQuoteID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteID(String value) {
        this.fxQuoteID = value;
    }

    /**
     * Obtiene el valor de la propiedad fxQuoteRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteRate() {
        return fxQuoteRate;
    }

    /**
     * Define el valor de la propiedad fxQuoteRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteRate(String value) {
        this.fxQuoteRate = value;
    }

    /**
     * Obtiene el valor de la propiedad fxQuoteType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteType() {
        return fxQuoteType;
    }

    /**
     * Define el valor de la propiedad fxQuoteType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteType(String value) {
        this.fxQuoteType = value;
    }

    /**
     * Obtiene el valor de la propiedad fxQuoteExpirationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteExpirationDateTime() {
        return fxQuoteExpirationDateTime;
    }

    /**
     * Define el valor de la propiedad fxQuoteExpirationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteExpirationDateTime(String value) {
        this.fxQuoteExpirationDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad authRecord.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRecord() {
        return authRecord;
    }

    /**
     * Define el valor de la propiedad authRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRecord(String value) {
        this.authRecord = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantAdviceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAdviceCode() {
        return merchantAdviceCode;
    }

    /**
     * Define el valor de la propiedad merchantAdviceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAdviceCode(String value) {
        this.merchantAdviceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantAdviceCodeRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAdviceCodeRaw() {
        return merchantAdviceCodeRaw;
    }

    /**
     * Define el valor de la propiedad merchantAdviceCodeRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAdviceCodeRaw(String value) {
        this.merchantAdviceCodeRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad cavvResponseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvResponseCode() {
        return cavvResponseCode;
    }

    /**
     * Define el valor de la propiedad cavvResponseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvResponseCode(String value) {
        this.cavvResponseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cavvResponseCodeRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvResponseCodeRaw() {
        return cavvResponseCodeRaw;
    }

    /**
     * Define el valor de la propiedad cavvResponseCodeRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvResponseCodeRaw(String value) {
        this.cavvResponseCodeRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticationXID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationXID() {
        return authenticationXID;
    }

    /**
     * Define el valor de la propiedad authenticationXID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationXID(String value) {
        this.authenticationXID = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationXID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationXID() {
        return authorizationXID;
    }

    /**
     * Define el valor de la propiedad authorizationXID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationXID(String value) {
        this.authorizationXID = value;
    }

    /**
     * Obtiene el valor de la propiedad processorCardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorCardType() {
        return processorCardType;
    }

    /**
     * Define el valor de la propiedad processorCardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorCardType(String value) {
        this.processorCardType = value;
    }

    /**
     * Obtiene el valor de la propiedad accountBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalance() {
        return accountBalance;
    }

    /**
     * Define el valor de la propiedad accountBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalance(String value) {
        this.accountBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad forwardCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardCode() {
        return forwardCode;
    }

    /**
     * Define el valor de la propiedad forwardCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardCode(String value) {
        this.forwardCode = value;
    }

    /**
     * Obtiene el valor de la propiedad enhancedDataEnabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedDataEnabled() {
        return enhancedDataEnabled;
    }

    /**
     * Define el valor de la propiedad enhancedDataEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedDataEnabled(String value) {
        this.enhancedDataEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad referralResponseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralResponseNumber() {
        return referralResponseNumber;
    }

    /**
     * Define el valor de la propiedad referralResponseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralResponseNumber(String value) {
        this.referralResponseNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad subResponseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubResponseCode() {
        return subResponseCode;
    }

    /**
     * Define el valor de la propiedad subResponseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubResponseCode(String value) {
        this.subResponseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad approvedAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedAmount() {
        return approvedAmount;
    }

    /**
     * Define el valor de la propiedad approvedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedAmount(String value) {
        this.approvedAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad creditLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLine() {
        return creditLine;
    }

    /**
     * Define el valor de la propiedad creditLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLine(String value) {
        this.creditLine = value;
    }

    /**
     * Obtiene el valor de la propiedad approvedTerms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedTerms() {
        return approvedTerms;
    }

    /**
     * Define el valor de la propiedad approvedTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedTerms(String value) {
        this.approvedTerms = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentNetworkTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNetworkTransactionID() {
        return paymentNetworkTransactionID;
    }

    /**
     * Define el valor de la propiedad paymentNetworkTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNetworkTransactionID(String value) {
        this.paymentNetworkTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad cardCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCategory() {
        return cardCategory;
    }

    /**
     * Define el valor de la propiedad cardCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCategory(String value) {
        this.cardCategory = value;
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
     * Obtiene el valor de la propiedad requestAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAmount() {
        return requestAmount;
    }

    /**
     * Define el valor de la propiedad requestAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAmount(String value) {
        this.requestAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad requestCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCurrency() {
        return requestCurrency;
    }

    /**
     * Define el valor de la propiedad requestCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCurrency(String value) {
        this.requestCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad accountBalanceCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceCurrency() {
        return accountBalanceCurrency;
    }

    /**
     * Define el valor de la propiedad accountBalanceCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceCurrency(String value) {
        this.accountBalanceCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad accountBalanceSign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceSign() {
        return accountBalanceSign;
    }

    /**
     * Define el valor de la propiedad accountBalanceSign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceSign(String value) {
        this.accountBalanceSign = value;
    }

    /**
     * Obtiene el valor de la propiedad amountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * Define el valor de la propiedad amountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountType(String value) {
        this.amountType = value;
    }

    /**
     * Obtiene el valor de la propiedad accountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Define el valor de la propiedad accountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Obtiene el valor de la propiedad affluenceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffluenceIndicator() {
        return affluenceIndicator;
    }

    /**
     * Define el valor de la propiedad affluenceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffluenceIndicator(String value) {
        this.affluenceIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad evEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvEmail() {
        return evEmail;
    }

    /**
     * Define el valor de la propiedad evEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvEmail(String value) {
        this.evEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad evPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvPhoneNumber() {
        return evPhoneNumber;
    }

    /**
     * Define el valor de la propiedad evPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvPhoneNumber(String value) {
        this.evPhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad evPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvPostalCode() {
        return evPostalCode;
    }

    /**
     * Define el valor de la propiedad evPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvPostalCode(String value) {
        this.evPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad evName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvName() {
        return evName;
    }

    /**
     * Define el valor de la propiedad evName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvName(String value) {
        this.evName = value;
    }

    /**
     * Obtiene el valor de la propiedad evStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvStreet() {
        return evStreet;
    }

    /**
     * Define el valor de la propiedad evStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvStreet(String value) {
        this.evStreet = value;
    }

    /**
     * Obtiene el valor de la propiedad evEmailRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvEmailRaw() {
        return evEmailRaw;
    }

    /**
     * Define el valor de la propiedad evEmailRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvEmailRaw(String value) {
        this.evEmailRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad evPhoneNumberRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvPhoneNumberRaw() {
        return evPhoneNumberRaw;
    }

    /**
     * Define el valor de la propiedad evPhoneNumberRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvPhoneNumberRaw(String value) {
        this.evPhoneNumberRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad evPostalCodeRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvPostalCodeRaw() {
        return evPostalCodeRaw;
    }

    /**
     * Define el valor de la propiedad evPostalCodeRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvPostalCodeRaw(String value) {
        this.evPostalCodeRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad evNameRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvNameRaw() {
        return evNameRaw;
    }

    /**
     * Define el valor de la propiedad evNameRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvNameRaw(String value) {
        this.evNameRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad evStreetRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvStreetRaw() {
        return evStreetRaw;
    }

    /**
     * Define el valor de la propiedad evStreetRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvStreetRaw(String value) {
        this.evStreetRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad cardGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardGroup() {
        return cardGroup;
    }

    /**
     * Define el valor de la propiedad cardGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardGroup(String value) {
        this.cardGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad posData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosData() {
        return posData;
    }

    /**
     * Define el valor de la propiedad posData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosData(String value) {
        this.posData = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Define el valor de la propiedad transactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad cardIssuerCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuerCountry() {
        return cardIssuerCountry;
    }

    /**
     * Define el valor de la propiedad cardIssuerCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuerCountry(String value) {
        this.cardIssuerCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad cardRegulated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardRegulated() {
        return cardRegulated;
    }

    /**
     * Define el valor de la propiedad cardRegulated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardRegulated(String value) {
        this.cardRegulated = value;
    }

    /**
     * Obtiene el valor de la propiedad cardCommercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCommercial() {
        return cardCommercial;
    }

    /**
     * Define el valor de la propiedad cardCommercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCommercial(String value) {
        this.cardCommercial = value;
    }

    /**
     * Obtiene el valor de la propiedad cardPrepaid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPrepaid() {
        return cardPrepaid;
    }

    /**
     * Define el valor de la propiedad cardPrepaid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPrepaid(String value) {
        this.cardPrepaid = value;
    }

    /**
     * Obtiene el valor de la propiedad cardPayroll.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPayroll() {
        return cardPayroll;
    }

    /**
     * Define el valor de la propiedad cardPayroll.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPayroll(String value) {
        this.cardPayroll = value;
    }

    /**
     * Obtiene el valor de la propiedad cardHealthcare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHealthcare() {
        return cardHealthcare;
    }

    /**
     * Define el valor de la propiedad cardHealthcare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHealthcare(String value) {
        this.cardHealthcare = value;
    }

    /**
     * Obtiene el valor de la propiedad cardSignatureDebit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSignatureDebit() {
        return cardSignatureDebit;
    }

    /**
     * Define el valor de la propiedad cardSignatureDebit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSignatureDebit(String value) {
        this.cardSignatureDebit = value;
    }

    /**
     * Obtiene el valor de la propiedad cardPINlessDebit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPINlessDebit() {
        return cardPINlessDebit;
    }

    /**
     * Define el valor de la propiedad cardPINlessDebit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPINlessDebit(String value) {
        this.cardPINlessDebit = value;
    }

    /**
     * Obtiene el valor de la propiedad cardLevel3Eligible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLevel3Eligible() {
        return cardLevel3Eligible;
    }

    /**
     * Define el valor de la propiedad cardLevel3Eligible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLevel3Eligible(String value) {
        this.cardLevel3Eligible = value;
    }

    /**
     * Obtiene el valor de la propiedad processorTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorTransactionID() {
        return processorTransactionID;
    }

    /**
     * Define el valor de la propiedad processorTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorTransactionID(String value) {
        this.processorTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad providerReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReasonCode() {
        return providerReasonCode;
    }

    /**
     * Define el valor de la propiedad providerReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReasonCode(String value) {
        this.providerReasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad providerReasonDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReasonDescription() {
        return providerReasonDescription;
    }

    /**
     * Define el valor de la propiedad providerReasonDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReasonDescription(String value) {
        this.providerReasonDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad providerPassThroughData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderPassThroughData() {
        return providerPassThroughData;
    }

    /**
     * Define el valor de la propiedad providerPassThroughData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderPassThroughData(String value) {
        this.providerPassThroughData = value;
    }

    /**
     * Obtiene el valor de la propiedad providerCVNResponseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCVNResponseCode() {
        return providerCVNResponseCode;
    }

    /**
     * Define el valor de la propiedad providerCVNResponseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCVNResponseCode(String value) {
        this.providerCVNResponseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad providerAVSResponseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAVSResponseCode() {
        return providerAVSResponseCode;
    }

    /**
     * Define el valor de la propiedad providerAVSResponseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAVSResponseCode(String value) {
        this.providerAVSResponseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad providerAcquirerBankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAcquirerBankCode() {
        return providerAcquirerBankCode;
    }

    /**
     * Define el valor de la propiedad providerAcquirerBankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAcquirerBankCode(String value) {
        this.providerAcquirerBankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCardService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardService() {
        return paymentCardService;
    }

    /**
     * Define el valor de la propiedad paymentCardService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardService(String value) {
        this.paymentCardService = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCardServiceResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardServiceResult() {
        return paymentCardServiceResult;
    }

    /**
     * Define el valor de la propiedad paymentCardServiceResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardServiceResult(String value) {
        this.paymentCardServiceResult = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionQualification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionQualification() {
        return transactionQualification;
    }

    /**
     * Define el valor de la propiedad transactionQualification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionQualification(String value) {
        this.transactionQualification = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionIntegrity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIntegrity() {
        return transactionIntegrity;
    }

    /**
     * Define el valor de la propiedad transactionIntegrity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIntegrity(String value) {
        this.transactionIntegrity = value;
    }

    /**
     * Obtiene el valor de la propiedad emsTransactionRiskScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmsTransactionRiskScore() {
        return emsTransactionRiskScore;
    }

    /**
     * Define el valor de la propiedad emsTransactionRiskScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmsTransactionRiskScore(String value) {
        this.emsTransactionRiskScore = value;
    }

    /**
     * Obtiene el valor de la propiedad reconciliationReferenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationReferenceNumber() {
        return reconciliationReferenceNumber;
    }

    /**
     * Define el valor de la propiedad reconciliationReferenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationReferenceNumber(String value) {
        this.reconciliationReferenceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad cardReferenceData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardReferenceData() {
        return cardReferenceData;
    }

    /**
     * Define el valor de la propiedad cardReferenceData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardReferenceData(String value) {
        this.cardReferenceData = value;
    }

}

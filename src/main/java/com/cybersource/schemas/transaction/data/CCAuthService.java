
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCAuthService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCAuthService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavvAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkTokenCryptogram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paSpecificationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directoryServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fxQuoteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnAuthRecord" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="authType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verbalAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billPayment" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="authenticationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryDatatype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checksumKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aggregatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aggregatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="splitTenderIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veresEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partialAuthIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="captureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstRecurringPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileRemotePaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardholderVerificationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dccRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overridePaymentDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardholderAuthenticationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leastCostRouting" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="verificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cryptocurrencyPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowValueExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riskAnalysisExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trustedMerchantExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureCorporatePaymentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deferredAuthIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegatedAuthenticationExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCAuthService", propOrder = {
    "cavv",
    "cavvAlgorithm",
    "networkTokenCryptogram",
    "paSpecificationVersion",
    "directoryServerTransactionID",
    "commerceIndicator",
    "eciRaw",
    "xid",
    "reconciliationID",
    "avsLevel",
    "fxQuoteID",
    "returnAuthRecord",
    "authType",
    "verbalAuthCode",
    "billPayment",
    "authenticationXID",
    "authorizationXID",
    "industryDatatype",
    "traceNumber",
    "checksumKey",
    "aggregatorID",
    "aggregatorName",
    "splitTenderIndicator",
    "veresEnrolled",
    "paresStatus",
    "partialAuthIndicator",
    "captureDate",
    "firstRecurringPayment",
    "duration",
    "overridePaymentMethod",
    "mobileRemotePaymentType",
    "cardholderVerificationMethod",
    "dccRequestID",
    "overridePaymentDetails",
    "cardholderAuthenticationMethod",
    "leastCostRouting",
    "verificationType",
    "cryptocurrencyPurchase",
    "lowValueExemptionIndicator",
    "riskAnalysisExemptionIndicator",
    "trustedMerchantExemptionIndicator",
    "secureCorporatePaymentIndicator",
    "deferredAuthIndicator",
    "delegatedAuthenticationExemptionIndicator"
})
public class CCAuthService {

    protected String cavv;
    protected String cavvAlgorithm;
    protected String networkTokenCryptogram;
    protected String paSpecificationVersion;
    protected String directoryServerTransactionID;
    protected String commerceIndicator;
    protected String eciRaw;
    protected String xid;
    protected String reconciliationID;
    protected String avsLevel;
    protected String fxQuoteID;
    protected String returnAuthRecord;
    protected String authType;
    protected String verbalAuthCode;
    protected String billPayment;
    protected String authenticationXID;
    protected String authorizationXID;
    protected String industryDatatype;
    protected String traceNumber;
    protected String checksumKey;
    protected String aggregatorID;
    protected String aggregatorName;
    protected String splitTenderIndicator;
    protected String veresEnrolled;
    protected String paresStatus;
    protected String partialAuthIndicator;
    protected String captureDate;
    protected String firstRecurringPayment;
    protected BigInteger duration;
    protected String overridePaymentMethod;
    protected String mobileRemotePaymentType;
    protected String cardholderVerificationMethod;
    protected String dccRequestID;
    protected String overridePaymentDetails;
    protected String cardholderAuthenticationMethod;
    protected String leastCostRouting;
    protected String verificationType;
    protected String cryptocurrencyPurchase;
    protected String lowValueExemptionIndicator;
    protected String riskAnalysisExemptionIndicator;
    protected String trustedMerchantExemptionIndicator;
    protected String secureCorporatePaymentIndicator;
    protected String deferredAuthIndicator;
    protected String delegatedAuthenticationExemptionIndicator;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad cavv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Define el valor de la propiedad cavv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * Obtiene el valor de la propiedad cavvAlgorithm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvAlgorithm() {
        return cavvAlgorithm;
    }

    /**
     * Define el valor de la propiedad cavvAlgorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvAlgorithm(String value) {
        this.cavvAlgorithm = value;
    }

    /**
     * Obtiene el valor de la propiedad networkTokenCryptogram.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkTokenCryptogram() {
        return networkTokenCryptogram;
    }

    /**
     * Define el valor de la propiedad networkTokenCryptogram.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkTokenCryptogram(String value) {
        this.networkTokenCryptogram = value;
    }

    /**
     * Obtiene el valor de la propiedad paSpecificationVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaSpecificationVersion() {
        return paSpecificationVersion;
    }

    /**
     * Define el valor de la propiedad paSpecificationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaSpecificationVersion(String value) {
        this.paSpecificationVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad directoryServerTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryServerTransactionID() {
        return directoryServerTransactionID;
    }

    /**
     * Define el valor de la propiedad directoryServerTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryServerTransactionID(String value) {
        this.directoryServerTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad commerceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceIndicator() {
        return commerceIndicator;
    }

    /**
     * Define el valor de la propiedad commerceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceIndicator(String value) {
        this.commerceIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad eciRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciRaw() {
        return eciRaw;
    }

    /**
     * Define el valor de la propiedad eciRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciRaw(String value) {
        this.eciRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad xid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Define el valor de la propiedad xid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
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
     * Obtiene el valor de la propiedad avsLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsLevel() {
        return avsLevel;
    }

    /**
     * Define el valor de la propiedad avsLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsLevel(String value) {
        this.avsLevel = value;
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
     * Obtiene el valor de la propiedad returnAuthRecord.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAuthRecord() {
        return returnAuthRecord;
    }

    /**
     * Define el valor de la propiedad returnAuthRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAuthRecord(String value) {
        this.returnAuthRecord = value;
    }

    /**
     * Obtiene el valor de la propiedad authType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * Define el valor de la propiedad authType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * Obtiene el valor de la propiedad verbalAuthCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbalAuthCode() {
        return verbalAuthCode;
    }

    /**
     * Define el valor de la propiedad verbalAuthCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbalAuthCode(String value) {
        this.verbalAuthCode = value;
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
     * Obtiene el valor de la propiedad industryDatatype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryDatatype() {
        return industryDatatype;
    }

    /**
     * Define el valor de la propiedad industryDatatype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryDatatype(String value) {
        this.industryDatatype = value;
    }

    /**
     * Obtiene el valor de la propiedad traceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceNumber() {
        return traceNumber;
    }

    /**
     * Define el valor de la propiedad traceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceNumber(String value) {
        this.traceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad checksumKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksumKey() {
        return checksumKey;
    }

    /**
     * Define el valor de la propiedad checksumKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksumKey(String value) {
        this.checksumKey = value;
    }

    /**
     * Obtiene el valor de la propiedad aggregatorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorID() {
        return aggregatorID;
    }

    /**
     * Define el valor de la propiedad aggregatorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorID(String value) {
        this.aggregatorID = value;
    }

    /**
     * Obtiene el valor de la propiedad aggregatorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorName() {
        return aggregatorName;
    }

    /**
     * Define el valor de la propiedad aggregatorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorName(String value) {
        this.aggregatorName = value;
    }

    /**
     * Obtiene el valor de la propiedad splitTenderIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitTenderIndicator() {
        return splitTenderIndicator;
    }

    /**
     * Define el valor de la propiedad splitTenderIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitTenderIndicator(String value) {
        this.splitTenderIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad veresEnrolled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeresEnrolled() {
        return veresEnrolled;
    }

    /**
     * Define el valor de la propiedad veresEnrolled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeresEnrolled(String value) {
        this.veresEnrolled = value;
    }

    /**
     * Obtiene el valor de la propiedad paresStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParesStatus() {
        return paresStatus;
    }

    /**
     * Define el valor de la propiedad paresStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParesStatus(String value) {
        this.paresStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad partialAuthIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialAuthIndicator() {
        return partialAuthIndicator;
    }

    /**
     * Define el valor de la propiedad partialAuthIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialAuthIndicator(String value) {
        this.partialAuthIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad captureDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureDate() {
        return captureDate;
    }

    /**
     * Define el valor de la propiedad captureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureDate(String value) {
        this.captureDate = value;
    }

    /**
     * Obtiene el valor de la propiedad firstRecurringPayment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstRecurringPayment() {
        return firstRecurringPayment;
    }

    /**
     * Define el valor de la propiedad firstRecurringPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstRecurringPayment(String value) {
        this.firstRecurringPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
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
     * Obtiene el valor de la propiedad mobileRemotePaymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileRemotePaymentType() {
        return mobileRemotePaymentType;
    }

    /**
     * Define el valor de la propiedad mobileRemotePaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileRemotePaymentType(String value) {
        this.mobileRemotePaymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad cardholderVerificationMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderVerificationMethod() {
        return cardholderVerificationMethod;
    }

    /**
     * Define el valor de la propiedad cardholderVerificationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderVerificationMethod(String value) {
        this.cardholderVerificationMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad dccRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccRequestID() {
        return dccRequestID;
    }

    /**
     * Define el valor de la propiedad dccRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccRequestID(String value) {
        this.dccRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad overridePaymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePaymentDetails() {
        return overridePaymentDetails;
    }

    /**
     * Define el valor de la propiedad overridePaymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePaymentDetails(String value) {
        this.overridePaymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad cardholderAuthenticationMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderAuthenticationMethod() {
        return cardholderAuthenticationMethod;
    }

    /**
     * Define el valor de la propiedad cardholderAuthenticationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderAuthenticationMethod(String value) {
        this.cardholderAuthenticationMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad leastCostRouting.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeastCostRouting() {
        return leastCostRouting;
    }

    /**
     * Define el valor de la propiedad leastCostRouting.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeastCostRouting(String value) {
        this.leastCostRouting = value;
    }

    /**
     * Obtiene el valor de la propiedad verificationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationType() {
        return verificationType;
    }

    /**
     * Define el valor de la propiedad verificationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationType(String value) {
        this.verificationType = value;
    }

    /**
     * Obtiene el valor de la propiedad cryptocurrencyPurchase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptocurrencyPurchase() {
        return cryptocurrencyPurchase;
    }

    /**
     * Define el valor de la propiedad cryptocurrencyPurchase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptocurrencyPurchase(String value) {
        this.cryptocurrencyPurchase = value;
    }

    /**
     * Obtiene el valor de la propiedad lowValueExemptionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowValueExemptionIndicator() {
        return lowValueExemptionIndicator;
    }

    /**
     * Define el valor de la propiedad lowValueExemptionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowValueExemptionIndicator(String value) {
        this.lowValueExemptionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad riskAnalysisExemptionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAnalysisExemptionIndicator() {
        return riskAnalysisExemptionIndicator;
    }

    /**
     * Define el valor de la propiedad riskAnalysisExemptionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAnalysisExemptionIndicator(String value) {
        this.riskAnalysisExemptionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad trustedMerchantExemptionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustedMerchantExemptionIndicator() {
        return trustedMerchantExemptionIndicator;
    }

    /**
     * Define el valor de la propiedad trustedMerchantExemptionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustedMerchantExemptionIndicator(String value) {
        this.trustedMerchantExemptionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad secureCorporatePaymentIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureCorporatePaymentIndicator() {
        return secureCorporatePaymentIndicator;
    }

    /**
     * Define el valor de la propiedad secureCorporatePaymentIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureCorporatePaymentIndicator(String value) {
        this.secureCorporatePaymentIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad deferredAuthIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferredAuthIndicator() {
        return deferredAuthIndicator;
    }

    /**
     * Define el valor de la propiedad deferredAuthIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferredAuthIndicator(String value) {
        this.deferredAuthIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad delegatedAuthenticationExemptionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatedAuthenticationExemptionIndicator() {
        return delegatedAuthenticationExemptionIndicator;
    }

    /**
     * Define el valor de la propiedad delegatedAuthenticationExemptionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatedAuthenticationExemptionIndicator(String value) {
        this.delegatedAuthenticationExemptionIndicator = value;
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

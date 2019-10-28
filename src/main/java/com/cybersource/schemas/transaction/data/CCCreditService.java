
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCCreditService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCCreditService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="captureRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partialPaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchasingLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryDatatype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billPayment" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="authorizationXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurrenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="captureRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checksumKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aggregatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aggregatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dpdeBillingMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reconciliationIDAlternate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overridePaymentDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCCreditService", propOrder = {
    "captureRequestID",
    "reconciliationID",
    "partialPaymentID",
    "purchasingLevel",
    "industryDatatype",
    "commerceIndicator",
    "billPayment",
    "authorizationXID",
    "occurrenceNumber",
    "authCode",
    "captureRequestToken",
    "merchantReceiptNumber",
    "checksumKey",
    "aggregatorID",
    "aggregatorName",
    "duration",
    "dpdeBillingMonth",
    "reconciliationIDAlternate",
    "refundReason",
    "overridePaymentMethod",
    "overridePaymentDetails"
})
public class CCCreditService {

    protected String captureRequestID;
    protected String reconciliationID;
    protected String partialPaymentID;
    protected String purchasingLevel;
    protected String industryDatatype;
    protected String commerceIndicator;
    protected String billPayment;
    protected String authorizationXID;
    protected String occurrenceNumber;
    protected String authCode;
    protected String captureRequestToken;
    protected String merchantReceiptNumber;
    protected String checksumKey;
    protected String aggregatorID;
    protected String aggregatorName;
    protected BigInteger duration;
    protected BigInteger dpdeBillingMonth;
    protected String reconciliationIDAlternate;
    protected String refundReason;
    protected String overridePaymentMethod;
    protected String overridePaymentDetails;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad captureRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureRequestID() {
        return captureRequestID;
    }

    /**
     * Define el valor de la propiedad captureRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureRequestID(String value) {
        this.captureRequestID = value;
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
     * Obtiene el valor de la propiedad partialPaymentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialPaymentID() {
        return partialPaymentID;
    }

    /**
     * Define el valor de la propiedad partialPaymentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialPaymentID(String value) {
        this.partialPaymentID = value;
    }

    /**
     * Obtiene el valor de la propiedad purchasingLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingLevel() {
        return purchasingLevel;
    }

    /**
     * Define el valor de la propiedad purchasingLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingLevel(String value) {
        this.purchasingLevel = value;
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
     * Obtiene el valor de la propiedad occurrenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurrenceNumber() {
        return occurrenceNumber;
    }

    /**
     * Define el valor de la propiedad occurrenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurrenceNumber(String value) {
        this.occurrenceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad authCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Define el valor de la propiedad authCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Obtiene el valor de la propiedad captureRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureRequestToken() {
        return captureRequestToken;
    }

    /**
     * Define el valor de la propiedad captureRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureRequestToken(String value) {
        this.captureRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantReceiptNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReceiptNumber() {
        return merchantReceiptNumber;
    }

    /**
     * Define el valor de la propiedad merchantReceiptNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReceiptNumber(String value) {
        this.merchantReceiptNumber = value;
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
     * Obtiene el valor de la propiedad dpdeBillingMonth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDpdeBillingMonth() {
        return dpdeBillingMonth;
    }

    /**
     * Define el valor de la propiedad dpdeBillingMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDpdeBillingMonth(BigInteger value) {
        this.dpdeBillingMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad reconciliationIDAlternate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationIDAlternate() {
        return reconciliationIDAlternate;
    }

    /**
     * Define el valor de la propiedad reconciliationIDAlternate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationIDAlternate(String value) {
        this.reconciliationIDAlternate = value;
    }

    /**
     * Obtiene el valor de la propiedad refundReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * Define el valor de la propiedad refundReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundReason(String value) {
        this.refundReason = value;
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

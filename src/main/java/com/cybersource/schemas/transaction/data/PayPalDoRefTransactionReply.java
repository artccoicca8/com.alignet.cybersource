
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalDoRefTransactionReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalDoRefTransactionReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="paypalBillingAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalOrderTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalExchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPendingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalDoRefTransactionReply", propOrder = {
    "reasonCode",
    "paypalBillingAgreementId",
    "transactionId",
    "paypalTransactionType",
    "paypalPaymentType",
    "paypalOrderTime",
    "paypalAmount",
    "currency",
    "paypalTaxAmount",
    "paypalExchangeRate",
    "paypalPaymentStatus",
    "paypalPendingReason",
    "paypalReasonCode",
    "errorCode",
    "correlationID"
})
public class PayPalDoRefTransactionReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String paypalBillingAgreementId;
    protected String transactionId;
    protected String paypalTransactionType;
    protected String paypalPaymentType;
    protected String paypalOrderTime;
    protected String paypalAmount;
    protected String currency;
    protected String paypalTaxAmount;
    protected String paypalExchangeRate;
    protected String paypalPaymentStatus;
    protected String paypalPendingReason;
    protected String paypalReasonCode;
    protected String errorCode;
    protected String correlationID;

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
     * Obtiene el valor de la propiedad paypalBillingAgreementId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementId() {
        return paypalBillingAgreementId;
    }

    /**
     * Define el valor de la propiedad paypalBillingAgreementId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementId(String value) {
        this.paypalBillingAgreementId = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalTransactionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalTransactionType() {
        return paypalTransactionType;
    }

    /**
     * Define el valor de la propiedad paypalTransactionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalTransactionType(String value) {
        this.paypalTransactionType = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalPaymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPaymentType() {
        return paypalPaymentType;
    }

    /**
     * Define el valor de la propiedad paypalPaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPaymentType(String value) {
        this.paypalPaymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalOrderTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalOrderTime() {
        return paypalOrderTime;
    }

    /**
     * Define el valor de la propiedad paypalOrderTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalOrderTime(String value) {
        this.paypalOrderTime = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAmount() {
        return paypalAmount;
    }

    /**
     * Define el valor de la propiedad paypalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAmount(String value) {
        this.paypalAmount = value;
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
     * Obtiene el valor de la propiedad paypalTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalTaxAmount() {
        return paypalTaxAmount;
    }

    /**
     * Define el valor de la propiedad paypalTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalTaxAmount(String value) {
        this.paypalTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalExchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalExchangeRate() {
        return paypalExchangeRate;
    }

    /**
     * Define el valor de la propiedad paypalExchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalExchangeRate(String value) {
        this.paypalExchangeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalPaymentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPaymentStatus() {
        return paypalPaymentStatus;
    }

    /**
     * Define el valor de la propiedad paypalPaymentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPaymentStatus(String value) {
        this.paypalPaymentStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalPendingReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPendingReason() {
        return paypalPendingReason;
    }

    /**
     * Define el valor de la propiedad paypalPendingReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPendingReason(String value) {
        this.paypalPendingReason = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalReasonCode() {
        return paypalReasonCode;
    }

    /**
     * Define el valor de la propiedad paypalReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalReasonCode(String value) {
        this.paypalReasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad correlationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Define el valor de la propiedad correlationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

}

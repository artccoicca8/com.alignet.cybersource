
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalDoCaptureReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalDoCaptureReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="authorizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalReceiptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalTransactiontype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalOrderTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentGrossAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalFeeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalExchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPendingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalDoCaptureReply", propOrder = {
    "reasonCode",
    "authorizationId",
    "transactionId",
    "parentTransactionId",
    "paypalReceiptId",
    "paypalTransactiontype",
    "paypalPaymentType",
    "paypalOrderTime",
    "paypalPaymentGrossAmount",
    "paypalFeeAmount",
    "paypalTaxAmount",
    "paypalExchangeRate",
    "paypalPaymentStatus",
    "amount",
    "currency",
    "correlationID",
    "errorCode",
    "paypalPendingReason"
})
public class PayPalDoCaptureReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String authorizationId;
    protected String transactionId;
    protected String parentTransactionId;
    protected String paypalReceiptId;
    protected String paypalTransactiontype;
    protected String paypalPaymentType;
    protected String paypalOrderTime;
    protected String paypalPaymentGrossAmount;
    protected String paypalFeeAmount;
    protected String paypalTaxAmount;
    protected String paypalExchangeRate;
    protected String paypalPaymentStatus;
    protected String amount;
    protected String currency;
    protected String correlationID;
    protected String errorCode;
    protected String paypalPendingReason;

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
     * Obtiene el valor de la propiedad authorizationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationId() {
        return authorizationId;
    }

    /**
     * Define el valor de la propiedad authorizationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationId(String value) {
        this.authorizationId = value;
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
     * Obtiene el valor de la propiedad parentTransactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTransactionId() {
        return parentTransactionId;
    }

    /**
     * Define el valor de la propiedad parentTransactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTransactionId(String value) {
        this.parentTransactionId = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalReceiptId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalReceiptId() {
        return paypalReceiptId;
    }

    /**
     * Define el valor de la propiedad paypalReceiptId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalReceiptId(String value) {
        this.paypalReceiptId = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalTransactiontype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalTransactiontype() {
        return paypalTransactiontype;
    }

    /**
     * Define el valor de la propiedad paypalTransactiontype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalTransactiontype(String value) {
        this.paypalTransactiontype = value;
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
     * Obtiene el valor de la propiedad paypalPaymentGrossAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPaymentGrossAmount() {
        return paypalPaymentGrossAmount;
    }

    /**
     * Define el valor de la propiedad paypalPaymentGrossAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPaymentGrossAmount(String value) {
        this.paypalPaymentGrossAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalFeeAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalFeeAmount() {
        return paypalFeeAmount;
    }

    /**
     * Define el valor de la propiedad paypalFeeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalFeeAmount(String value) {
        this.paypalFeeAmount = value;
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

}

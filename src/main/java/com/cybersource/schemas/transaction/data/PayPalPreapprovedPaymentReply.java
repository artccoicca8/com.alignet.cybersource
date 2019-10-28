
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalPreapprovedPaymentReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalPreapprovedPaymentReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pendingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentGrossAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentSourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalPreapprovedPaymentReply", propOrder = {
    "reasonCode",
    "requestDateTime",
    "reconciliationID",
    "payerStatus",
    "payerName",
    "transactionType",
    "feeAmount",
    "payerCountry",
    "pendingReason",
    "paymentStatus",
    "mpStatus",
    "payer",
    "payerID",
    "payerBusiness",
    "transactionID",
    "desc",
    "mpMax",
    "paymentType",
    "paymentDate",
    "paymentGrossAmount",
    "settleAmount",
    "taxAmount",
    "exchangeRate",
    "paymentSourceID"
})
public class PayPalPreapprovedPaymentReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String requestDateTime;
    protected String reconciliationID;
    protected String payerStatus;
    protected String payerName;
    protected String transactionType;
    protected String feeAmount;
    protected String payerCountry;
    protected String pendingReason;
    protected String paymentStatus;
    protected String mpStatus;
    protected String payer;
    protected String payerID;
    protected String payerBusiness;
    protected String transactionID;
    protected String desc;
    protected String mpMax;
    protected String paymentType;
    protected String paymentDate;
    protected String paymentGrossAmount;
    protected String settleAmount;
    protected String taxAmount;
    protected String exchangeRate;
    protected String paymentSourceID;

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
     * Obtiene el valor de la propiedad requestDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDateTime() {
        return requestDateTime;
    }

    /**
     * Define el valor de la propiedad requestDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDateTime(String value) {
        this.requestDateTime = value;
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
     * Obtiene el valor de la propiedad payerStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerStatus() {
        return payerStatus;
    }

    /**
     * Define el valor de la propiedad payerStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerStatus(String value) {
        this.payerStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad payerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * Define el valor de la propiedad payerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerName(String value) {
        this.payerName = value;
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
     * Obtiene el valor de la propiedad feeAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeAmount() {
        return feeAmount;
    }

    /**
     * Define el valor de la propiedad feeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeAmount(String value) {
        this.feeAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad payerCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerCountry() {
        return payerCountry;
    }

    /**
     * Define el valor de la propiedad payerCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerCountry(String value) {
        this.payerCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad pendingReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingReason() {
        return pendingReason;
    }

    /**
     * Define el valor de la propiedad pendingReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingReason(String value) {
        this.pendingReason = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Define el valor de la propiedad paymentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad mpStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpStatus() {
        return mpStatus;
    }

    /**
     * Define el valor de la propiedad mpStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpStatus(String value) {
        this.mpStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad payer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Define el valor de la propiedad payer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
    }

    /**
     * Obtiene el valor de la propiedad payerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerID() {
        return payerID;
    }

    /**
     * Define el valor de la propiedad payerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerID(String value) {
        this.payerID = value;
    }

    /**
     * Obtiene el valor de la propiedad payerBusiness.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBusiness() {
        return payerBusiness;
    }

    /**
     * Define el valor de la propiedad payerBusiness.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBusiness(String value) {
        this.payerBusiness = value;
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
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Obtiene el valor de la propiedad mpMax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpMax() {
        return mpMax;
    }

    /**
     * Define el valor de la propiedad mpMax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpMax(String value) {
        this.mpMax = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Define el valor de la propiedad paymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Define el valor de la propiedad paymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentGrossAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentGrossAmount() {
        return paymentGrossAmount;
    }

    /**
     * Define el valor de la propiedad paymentGrossAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentGrossAmount(String value) {
        this.paymentGrossAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad settleAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleAmount() {
        return settleAmount;
    }

    /**
     * Define el valor de la propiedad settleAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleAmount(String value) {
        this.settleAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Define el valor de la propiedad exchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentSourceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSourceID() {
        return paymentSourceID;
    }

    /**
     * Define el valor de la propiedad paymentSourceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSourceID(String value) {
        this.paymentSourceID = value;
    }

}

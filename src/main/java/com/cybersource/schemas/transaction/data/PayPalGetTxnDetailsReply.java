
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalGetTxnDetailsReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalGetTxnDetailsReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="payer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerSalutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerMiddlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalReceiptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalTransactiontype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalOrderTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentGrossAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalFeeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalSettleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalExchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPendingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectionEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protectionEligibilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:schemas-cybersource-com:transaction-data-1.159}Item" maxOccurs="1000" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalGetTxnDetailsReply", propOrder = {
    "reasonCode",
    "payer",
    "payerId",
    "payerStatus",
    "payerCountry",
    "payerBusiness",
    "payerSalutation",
    "payerFirstname",
    "payerMiddlename",
    "payerLastname",
    "payerSuffix",
    "addressID",
    "addressStatus",
    "shipToName",
    "shipToAddress1",
    "shipToAddress2",
    "shipToCity",
    "shipToState",
    "shipToCountry",
    "shipToZip",
    "payerPhone",
    "transactionId",
    "parentTransactionId",
    "paypalReceiptId",
    "paypalTransactiontype",
    "paypalPaymentType",
    "paypalOrderTime",
    "paypalPaymentGrossAmount",
    "paypalFeeAmount",
    "currency",
    "paypalSettleAmount",
    "paypalTaxAmount",
    "paypalExchangeRate",
    "paypalPaymentStatus",
    "paypalPendingReason",
    "paypalReasonCode",
    "protectionEligibility",
    "protectionEligibilityType",
    "paypalNote",
    "invoiceNumber",
    "item",
    "errorCode"
})
public class PayPalGetTxnDetailsReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String payer;
    protected String payerId;
    protected String payerStatus;
    protected String payerCountry;
    protected String payerBusiness;
    protected String payerSalutation;
    protected String payerFirstname;
    protected String payerMiddlename;
    protected String payerLastname;
    protected String payerSuffix;
    protected String addressID;
    protected String addressStatus;
    protected String shipToName;
    protected String shipToAddress1;
    protected String shipToAddress2;
    protected String shipToCity;
    protected String shipToState;
    protected String shipToCountry;
    protected String shipToZip;
    protected String payerPhone;
    protected String transactionId;
    protected String parentTransactionId;
    protected String paypalReceiptId;
    protected String paypalTransactiontype;
    protected String paypalPaymentType;
    protected String paypalOrderTime;
    protected String paypalPaymentGrossAmount;
    protected String paypalFeeAmount;
    protected String currency;
    protected String paypalSettleAmount;
    protected String paypalTaxAmount;
    protected String paypalExchangeRate;
    protected String paypalPaymentStatus;
    protected String paypalPendingReason;
    protected String paypalReasonCode;
    protected String protectionEligibility;
    protected String protectionEligibilityType;
    protected String paypalNote;
    protected String invoiceNumber;
    protected List<Item> item;
    protected String errorCode;

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
     * Obtiene el valor de la propiedad payerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerId() {
        return payerId;
    }

    /**
     * Define el valor de la propiedad payerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerId(String value) {
        this.payerId = value;
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
     * Obtiene el valor de la propiedad payerSalutation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerSalutation() {
        return payerSalutation;
    }

    /**
     * Define el valor de la propiedad payerSalutation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerSalutation(String value) {
        this.payerSalutation = value;
    }

    /**
     * Obtiene el valor de la propiedad payerFirstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerFirstname() {
        return payerFirstname;
    }

    /**
     * Define el valor de la propiedad payerFirstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerFirstname(String value) {
        this.payerFirstname = value;
    }

    /**
     * Obtiene el valor de la propiedad payerMiddlename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerMiddlename() {
        return payerMiddlename;
    }

    /**
     * Define el valor de la propiedad payerMiddlename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerMiddlename(String value) {
        this.payerMiddlename = value;
    }

    /**
     * Obtiene el valor de la propiedad payerLastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerLastname() {
        return payerLastname;
    }

    /**
     * Define el valor de la propiedad payerLastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerLastname(String value) {
        this.payerLastname = value;
    }

    /**
     * Obtiene el valor de la propiedad payerSuffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerSuffix() {
        return payerSuffix;
    }

    /**
     * Define el valor de la propiedad payerSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerSuffix(String value) {
        this.payerSuffix = value;
    }

    /**
     * Obtiene el valor de la propiedad addressID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * Define el valor de la propiedad addressID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressID(String value) {
        this.addressID = value;
    }

    /**
     * Obtiene el valor de la propiedad addressStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStatus() {
        return addressStatus;
    }

    /**
     * Define el valor de la propiedad addressStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStatus(String value) {
        this.addressStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToName() {
        return shipToName;
    }

    /**
     * Define el valor de la propiedad shipToName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToName(String value) {
        this.shipToName = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress1() {
        return shipToAddress1;
    }

    /**
     * Define el valor de la propiedad shipToAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress1(String value) {
        this.shipToAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Define el valor de la propiedad shipToAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress2(String value) {
        this.shipToAddress2 = value;
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
     * Obtiene el valor de la propiedad shipToZip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZip() {
        return shipToZip;
    }

    /**
     * Define el valor de la propiedad shipToZip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZip(String value) {
        this.shipToZip = value;
    }

    /**
     * Obtiene el valor de la propiedad payerPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerPhone() {
        return payerPhone;
    }

    /**
     * Define el valor de la propiedad payerPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerPhone(String value) {
        this.payerPhone = value;
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
     * Obtiene el valor de la propiedad paypalSettleAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalSettleAmount() {
        return paypalSettleAmount;
    }

    /**
     * Define el valor de la propiedad paypalSettleAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalSettleAmount(String value) {
        this.paypalSettleAmount = value;
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
     * Obtiene el valor de la propiedad protectionEligibility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionEligibility() {
        return protectionEligibility;
    }

    /**
     * Define el valor de la propiedad protectionEligibility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionEligibility(String value) {
        this.protectionEligibility = value;
    }

    /**
     * Obtiene el valor de la propiedad protectionEligibilityType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionEligibilityType() {
        return protectionEligibilityType;
    }

    /**
     * Define el valor de la propiedad protectionEligibilityType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionEligibilityType(String value) {
        this.protectionEligibilityType = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalNote() {
        return paypalNote;
    }

    /**
     * Define el valor de la propiedad paypalNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalNote(String value) {
        this.paypalNote = value;
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
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
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

}


package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OCTReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OCTReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="paymentNetworkTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prepaidBalanceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prepaidBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorResponseSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCTReply", propOrder = {
    "reasonCode",
    "requestDateTime",
    "reconciliationID",
    "processorResponse",
    "approvalCode",
    "amount",
    "paymentNetworkTransactionID",
    "prepaidBalanceCurrency",
    "prepaidBalanceAmount",
    "processorResponseSource",
    "reconciliationIdType"
})
public class OCTReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String requestDateTime;
    protected String reconciliationID;
    protected String processorResponse;
    protected String approvalCode;
    protected String amount;
    protected String paymentNetworkTransactionID;
    protected String prepaidBalanceCurrency;
    protected String prepaidBalanceAmount;
    protected String processorResponseSource;
    protected String reconciliationIdType;

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
     * Obtiene el valor de la propiedad approvalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Define el valor de la propiedad approvalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
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
     * Obtiene el valor de la propiedad prepaidBalanceCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidBalanceCurrency() {
        return prepaidBalanceCurrency;
    }

    /**
     * Define el valor de la propiedad prepaidBalanceCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidBalanceCurrency(String value) {
        this.prepaidBalanceCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad prepaidBalanceAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidBalanceAmount() {
        return prepaidBalanceAmount;
    }

    /**
     * Define el valor de la propiedad prepaidBalanceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidBalanceAmount(String value) {
        this.prepaidBalanceAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad processorResponseSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorResponseSource() {
        return processorResponseSource;
    }

    /**
     * Define el valor de la propiedad processorResponseSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorResponseSource(String value) {
        this.processorResponseSource = value;
    }

    /**
     * Obtiene el valor de la propiedad reconciliationIdType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationIdType() {
        return reconciliationIdType;
    }

    /**
     * Define el valor de la propiedad reconciliationIdType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationIdType(String value) {
        this.reconciliationIdType = value;
    }

}

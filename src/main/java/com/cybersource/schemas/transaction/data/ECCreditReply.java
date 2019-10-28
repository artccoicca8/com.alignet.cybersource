
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ECCreditReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ECCreditReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="settlementMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="processorTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verificationCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correctedAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correctedRoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECCreditReply", propOrder = {
    "reasonCode",
    "settlementMethod",
    "requestDateTime",
    "amount",
    "processorTransactionID",
    "reconciliationID",
    "processorResponse",
    "verificationCode",
    "verificationCodeRaw",
    "correctedAccountNumber",
    "correctedRoutingNumber",
    "ownerMerchantID"
})
public class ECCreditReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String settlementMethod;
    protected String requestDateTime;
    protected String amount;
    protected String processorTransactionID;
    protected String reconciliationID;
    protected String processorResponse;
    protected String verificationCode;
    protected String verificationCodeRaw;
    protected String correctedAccountNumber;
    protected String correctedRoutingNumber;
    protected String ownerMerchantID;

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
     * Obtiene el valor de la propiedad settlementMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementMethod() {
        return settlementMethod;
    }

    /**
     * Define el valor de la propiedad settlementMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementMethod(String value) {
        this.settlementMethod = value;
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
     * Obtiene el valor de la propiedad verificationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * Define el valor de la propiedad verificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationCode(String value) {
        this.verificationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad verificationCodeRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationCodeRaw() {
        return verificationCodeRaw;
    }

    /**
     * Define el valor de la propiedad verificationCodeRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationCodeRaw(String value) {
        this.verificationCodeRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad correctedAccountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectedAccountNumber() {
        return correctedAccountNumber;
    }

    /**
     * Define el valor de la propiedad correctedAccountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectedAccountNumber(String value) {
        this.correctedAccountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad correctedRoutingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectedRoutingNumber() {
        return correctedRoutingNumber;
    }

    /**
     * Define el valor de la propiedad correctedRoutingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectedRoutingNumber(String value) {
        this.correctedRoutingNumber = value;
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

}

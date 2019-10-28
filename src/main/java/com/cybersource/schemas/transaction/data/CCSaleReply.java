
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCSaleReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCSaleReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavvResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavvResponseCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentNetworkTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalance" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="authorizedDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="requestAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCSaleReply", propOrder = {
    "reasonCode",
    "amount",
    "authorizationCode",
    "processorResponse",
    "avsCode",
    "avsCodeRaw",
    "cvCode",
    "cvCodeRaw",
    "cavvResponseCode",
    "cavvResponseCodeRaw",
    "cardGroup",
    "paymentNetworkTransactionID",
    "cardCategory",
    "accountBalance",
    "authorizedDateTime",
    "requestAmount",
    "reconciliationID",
    "accountBalanceCurrency",
    "accountBalanceSign",
    "cardReferenceData"
})
public class CCSaleReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String amount;
    protected String authorizationCode;
    protected String processorResponse;
    protected String avsCode;
    protected String avsCodeRaw;
    protected String cvCode;
    protected String cvCodeRaw;
    protected String cavvResponseCode;
    protected String cavvResponseCodeRaw;
    protected String cardGroup;
    protected String paymentNetworkTransactionID;
    protected String cardCategory;
    protected String accountBalance;
    protected String authorizedDateTime;
    protected String requestAmount;
    protected String reconciliationID;
    protected String accountBalanceCurrency;
    protected String accountBalanceSign;
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

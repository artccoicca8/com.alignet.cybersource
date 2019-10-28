
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HostedDataRetrieveReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HostedDataRetrieveReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="aggregatorMerchantIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIssueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardStartMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardStartYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostedDataRetrieveReply", propOrder = {
    "responseMessage",
    "reasonCode",
    "aggregatorMerchantIdentifier",
    "customerFirstName",
    "customerLastName",
    "customerID",
    "paymentMethod",
    "billToStreet1",
    "billToStreet2",
    "billToEmail",
    "billToState",
    "billToFirstName",
    "billToLastName",
    "billToCity",
    "billToCountry",
    "billToPostalCode",
    "cardAccountNumber",
    "cardType",
    "cardExpirationMonth",
    "cardExpirationYear",
    "cardIssueNumber",
    "cardStartMonth",
    "cardStartYear"
})
public class HostedDataRetrieveReply {

    protected String responseMessage;
    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String aggregatorMerchantIdentifier;
    protected String customerFirstName;
    protected String customerLastName;
    protected String customerID;
    protected String paymentMethod;
    protected String billToStreet1;
    protected String billToStreet2;
    protected String billToEmail;
    protected String billToState;
    protected String billToFirstName;
    protected String billToLastName;
    protected String billToCity;
    protected String billToCountry;
    protected String billToPostalCode;
    protected String cardAccountNumber;
    protected String cardType;
    protected String cardExpirationMonth;
    protected String cardExpirationYear;
    protected String cardIssueNumber;
    protected String cardStartMonth;
    protected String cardStartYear;

    /**
     * Obtiene el valor de la propiedad responseMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Define el valor de la propiedad responseMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

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
     * Obtiene el valor de la propiedad aggregatorMerchantIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorMerchantIdentifier() {
        return aggregatorMerchantIdentifier;
    }

    /**
     * Define el valor de la propiedad aggregatorMerchantIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorMerchantIdentifier(String value) {
        this.aggregatorMerchantIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad customerFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Define el valor de la propiedad customerFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstName(String value) {
        this.customerFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Define el valor de la propiedad customerLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastName(String value) {
        this.customerLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define el valor de la propiedad paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad billToStreet1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToStreet1() {
        return billToStreet1;
    }

    /**
     * Define el valor de la propiedad billToStreet1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToStreet1(String value) {
        this.billToStreet1 = value;
    }

    /**
     * Obtiene el valor de la propiedad billToStreet2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToStreet2() {
        return billToStreet2;
    }

    /**
     * Define el valor de la propiedad billToStreet2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToStreet2(String value) {
        this.billToStreet2 = value;
    }

    /**
     * Obtiene el valor de la propiedad billToEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToEmail() {
        return billToEmail;
    }

    /**
     * Define el valor de la propiedad billToEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToEmail(String value) {
        this.billToEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad billToState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToState() {
        return billToState;
    }

    /**
     * Define el valor de la propiedad billToState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToState(String value) {
        this.billToState = value;
    }

    /**
     * Obtiene el valor de la propiedad billToFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToFirstName() {
        return billToFirstName;
    }

    /**
     * Define el valor de la propiedad billToFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToFirstName(String value) {
        this.billToFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad billToLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToLastName() {
        return billToLastName;
    }

    /**
     * Define el valor de la propiedad billToLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToLastName(String value) {
        this.billToLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad billToCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCity() {
        return billToCity;
    }

    /**
     * Define el valor de la propiedad billToCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCity(String value) {
        this.billToCity = value;
    }

    /**
     * Obtiene el valor de la propiedad billToCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCountry() {
        return billToCountry;
    }

    /**
     * Define el valor de la propiedad billToCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCountry(String value) {
        this.billToCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad billToPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToPostalCode() {
        return billToPostalCode;
    }

    /**
     * Define el valor de la propiedad billToPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToPostalCode(String value) {
        this.billToPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAccountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountNumber() {
        return cardAccountNumber;
    }

    /**
     * Define el valor de la propiedad cardAccountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountNumber(String value) {
        this.cardAccountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad cardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Define el valor de la propiedad cardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Obtiene el valor de la propiedad cardExpirationMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationMonth() {
        return cardExpirationMonth;
    }

    /**
     * Define el valor de la propiedad cardExpirationMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationMonth(String value) {
        this.cardExpirationMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad cardExpirationYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationYear() {
        return cardExpirationYear;
    }

    /**
     * Define el valor de la propiedad cardExpirationYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationYear(String value) {
        this.cardExpirationYear = value;
    }

    /**
     * Obtiene el valor de la propiedad cardIssueNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssueNumber() {
        return cardIssueNumber;
    }

    /**
     * Define el valor de la propiedad cardIssueNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssueNumber(String value) {
        this.cardIssueNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad cardStartMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStartMonth() {
        return cardStartMonth;
    }

    /**
     * Define el valor de la propiedad cardStartMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStartMonth(String value) {
        this.cardStartMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad cardStartYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStartYear() {
        return cardStartYear;
    }

    /**
     * Define el valor de la propiedad cardStartYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStartYear(String value) {
        this.cardStartYear = value;
    }

}

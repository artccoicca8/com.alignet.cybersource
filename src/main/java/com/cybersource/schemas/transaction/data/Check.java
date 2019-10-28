
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Check complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Check">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountEncoderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkTransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Check", propOrder = {
    "fullName",
    "accountNumber",
    "accountType",
    "bankTransitNumber",
    "checkNumber",
    "secCode",
    "accountEncoderID",
    "authenticateID",
    "paymentInfo",
    "imageReferenceNumber",
    "terminalCity",
    "terminalState",
    "customerPresent",
    "checkTransactionCode"
})
public class Check {

    protected String fullName;
    protected String accountNumber;
    protected String accountType;
    protected String bankTransitNumber;
    protected String checkNumber;
    protected String secCode;
    protected String accountEncoderID;
    protected String authenticateID;
    protected String paymentInfo;
    protected String imageReferenceNumber;
    protected String terminalCity;
    protected String terminalState;
    protected String customerPresent;
    protected String checkTransactionCode;

    /**
     * Obtiene el valor de la propiedad fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Define el valor de la propiedad fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Obtiene el valor de la propiedad accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el valor de la propiedad accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad accountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Define el valor de la propiedad accountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Obtiene el valor de la propiedad bankTransitNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransitNumber() {
        return bankTransitNumber;
    }

    /**
     * Define el valor de la propiedad bankTransitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransitNumber(String value) {
        this.bankTransitNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad checkNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Define el valor de la propiedad checkNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad secCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecCode() {
        return secCode;
    }

    /**
     * Define el valor de la propiedad secCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecCode(String value) {
        this.secCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accountEncoderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountEncoderID() {
        return accountEncoderID;
    }

    /**
     * Define el valor de la propiedad accountEncoderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountEncoderID(String value) {
        this.accountEncoderID = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticateID() {
        return authenticateID;
    }

    /**
     * Define el valor de la propiedad authenticateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticateID(String value) {
        this.authenticateID = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Define el valor de la propiedad paymentInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInfo(String value) {
        this.paymentInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad imageReferenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageReferenceNumber() {
        return imageReferenceNumber;
    }

    /**
     * Define el valor de la propiedad imageReferenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageReferenceNumber(String value) {
        this.imageReferenceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCity() {
        return terminalCity;
    }

    /**
     * Define el valor de la propiedad terminalCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCity(String value) {
        this.terminalCity = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalState() {
        return terminalState;
    }

    /**
     * Define el valor de la propiedad terminalState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalState(String value) {
        this.terminalState = value;
    }

    /**
     * Obtiene el valor de la propiedad customerPresent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPresent() {
        return customerPresent;
    }

    /**
     * Define el valor de la propiedad customerPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPresent(String value) {
        this.customerPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad checkTransactionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckTransactionCode() {
        return checkTransactionCode;
    }

    /**
     * Define el valor de la propiedad checkTransactionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckTransactionCode(String value) {
        this.checkTransactionCode = value;
    }

}

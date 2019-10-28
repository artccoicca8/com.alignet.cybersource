
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para APInitiateService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="APInitiateService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="escrowAgreement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failureURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "APInitiateService", propOrder = {
    "returnURL",
    "productName",
    "productDescription",
    "reconciliationID",
    "bankID",
    "countryCode",
    "escrowAgreement",
    "languageInterface",
    "intent",
    "successURL",
    "cancelURL",
    "failureURL",
    "overridePaymentMethod"
})
public class APInitiateService {

    protected String returnURL;
    protected String productName;
    protected String productDescription;
    protected String reconciliationID;
    protected String bankID;
    protected String countryCode;
    protected String escrowAgreement;
    protected String languageInterface;
    protected String intent;
    protected String successURL;
    protected String cancelURL;
    protected String failureURL;
    protected String overridePaymentMethod;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad returnURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Define el valor de la propiedad returnURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Obtiene el valor de la propiedad productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define el valor de la propiedad productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Obtiene el valor de la propiedad productDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Define el valor de la propiedad productDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
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
     * Obtiene el valor de la propiedad bankID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * Define el valor de la propiedad bankID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad escrowAgreement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscrowAgreement() {
        return escrowAgreement;
    }

    /**
     * Define el valor de la propiedad escrowAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscrowAgreement(String value) {
        this.escrowAgreement = value;
    }

    /**
     * Obtiene el valor de la propiedad languageInterface.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageInterface() {
        return languageInterface;
    }

    /**
     * Define el valor de la propiedad languageInterface.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageInterface(String value) {
        this.languageInterface = value;
    }

    /**
     * Obtiene el valor de la propiedad intent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntent() {
        return intent;
    }

    /**
     * Define el valor de la propiedad intent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntent(String value) {
        this.intent = value;
    }

    /**
     * Obtiene el valor de la propiedad successURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessURL() {
        return successURL;
    }

    /**
     * Define el valor de la propiedad successURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessURL(String value) {
        this.successURL = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelURL() {
        return cancelURL;
    }

    /**
     * Define el valor de la propiedad cancelURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelURL(String value) {
        this.cancelURL = value;
    }

    /**
     * Obtiene el valor de la propiedad failureURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureURL() {
        return failureURL;
    }

    /**
     * Define el valor de la propiedad failureURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureURL(String value) {
        this.failureURL = value;
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

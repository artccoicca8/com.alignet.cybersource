
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChinaPaymentReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChinaPaymentReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verifyFailure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verifyInProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verifySuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChinaPaymentReply", propOrder = {
    "reasonCode",
    "requestDateTime",
    "amount",
    "currency",
    "reconciliationID",
    "formData",
    "verifyFailure",
    "verifyInProcess",
    "verifySuccess"
})
public class ChinaPaymentReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String requestDateTime;
    protected String amount;
    protected String currency;
    protected String reconciliationID;
    protected String formData;
    protected String verifyFailure;
    protected String verifyInProcess;
    protected String verifySuccess;

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
     * Obtiene el valor de la propiedad formData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormData() {
        return formData;
    }

    /**
     * Define el valor de la propiedad formData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormData(String value) {
        this.formData = value;
    }

    /**
     * Obtiene el valor de la propiedad verifyFailure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyFailure() {
        return verifyFailure;
    }

    /**
     * Define el valor de la propiedad verifyFailure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyFailure(String value) {
        this.verifyFailure = value;
    }

    /**
     * Obtiene el valor de la propiedad verifyInProcess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyInProcess() {
        return verifyInProcess;
    }

    /**
     * Define el valor de la propiedad verifyInProcess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyInProcess(String value) {
        this.verifyInProcess = value;
    }

    /**
     * Obtiene el valor de la propiedad verifySuccess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifySuccess() {
        return verifySuccess;
    }

    /**
     * Define el valor de la propiedad verifySuccess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifySuccess(String value) {
        this.verifySuccess = value;
    }

}

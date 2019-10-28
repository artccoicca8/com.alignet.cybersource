
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para APSaleService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="APSaleService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancelURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failureURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCollect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preapprovalToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "APSaleService", propOrder = {
    "cancelURL",
    "successURL",
    "failureURL",
    "reconciliationID",
    "overridePaymentMethod",
    "paymentOptionID",
    "transactionTimeout",
    "orderRequestID",
    "billingAgreementID",
    "mandateID",
    "dateCollect",
    "preapprovalToken"
})
public class APSaleService {

    protected String cancelURL;
    protected String successURL;
    protected String failureURL;
    protected String reconciliationID;
    protected String overridePaymentMethod;
    protected String paymentOptionID;
    protected String transactionTimeout;
    protected String orderRequestID;
    protected String billingAgreementID;
    protected String mandateID;
    protected String dateCollect;
    protected String preapprovalToken;
    @XmlAttribute(name = "run", required = true)
    protected String run;

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
     * Obtiene el valor de la propiedad paymentOptionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOptionID() {
        return paymentOptionID;
    }

    /**
     * Define el valor de la propiedad paymentOptionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOptionID(String value) {
        this.paymentOptionID = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionTimeout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTimeout() {
        return transactionTimeout;
    }

    /**
     * Define el valor de la propiedad transactionTimeout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTimeout(String value) {
        this.transactionTimeout = value;
    }

    /**
     * Obtiene el valor de la propiedad orderRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRequestID() {
        return orderRequestID;
    }

    /**
     * Define el valor de la propiedad orderRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRequestID(String value) {
        this.orderRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad billingAgreementID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAgreementID() {
        return billingAgreementID;
    }

    /**
     * Define el valor de la propiedad billingAgreementID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAgreementID(String value) {
        this.billingAgreementID = value;
    }

    /**
     * Obtiene el valor de la propiedad mandateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateID() {
        return mandateID;
    }

    /**
     * Define el valor de la propiedad mandateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateID(String value) {
        this.mandateID = value;
    }

    /**
     * Obtiene el valor de la propiedad dateCollect.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCollect() {
        return dateCollect;
    }

    /**
     * Define el valor de la propiedad dateCollect.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCollect(String value) {
        this.dateCollect = value;
    }

    /**
     * Obtiene el valor de la propiedad preapprovalToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreapprovalToken() {
        return preapprovalToken;
    }

    /**
     * Define el valor de la propiedad preapprovalToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreapprovalToken(String value) {
        this.preapprovalToken = value;
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

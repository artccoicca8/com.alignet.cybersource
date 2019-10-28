
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DirectDebitService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateCollect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directDebitText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directDebitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validateRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validateRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandateAuthenticationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DirectDebitService", propOrder = {
    "dateCollect",
    "directDebitText",
    "authorizationID",
    "transactionType",
    "directDebitType",
    "validateRequestID",
    "recurringType",
    "mandateID",
    "validateRequestToken",
    "reconciliationID",
    "mandateAuthenticationDate"
})
public class DirectDebitService {

    protected String dateCollect;
    protected String directDebitText;
    protected String authorizationID;
    protected String transactionType;
    protected String directDebitType;
    protected String validateRequestID;
    protected String recurringType;
    protected String mandateID;
    protected String validateRequestToken;
    protected String reconciliationID;
    protected String mandateAuthenticationDate;
    @XmlAttribute(name = "run", required = true)
    protected String run;

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
     * Obtiene el valor de la propiedad directDebitText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectDebitText() {
        return directDebitText;
    }

    /**
     * Define el valor de la propiedad directDebitText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectDebitText(String value) {
        this.directDebitText = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationID() {
        return authorizationID;
    }

    /**
     * Define el valor de la propiedad authorizationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationID(String value) {
        this.authorizationID = value;
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
     * Obtiene el valor de la propiedad directDebitType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectDebitType() {
        return directDebitType;
    }

    /**
     * Define el valor de la propiedad directDebitType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectDebitType(String value) {
        this.directDebitType = value;
    }

    /**
     * Obtiene el valor de la propiedad validateRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateRequestID() {
        return validateRequestID;
    }

    /**
     * Define el valor de la propiedad validateRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateRequestID(String value) {
        this.validateRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad recurringType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringType() {
        return recurringType;
    }

    /**
     * Define el valor de la propiedad recurringType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringType(String value) {
        this.recurringType = value;
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
     * Obtiene el valor de la propiedad validateRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateRequestToken() {
        return validateRequestToken;
    }

    /**
     * Define el valor de la propiedad validateRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateRequestToken(String value) {
        this.validateRequestToken = value;
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
     * Obtiene el valor de la propiedad mandateAuthenticationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateAuthenticationDate() {
        return mandateAuthenticationDate;
    }

    /**
     * Define el valor de la propiedad mandateAuthenticationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateAuthenticationDate(String value) {
        this.mandateAuthenticationDate = value;
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

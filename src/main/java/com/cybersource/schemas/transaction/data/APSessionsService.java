
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para APSessionsService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="APSessionsService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancelURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failureURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionsRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "APSessionsService", propOrder = {
    "cancelURL",
    "successURL",
    "failureURL",
    "reconciliationID",
    "overridePaymentMethod",
    "paymentOptionID",
    "sessionsType",
    "sessionsRequestID"
})
public class APSessionsService {

    protected String cancelURL;
    protected String successURL;
    protected String failureURL;
    protected String reconciliationID;
    protected String overridePaymentMethod;
    protected String paymentOptionID;
    protected String sessionsType;
    protected String sessionsRequestID;
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
     * Obtiene el valor de la propiedad sessionsType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionsType() {
        return sessionsType;
    }

    /**
     * Define el valor de la propiedad sessionsType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionsType(String value) {
        this.sessionsType = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionsRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionsRequestID() {
        return sessionsRequestID;
    }

    /**
     * Define el valor de la propiedad sessionsRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionsRequestID(String value) {
        this.sessionsRequestID = value;
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

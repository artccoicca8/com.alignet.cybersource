
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DirectDebitRefundService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitRefundService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directDebitRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directDebitRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directDebitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DirectDebitRefundService", propOrder = {
    "directDebitRequestID",
    "reconciliationID",
    "directDebitRequestToken",
    "directDebitType",
    "recurringType",
    "mandateID",
    "mandateAuthenticationDate"
})
public class DirectDebitRefundService {

    protected String directDebitRequestID;
    protected String reconciliationID;
    protected String directDebitRequestToken;
    protected String directDebitType;
    protected String recurringType;
    protected String mandateID;
    protected String mandateAuthenticationDate;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad directDebitRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectDebitRequestID() {
        return directDebitRequestID;
    }

    /**
     * Define el valor de la propiedad directDebitRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectDebitRequestID(String value) {
        this.directDebitRequestID = value;
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
     * Obtiene el valor de la propiedad directDebitRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectDebitRequestToken() {
        return directDebitRequestToken;
    }

    /**
     * Define el valor de la propiedad directDebitRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectDebitRequestToken(String value) {
        this.directDebitRequestToken = value;
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

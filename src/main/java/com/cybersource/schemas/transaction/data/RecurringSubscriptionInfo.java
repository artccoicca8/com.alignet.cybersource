
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RecurringSubscriptionInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RecurringSubscriptionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="numberOfPayments" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="numberOfPaymentsToAdd" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="automaticRenew" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalRequired" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="event" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionEvent" minOccurs="0"/>
 *         &lt;element name="billPayment" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringSubscriptionInfo", propOrder = {
    "subscriptionID",
    "status",
    "amount",
    "numberOfPayments",
    "numberOfPaymentsToAdd",
    "automaticRenew",
    "frequency",
    "startDate",
    "endDate",
    "approvalRequired",
    "event",
    "billPayment"
})
public class RecurringSubscriptionInfo {

    protected String subscriptionID;
    protected String status;
    protected String amount;
    protected BigInteger numberOfPayments;
    protected BigInteger numberOfPaymentsToAdd;
    protected String automaticRenew;
    protected String frequency;
    protected String startDate;
    protected String endDate;
    protected String approvalRequired;
    protected PaySubscriptionEvent event;
    protected String billPayment;

    /**
     * Obtiene el valor de la propiedad subscriptionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Define el valor de la propiedad subscriptionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionID(String value) {
        this.subscriptionID = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Obtiene el valor de la propiedad numberOfPayments.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
     * Define el valor de la propiedad numberOfPayments.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPayments(BigInteger value) {
        this.numberOfPayments = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfPaymentsToAdd.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPaymentsToAdd() {
        return numberOfPaymentsToAdd;
    }

    /**
     * Define el valor de la propiedad numberOfPaymentsToAdd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPaymentsToAdd(BigInteger value) {
        this.numberOfPaymentsToAdd = value;
    }

    /**
     * Obtiene el valor de la propiedad automaticRenew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticRenew() {
        return automaticRenew;
    }

    /**
     * Define el valor de la propiedad automaticRenew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticRenew(String value) {
        this.automaticRenew = value;
    }

    /**
     * Obtiene el valor de la propiedad frequency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Define el valor de la propiedad frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad approvalRequired.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalRequired() {
        return approvalRequired;
    }

    /**
     * Define el valor de la propiedad approvalRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalRequired(String value) {
        this.approvalRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad event.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionEvent }
     *     
     */
    public PaySubscriptionEvent getEvent() {
        return event;
    }

    /**
     * Define el valor de la propiedad event.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionEvent }
     *     
     */
    public void setEvent(PaySubscriptionEvent value) {
        this.event = value;
    }

    /**
     * Obtiene el valor de la propiedad billPayment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPayment() {
        return billPayment;
    }

    /**
     * Define el valor de la propiedad billPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPayment(String value) {
        this.billPayment = value;
    }

}


package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalPreapprovedUpdateReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalPreapprovedUpdateReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentSourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalPreapprovedUpdateReply", propOrder = {
    "reasonCode",
    "requestDateTime",
    "reconciliationID",
    "payerStatus",
    "payerName",
    "payerCountry",
    "mpStatus",
    "payer",
    "payerID",
    "payerBusiness",
    "desc",
    "mpMax",
    "paymentSourceID"
})
public class PayPalPreapprovedUpdateReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String requestDateTime;
    protected String reconciliationID;
    protected String payerStatus;
    protected String payerName;
    protected String payerCountry;
    protected String mpStatus;
    protected String payer;
    protected String payerID;
    protected String payerBusiness;
    protected String desc;
    protected String mpMax;
    protected String paymentSourceID;

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
     * Obtiene el valor de la propiedad payerStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerStatus() {
        return payerStatus;
    }

    /**
     * Define el valor de la propiedad payerStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerStatus(String value) {
        this.payerStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad payerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * Define el valor de la propiedad payerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerName(String value) {
        this.payerName = value;
    }

    /**
     * Obtiene el valor de la propiedad payerCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerCountry() {
        return payerCountry;
    }

    /**
     * Define el valor de la propiedad payerCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerCountry(String value) {
        this.payerCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad mpStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpStatus() {
        return mpStatus;
    }

    /**
     * Define el valor de la propiedad mpStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpStatus(String value) {
        this.mpStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad payer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Define el valor de la propiedad payer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
    }

    /**
     * Obtiene el valor de la propiedad payerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerID() {
        return payerID;
    }

    /**
     * Define el valor de la propiedad payerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerID(String value) {
        this.payerID = value;
    }

    /**
     * Obtiene el valor de la propiedad payerBusiness.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBusiness() {
        return payerBusiness;
    }

    /**
     * Define el valor de la propiedad payerBusiness.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBusiness(String value) {
        this.payerBusiness = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Obtiene el valor de la propiedad mpMax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpMax() {
        return mpMax;
    }

    /**
     * Define el valor de la propiedad mpMax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpMax(String value) {
        this.mpMax = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentSourceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSourceID() {
        return paymentSourceID;
    }

    /**
     * Define el valor de la propiedad paymentSourceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSourceID(String value) {
        this.paymentSourceID = value;
    }

}

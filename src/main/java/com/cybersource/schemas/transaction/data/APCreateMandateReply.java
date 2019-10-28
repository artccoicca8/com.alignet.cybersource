
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para APCreateMandateReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="APCreateMandateReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="mandateID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="merchantURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riskScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encodedHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encodedPopupHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="dateSigned" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APCreateMandateReply", propOrder = {
    "reasonCode",
    "mandateID",
    "status",
    "merchantURL",
    "responseCode",
    "processorTransactionID",
    "riskScore",
    "encodedHTML",
    "encodedPopupHTML",
    "dateTime",
    "dateSigned",
    "dateCreated"
})
public class APCreateMandateReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    @XmlElement(required = true)
    protected String mandateID;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String merchantURL;
    protected String responseCode;
    protected String processorTransactionID;
    protected String riskScore;
    protected String encodedHTML;
    protected String encodedPopupHTML;
    protected String dateTime;
    protected String dateSigned;
    protected String dateCreated;

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
     * Obtiene el valor de la propiedad merchantURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantURL() {
        return merchantURL;
    }

    /**
     * Define el valor de la propiedad merchantURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantURL(String value) {
        this.merchantURL = value;
    }

    /**
     * Obtiene el valor de la propiedad responseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Define el valor de la propiedad responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad processorTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorTransactionID() {
        return processorTransactionID;
    }

    /**
     * Define el valor de la propiedad processorTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorTransactionID(String value) {
        this.processorTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad riskScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskScore() {
        return riskScore;
    }

    /**
     * Define el valor de la propiedad riskScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskScore(String value) {
        this.riskScore = value;
    }

    /**
     * Obtiene el valor de la propiedad encodedHTML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodedHTML() {
        return encodedHTML;
    }

    /**
     * Define el valor de la propiedad encodedHTML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodedHTML(String value) {
        this.encodedHTML = value;
    }

    /**
     * Obtiene el valor de la propiedad encodedPopupHTML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodedPopupHTML() {
        return encodedPopupHTML;
    }

    /**
     * Define el valor de la propiedad encodedPopupHTML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodedPopupHTML(String value) {
        this.encodedPopupHTML = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Define el valor de la propiedad dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad dateSigned.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSigned() {
        return dateSigned;
    }

    /**
     * Define el valor de la propiedad dateSigned.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSigned(String value) {
        this.dateSigned = value;
    }

    /**
     * Obtiene el valor de la propiedad dateCreated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * Define el valor de la propiedad dateCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCreated(String value) {
        this.dateCreated = value;
    }

}

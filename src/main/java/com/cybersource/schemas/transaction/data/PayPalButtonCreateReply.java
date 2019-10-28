
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalButtonCreateReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalButtonCreateReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="encryptedFormData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unencryptedFormData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buttonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalButtonCreateReply", propOrder = {
    "reasonCode",
    "encryptedFormData",
    "unencryptedFormData",
    "requestDateTime",
    "reconciliationID",
    "buttonType"
})
public class PayPalButtonCreateReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String encryptedFormData;
    protected String unencryptedFormData;
    protected String requestDateTime;
    protected String reconciliationID;
    protected String buttonType;

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
     * Obtiene el valor de la propiedad encryptedFormData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedFormData() {
        return encryptedFormData;
    }

    /**
     * Define el valor de la propiedad encryptedFormData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedFormData(String value) {
        this.encryptedFormData = value;
    }

    /**
     * Obtiene el valor de la propiedad unencryptedFormData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnencryptedFormData() {
        return unencryptedFormData;
    }

    /**
     * Define el valor de la propiedad unencryptedFormData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnencryptedFormData(String value) {
        this.unencryptedFormData = value;
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
     * Obtiene el valor de la propiedad buttonType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonType() {
        return buttonType;
    }

    /**
     * Define el valor de la propiedad buttonType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonType(String value) {
        this.buttonType = value;
    }

}

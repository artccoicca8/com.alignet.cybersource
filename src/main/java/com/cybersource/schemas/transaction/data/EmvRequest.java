
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EmvRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EmvRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="combinedTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aidAndDFname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fallback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fallbackCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmvRequest", propOrder = {
    "combinedTags",
    "cardSequenceNumber",
    "aidAndDFname",
    "fallback",
    "fallbackCondition"
})
public class EmvRequest {

    protected String combinedTags;
    protected String cardSequenceNumber;
    protected String aidAndDFname;
    protected String fallback;
    protected String fallbackCondition;

    /**
     * Obtiene el valor de la propiedad combinedTags.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombinedTags() {
        return combinedTags;
    }

    /**
     * Define el valor de la propiedad combinedTags.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinedTags(String value) {
        this.combinedTags = value;
    }

    /**
     * Obtiene el valor de la propiedad cardSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * Define el valor de la propiedad cardSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSequenceNumber(String value) {
        this.cardSequenceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad aidAndDFname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAidAndDFname() {
        return aidAndDFname;
    }

    /**
     * Define el valor de la propiedad aidAndDFname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAidAndDFname(String value) {
        this.aidAndDFname = value;
    }

    /**
     * Obtiene el valor de la propiedad fallback.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallback() {
        return fallback;
    }

    /**
     * Define el valor de la propiedad fallback.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallback(String value) {
        this.fallback = value;
    }

    /**
     * Obtiene el valor de la propiedad fallbackCondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackCondition() {
        return fallbackCondition;
    }

    /**
     * Define el valor de la propiedad fallbackCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackCondition(String value) {
        this.fallbackCondition = value;
    }

}

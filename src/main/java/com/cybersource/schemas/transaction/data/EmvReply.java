
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EmvReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EmvReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="combinedTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decryptedRequestTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chipValidationResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chipValidationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmvReply", propOrder = {
    "combinedTags",
    "decryptedRequestTags",
    "chipValidationResults",
    "chipValidationType"
})
public class EmvReply {

    protected String combinedTags;
    protected String decryptedRequestTags;
    protected String chipValidationResults;
    protected String chipValidationType;

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
     * Obtiene el valor de la propiedad decryptedRequestTags.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecryptedRequestTags() {
        return decryptedRequestTags;
    }

    /**
     * Define el valor de la propiedad decryptedRequestTags.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecryptedRequestTags(String value) {
        this.decryptedRequestTags = value;
    }

    /**
     * Obtiene el valor de la propiedad chipValidationResults.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipValidationResults() {
        return chipValidationResults;
    }

    /**
     * Define el valor de la propiedad chipValidationResults.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipValidationResults(String value) {
        this.chipValidationResults = value;
    }

    /**
     * Obtiene el valor de la propiedad chipValidationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipValidationType() {
        return chipValidationType;
    }

    /**
     * Define el valor de la propiedad chipValidationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipValidationType(String value) {
        this.chipValidationType = value;
    }

}

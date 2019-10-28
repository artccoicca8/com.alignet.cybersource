
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BusinessRules complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ignoreAVSResult" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="ignoreCVResult" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="ignoreDAVResult" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="ignoreExportResult" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="ignoreValidateResult" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="declineAVSFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreThreshold" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessRules", propOrder = {
    "ignoreAVSResult",
    "ignoreCVResult",
    "ignoreDAVResult",
    "ignoreExportResult",
    "ignoreValidateResult",
    "declineAVSFlags",
    "scoreThreshold"
})
public class BusinessRules {

    protected String ignoreAVSResult;
    protected String ignoreCVResult;
    protected String ignoreDAVResult;
    protected String ignoreExportResult;
    protected String ignoreValidateResult;
    protected String declineAVSFlags;
    protected BigInteger scoreThreshold;

    /**
     * Obtiene el valor de la propiedad ignoreAVSResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreAVSResult() {
        return ignoreAVSResult;
    }

    /**
     * Define el valor de la propiedad ignoreAVSResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreAVSResult(String value) {
        this.ignoreAVSResult = value;
    }

    /**
     * Obtiene el valor de la propiedad ignoreCVResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreCVResult() {
        return ignoreCVResult;
    }

    /**
     * Define el valor de la propiedad ignoreCVResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreCVResult(String value) {
        this.ignoreCVResult = value;
    }

    /**
     * Obtiene el valor de la propiedad ignoreDAVResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreDAVResult() {
        return ignoreDAVResult;
    }

    /**
     * Define el valor de la propiedad ignoreDAVResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreDAVResult(String value) {
        this.ignoreDAVResult = value;
    }

    /**
     * Obtiene el valor de la propiedad ignoreExportResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreExportResult() {
        return ignoreExportResult;
    }

    /**
     * Define el valor de la propiedad ignoreExportResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreExportResult(String value) {
        this.ignoreExportResult = value;
    }

    /**
     * Obtiene el valor de la propiedad ignoreValidateResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreValidateResult() {
        return ignoreValidateResult;
    }

    /**
     * Define el valor de la propiedad ignoreValidateResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreValidateResult(String value) {
        this.ignoreValidateResult = value;
    }

    /**
     * Obtiene el valor de la propiedad declineAVSFlags.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclineAVSFlags() {
        return declineAVSFlags;
    }

    /**
     * Define el valor de la propiedad declineAVSFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclineAVSFlags(String value) {
        this.declineAVSFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreThreshold.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScoreThreshold() {
        return scoreThreshold;
    }

    /**
     * Define el valor de la propiedad scoreThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScoreThreshold(BigInteger value) {
        this.scoreThreshold = value;
    }

}

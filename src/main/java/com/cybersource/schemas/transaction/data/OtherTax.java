
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OtherTax complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OtherTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vatTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="vatTaxRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="vatTaxAmountSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="alternateTaxIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="localTaxIndicator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="nationalTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="nationalTaxIndicator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTax", propOrder = {
    "vatTaxAmount",
    "vatTaxRate",
    "vatTaxAmountSign",
    "alternateTaxAmount",
    "alternateTaxIndicator",
    "alternateTaxID",
    "localTaxAmount",
    "localTaxIndicator",
    "nationalTaxAmount",
    "nationalTaxIndicator"
})
public class OtherTax {

    protected String vatTaxAmount;
    protected String vatTaxRate;
    protected String vatTaxAmountSign;
    protected String alternateTaxAmount;
    protected String alternateTaxIndicator;
    protected String alternateTaxID;
    protected String localTaxAmount;
    protected BigInteger localTaxIndicator;
    protected String nationalTaxAmount;
    protected BigInteger nationalTaxIndicator;

    /**
     * Obtiene el valor de la propiedad vatTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatTaxAmount() {
        return vatTaxAmount;
    }

    /**
     * Define el valor de la propiedad vatTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatTaxAmount(String value) {
        this.vatTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad vatTaxRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatTaxRate() {
        return vatTaxRate;
    }

    /**
     * Define el valor de la propiedad vatTaxRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatTaxRate(String value) {
        this.vatTaxRate = value;
    }

    /**
     * Obtiene el valor de la propiedad vatTaxAmountSign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatTaxAmountSign() {
        return vatTaxAmountSign;
    }

    /**
     * Define el valor de la propiedad vatTaxAmountSign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatTaxAmountSign(String value) {
        this.vatTaxAmountSign = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxAmount() {
        return alternateTaxAmount;
    }

    /**
     * Define el valor de la propiedad alternateTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxAmount(String value) {
        this.alternateTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateTaxIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxIndicator() {
        return alternateTaxIndicator;
    }

    /**
     * Define el valor de la propiedad alternateTaxIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxIndicator(String value) {
        this.alternateTaxIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateTaxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxID() {
        return alternateTaxID;
    }

    /**
     * Define el valor de la propiedad alternateTaxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxID(String value) {
        this.alternateTaxID = value;
    }

    /**
     * Obtiene el valor de la propiedad localTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTaxAmount() {
        return localTaxAmount;
    }

    /**
     * Define el valor de la propiedad localTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTaxAmount(String value) {
        this.localTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad localTaxIndicator.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalTaxIndicator() {
        return localTaxIndicator;
    }

    /**
     * Define el valor de la propiedad localTaxIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalTaxIndicator(BigInteger value) {
        this.localTaxIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalTaxAmount() {
        return nationalTaxAmount;
    }

    /**
     * Define el valor de la propiedad nationalTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalTaxAmount(String value) {
        this.nationalTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalTaxIndicator.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNationalTaxIndicator() {
        return nationalTaxIndicator;
    }

    /**
     * Define el valor de la propiedad nationalTaxIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNationalTaxIndicator(BigInteger value) {
        this.nationalTaxIndicator = value;
    }

}

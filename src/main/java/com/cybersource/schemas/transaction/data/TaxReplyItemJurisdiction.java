
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TaxReplyItemJurisdiction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxReplyItemJurisdiction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxable" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="rate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="jurisId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReplyItemJurisdiction", propOrder = {
    "country",
    "region",
    "type",
    "code",
    "taxable",
    "rate",
    "taxAmount",
    "name",
    "taxName"
})
public class TaxReplyItemJurisdiction {

    protected String country;
    protected String region;
    protected String type;
    protected String code;
    protected String taxable;
    protected String rate;
    protected String taxAmount;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String taxName;
    @XmlAttribute(name = "jurisId", required = true)
    protected BigInteger jurisId;

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad taxable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxable() {
        return taxable;
    }

    /**
     * Define el valor de la propiedad taxable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxable(String value) {
        this.taxable = value;
    }

    /**
     * Obtiene el valor de la propiedad rate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Define el valor de la propiedad rate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad taxName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * Define el valor de la propiedad taxName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    /**
     * Obtiene el valor de la propiedad jurisId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJurisId() {
        return jurisId;
    }

    /**
     * Define el valor de la propiedad jurisId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJurisId(BigInteger value) {
        this.jurisId = value;
    }

}

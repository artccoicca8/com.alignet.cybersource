
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TaxReplyItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxReplyItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxableAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="exemptAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="specialTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="cityTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="countyTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="districtTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="stateTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="countryTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="totalTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount"/>
 *         &lt;element name="jurisdiction" type="{urn:schemas-cybersource-com:transaction-data-1.159}TaxReplyItemJurisdiction" maxOccurs="1000" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReplyItem", propOrder = {
    "taxableAmount",
    "exemptAmount",
    "specialTaxAmount",
    "cityTaxAmount",
    "countyTaxAmount",
    "districtTaxAmount",
    "stateTaxAmount",
    "countryTaxAmount",
    "totalTaxAmount",
    "jurisdiction"
})
public class TaxReplyItem {

    protected String taxableAmount;
    protected String exemptAmount;
    protected String specialTaxAmount;
    protected String cityTaxAmount;
    protected String countyTaxAmount;
    protected String districtTaxAmount;
    protected String stateTaxAmount;
    protected String countryTaxAmount;
    @XmlElement(required = true)
    protected String totalTaxAmount;
    protected List<TaxReplyItemJurisdiction> jurisdiction;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;

    /**
     * Obtiene el valor de la propiedad taxableAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Define el valor de la propiedad taxableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxableAmount(String value) {
        this.taxableAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptAmount() {
        return exemptAmount;
    }

    /**
     * Define el valor de la propiedad exemptAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptAmount(String value) {
        this.exemptAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad specialTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTaxAmount() {
        return specialTaxAmount;
    }

    /**
     * Define el valor de la propiedad specialTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTaxAmount(String value) {
        this.specialTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad cityTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTaxAmount() {
        return cityTaxAmount;
    }

    /**
     * Define el valor de la propiedad cityTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTaxAmount(String value) {
        this.cityTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad countyTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyTaxAmount() {
        return countyTaxAmount;
    }

    /**
     * Define el valor de la propiedad countyTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyTaxAmount(String value) {
        this.countyTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad districtTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictTaxAmount() {
        return districtTaxAmount;
    }

    /**
     * Define el valor de la propiedad districtTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictTaxAmount(String value) {
        this.districtTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad stateTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateTaxAmount() {
        return stateTaxAmount;
    }

    /**
     * Define el valor de la propiedad stateTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateTaxAmount(String value) {
        this.stateTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad countryTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryTaxAmount() {
        return countryTaxAmount;
    }

    /**
     * Define el valor de la propiedad countryTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryTaxAmount(String value) {
        this.countryTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Define el valor de la propiedad totalTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTaxAmount(String value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReplyItemJurisdiction }
     * 
     * 
     */
    public List<TaxReplyItemJurisdiction> getJurisdiction() {
        if (jurisdiction == null) {
            jurisdiction = new ArrayList<TaxReplyItemJurisdiction>();
        }
        return this.jurisdiction;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}

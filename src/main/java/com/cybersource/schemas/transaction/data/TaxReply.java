
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TaxReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grandTotalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="totalTaxableAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="totalExemptAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="totalSpecialTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="totalCityTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCountyTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDistrictTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="totalStateTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCountryTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="totalTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="commitIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:schemas-cybersource-com:transaction-data-1.159}TaxReplyItem" maxOccurs="1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReply", propOrder = {
    "reasonCode",
    "currency",
    "grandTotalAmount",
    "totalTaxableAmount",
    "totalExemptAmount",
    "totalSpecialTaxAmount",
    "totalCityTaxAmount",
    "city",
    "totalCountyTaxAmount",
    "county",
    "totalDistrictTaxAmount",
    "totalStateTaxAmount",
    "state",
    "totalCountryTaxAmount",
    "totalTaxAmount",
    "commitIndicator",
    "refundIndicator",
    "postalCode",
    "geocode",
    "item"
})
public class TaxReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String currency;
    protected String grandTotalAmount;
    protected String totalTaxableAmount;
    protected String totalExemptAmount;
    protected String totalSpecialTaxAmount;
    protected String totalCityTaxAmount;
    protected String city;
    protected String totalCountyTaxAmount;
    protected String county;
    protected String totalDistrictTaxAmount;
    protected String totalStateTaxAmount;
    protected String state;
    protected String totalCountryTaxAmount;
    protected String totalTaxAmount;
    protected String commitIndicator;
    protected String refundIndicator;
    protected String postalCode;
    protected String geocode;
    protected List<TaxReplyItem> item;

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
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad grandTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * Define el valor de la propiedad grandTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandTotalAmount(String value) {
        this.grandTotalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTaxableAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTaxableAmount() {
        return totalTaxableAmount;
    }

    /**
     * Define el valor de la propiedad totalTaxableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTaxableAmount(String value) {
        this.totalTaxableAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalExemptAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalExemptAmount() {
        return totalExemptAmount;
    }

    /**
     * Define el valor de la propiedad totalExemptAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalExemptAmount(String value) {
        this.totalExemptAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSpecialTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalSpecialTaxAmount() {
        return totalSpecialTaxAmount;
    }

    /**
     * Define el valor de la propiedad totalSpecialTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalSpecialTaxAmount(String value) {
        this.totalSpecialTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCityTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCityTaxAmount() {
        return totalCityTaxAmount;
    }

    /**
     * Define el valor de la propiedad totalCityTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCityTaxAmount(String value) {
        this.totalCityTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCountyTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCountyTaxAmount() {
        return totalCountyTaxAmount;
    }

    /**
     * Define el valor de la propiedad totalCountyTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCountyTaxAmount(String value) {
        this.totalCountyTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad county.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Define el valor de la propiedad county.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDistrictTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDistrictTaxAmount() {
        return totalDistrictTaxAmount;
    }

    /**
     * Define el valor de la propiedad totalDistrictTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDistrictTaxAmount(String value) {
        this.totalDistrictTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalStateTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalStateTaxAmount() {
        return totalStateTaxAmount;
    }

    /**
     * Define el valor de la propiedad totalStateTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalStateTaxAmount(String value) {
        this.totalStateTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCountryTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCountryTaxAmount() {
        return totalCountryTaxAmount;
    }

    /**
     * Define el valor de la propiedad totalCountryTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCountryTaxAmount(String value) {
        this.totalCountryTaxAmount = value;
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
     * Obtiene el valor de la propiedad commitIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitIndicator() {
        return commitIndicator;
    }

    /**
     * Define el valor de la propiedad commitIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitIndicator(String value) {
        this.commitIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad refundIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundIndicator() {
        return refundIndicator;
    }

    /**
     * Define el valor de la propiedad refundIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundIndicator(String value) {
        this.refundIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define el valor de la propiedad postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad geocode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocode() {
        return geocode;
    }

    /**
     * Define el valor de la propiedad geocode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocode(String value) {
        this.geocode = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReplyItem }
     * 
     * 
     */
    public List<TaxReplyItem> getItem() {
        if (item == null) {
            item = new ArrayList<TaxReplyItem>();
        }
        return this.item;
    }

}

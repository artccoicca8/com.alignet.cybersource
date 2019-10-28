
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalEcGetDetailsReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalEcGetDetailsReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="paypalToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerSalutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerMiddlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalBillingAgreementAcceptedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:schemas-cybersource-com:transaction-data-1.159}Item" maxOccurs="1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalEcGetDetailsReply", propOrder = {
    "reasonCode",
    "paypalToken",
    "payer",
    "payerId",
    "payerStatus",
    "payerSalutation",
    "payerFirstname",
    "payerMiddlename",
    "payerLastname",
    "payerSuffix",
    "payerCountry",
    "payerBusiness",
    "shipToName",
    "shipToAddress1",
    "shipToAddress2",
    "shipToCity",
    "shipToState",
    "shipToCountry",
    "shipToZip",
    "addressStatus",
    "payerPhone",
    "avsCode",
    "street1",
    "street2",
    "city",
    "state",
    "postalCode",
    "countryCode",
    "countryName",
    "addressID",
    "errorCode",
    "correlationID",
    "paypalBillingAgreementAcceptedStatus",
    "paypalTaxAmount",
    "item"
})
public class PayPalEcGetDetailsReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String paypalToken;
    protected String payer;
    protected String payerId;
    protected String payerStatus;
    protected String payerSalutation;
    protected String payerFirstname;
    protected String payerMiddlename;
    protected String payerLastname;
    protected String payerSuffix;
    protected String payerCountry;
    protected String payerBusiness;
    protected String shipToName;
    protected String shipToAddress1;
    protected String shipToAddress2;
    protected String shipToCity;
    protected String shipToState;
    protected String shipToCountry;
    protected String shipToZip;
    protected String addressStatus;
    protected String payerPhone;
    protected String avsCode;
    protected String street1;
    protected String street2;
    protected String city;
    protected String state;
    protected String postalCode;
    protected String countryCode;
    protected String countryName;
    protected String addressID;
    protected String errorCode;
    protected String correlationID;
    protected String paypalBillingAgreementAcceptedStatus;
    protected String paypalTaxAmount;
    protected List<Item> item;

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
     * Obtiene el valor de la propiedad paypalToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalToken() {
        return paypalToken;
    }

    /**
     * Define el valor de la propiedad paypalToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalToken(String value) {
        this.paypalToken = value;
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
     * Obtiene el valor de la propiedad payerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerId() {
        return payerId;
    }

    /**
     * Define el valor de la propiedad payerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerId(String value) {
        this.payerId = value;
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
     * Obtiene el valor de la propiedad payerSalutation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerSalutation() {
        return payerSalutation;
    }

    /**
     * Define el valor de la propiedad payerSalutation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerSalutation(String value) {
        this.payerSalutation = value;
    }

    /**
     * Obtiene el valor de la propiedad payerFirstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerFirstname() {
        return payerFirstname;
    }

    /**
     * Define el valor de la propiedad payerFirstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerFirstname(String value) {
        this.payerFirstname = value;
    }

    /**
     * Obtiene el valor de la propiedad payerMiddlename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerMiddlename() {
        return payerMiddlename;
    }

    /**
     * Define el valor de la propiedad payerMiddlename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerMiddlename(String value) {
        this.payerMiddlename = value;
    }

    /**
     * Obtiene el valor de la propiedad payerLastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerLastname() {
        return payerLastname;
    }

    /**
     * Define el valor de la propiedad payerLastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerLastname(String value) {
        this.payerLastname = value;
    }

    /**
     * Obtiene el valor de la propiedad payerSuffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerSuffix() {
        return payerSuffix;
    }

    /**
     * Define el valor de la propiedad payerSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerSuffix(String value) {
        this.payerSuffix = value;
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
     * Obtiene el valor de la propiedad shipToName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToName() {
        return shipToName;
    }

    /**
     * Define el valor de la propiedad shipToName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToName(String value) {
        this.shipToName = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress1() {
        return shipToAddress1;
    }

    /**
     * Define el valor de la propiedad shipToAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress1(String value) {
        this.shipToAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Define el valor de la propiedad shipToAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress2(String value) {
        this.shipToAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Define el valor de la propiedad shipToCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Define el valor de la propiedad shipToState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Define el valor de la propiedad shipToCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountry(String value) {
        this.shipToCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToZip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZip() {
        return shipToZip;
    }

    /**
     * Define el valor de la propiedad shipToZip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZip(String value) {
        this.shipToZip = value;
    }

    /**
     * Obtiene el valor de la propiedad addressStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStatus() {
        return addressStatus;
    }

    /**
     * Define el valor de la propiedad addressStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStatus(String value) {
        this.addressStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad payerPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerPhone() {
        return payerPhone;
    }

    /**
     * Define el valor de la propiedad payerPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerPhone(String value) {
        this.payerPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad avsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCode() {
        return avsCode;
    }

    /**
     * Define el valor de la propiedad avsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCode(String value) {
        this.avsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad street1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Define el valor de la propiedad street1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Obtiene el valor de la propiedad street2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Define el valor de la propiedad street2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
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
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad countryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Define el valor de la propiedad countryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Obtiene el valor de la propiedad addressID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * Define el valor de la propiedad addressID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressID(String value) {
        this.addressID = value;
    }

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad correlationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Define el valor de la propiedad correlationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalBillingAgreementAcceptedStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementAcceptedStatus() {
        return paypalBillingAgreementAcceptedStatus;
    }

    /**
     * Define el valor de la propiedad paypalBillingAgreementAcceptedStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementAcceptedStatus(String value) {
        this.paypalBillingAgreementAcceptedStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalTaxAmount() {
        return paypalTaxAmount;
    }

    /**
     * Define el valor de la propiedad paypalTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalTaxAmount(String value) {
        this.paypalTaxAmount = value;
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
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

}

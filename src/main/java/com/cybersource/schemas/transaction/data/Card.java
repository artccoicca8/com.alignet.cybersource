
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Card complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Card">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="expirationYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cvIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountEncoderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encryptedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virtual" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level2Eligible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level3Eligible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crossBorderIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCurrencyNumericCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCurrencyMinorDigits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="octFastFundsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="octBlockIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onlineGamblingBlockIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prepaidReloadable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prepaidType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brands" type="{urn:schemas-cybersource-com:transaction-data-1.159}Brands" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Card", propOrder = {
    "fullName",
    "accountNumber",
    "expirationMonth",
    "expirationYear",
    "cvIndicator",
    "cvNumber",
    "cardType",
    "issueNumber",
    "startMonth",
    "startYear",
    "pin",
    "accountEncoderID",
    "bin",
    "encryptedData",
    "suffix",
    "virtual",
    "prefix",
    "cardTypeName",
    "cardSubType",
    "level2Eligible",
    "level3Eligible",
    "productCategory",
    "crossBorderIndicator",
    "billingCurrency",
    "billingCurrencyNumericCode",
    "billingCurrencyMinorDigits",
    "octFastFundsIndicator",
    "octBlockIndicator",
    "onlineGamblingBlockIndicator",
    "productName",
    "usage",
    "prepaidReloadable",
    "prepaidType",
    "brands"
})
public class Card {

    protected String fullName;
    protected String accountNumber;
    protected BigInteger expirationMonth;
    protected BigInteger expirationYear;
    protected String cvIndicator;
    protected String cvNumber;
    protected String cardType;
    protected String issueNumber;
    protected BigInteger startMonth;
    protected BigInteger startYear;
    protected String pin;
    protected String accountEncoderID;
    protected String bin;
    protected String encryptedData;
    protected String suffix;
    protected String virtual;
    protected String prefix;
    protected String cardTypeName;
    protected String cardSubType;
    protected String level2Eligible;
    protected String level3Eligible;
    protected String productCategory;
    protected String crossBorderIndicator;
    protected String billingCurrency;
    protected String billingCurrencyNumericCode;
    protected String billingCurrencyMinorDigits;
    protected String octFastFundsIndicator;
    protected String octBlockIndicator;
    protected String onlineGamblingBlockIndicator;
    protected String productName;
    protected String usage;
    protected String prepaidReloadable;
    protected String prepaidType;
    protected List<Brands> brands;

    /**
     * Obtiene el valor de la propiedad fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Define el valor de la propiedad fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Obtiene el valor de la propiedad accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el valor de la propiedad accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationMonth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Define el valor de la propiedad expirationMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpirationMonth(BigInteger value) {
        this.expirationMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationYear.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpirationYear() {
        return expirationYear;
    }

    /**
     * Define el valor de la propiedad expirationYear.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpirationYear(BigInteger value) {
        this.expirationYear = value;
    }

    /**
     * Obtiene el valor de la propiedad cvIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvIndicator() {
        return cvIndicator;
    }

    /**
     * Define el valor de la propiedad cvIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvIndicator(String value) {
        this.cvIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad cvNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvNumber() {
        return cvNumber;
    }

    /**
     * Define el valor de la propiedad cvNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvNumber(String value) {
        this.cvNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad cardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Define el valor de la propiedad cardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Obtiene el valor de la propiedad issueNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Define el valor de la propiedad issueNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad startMonth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartMonth() {
        return startMonth;
    }

    /**
     * Define el valor de la propiedad startMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartMonth(BigInteger value) {
        this.startMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad startYear.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartYear() {
        return startYear;
    }

    /**
     * Define el valor de la propiedad startYear.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartYear(BigInteger value) {
        this.startYear = value;
    }

    /**
     * Obtiene el valor de la propiedad pin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Define el valor de la propiedad pin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Obtiene el valor de la propiedad accountEncoderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountEncoderID() {
        return accountEncoderID;
    }

    /**
     * Define el valor de la propiedad accountEncoderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountEncoderID(String value) {
        this.accountEncoderID = value;
    }

    /**
     * Obtiene el valor de la propiedad bin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBin() {
        return bin;
    }

    /**
     * Define el valor de la propiedad bin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBin(String value) {
        this.bin = value;
    }

    /**
     * Obtiene el valor de la propiedad encryptedData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedData() {
        return encryptedData;
    }

    /**
     * Define el valor de la propiedad encryptedData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedData(String value) {
        this.encryptedData = value;
    }

    /**
     * Obtiene el valor de la propiedad suffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Define el valor de la propiedad suffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Obtiene el valor de la propiedad virtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtual() {
        return virtual;
    }

    /**
     * Define el valor de la propiedad virtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtual(String value) {
        this.virtual = value;
    }

    /**
     * Obtiene el valor de la propiedad prefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Define el valor de la propiedad prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Obtiene el valor de la propiedad cardTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeName() {
        return cardTypeName;
    }

    /**
     * Define el valor de la propiedad cardTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeName(String value) {
        this.cardTypeName = value;
    }

    /**
     * Obtiene el valor de la propiedad cardSubType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSubType() {
        return cardSubType;
    }

    /**
     * Define el valor de la propiedad cardSubType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSubType(String value) {
        this.cardSubType = value;
    }

    /**
     * Obtiene el valor de la propiedad level2Eligible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel2Eligible() {
        return level2Eligible;
    }

    /**
     * Define el valor de la propiedad level2Eligible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel2Eligible(String value) {
        this.level2Eligible = value;
    }

    /**
     * Obtiene el valor de la propiedad level3Eligible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel3Eligible() {
        return level3Eligible;
    }

    /**
     * Define el valor de la propiedad level3Eligible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel3Eligible(String value) {
        this.level3Eligible = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Define el valor de la propiedad productCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad crossBorderIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossBorderIndicator() {
        return crossBorderIndicator;
    }

    /**
     * Define el valor de la propiedad crossBorderIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossBorderIndicator(String value) {
        this.crossBorderIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad billingCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCurrency() {
        return billingCurrency;
    }

    /**
     * Define el valor de la propiedad billingCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCurrency(String value) {
        this.billingCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad billingCurrencyNumericCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCurrencyNumericCode() {
        return billingCurrencyNumericCode;
    }

    /**
     * Define el valor de la propiedad billingCurrencyNumericCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCurrencyNumericCode(String value) {
        this.billingCurrencyNumericCode = value;
    }

    /**
     * Obtiene el valor de la propiedad billingCurrencyMinorDigits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCurrencyMinorDigits() {
        return billingCurrencyMinorDigits;
    }

    /**
     * Define el valor de la propiedad billingCurrencyMinorDigits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCurrencyMinorDigits(String value) {
        this.billingCurrencyMinorDigits = value;
    }

    /**
     * Obtiene el valor de la propiedad octFastFundsIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctFastFundsIndicator() {
        return octFastFundsIndicator;
    }

    /**
     * Define el valor de la propiedad octFastFundsIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctFastFundsIndicator(String value) {
        this.octFastFundsIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad octBlockIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctBlockIndicator() {
        return octBlockIndicator;
    }

    /**
     * Define el valor de la propiedad octBlockIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctBlockIndicator(String value) {
        this.octBlockIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad onlineGamblingBlockIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineGamblingBlockIndicator() {
        return onlineGamblingBlockIndicator;
    }

    /**
     * Define el valor de la propiedad onlineGamblingBlockIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineGamblingBlockIndicator(String value) {
        this.onlineGamblingBlockIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define el valor de la propiedad productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Obtiene el valor de la propiedad usage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Define el valor de la propiedad usage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Obtiene el valor de la propiedad prepaidReloadable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidReloadable() {
        return prepaidReloadable;
    }

    /**
     * Define el valor de la propiedad prepaidReloadable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidReloadable(String value) {
        this.prepaidReloadable = value;
    }

    /**
     * Obtiene el valor de la propiedad prepaidType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidType() {
        return prepaidType;
    }

    /**
     * Define el valor de la propiedad prepaidType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidType(String value) {
        this.prepaidType = value;
    }

    /**
     * Gets the value of the brands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Brands }
     * 
     * 
     */
    public List<Brands> getBrands() {
        if (brands == null) {
            brands = new ArrayList<Brands>();
        }
        return this.brands;
    }

}


package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GiftCard complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GiftCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originalRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redemptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="escheatable" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionPostingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balanceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseCurrencyPreviousBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseCurrencyCurrentBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseCurrencyCashbackAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bonusAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCard", propOrder = {
    "originalRequestID",
    "redemptionType",
    "count",
    "escheatable",
    "groupID",
    "securityValue",
    "transactionPostingDate",
    "additionalAccountNumber",
    "promoCode",
    "balanceCurrency",
    "extendedAccountNumber",
    "previousBalance",
    "currentBalance",
    "baseCurrencyPreviousBalance",
    "baseCurrencyCurrentBalance",
    "baseCurrencyCashbackAmount",
    "baseCurrency",
    "expirationDate",
    "exchangeRate",
    "bonusAmount",
    "discountAmount"
})
public class GiftCard {

    protected String originalRequestID;
    protected String redemptionType;
    protected String count;
    protected String escheatable;
    protected String groupID;
    protected String securityValue;
    protected String transactionPostingDate;
    protected String additionalAccountNumber;
    protected String promoCode;
    protected String balanceCurrency;
    protected String extendedAccountNumber;
    protected String previousBalance;
    protected String currentBalance;
    protected String baseCurrencyPreviousBalance;
    protected String baseCurrencyCurrentBalance;
    protected String baseCurrencyCashbackAmount;
    protected String baseCurrency;
    protected String expirationDate;
    protected String exchangeRate;
    protected String bonusAmount;
    protected String discountAmount;

    /**
     * Obtiene el valor de la propiedad originalRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalRequestID() {
        return originalRequestID;
    }

    /**
     * Define el valor de la propiedad originalRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalRequestID(String value) {
        this.originalRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad redemptionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionType() {
        return redemptionType;
    }

    /**
     * Define el valor de la propiedad redemptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionType(String value) {
        this.redemptionType = value;
    }

    /**
     * Obtiene el valor de la propiedad count.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * Define el valor de la propiedad count.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * Obtiene el valor de la propiedad escheatable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscheatable() {
        return escheatable;
    }

    /**
     * Define el valor de la propiedad escheatable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscheatable(String value) {
        this.escheatable = value;
    }

    /**
     * Obtiene el valor de la propiedad groupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Define el valor de la propiedad groupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Obtiene el valor de la propiedad securityValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityValue() {
        return securityValue;
    }

    /**
     * Define el valor de la propiedad securityValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityValue(String value) {
        this.securityValue = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionPostingDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionPostingDate() {
        return transactionPostingDate;
    }

    /**
     * Define el valor de la propiedad transactionPostingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionPostingDate(String value) {
        this.transactionPostingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAccountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAccountNumber() {
        return additionalAccountNumber;
    }

    /**
     * Define el valor de la propiedad additionalAccountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAccountNumber(String value) {
        this.additionalAccountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad promoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Define el valor de la propiedad promoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceCurrency() {
        return balanceCurrency;
    }

    /**
     * Define el valor de la propiedad balanceCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceCurrency(String value) {
        this.balanceCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad extendedAccountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedAccountNumber() {
        return extendedAccountNumber;
    }

    /**
     * Define el valor de la propiedad extendedAccountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedAccountNumber(String value) {
        this.extendedAccountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad previousBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Define el valor de la propiedad previousBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousBalance(String value) {
        this.previousBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad currentBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Define el valor de la propiedad currentBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentBalance(String value) {
        this.currentBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad baseCurrencyPreviousBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyPreviousBalance() {
        return baseCurrencyPreviousBalance;
    }

    /**
     * Define el valor de la propiedad baseCurrencyPreviousBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyPreviousBalance(String value) {
        this.baseCurrencyPreviousBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad baseCurrencyCurrentBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyCurrentBalance() {
        return baseCurrencyCurrentBalance;
    }

    /**
     * Define el valor de la propiedad baseCurrencyCurrentBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyCurrentBalance(String value) {
        this.baseCurrencyCurrentBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad baseCurrencyCashbackAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyCashbackAmount() {
        return baseCurrencyCashbackAmount;
    }

    /**
     * Define el valor de la propiedad baseCurrencyCashbackAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyCashbackAmount(String value) {
        this.baseCurrencyCashbackAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad baseCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Define el valor de la propiedad baseCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrency(String value) {
        this.baseCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define el valor de la propiedad expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Define el valor de la propiedad exchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad bonusAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusAmount() {
        return bonusAmount;
    }

    /**
     * Define el valor de la propiedad bonusAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusAmount(String value) {
        this.bonusAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad discountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Define el valor de la propiedad discountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

}

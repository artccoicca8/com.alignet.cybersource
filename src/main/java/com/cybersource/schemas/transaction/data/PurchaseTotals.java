
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PurchaseTotals complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PurchaseTotals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="discountAmountSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="dutyAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="dutyAmountSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grandTotalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="freightAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="freightAmountSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="foreignCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="originalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="exchangeRateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmountType0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmount0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmountType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmountType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmountType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmount3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmountType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmount4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceFeeAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="subtotalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="shippingAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="handlingAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="shippingHandlingAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="shippingDiscountAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="giftWrapAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="insuranceAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseTotals", propOrder = {
    "currency",
    "discountAmount",
    "discountAmountSign",
    "discountManagementIndicator",
    "taxAmount",
    "dutyAmount",
    "dutyAmountSign",
    "grandTotalAmount",
    "freightAmount",
    "freightAmountSign",
    "foreignAmount",
    "foreignCurrency",
    "originalAmount",
    "originalCurrency",
    "exchangeRate",
    "exchangeRateTimeStamp",
    "additionalAmountType0",
    "additionalAmount0",
    "additionalAmountType1",
    "additionalAmount1",
    "additionalAmountType2",
    "additionalAmount2",
    "additionalAmountType3",
    "additionalAmount3",
    "additionalAmountType4",
    "additionalAmount4",
    "serviceFeeAmount",
    "subtotalAmount",
    "shippingAmount",
    "handlingAmount",
    "shippingHandlingAmount",
    "shippingDiscountAmount",
    "giftWrapAmount",
    "insuranceAmount"
})
public class PurchaseTotals {

    protected String currency;
    protected String discountAmount;
    protected String discountAmountSign;
    protected String discountManagementIndicator;
    protected String taxAmount;
    protected String dutyAmount;
    protected String dutyAmountSign;
    protected String grandTotalAmount;
    protected String freightAmount;
    protected String freightAmountSign;
    protected String foreignAmount;
    protected String foreignCurrency;
    protected String originalAmount;
    protected String originalCurrency;
    protected String exchangeRate;
    protected String exchangeRateTimeStamp;
    protected String additionalAmountType0;
    protected String additionalAmount0;
    protected String additionalAmountType1;
    protected String additionalAmount1;
    protected String additionalAmountType2;
    protected String additionalAmount2;
    protected String additionalAmountType3;
    protected String additionalAmount3;
    protected String additionalAmountType4;
    protected String additionalAmount4;
    protected String serviceFeeAmount;
    protected String subtotalAmount;
    protected String shippingAmount;
    protected String handlingAmount;
    protected String shippingHandlingAmount;
    protected String shippingDiscountAmount;
    protected String giftWrapAmount;
    protected String insuranceAmount;

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

    /**
     * Obtiene el valor de la propiedad discountAmountSign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmountSign() {
        return discountAmountSign;
    }

    /**
     * Define el valor de la propiedad discountAmountSign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmountSign(String value) {
        this.discountAmountSign = value;
    }

    /**
     * Obtiene el valor de la propiedad discountManagementIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountManagementIndicator() {
        return discountManagementIndicator;
    }

    /**
     * Define el valor de la propiedad discountManagementIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountManagementIndicator(String value) {
        this.discountManagementIndicator = value;
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
     * Obtiene el valor de la propiedad dutyAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyAmount() {
        return dutyAmount;
    }

    /**
     * Define el valor de la propiedad dutyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyAmount(String value) {
        this.dutyAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad dutyAmountSign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyAmountSign() {
        return dutyAmountSign;
    }

    /**
     * Define el valor de la propiedad dutyAmountSign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyAmountSign(String value) {
        this.dutyAmountSign = value;
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
     * Obtiene el valor de la propiedad freightAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightAmount() {
        return freightAmount;
    }

    /**
     * Define el valor de la propiedad freightAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightAmount(String value) {
        this.freightAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad freightAmountSign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightAmountSign() {
        return freightAmountSign;
    }

    /**
     * Define el valor de la propiedad freightAmountSign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightAmountSign(String value) {
        this.freightAmountSign = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignAmount() {
        return foreignAmount;
    }

    /**
     * Define el valor de la propiedad foreignAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignAmount(String value) {
        this.foreignAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignCurrency() {
        return foreignCurrency;
    }

    /**
     * Define el valor de la propiedad foreignCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignCurrency(String value) {
        this.foreignCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad originalAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Define el valor de la propiedad originalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAmount(String value) {
        this.originalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad originalCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCurrency() {
        return originalCurrency;
    }

    /**
     * Define el valor de la propiedad originalCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCurrency(String value) {
        this.originalCurrency = value;
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
     * Obtiene el valor de la propiedad exchangeRateTimeStamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateTimeStamp() {
        return exchangeRateTimeStamp;
    }

    /**
     * Define el valor de la propiedad exchangeRateTimeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateTimeStamp(String value) {
        this.exchangeRateTimeStamp = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmountType0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountType0() {
        return additionalAmountType0;
    }

    /**
     * Define el valor de la propiedad additionalAmountType0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountType0(String value) {
        this.additionalAmountType0 = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmount0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount0() {
        return additionalAmount0;
    }

    /**
     * Define el valor de la propiedad additionalAmount0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount0(String value) {
        this.additionalAmount0 = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmountType1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountType1() {
        return additionalAmountType1;
    }

    /**
     * Define el valor de la propiedad additionalAmountType1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountType1(String value) {
        this.additionalAmountType1 = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmount1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount1() {
        return additionalAmount1;
    }

    /**
     * Define el valor de la propiedad additionalAmount1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount1(String value) {
        this.additionalAmount1 = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmountType2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountType2() {
        return additionalAmountType2;
    }

    /**
     * Define el valor de la propiedad additionalAmountType2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountType2(String value) {
        this.additionalAmountType2 = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmount2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount2() {
        return additionalAmount2;
    }

    /**
     * Define el valor de la propiedad additionalAmount2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount2(String value) {
        this.additionalAmount2 = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmountType3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountType3() {
        return additionalAmountType3;
    }

    /**
     * Define el valor de la propiedad additionalAmountType3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountType3(String value) {
        this.additionalAmountType3 = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmount3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount3() {
        return additionalAmount3;
    }

    /**
     * Define el valor de la propiedad additionalAmount3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount3(String value) {
        this.additionalAmount3 = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmountType4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountType4() {
        return additionalAmountType4;
    }

    /**
     * Define el valor de la propiedad additionalAmountType4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountType4(String value) {
        this.additionalAmountType4 = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalAmount4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount4() {
        return additionalAmount4;
    }

    /**
     * Define el valor de la propiedad additionalAmount4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount4(String value) {
        this.additionalAmount4 = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeeAmount() {
        return serviceFeeAmount;
    }

    /**
     * Define el valor de la propiedad serviceFeeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeeAmount(String value) {
        this.serviceFeeAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Define el valor de la propiedad subtotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotalAmount(String value) {
        this.subtotalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Define el valor de la propiedad shippingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAmount(String value) {
        this.shippingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad handlingAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingAmount() {
        return handlingAmount;
    }

    /**
     * Define el valor de la propiedad handlingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingAmount(String value) {
        this.handlingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingHandlingAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingHandlingAmount() {
        return shippingHandlingAmount;
    }

    /**
     * Define el valor de la propiedad shippingHandlingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingHandlingAmount(String value) {
        this.shippingHandlingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingDiscountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingDiscountAmount() {
        return shippingDiscountAmount;
    }

    /**
     * Define el valor de la propiedad shippingDiscountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingDiscountAmount(String value) {
        this.shippingDiscountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad giftWrapAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftWrapAmount() {
        return giftWrapAmount;
    }

    /**
     * Define el valor de la propiedad giftWrapAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftWrapAmount(String value) {
        this.giftWrapAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Define el valor de la propiedad insuranceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceAmount(String value) {
        this.insuranceAmount = value;
    }

}

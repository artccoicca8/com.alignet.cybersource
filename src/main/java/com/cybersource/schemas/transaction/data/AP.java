
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pspBarcodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerRepresentativeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handlingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingHandlingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftWrapAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="device" type="{urn:schemas-cybersource-com:transaction-data-1.159}APDevice" minOccurs="0"/>
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAgreementIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="billingAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAgreementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingAddressImmutable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AP", propOrder = {
    "orderID",
    "pspBarcodeID",
    "customerRepresentativeID",
    "productDescription",
    "settlementCurrency",
    "subtotalAmount",
    "shippingAmount",
    "handlingAmount",
    "shippingHandlingAmount",
    "additionalAmount",
    "taxAmount",
    "giftWrapAmount",
    "discountAmount",
    "purchaseID",
    "productID",
    "device",
    "apiKey",
    "insuranceAmount",
    "billingAgreementIndicator",
    "billingAgreementID",
    "billingAgreementDescription",
    "payerID",
    "fundingSource",
    "shippingAddressImmutable"
})
public class AP {

    protected String orderID;
    protected String pspBarcodeID;
    protected String customerRepresentativeID;
    protected String productDescription;
    protected String settlementCurrency;
    protected String subtotalAmount;
    protected String shippingAmount;
    protected String handlingAmount;
    protected String shippingHandlingAmount;
    protected String additionalAmount;
    protected String taxAmount;
    protected String giftWrapAmount;
    protected String discountAmount;
    protected String purchaseID;
    protected String productID;
    protected APDevice device;
    protected String apiKey;
    protected String insuranceAmount;
    protected String billingAgreementIndicator;
    protected String billingAgreementID;
    protected String billingAgreementDescription;
    protected String payerID;
    protected String fundingSource;
    protected String shippingAddressImmutable;

    /**
     * Obtiene el valor de la propiedad orderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Define el valor de la propiedad orderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Obtiene el valor de la propiedad pspBarcodeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPspBarcodeID() {
        return pspBarcodeID;
    }

    /**
     * Define el valor de la propiedad pspBarcodeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPspBarcodeID(String value) {
        this.pspBarcodeID = value;
    }

    /**
     * Obtiene el valor de la propiedad customerRepresentativeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRepresentativeID() {
        return customerRepresentativeID;
    }

    /**
     * Define el valor de la propiedad customerRepresentativeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRepresentativeID(String value) {
        this.customerRepresentativeID = value;
    }

    /**
     * Obtiene el valor de la propiedad productDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Define el valor de la propiedad productDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad settlementCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCurrency() {
        return settlementCurrency;
    }

    /**
     * Define el valor de la propiedad settlementCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCurrency(String value) {
        this.settlementCurrency = value;
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
     * Obtiene el valor de la propiedad additionalAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Define el valor de la propiedad additionalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmount(String value) {
        this.additionalAmount = value;
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
     * Obtiene el valor de la propiedad purchaseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseID() {
        return purchaseID;
    }

    /**
     * Define el valor de la propiedad purchaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseID(String value) {
        this.purchaseID = value;
    }

    /**
     * Obtiene el valor de la propiedad productID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Define el valor de la propiedad productID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Obtiene el valor de la propiedad device.
     * 
     * @return
     *     possible object is
     *     {@link APDevice }
     *     
     */
    public APDevice getDevice() {
        return device;
    }

    /**
     * Define el valor de la propiedad device.
     * 
     * @param value
     *     allowed object is
     *     {@link APDevice }
     *     
     */
    public void setDevice(APDevice value) {
        this.device = value;
    }

    /**
     * Obtiene el valor de la propiedad apiKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Define el valor de la propiedad apiKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
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

    /**
     * Obtiene el valor de la propiedad billingAgreementIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAgreementIndicator() {
        return billingAgreementIndicator;
    }

    /**
     * Define el valor de la propiedad billingAgreementIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAgreementIndicator(String value) {
        this.billingAgreementIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad billingAgreementID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAgreementID() {
        return billingAgreementID;
    }

    /**
     * Define el valor de la propiedad billingAgreementID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAgreementID(String value) {
        this.billingAgreementID = value;
    }

    /**
     * Obtiene el valor de la propiedad billingAgreementDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAgreementDescription() {
        return billingAgreementDescription;
    }

    /**
     * Define el valor de la propiedad billingAgreementDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAgreementDescription(String value) {
        this.billingAgreementDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad payerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerID() {
        return payerID;
    }

    /**
     * Define el valor de la propiedad payerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerID(String value) {
        this.payerID = value;
    }

    /**
     * Obtiene el valor de la propiedad fundingSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingSource() {
        return fundingSource;
    }

    /**
     * Define el valor de la propiedad fundingSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingSource(String value) {
        this.fundingSource = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingAddressImmutable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressImmutable() {
        return shippingAddressImmutable;
    }

    /**
     * Define el valor de la propiedad shippingAddressImmutable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressImmutable(String value) {
        this.shippingAddressImmutable = value;
    }

}

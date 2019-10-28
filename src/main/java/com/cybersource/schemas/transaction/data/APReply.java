
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para APReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="APReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handlingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingHandlingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPurchaseAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftWrapAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumberPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riskIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantSiteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerProtection" type="{urn:schemas-cybersource-com:transaction-data-1.159}SellerProtection" minOccurs="0"/>
 *         &lt;element name="processorFraudDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorFraudDecisionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APReply", propOrder = {
    "orderID",
    "cardGroup",
    "cardType",
    "cardNumberSuffix",
    "cardExpirationMonth",
    "cardExpirationYear",
    "avsCodeRaw",
    "purchaseID",
    "productID",
    "productDescription",
    "shippingAmount",
    "handlingAmount",
    "shippingHandlingAmount",
    "additionalAmount",
    "taxAmount",
    "subtotalAmount",
    "totalPurchaseAmount",
    "giftWrapAmount",
    "discountAmount",
    "cardNumberPrefix",
    "riskIndicator",
    "merchantUUID",
    "merchantSiteID",
    "transactionExpirationDate",
    "sellerProtection",
    "processorFraudDecision",
    "processorFraudDecisionReason",
    "customerID",
    "billingAgreementID",
    "payerID",
    "fundingSource"
})
public class APReply {

    protected String orderID;
    protected String cardGroup;
    protected String cardType;
    protected String cardNumberSuffix;
    protected String cardExpirationMonth;
    protected String cardExpirationYear;
    protected String avsCodeRaw;
    protected String purchaseID;
    protected String productID;
    protected String productDescription;
    protected String shippingAmount;
    protected String handlingAmount;
    protected String shippingHandlingAmount;
    protected String additionalAmount;
    protected String taxAmount;
    protected String subtotalAmount;
    protected String totalPurchaseAmount;
    protected String giftWrapAmount;
    protected String discountAmount;
    protected String cardNumberPrefix;
    protected String riskIndicator;
    protected String merchantUUID;
    protected String merchantSiteID;
    protected String transactionExpirationDate;
    protected SellerProtection sellerProtection;
    protected String processorFraudDecision;
    protected String processorFraudDecisionReason;
    protected String customerID;
    protected String billingAgreementID;
    protected String payerID;
    protected String fundingSource;

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
     * Obtiene el valor de la propiedad cardGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardGroup() {
        return cardGroup;
    }

    /**
     * Define el valor de la propiedad cardGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardGroup(String value) {
        this.cardGroup = value;
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
     * Obtiene el valor de la propiedad cardNumberSuffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumberSuffix() {
        return cardNumberSuffix;
    }

    /**
     * Define el valor de la propiedad cardNumberSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumberSuffix(String value) {
        this.cardNumberSuffix = value;
    }

    /**
     * Obtiene el valor de la propiedad cardExpirationMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationMonth() {
        return cardExpirationMonth;
    }

    /**
     * Define el valor de la propiedad cardExpirationMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationMonth(String value) {
        this.cardExpirationMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad cardExpirationYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationYear() {
        return cardExpirationYear;
    }

    /**
     * Define el valor de la propiedad cardExpirationYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationYear(String value) {
        this.cardExpirationYear = value;
    }

    /**
     * Obtiene el valor de la propiedad avsCodeRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCodeRaw() {
        return avsCodeRaw;
    }

    /**
     * Define el valor de la propiedad avsCodeRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCodeRaw(String value) {
        this.avsCodeRaw = value;
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
     * Obtiene el valor de la propiedad totalPurchaseAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    /**
     * Define el valor de la propiedad totalPurchaseAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPurchaseAmount(String value) {
        this.totalPurchaseAmount = value;
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
     * Obtiene el valor de la propiedad cardNumberPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumberPrefix() {
        return cardNumberPrefix;
    }

    /**
     * Define el valor de la propiedad cardNumberPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumberPrefix(String value) {
        this.cardNumberPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad riskIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskIndicator() {
        return riskIndicator;
    }

    /**
     * Define el valor de la propiedad riskIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskIndicator(String value) {
        this.riskIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantUUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantUUID() {
        return merchantUUID;
    }

    /**
     * Define el valor de la propiedad merchantUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantUUID(String value) {
        this.merchantUUID = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantSiteID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantSiteID() {
        return merchantSiteID;
    }

    /**
     * Define el valor de la propiedad merchantSiteID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantSiteID(String value) {
        this.merchantSiteID = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionExpirationDate() {
        return transactionExpirationDate;
    }

    /**
     * Define el valor de la propiedad transactionExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionExpirationDate(String value) {
        this.transactionExpirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerProtection.
     * 
     * @return
     *     possible object is
     *     {@link SellerProtection }
     *     
     */
    public SellerProtection getSellerProtection() {
        return sellerProtection;
    }

    /**
     * Define el valor de la propiedad sellerProtection.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerProtection }
     *     
     */
    public void setSellerProtection(SellerProtection value) {
        this.sellerProtection = value;
    }

    /**
     * Obtiene el valor de la propiedad processorFraudDecision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorFraudDecision() {
        return processorFraudDecision;
    }

    /**
     * Define el valor de la propiedad processorFraudDecision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorFraudDecision(String value) {
        this.processorFraudDecision = value;
    }

    /**
     * Obtiene el valor de la propiedad processorFraudDecisionReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorFraudDecisionReason() {
        return processorFraudDecisionReason;
    }

    /**
     * Define el valor de la propiedad processorFraudDecisionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorFraudDecisionReason(String value) {
        this.processorFraudDecisionReason = value;
    }

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
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

}

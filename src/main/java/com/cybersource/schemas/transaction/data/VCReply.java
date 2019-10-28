
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VCReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VCReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateShippingAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateShippingAddressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vcAccountLoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vcAccountFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vcAccountLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vcAccountEncryptedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vcAccountEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vcAccountMobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingHandlingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftWrapAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uncategorizedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPurchaseAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="walletReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentInstrumentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardVerificationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentInstrumentNickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameOnCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardArt" type="{urn:schemas-cybersource-com:transaction-data-1.159}VCCardArt" minOccurs="0"/>
 *         &lt;element name="riskAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riskScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riskAdditionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvnCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veresEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veresTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paresTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customData" type="{urn:schemas-cybersource-com:transaction-data-1.159}VCCustomData" minOccurs="0"/>
 *         &lt;element name="vcAccountFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAddressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAddressAdditionalLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAddressStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiredCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingAddressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingAddressAdditionalLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingAddressStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ageOfAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCReply", propOrder = {
    "creationTimeStamp",
    "alternateShippingAddressCountryCode",
    "alternateShippingAddressPostalCode",
    "vcAccountLoginName",
    "vcAccountFirstName",
    "vcAccountLastName",
    "vcAccountEncryptedID",
    "vcAccountEmail",
    "vcAccountMobilePhoneNumber",
    "merchantReferenceID",
    "subtotalAmount",
    "shippingHandlingAmount",
    "taxAmount",
    "discountAmount",
    "giftWrapAmount",
    "uncategorizedAmount",
    "totalPurchaseAmount",
    "walletReferenceID",
    "promotionCode",
    "paymentInstrumentID",
    "cardVerificationStatus",
    "issuerID",
    "paymentInstrumentNickName",
    "nameOnCard",
    "cardType",
    "cardGroup",
    "cardArt",
    "riskAdvice",
    "riskScore",
    "riskAdditionalData",
    "avsCodeRaw",
    "cvnCodeRaw",
    "eciRaw",
    "eci",
    "cavv",
    "veresEnrolled",
    "veresTimeStamp",
    "paresStatus",
    "paresTimeStamp",
    "xid",
    "customData",
    "vcAccountFullName",
    "paymentDescription",
    "billingAddressStreetName",
    "billingAddressAdditionalLocation",
    "billingAddressStreetNumber",
    "expiredCard",
    "cardFirstName",
    "cardLastName",
    "shippingAddressStreetName",
    "shippingAddressAdditionalLocation",
    "shippingAddressStreetNumber",
    "ageOfAccount",
    "newUser"
})
public class VCReply {

    protected String creationTimeStamp;
    protected String alternateShippingAddressCountryCode;
    protected String alternateShippingAddressPostalCode;
    protected String vcAccountLoginName;
    protected String vcAccountFirstName;
    protected String vcAccountLastName;
    protected String vcAccountEncryptedID;
    protected String vcAccountEmail;
    protected String vcAccountMobilePhoneNumber;
    protected String merchantReferenceID;
    protected String subtotalAmount;
    protected String shippingHandlingAmount;
    protected String taxAmount;
    protected String discountAmount;
    protected String giftWrapAmount;
    protected String uncategorizedAmount;
    protected String totalPurchaseAmount;
    protected String walletReferenceID;
    protected String promotionCode;
    protected String paymentInstrumentID;
    protected String cardVerificationStatus;
    protected String issuerID;
    protected String paymentInstrumentNickName;
    protected String nameOnCard;
    protected String cardType;
    protected String cardGroup;
    protected VCCardArt cardArt;
    protected String riskAdvice;
    protected String riskScore;
    protected String riskAdditionalData;
    protected String avsCodeRaw;
    protected String cvnCodeRaw;
    protected String eciRaw;
    protected String eci;
    protected String cavv;
    protected String veresEnrolled;
    protected String veresTimeStamp;
    protected String paresStatus;
    protected String paresTimeStamp;
    protected String xid;
    protected VCCustomData customData;
    protected String vcAccountFullName;
    protected String paymentDescription;
    protected String billingAddressStreetName;
    protected String billingAddressAdditionalLocation;
    protected String billingAddressStreetNumber;
    protected String expiredCard;
    protected String cardFirstName;
    protected String cardLastName;
    protected String shippingAddressStreetName;
    protected String shippingAddressAdditionalLocation;
    protected String shippingAddressStreetNumber;
    protected String ageOfAccount;
    protected String newUser;

    /**
     * Obtiene el valor de la propiedad creationTimeStamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTimeStamp() {
        return creationTimeStamp;
    }

    /**
     * Define el valor de la propiedad creationTimeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTimeStamp(String value) {
        this.creationTimeStamp = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateShippingAddressCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateShippingAddressCountryCode() {
        return alternateShippingAddressCountryCode;
    }

    /**
     * Define el valor de la propiedad alternateShippingAddressCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateShippingAddressCountryCode(String value) {
        this.alternateShippingAddressCountryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateShippingAddressPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateShippingAddressPostalCode() {
        return alternateShippingAddressPostalCode;
    }

    /**
     * Define el valor de la propiedad alternateShippingAddressPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateShippingAddressPostalCode(String value) {
        this.alternateShippingAddressPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad vcAccountLoginName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountLoginName() {
        return vcAccountLoginName;
    }

    /**
     * Define el valor de la propiedad vcAccountLoginName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountLoginName(String value) {
        this.vcAccountLoginName = value;
    }

    /**
     * Obtiene el valor de la propiedad vcAccountFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountFirstName() {
        return vcAccountFirstName;
    }

    /**
     * Define el valor de la propiedad vcAccountFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountFirstName(String value) {
        this.vcAccountFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad vcAccountLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountLastName() {
        return vcAccountLastName;
    }

    /**
     * Define el valor de la propiedad vcAccountLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountLastName(String value) {
        this.vcAccountLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad vcAccountEncryptedID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountEncryptedID() {
        return vcAccountEncryptedID;
    }

    /**
     * Define el valor de la propiedad vcAccountEncryptedID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountEncryptedID(String value) {
        this.vcAccountEncryptedID = value;
    }

    /**
     * Obtiene el valor de la propiedad vcAccountEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountEmail() {
        return vcAccountEmail;
    }

    /**
     * Define el valor de la propiedad vcAccountEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountEmail(String value) {
        this.vcAccountEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad vcAccountMobilePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountMobilePhoneNumber() {
        return vcAccountMobilePhoneNumber;
    }

    /**
     * Define el valor de la propiedad vcAccountMobilePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountMobilePhoneNumber(String value) {
        this.vcAccountMobilePhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantReferenceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReferenceID() {
        return merchantReferenceID;
    }

    /**
     * Define el valor de la propiedad merchantReferenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReferenceID(String value) {
        this.merchantReferenceID = value;
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
     * Obtiene el valor de la propiedad uncategorizedAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUncategorizedAmount() {
        return uncategorizedAmount;
    }

    /**
     * Define el valor de la propiedad uncategorizedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUncategorizedAmount(String value) {
        this.uncategorizedAmount = value;
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
     * Obtiene el valor de la propiedad walletReferenceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletReferenceID() {
        return walletReferenceID;
    }

    /**
     * Define el valor de la propiedad walletReferenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletReferenceID(String value) {
        this.walletReferenceID = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Define el valor de la propiedad promotionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentInstrumentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInstrumentID() {
        return paymentInstrumentID;
    }

    /**
     * Define el valor de la propiedad paymentInstrumentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInstrumentID(String value) {
        this.paymentInstrumentID = value;
    }

    /**
     * Obtiene el valor de la propiedad cardVerificationStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardVerificationStatus() {
        return cardVerificationStatus;
    }

    /**
     * Define el valor de la propiedad cardVerificationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardVerificationStatus(String value) {
        this.cardVerificationStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad issuerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerID() {
        return issuerID;
    }

    /**
     * Define el valor de la propiedad issuerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerID(String value) {
        this.issuerID = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentInstrumentNickName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInstrumentNickName() {
        return paymentInstrumentNickName;
    }

    /**
     * Define el valor de la propiedad paymentInstrumentNickName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInstrumentNickName(String value) {
        this.paymentInstrumentNickName = value;
    }

    /**
     * Obtiene el valor de la propiedad nameOnCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Define el valor de la propiedad nameOnCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCard(String value) {
        this.nameOnCard = value;
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
     * Obtiene el valor de la propiedad cardArt.
     * 
     * @return
     *     possible object is
     *     {@link VCCardArt }
     *     
     */
    public VCCardArt getCardArt() {
        return cardArt;
    }

    /**
     * Define el valor de la propiedad cardArt.
     * 
     * @param value
     *     allowed object is
     *     {@link VCCardArt }
     *     
     */
    public void setCardArt(VCCardArt value) {
        this.cardArt = value;
    }

    /**
     * Obtiene el valor de la propiedad riskAdvice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAdvice() {
        return riskAdvice;
    }

    /**
     * Define el valor de la propiedad riskAdvice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAdvice(String value) {
        this.riskAdvice = value;
    }

    /**
     * Obtiene el valor de la propiedad riskScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskScore() {
        return riskScore;
    }

    /**
     * Define el valor de la propiedad riskScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskScore(String value) {
        this.riskScore = value;
    }

    /**
     * Obtiene el valor de la propiedad riskAdditionalData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAdditionalData() {
        return riskAdditionalData;
    }

    /**
     * Define el valor de la propiedad riskAdditionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAdditionalData(String value) {
        this.riskAdditionalData = value;
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
     * Obtiene el valor de la propiedad cvnCodeRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvnCodeRaw() {
        return cvnCodeRaw;
    }

    /**
     * Define el valor de la propiedad cvnCodeRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvnCodeRaw(String value) {
        this.cvnCodeRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad eciRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciRaw() {
        return eciRaw;
    }

    /**
     * Define el valor de la propiedad eciRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciRaw(String value) {
        this.eciRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad eci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEci() {
        return eci;
    }

    /**
     * Define el valor de la propiedad eci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEci(String value) {
        this.eci = value;
    }

    /**
     * Obtiene el valor de la propiedad cavv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Define el valor de la propiedad cavv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * Obtiene el valor de la propiedad veresEnrolled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeresEnrolled() {
        return veresEnrolled;
    }

    /**
     * Define el valor de la propiedad veresEnrolled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeresEnrolled(String value) {
        this.veresEnrolled = value;
    }

    /**
     * Obtiene el valor de la propiedad veresTimeStamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeresTimeStamp() {
        return veresTimeStamp;
    }

    /**
     * Define el valor de la propiedad veresTimeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeresTimeStamp(String value) {
        this.veresTimeStamp = value;
    }

    /**
     * Obtiene el valor de la propiedad paresStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParesStatus() {
        return paresStatus;
    }

    /**
     * Define el valor de la propiedad paresStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParesStatus(String value) {
        this.paresStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad paresTimeStamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParesTimeStamp() {
        return paresTimeStamp;
    }

    /**
     * Define el valor de la propiedad paresTimeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParesTimeStamp(String value) {
        this.paresTimeStamp = value;
    }

    /**
     * Obtiene el valor de la propiedad xid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Define el valor de la propiedad xid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
    }

    /**
     * Obtiene el valor de la propiedad customData.
     * 
     * @return
     *     possible object is
     *     {@link VCCustomData }
     *     
     */
    public VCCustomData getCustomData() {
        return customData;
    }

    /**
     * Define el valor de la propiedad customData.
     * 
     * @param value
     *     allowed object is
     *     {@link VCCustomData }
     *     
     */
    public void setCustomData(VCCustomData value) {
        this.customData = value;
    }

    /**
     * Obtiene el valor de la propiedad vcAccountFullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcAccountFullName() {
        return vcAccountFullName;
    }

    /**
     * Define el valor de la propiedad vcAccountFullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcAccountFullName(String value) {
        this.vcAccountFullName = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * Define el valor de la propiedad paymentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad billingAddressStreetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressStreetName() {
        return billingAddressStreetName;
    }

    /**
     * Define el valor de la propiedad billingAddressStreetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressStreetName(String value) {
        this.billingAddressStreetName = value;
    }

    /**
     * Obtiene el valor de la propiedad billingAddressAdditionalLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressAdditionalLocation() {
        return billingAddressAdditionalLocation;
    }

    /**
     * Define el valor de la propiedad billingAddressAdditionalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressAdditionalLocation(String value) {
        this.billingAddressAdditionalLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad billingAddressStreetNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressStreetNumber() {
        return billingAddressStreetNumber;
    }

    /**
     * Define el valor de la propiedad billingAddressStreetNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressStreetNumber(String value) {
        this.billingAddressStreetNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad expiredCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredCard() {
        return expiredCard;
    }

    /**
     * Define el valor de la propiedad expiredCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredCard(String value) {
        this.expiredCard = value;
    }

    /**
     * Obtiene el valor de la propiedad cardFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardFirstName() {
        return cardFirstName;
    }

    /**
     * Define el valor de la propiedad cardFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardFirstName(String value) {
        this.cardFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad cardLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLastName() {
        return cardLastName;
    }

    /**
     * Define el valor de la propiedad cardLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLastName(String value) {
        this.cardLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingAddressStreetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressStreetName() {
        return shippingAddressStreetName;
    }

    /**
     * Define el valor de la propiedad shippingAddressStreetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressStreetName(String value) {
        this.shippingAddressStreetName = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingAddressAdditionalLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressAdditionalLocation() {
        return shippingAddressAdditionalLocation;
    }

    /**
     * Define el valor de la propiedad shippingAddressAdditionalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressAdditionalLocation(String value) {
        this.shippingAddressAdditionalLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingAddressStreetNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressStreetNumber() {
        return shippingAddressStreetNumber;
    }

    /**
     * Define el valor de la propiedad shippingAddressStreetNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressStreetNumber(String value) {
        this.shippingAddressStreetNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad ageOfAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeOfAccount() {
        return ageOfAccount;
    }

    /**
     * Define el valor de la propiedad ageOfAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeOfAccount(String value) {
        this.ageOfAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad newUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUser() {
        return newUser;
    }

    /**
     * Define el valor de la propiedad newUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUser(String value) {
        this.newUser = value;
    }

}

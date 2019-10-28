
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Wallet complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Wallet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticatonMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardEnrollmentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veresEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPurchaseAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftWrapAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrollmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wallet", propOrder = {
    "type",
    "orderID",
    "merchantReferenceID",
    "userPhone",
    "avv",
    "eciRaw",
    "authenticatonMethod",
    "cardEnrollmentMethod",
    "paresStatus",
    "veresEnrolled",
    "xid",
    "totalPurchaseAmount",
    "subtotalAmount",
    "discountAmount",
    "giftWrapAmount",
    "eventType",
    "promotionCode",
    "enrollmentID"
})
public class Wallet {

    protected String type;
    protected String orderID;
    protected String merchantReferenceID;
    protected String userPhone;
    protected String avv;
    protected String eciRaw;
    protected String authenticatonMethod;
    protected String cardEnrollmentMethod;
    protected String paresStatus;
    protected String veresEnrolled;
    protected String xid;
    protected String totalPurchaseAmount;
    protected String subtotalAmount;
    protected String discountAmount;
    protected String giftWrapAmount;
    protected String eventType;
    protected String promotionCode;
    protected String enrollmentID;

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
     * Obtiene el valor de la propiedad userPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * Define el valor de la propiedad userPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPhone(String value) {
        this.userPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad avv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvv() {
        return avv;
    }

    /**
     * Define el valor de la propiedad avv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvv(String value) {
        this.avv = value;
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
     * Obtiene el valor de la propiedad authenticatonMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticatonMethod() {
        return authenticatonMethod;
    }

    /**
     * Define el valor de la propiedad authenticatonMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticatonMethod(String value) {
        this.authenticatonMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad cardEnrollmentMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEnrollmentMethod() {
        return cardEnrollmentMethod;
    }

    /**
     * Define el valor de la propiedad cardEnrollmentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEnrollmentMethod(String value) {
        this.cardEnrollmentMethod = value;
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
     * Obtiene el valor de la propiedad eventType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Define el valor de la propiedad eventType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
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
     * Obtiene el valor de la propiedad enrollmentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentID() {
        return enrollmentID;
    }

    /**
     * Define el valor de la propiedad enrollmentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentID(String value) {
        this.enrollmentID = value;
    }

}

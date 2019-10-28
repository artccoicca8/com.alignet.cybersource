
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalEcSetService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalEcSetService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paypalReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalCancelReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalMaxamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalCustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalReqconfirmshipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalNoshipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalAddressOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalLc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPagestyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalHdrimg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalHdrbordercolor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalHdrbackcolor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPayflowcolor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcSetRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcSetRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoCode0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestBillingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalBillingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalBillingAgreementDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalBillingAgreementCustom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalLogoimg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="run" use="required" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalEcSetService", propOrder = {
    "paypalReturn",
    "paypalCancelReturn",
    "paypalMaxamt",
    "paypalCustomerEmail",
    "paypalDesc",
    "paypalReqconfirmshipping",
    "paypalNoshipping",
    "paypalAddressOverride",
    "paypalToken",
    "paypalLc",
    "paypalPagestyle",
    "paypalHdrimg",
    "paypalHdrbordercolor",
    "paypalHdrbackcolor",
    "paypalPayflowcolor",
    "paypalEcSetRequestID",
    "paypalEcSetRequestToken",
    "promoCode0",
    "requestBillingAddress",
    "invoiceNumber",
    "paypalBillingType",
    "paypalBillingAgreementDesc",
    "paypalPaymentType",
    "paypalBillingAgreementCustom",
    "paypalLogoimg"
})
public class PayPalEcSetService {

    protected String paypalReturn;
    protected String paypalCancelReturn;
    protected String paypalMaxamt;
    protected String paypalCustomerEmail;
    protected String paypalDesc;
    protected String paypalReqconfirmshipping;
    protected String paypalNoshipping;
    protected String paypalAddressOverride;
    protected String paypalToken;
    protected String paypalLc;
    protected String paypalPagestyle;
    protected String paypalHdrimg;
    protected String paypalHdrbordercolor;
    protected String paypalHdrbackcolor;
    protected String paypalPayflowcolor;
    protected String paypalEcSetRequestID;
    protected String paypalEcSetRequestToken;
    protected String promoCode0;
    protected String requestBillingAddress;
    protected String invoiceNumber;
    protected String paypalBillingType;
    protected String paypalBillingAgreementDesc;
    protected String paypalPaymentType;
    protected String paypalBillingAgreementCustom;
    protected String paypalLogoimg;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad paypalReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalReturn() {
        return paypalReturn;
    }

    /**
     * Define el valor de la propiedad paypalReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalReturn(String value) {
        this.paypalReturn = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalCancelReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalCancelReturn() {
        return paypalCancelReturn;
    }

    /**
     * Define el valor de la propiedad paypalCancelReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalCancelReturn(String value) {
        this.paypalCancelReturn = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalMaxamt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalMaxamt() {
        return paypalMaxamt;
    }

    /**
     * Define el valor de la propiedad paypalMaxamt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalMaxamt(String value) {
        this.paypalMaxamt = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalCustomerEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalCustomerEmail() {
        return paypalCustomerEmail;
    }

    /**
     * Define el valor de la propiedad paypalCustomerEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalCustomerEmail(String value) {
        this.paypalCustomerEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDesc() {
        return paypalDesc;
    }

    /**
     * Define el valor de la propiedad paypalDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDesc(String value) {
        this.paypalDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalReqconfirmshipping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalReqconfirmshipping() {
        return paypalReqconfirmshipping;
    }

    /**
     * Define el valor de la propiedad paypalReqconfirmshipping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalReqconfirmshipping(String value) {
        this.paypalReqconfirmshipping = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalNoshipping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalNoshipping() {
        return paypalNoshipping;
    }

    /**
     * Define el valor de la propiedad paypalNoshipping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalNoshipping(String value) {
        this.paypalNoshipping = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalAddressOverride.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAddressOverride() {
        return paypalAddressOverride;
    }

    /**
     * Define el valor de la propiedad paypalAddressOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAddressOverride(String value) {
        this.paypalAddressOverride = value;
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
     * Obtiene el valor de la propiedad paypalLc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalLc() {
        return paypalLc;
    }

    /**
     * Define el valor de la propiedad paypalLc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalLc(String value) {
        this.paypalLc = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalPagestyle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPagestyle() {
        return paypalPagestyle;
    }

    /**
     * Define el valor de la propiedad paypalPagestyle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPagestyle(String value) {
        this.paypalPagestyle = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalHdrimg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalHdrimg() {
        return paypalHdrimg;
    }

    /**
     * Define el valor de la propiedad paypalHdrimg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalHdrimg(String value) {
        this.paypalHdrimg = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalHdrbordercolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalHdrbordercolor() {
        return paypalHdrbordercolor;
    }

    /**
     * Define el valor de la propiedad paypalHdrbordercolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalHdrbordercolor(String value) {
        this.paypalHdrbordercolor = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalHdrbackcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalHdrbackcolor() {
        return paypalHdrbackcolor;
    }

    /**
     * Define el valor de la propiedad paypalHdrbackcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalHdrbackcolor(String value) {
        this.paypalHdrbackcolor = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalPayflowcolor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPayflowcolor() {
        return paypalPayflowcolor;
    }

    /**
     * Define el valor de la propiedad paypalPayflowcolor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPayflowcolor(String value) {
        this.paypalPayflowcolor = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalEcSetRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcSetRequestID() {
        return paypalEcSetRequestID;
    }

    /**
     * Define el valor de la propiedad paypalEcSetRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcSetRequestID(String value) {
        this.paypalEcSetRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalEcSetRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcSetRequestToken() {
        return paypalEcSetRequestToken;
    }

    /**
     * Define el valor de la propiedad paypalEcSetRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcSetRequestToken(String value) {
        this.paypalEcSetRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad promoCode0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode0() {
        return promoCode0;
    }

    /**
     * Define el valor de la propiedad promoCode0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode0(String value) {
        this.promoCode0 = value;
    }

    /**
     * Obtiene el valor de la propiedad requestBillingAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestBillingAddress() {
        return requestBillingAddress;
    }

    /**
     * Define el valor de la propiedad requestBillingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestBillingAddress(String value) {
        this.requestBillingAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define el valor de la propiedad invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalBillingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingType() {
        return paypalBillingType;
    }

    /**
     * Define el valor de la propiedad paypalBillingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingType(String value) {
        this.paypalBillingType = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalBillingAgreementDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementDesc() {
        return paypalBillingAgreementDesc;
    }

    /**
     * Define el valor de la propiedad paypalBillingAgreementDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementDesc(String value) {
        this.paypalBillingAgreementDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalPaymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPaymentType() {
        return paypalPaymentType;
    }

    /**
     * Define el valor de la propiedad paypalPaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPaymentType(String value) {
        this.paypalPaymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalBillingAgreementCustom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementCustom() {
        return paypalBillingAgreementCustom;
    }

    /**
     * Define el valor de la propiedad paypalBillingAgreementCustom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementCustom(String value) {
        this.paypalBillingAgreementCustom = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalLogoimg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalLogoimg() {
        return paypalLogoimg;
    }

    /**
     * Define el valor de la propiedad paypalLogoimg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalLogoimg(String value) {
        this.paypalLogoimg = value;
    }

    /**
     * Obtiene el valor de la propiedad run.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Define el valor de la propiedad run.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
    }

}


package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalEcDoPaymentService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalEcDoPaymentService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paypalToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPayerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalCustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcSetRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcSetRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoCode0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayPalEcDoPaymentService", propOrder = {
    "paypalToken",
    "paypalPayerId",
    "paypalCustomerEmail",
    "paypalDesc",
    "paypalEcSetRequestID",
    "paypalEcSetRequestToken",
    "promoCode0",
    "invoiceNumber"
})
public class PayPalEcDoPaymentService {

    protected String paypalToken;
    protected String paypalPayerId;
    protected String paypalCustomerEmail;
    protected String paypalDesc;
    protected String paypalEcSetRequestID;
    protected String paypalEcSetRequestToken;
    protected String promoCode0;
    protected String invoiceNumber;
    @XmlAttribute(name = "run", required = true)
    protected String run;

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
     * Obtiene el valor de la propiedad paypalPayerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPayerId() {
        return paypalPayerId;
    }

    /**
     * Define el valor de la propiedad paypalPayerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPayerId(String value) {
        this.paypalPayerId = value;
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

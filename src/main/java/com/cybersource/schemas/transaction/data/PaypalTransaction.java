
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaypalTransaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaypalTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="transactionTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPayerOrPayeeEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grandTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalFeeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalNetAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaypalTransaction", propOrder = {
    "transactionTime",
    "transactionTimeZone",
    "transactionType",
    "paypalPayerOrPayeeEmail",
    "customerDisplayName",
    "transactionID",
    "paypalPaymentStatus",
    "grandTotalAmount",
    "currency",
    "paypalFeeAmount",
    "paypalNetAmount"
})
public class PaypalTransaction {

    protected String transactionTime;
    protected String transactionTimeZone;
    protected String transactionType;
    protected String paypalPayerOrPayeeEmail;
    protected String customerDisplayName;
    protected String transactionID;
    protected String paypalPaymentStatus;
    protected String grandTotalAmount;
    protected String currency;
    protected String paypalFeeAmount;
    protected String paypalNetAmount;
    @XmlAttribute(name = "id")
    protected BigInteger id;

    /**
     * Obtiene el valor de la propiedad transactionTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTime() {
        return transactionTime;
    }

    /**
     * Define el valor de la propiedad transactionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTime(String value) {
        this.transactionTime = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTimeZone() {
        return transactionTimeZone;
    }

    /**
     * Define el valor de la propiedad transactionTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTimeZone(String value) {
        this.transactionTimeZone = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Define el valor de la propiedad transactionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalPayerOrPayeeEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPayerOrPayeeEmail() {
        return paypalPayerOrPayeeEmail;
    }

    /**
     * Define el valor de la propiedad paypalPayerOrPayeeEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPayerOrPayeeEmail(String value) {
        this.paypalPayerOrPayeeEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad customerDisplayName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDisplayName() {
        return customerDisplayName;
    }

    /**
     * Define el valor de la propiedad customerDisplayName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDisplayName(String value) {
        this.customerDisplayName = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Define el valor de la propiedad transactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalPaymentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPaymentStatus() {
        return paypalPaymentStatus;
    }

    /**
     * Define el valor de la propiedad paypalPaymentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPaymentStatus(String value) {
        this.paypalPaymentStatus = value;
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
     * Obtiene el valor de la propiedad paypalFeeAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalFeeAmount() {
        return paypalFeeAmount;
    }

    /**
     * Define el valor de la propiedad paypalFeeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalFeeAmount(String value) {
        this.paypalFeeAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalNetAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalNetAmount() {
        return paypalNetAmount;
    }

    /**
     * Define el valor de la propiedad paypalNetAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalNetAmount(String value) {
        this.paypalNetAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}

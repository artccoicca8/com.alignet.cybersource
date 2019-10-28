
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalAuthorizationService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalAuthorizationService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paypalOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcOrderSetupRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcOrderSetupRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalDoRefTransactionRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalDoRefTransactionRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalCustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayPalAuthorizationService", propOrder = {
    "paypalOrderId",
    "paypalEcOrderSetupRequestID",
    "paypalEcOrderSetupRequestToken",
    "paypalDoRefTransactionRequestID",
    "paypalDoRefTransactionRequestToken",
    "paypalCustomerEmail"
})
public class PayPalAuthorizationService {

    protected String paypalOrderId;
    protected String paypalEcOrderSetupRequestID;
    protected String paypalEcOrderSetupRequestToken;
    protected String paypalDoRefTransactionRequestID;
    protected String paypalDoRefTransactionRequestToken;
    protected String paypalCustomerEmail;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad paypalOrderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalOrderId() {
        return paypalOrderId;
    }

    /**
     * Define el valor de la propiedad paypalOrderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalOrderId(String value) {
        this.paypalOrderId = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalEcOrderSetupRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcOrderSetupRequestID() {
        return paypalEcOrderSetupRequestID;
    }

    /**
     * Define el valor de la propiedad paypalEcOrderSetupRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcOrderSetupRequestID(String value) {
        this.paypalEcOrderSetupRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalEcOrderSetupRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcOrderSetupRequestToken() {
        return paypalEcOrderSetupRequestToken;
    }

    /**
     * Define el valor de la propiedad paypalEcOrderSetupRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcOrderSetupRequestToken(String value) {
        this.paypalEcOrderSetupRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalDoRefTransactionRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDoRefTransactionRequestID() {
        return paypalDoRefTransactionRequestID;
    }

    /**
     * Define el valor de la propiedad paypalDoRefTransactionRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDoRefTransactionRequestID(String value) {
        this.paypalDoRefTransactionRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalDoRefTransactionRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDoRefTransactionRequestToken() {
        return paypalDoRefTransactionRequestToken;
    }

    /**
     * Define el valor de la propiedad paypalDoRefTransactionRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDoRefTransactionRequestToken(String value) {
        this.paypalDoRefTransactionRequestToken = value;
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

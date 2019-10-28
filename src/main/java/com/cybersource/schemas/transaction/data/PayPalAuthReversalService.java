
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalAuthReversalService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalAuthReversalService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paypalAuthorizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcDoPaymentRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcDoPaymentRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalAuthorizationRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalAuthorizationRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcOrderSetupRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcOrderSetupRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayPalAuthReversalService", propOrder = {
    "paypalAuthorizationId",
    "paypalEcDoPaymentRequestID",
    "paypalEcDoPaymentRequestToken",
    "paypalAuthorizationRequestID",
    "paypalAuthorizationRequestToken",
    "paypalEcOrderSetupRequestID",
    "paypalEcOrderSetupRequestToken"
})
public class PayPalAuthReversalService {

    protected String paypalAuthorizationId;
    protected String paypalEcDoPaymentRequestID;
    protected String paypalEcDoPaymentRequestToken;
    protected String paypalAuthorizationRequestID;
    protected String paypalAuthorizationRequestToken;
    protected String paypalEcOrderSetupRequestID;
    protected String paypalEcOrderSetupRequestToken;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad paypalAuthorizationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAuthorizationId() {
        return paypalAuthorizationId;
    }

    /**
     * Define el valor de la propiedad paypalAuthorizationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAuthorizationId(String value) {
        this.paypalAuthorizationId = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalEcDoPaymentRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcDoPaymentRequestID() {
        return paypalEcDoPaymentRequestID;
    }

    /**
     * Define el valor de la propiedad paypalEcDoPaymentRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcDoPaymentRequestID(String value) {
        this.paypalEcDoPaymentRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalEcDoPaymentRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcDoPaymentRequestToken() {
        return paypalEcDoPaymentRequestToken;
    }

    /**
     * Define el valor de la propiedad paypalEcDoPaymentRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcDoPaymentRequestToken(String value) {
        this.paypalEcDoPaymentRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalAuthorizationRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAuthorizationRequestID() {
        return paypalAuthorizationRequestID;
    }

    /**
     * Define el valor de la propiedad paypalAuthorizationRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAuthorizationRequestID(String value) {
        this.paypalAuthorizationRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalAuthorizationRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAuthorizationRequestToken() {
        return paypalAuthorizationRequestToken;
    }

    /**
     * Define el valor de la propiedad paypalAuthorizationRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAuthorizationRequestToken(String value) {
        this.paypalAuthorizationRequestToken = value;
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

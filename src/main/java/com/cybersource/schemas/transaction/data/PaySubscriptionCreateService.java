
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaySubscriptionCreateService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaySubscriptionCreateService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disableAutoAuth" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
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
@XmlType(name = "PaySubscriptionCreateService", propOrder = {
    "paymentRequestID",
    "paymentRequestToken",
    "disableAutoAuth"
})
public class PaySubscriptionCreateService {

    protected String paymentRequestID;
    protected String paymentRequestToken;
    protected String disableAutoAuth;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad paymentRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRequestID() {
        return paymentRequestID;
    }

    /**
     * Define el valor de la propiedad paymentRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRequestID(String value) {
        this.paymentRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRequestToken() {
        return paymentRequestToken;
    }

    /**
     * Define el valor de la propiedad paymentRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRequestToken(String value) {
        this.paymentRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad disableAutoAuth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableAutoAuth() {
        return disableAutoAuth;
    }

    /**
     * Define el valor de la propiedad disableAutoAuth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableAutoAuth(String value) {
        this.disableAutoAuth = value;
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

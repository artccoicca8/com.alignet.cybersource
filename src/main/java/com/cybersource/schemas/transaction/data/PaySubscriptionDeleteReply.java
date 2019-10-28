
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaySubscriptionDeleteReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaySubscriptionDeleteReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="subscriptionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instrumentIdentifierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaySubscriptionDeleteReply", propOrder = {
    "reasonCode",
    "subscriptionID",
    "instrumentIdentifierID"
})
public class PaySubscriptionDeleteReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    @XmlElement(required = true)
    protected String subscriptionID;
    protected String instrumentIdentifierID;

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriptionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Define el valor de la propiedad subscriptionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionID(String value) {
        this.subscriptionID = value;
    }

    /**
     * Obtiene el valor de la propiedad instrumentIdentifierID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierID() {
        return instrumentIdentifierID;
    }

    /**
     * Define el valor de la propiedad instrumentIdentifierID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierID(String value) {
        this.instrumentIdentifierID = value;
    }

}


package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaySubscriptionCreateReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaySubscriptionCreateReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="subscriptionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instrumentIdentifierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrumentIdentifierStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrumentIdentifierNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrumentIdentifierSuccessorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaySubscriptionCreateReply", propOrder = {
    "reasonCode",
    "subscriptionID",
    "instrumentIdentifierID",
    "instrumentIdentifierStatus",
    "instrumentIdentifierNew",
    "instrumentIdentifierSuccessorID"
})
public class PaySubscriptionCreateReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    @XmlElement(required = true)
    protected String subscriptionID;
    protected String instrumentIdentifierID;
    protected String instrumentIdentifierStatus;
    protected String instrumentIdentifierNew;
    protected String instrumentIdentifierSuccessorID;

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

    /**
     * Obtiene el valor de la propiedad instrumentIdentifierStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierStatus() {
        return instrumentIdentifierStatus;
    }

    /**
     * Define el valor de la propiedad instrumentIdentifierStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierStatus(String value) {
        this.instrumentIdentifierStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad instrumentIdentifierNew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierNew() {
        return instrumentIdentifierNew;
    }

    /**
     * Define el valor de la propiedad instrumentIdentifierNew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierNew(String value) {
        this.instrumentIdentifierNew = value;
    }

    /**
     * Obtiene el valor de la propiedad instrumentIdentifierSuccessorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentIdentifierSuccessorID() {
        return instrumentIdentifierSuccessorID;
    }

    /**
     * Define el valor de la propiedad instrumentIdentifierSuccessorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentIdentifierSuccessorID(String value) {
        this.instrumentIdentifierSuccessorID = value;
    }

}


package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para merchant complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="merchant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acquirerBIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAcceptorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "merchant", propOrder = {
    "acquirerBIN",
    "cardAcceptorID",
    "visaMerchantID"
})
public class Merchant {

    protected String acquirerBIN;
    protected String cardAcceptorID;
    protected String visaMerchantID;

    /**
     * Obtiene el valor de la propiedad acquirerBIN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerBIN() {
        return acquirerBIN;
    }

    /**
     * Define el valor de la propiedad acquirerBIN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerBIN(String value) {
        this.acquirerBIN = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAcceptorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorID() {
        return cardAcceptorID;
    }

    /**
     * Define el valor de la propiedad cardAcceptorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorID(String value) {
        this.cardAcceptorID = value;
    }

    /**
     * Obtiene el valor de la propiedad visaMerchantID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaMerchantID() {
        return visaMerchantID;
    }

    /**
     * Define el valor de la propiedad visaMerchantID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaMerchantID(String value) {
        this.visaMerchantID = value;
    }

}

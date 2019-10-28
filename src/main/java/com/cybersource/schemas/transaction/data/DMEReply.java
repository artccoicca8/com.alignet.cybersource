
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DMEReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DMEReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventHotlistInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventVelocityInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalFields" type="{urn:schemas-cybersource-com:transaction-data-1.159}AdditionalFields" minOccurs="0"/>
 *         &lt;element name="morphingElement" type="{urn:schemas-cybersource-com:transaction-data-1.159}MorphingElement" minOccurs="0"/>
 *         &lt;element name="cardBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="binCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerFields" type="{urn:schemas-cybersource-com:transaction-data-1.159}ProviderFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMEReply", propOrder = {
    "eventType",
    "eventInfo",
    "eventHotlistInfo",
    "eventPolicy",
    "eventVelocityInfoCode",
    "additionalFields",
    "morphingElement",
    "cardBin",
    "binCountry",
    "cardAccountType",
    "cardScheme",
    "cardIssuer",
    "providerFields"
})
public class DMEReply {

    protected String eventType;
    protected String eventInfo;
    protected String eventHotlistInfo;
    protected String eventPolicy;
    protected String eventVelocityInfoCode;
    protected AdditionalFields additionalFields;
    protected MorphingElement morphingElement;
    protected String cardBin;
    protected String binCountry;
    protected String cardAccountType;
    protected String cardScheme;
    protected String cardIssuer;
    protected ProviderFields providerFields;

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
     * Obtiene el valor de la propiedad eventInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventInfo() {
        return eventInfo;
    }

    /**
     * Define el valor de la propiedad eventInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventInfo(String value) {
        this.eventInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad eventHotlistInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventHotlistInfo() {
        return eventHotlistInfo;
    }

    /**
     * Define el valor de la propiedad eventHotlistInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventHotlistInfo(String value) {
        this.eventHotlistInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad eventPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventPolicy() {
        return eventPolicy;
    }

    /**
     * Define el valor de la propiedad eventPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventPolicy(String value) {
        this.eventPolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad eventVelocityInfoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventVelocityInfoCode() {
        return eventVelocityInfoCode;
    }

    /**
     * Define el valor de la propiedad eventVelocityInfoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventVelocityInfoCode(String value) {
        this.eventVelocityInfoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalFields.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFields }
     *     
     */
    public AdditionalFields getAdditionalFields() {
        return additionalFields;
    }

    /**
     * Define el valor de la propiedad additionalFields.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFields }
     *     
     */
    public void setAdditionalFields(AdditionalFields value) {
        this.additionalFields = value;
    }

    /**
     * Obtiene el valor de la propiedad morphingElement.
     * 
     * @return
     *     possible object is
     *     {@link MorphingElement }
     *     
     */
    public MorphingElement getMorphingElement() {
        return morphingElement;
    }

    /**
     * Define el valor de la propiedad morphingElement.
     * 
     * @param value
     *     allowed object is
     *     {@link MorphingElement }
     *     
     */
    public void setMorphingElement(MorphingElement value) {
        this.morphingElement = value;
    }

    /**
     * Obtiene el valor de la propiedad cardBin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBin() {
        return cardBin;
    }

    /**
     * Define el valor de la propiedad cardBin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBin(String value) {
        this.cardBin = value;
    }

    /**
     * Obtiene el valor de la propiedad binCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinCountry() {
        return binCountry;
    }

    /**
     * Define el valor de la propiedad binCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinCountry(String value) {
        this.binCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAccountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountType() {
        return cardAccountType;
    }

    /**
     * Define el valor de la propiedad cardAccountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountType(String value) {
        this.cardAccountType = value;
    }

    /**
     * Obtiene el valor de la propiedad cardScheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardScheme() {
        return cardScheme;
    }

    /**
     * Define el valor de la propiedad cardScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardScheme(String value) {
        this.cardScheme = value;
    }

    /**
     * Obtiene el valor de la propiedad cardIssuer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuer() {
        return cardIssuer;
    }

    /**
     * Define el valor de la propiedad cardIssuer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuer(String value) {
        this.cardIssuer = value;
    }

    /**
     * Obtiene el valor de la propiedad providerFields.
     * 
     * @return
     *     possible object is
     *     {@link ProviderFields }
     *     
     */
    public ProviderFields getProviderFields() {
        return providerFields;
    }

    /**
     * Define el valor de la propiedad providerFields.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderFields }
     *     
     */
    public void setProviderFields(ProviderFields value) {
        this.providerFields = value;
    }

}

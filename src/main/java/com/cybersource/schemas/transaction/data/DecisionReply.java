
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DecisionReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DecisionReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="casePriority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="activeProfileReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}ProfileReply" minOccurs="0"/>
 *         &lt;element name="velocityInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalFields" type="{urn:schemas-cybersource-com:transaction-data-1.159}AdditionalFields" minOccurs="0"/>
 *         &lt;element name="morphingElement" type="{urn:schemas-cybersource-com:transaction-data-1.159}MorphingElement" minOccurs="0"/>
 *         &lt;element name="providerFields" type="{urn:schemas-cybersource-com:transaction-data-1.159}ProviderFields" minOccurs="0"/>
 *         &lt;element name="travel" type="{urn:schemas-cybersource-com:transaction-data-1.159}Travel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionReply", propOrder = {
    "casePriority",
    "activeProfileReply",
    "velocityInfoCode",
    "additionalFields",
    "morphingElement",
    "providerFields",
    "travel"
})
public class DecisionReply {

    protected BigInteger casePriority;
    protected ProfileReply activeProfileReply;
    protected String velocityInfoCode;
    protected AdditionalFields additionalFields;
    protected MorphingElement morphingElement;
    protected ProviderFields providerFields;
    protected Travel travel;

    /**
     * Obtiene el valor de la propiedad casePriority.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCasePriority() {
        return casePriority;
    }

    /**
     * Define el valor de la propiedad casePriority.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCasePriority(BigInteger value) {
        this.casePriority = value;
    }

    /**
     * Obtiene el valor de la propiedad activeProfileReply.
     * 
     * @return
     *     possible object is
     *     {@link ProfileReply }
     *     
     */
    public ProfileReply getActiveProfileReply() {
        return activeProfileReply;
    }

    /**
     * Define el valor de la propiedad activeProfileReply.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileReply }
     *     
     */
    public void setActiveProfileReply(ProfileReply value) {
        this.activeProfileReply = value;
    }

    /**
     * Obtiene el valor de la propiedad velocityInfoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityInfoCode() {
        return velocityInfoCode;
    }

    /**
     * Define el valor de la propiedad velocityInfoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityInfoCode(String value) {
        this.velocityInfoCode = value;
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

    /**
     * Obtiene el valor de la propiedad travel.
     * 
     * @return
     *     possible object is
     *     {@link Travel }
     *     
     */
    public Travel getTravel() {
        return travel;
    }

    /**
     * Define el valor de la propiedad travel.
     * 
     * @param value
     *     allowed object is
     *     {@link Travel }
     *     
     */
    public void setTravel(Travel value) {
        this.travel = value;
    }

}

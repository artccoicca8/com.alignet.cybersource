
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DecisionManager complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DecisionManager">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enabled" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="travelData" type="{urn:schemas-cybersource-com:transaction-data-1.159}DecisionManagerTravelData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionManager", propOrder = {
    "enabled",
    "profile",
    "travelData"
})
public class DecisionManager {

    protected String enabled;
    protected String profile;
    protected DecisionManagerTravelData travelData;

    /**
     * Obtiene el valor de la propiedad enabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Define el valor de la propiedad enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad profile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Define el valor de la propiedad profile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Obtiene el valor de la propiedad travelData.
     * 
     * @return
     *     possible object is
     *     {@link DecisionManagerTravelData }
     *     
     */
    public DecisionManagerTravelData getTravelData() {
        return travelData;
    }

    /**
     * Define el valor de la propiedad travelData.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionManagerTravelData }
     *     
     */
    public void setTravelData(DecisionManagerTravelData value) {
        this.travelData = value;
    }

}

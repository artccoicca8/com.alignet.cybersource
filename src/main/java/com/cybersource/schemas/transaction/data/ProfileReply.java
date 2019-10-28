
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProfileReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProfileReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationQueue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profileScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rulesTriggered" type="{urn:schemas-cybersource-com:transaction-data-1.159}RuleResultItems" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileReply", propOrder = {
    "selectedBy",
    "name",
    "destinationQueue",
    "profileScore",
    "rulesTriggered"
})
public class ProfileReply {

    protected String selectedBy;
    protected String name;
    protected String destinationQueue;
    protected String profileScore;
    protected RuleResultItems rulesTriggered;

    /**
     * Obtiene el valor de la propiedad selectedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedBy() {
        return selectedBy;
    }

    /**
     * Define el valor de la propiedad selectedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedBy(String value) {
        this.selectedBy = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationQueue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationQueue() {
        return destinationQueue;
    }

    /**
     * Define el valor de la propiedad destinationQueue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationQueue(String value) {
        this.destinationQueue = value;
    }

    /**
     * Obtiene el valor de la propiedad profileScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileScore() {
        return profileScore;
    }

    /**
     * Define el valor de la propiedad profileScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileScore(String value) {
        this.profileScore = value;
    }

    /**
     * Obtiene el valor de la propiedad rulesTriggered.
     * 
     * @return
     *     possible object is
     *     {@link RuleResultItems }
     *     
     */
    public RuleResultItems getRulesTriggered() {
        return rulesTriggered;
    }

    /**
     * Define el valor de la propiedad rulesTriggered.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleResultItems }
     *     
     */
    public void setRulesTriggered(RuleResultItems value) {
        this.rulesTriggered = value;
    }

}

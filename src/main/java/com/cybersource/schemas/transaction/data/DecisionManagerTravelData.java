
package com.cybersource.schemas.transaction.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DecisionManagerTravelData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DecisionManagerTravelData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leg" type="{urn:schemas-cybersource-com:transaction-data-1.159}DecisionManagerTravelLeg" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="departureDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="completeRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="journeyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualFinalDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionManagerTravelData", propOrder = {
    "leg",
    "departureDateTime",
    "completeRoute",
    "journeyType",
    "actualFinalDestination"
})
public class DecisionManagerTravelData {

    protected List<DecisionManagerTravelLeg> leg;
    protected String departureDateTime;
    protected String completeRoute;
    protected String journeyType;
    protected String actualFinalDestination;

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionManagerTravelLeg }
     * 
     * 
     */
    public List<DecisionManagerTravelLeg> getLeg() {
        if (leg == null) {
            leg = new ArrayList<DecisionManagerTravelLeg>();
        }
        return this.leg;
    }

    /**
     * Obtiene el valor de la propiedad departureDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Define el valor de la propiedad departureDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(String value) {
        this.departureDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad completeRoute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteRoute() {
        return completeRoute;
    }

    /**
     * Define el valor de la propiedad completeRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteRoute(String value) {
        this.completeRoute = value;
    }

    /**
     * Obtiene el valor de la propiedad journeyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyType() {
        return journeyType;
    }

    /**
     * Define el valor de la propiedad journeyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyType(String value) {
        this.journeyType = value;
    }

    /**
     * Obtiene el valor de la propiedad actualFinalDestination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFinalDestination() {
        return actualFinalDestination;
    }

    /**
     * Define el valor de la propiedad actualFinalDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFinalDestination(String value) {
        this.actualFinalDestination = value;
    }

}

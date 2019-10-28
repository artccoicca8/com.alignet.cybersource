
package com.cybersource.schemas.transaction.data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Travel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Travel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualFinalDestinationCountry" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedString" minOccurs="0"/>
 *         &lt;element name="actualFinalDestinationCity" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedString" minOccurs="0"/>
 *         &lt;element name="actualFinalDestinationLatitude" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedDecimal" minOccurs="0"/>
 *         &lt;element name="actualFinalDestinationLongitude" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedDecimal" minOccurs="0"/>
 *         &lt;element name="firstDepartureCountry" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedString" minOccurs="0"/>
 *         &lt;element name="firstDepartureCity" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedString" minOccurs="0"/>
 *         &lt;element name="firstDepartureLatitude" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedDecimal" minOccurs="0"/>
 *         &lt;element name="firstDepartureLongitude" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedDecimal" minOccurs="0"/>
 *         &lt;element name="firstDestinationCountry" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedString" minOccurs="0"/>
 *         &lt;element name="firstDestinationCity" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedString" minOccurs="0"/>
 *         &lt;element name="firstDestinationLatitude" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedDecimal" minOccurs="0"/>
 *         &lt;element name="firstDestinationLongitude" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedDecimal" minOccurs="0"/>
 *         &lt;element name="lastDestinationCountry" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedString" minOccurs="0"/>
 *         &lt;element name="lastDestinationCity" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedString" minOccurs="0"/>
 *         &lt;element name="lastDestinationLatitude" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedDecimal" minOccurs="0"/>
 *         &lt;element name="lastDestinationLongitude" type="{urn:schemas-cybersource-com:transaction-data-1.159}RestrictedDecimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Travel", propOrder = {
    "actualFinalDestinationCountry",
    "actualFinalDestinationCity",
    "actualFinalDestinationLatitude",
    "actualFinalDestinationLongitude",
    "firstDepartureCountry",
    "firstDepartureCity",
    "firstDepartureLatitude",
    "firstDepartureLongitude",
    "firstDestinationCountry",
    "firstDestinationCity",
    "firstDestinationLatitude",
    "firstDestinationLongitude",
    "lastDestinationCountry",
    "lastDestinationCity",
    "lastDestinationLatitude",
    "lastDestinationLongitude"
})
public class Travel {

    protected String actualFinalDestinationCountry;
    protected String actualFinalDestinationCity;
    protected BigDecimal actualFinalDestinationLatitude;
    protected BigDecimal actualFinalDestinationLongitude;
    protected String firstDepartureCountry;
    protected String firstDepartureCity;
    protected BigDecimal firstDepartureLatitude;
    protected BigDecimal firstDepartureLongitude;
    protected String firstDestinationCountry;
    protected String firstDestinationCity;
    protected BigDecimal firstDestinationLatitude;
    protected BigDecimal firstDestinationLongitude;
    protected String lastDestinationCountry;
    protected String lastDestinationCity;
    protected BigDecimal lastDestinationLatitude;
    protected BigDecimal lastDestinationLongitude;

    /**
     * Obtiene el valor de la propiedad actualFinalDestinationCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFinalDestinationCountry() {
        return actualFinalDestinationCountry;
    }

    /**
     * Define el valor de la propiedad actualFinalDestinationCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFinalDestinationCountry(String value) {
        this.actualFinalDestinationCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad actualFinalDestinationCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFinalDestinationCity() {
        return actualFinalDestinationCity;
    }

    /**
     * Define el valor de la propiedad actualFinalDestinationCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFinalDestinationCity(String value) {
        this.actualFinalDestinationCity = value;
    }

    /**
     * Obtiene el valor de la propiedad actualFinalDestinationLatitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualFinalDestinationLatitude() {
        return actualFinalDestinationLatitude;
    }

    /**
     * Define el valor de la propiedad actualFinalDestinationLatitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualFinalDestinationLatitude(BigDecimal value) {
        this.actualFinalDestinationLatitude = value;
    }

    /**
     * Obtiene el valor de la propiedad actualFinalDestinationLongitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualFinalDestinationLongitude() {
        return actualFinalDestinationLongitude;
    }

    /**
     * Define el valor de la propiedad actualFinalDestinationLongitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualFinalDestinationLongitude(BigDecimal value) {
        this.actualFinalDestinationLongitude = value;
    }

    /**
     * Obtiene el valor de la propiedad firstDepartureCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDepartureCountry() {
        return firstDepartureCountry;
    }

    /**
     * Define el valor de la propiedad firstDepartureCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDepartureCountry(String value) {
        this.firstDepartureCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad firstDepartureCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDepartureCity() {
        return firstDepartureCity;
    }

    /**
     * Define el valor de la propiedad firstDepartureCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDepartureCity(String value) {
        this.firstDepartureCity = value;
    }

    /**
     * Obtiene el valor de la propiedad firstDepartureLatitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstDepartureLatitude() {
        return firstDepartureLatitude;
    }

    /**
     * Define el valor de la propiedad firstDepartureLatitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstDepartureLatitude(BigDecimal value) {
        this.firstDepartureLatitude = value;
    }

    /**
     * Obtiene el valor de la propiedad firstDepartureLongitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstDepartureLongitude() {
        return firstDepartureLongitude;
    }

    /**
     * Define el valor de la propiedad firstDepartureLongitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstDepartureLongitude(BigDecimal value) {
        this.firstDepartureLongitude = value;
    }

    /**
     * Obtiene el valor de la propiedad firstDestinationCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDestinationCountry() {
        return firstDestinationCountry;
    }

    /**
     * Define el valor de la propiedad firstDestinationCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDestinationCountry(String value) {
        this.firstDestinationCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad firstDestinationCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDestinationCity() {
        return firstDestinationCity;
    }

    /**
     * Define el valor de la propiedad firstDestinationCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDestinationCity(String value) {
        this.firstDestinationCity = value;
    }

    /**
     * Obtiene el valor de la propiedad firstDestinationLatitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstDestinationLatitude() {
        return firstDestinationLatitude;
    }

    /**
     * Define el valor de la propiedad firstDestinationLatitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstDestinationLatitude(BigDecimal value) {
        this.firstDestinationLatitude = value;
    }

    /**
     * Obtiene el valor de la propiedad firstDestinationLongitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstDestinationLongitude() {
        return firstDestinationLongitude;
    }

    /**
     * Define el valor de la propiedad firstDestinationLongitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstDestinationLongitude(BigDecimal value) {
        this.firstDestinationLongitude = value;
    }

    /**
     * Obtiene el valor de la propiedad lastDestinationCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDestinationCountry() {
        return lastDestinationCountry;
    }

    /**
     * Define el valor de la propiedad lastDestinationCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDestinationCountry(String value) {
        this.lastDestinationCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad lastDestinationCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDestinationCity() {
        return lastDestinationCity;
    }

    /**
     * Define el valor de la propiedad lastDestinationCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDestinationCity(String value) {
        this.lastDestinationCity = value;
    }

    /**
     * Obtiene el valor de la propiedad lastDestinationLatitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastDestinationLatitude() {
        return lastDestinationLatitude;
    }

    /**
     * Define el valor de la propiedad lastDestinationLatitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastDestinationLatitude(BigDecimal value) {
        this.lastDestinationLatitude = value;
    }

    /**
     * Obtiene el valor de la propiedad lastDestinationLongitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastDestinationLongitude() {
        return lastDestinationLongitude;
    }

    /**
     * Define el valor de la propiedad lastDestinationLongitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastDestinationLongitude(BigDecimal value) {
        this.lastDestinationLongitude = value;
    }

}

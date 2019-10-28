
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Leg complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Leg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originatingAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stopoverCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fareBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conjunctionTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="couponNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureTimeSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalTimeSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endorsementsRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leg", propOrder = {
    "carrierCode",
    "flightNumber",
    "originatingAirportCode",
    "clazz",
    "stopoverCode",
    "departureDate",
    "destination",
    "fareBasis",
    "departTax",
    "conjunctionTicket",
    "exchangeTicket",
    "couponNumber",
    "departureTime",
    "departureTimeSegment",
    "arrivalTime",
    "arrivalTimeSegment",
    "endorsementsRestrictions",
    "fare",
    "fee",
    "tax"
})
public class Leg {

    protected String carrierCode;
    protected String flightNumber;
    protected String originatingAirportCode;
    @XmlElement(name = "class")
    protected String clazz;
    protected String stopoverCode;
    protected String departureDate;
    protected String destination;
    protected String fareBasis;
    protected String departTax;
    protected String conjunctionTicket;
    protected String exchangeTicket;
    protected String couponNumber;
    protected String departureTime;
    protected String departureTimeSegment;
    protected String arrivalTime;
    protected String arrivalTimeSegment;
    protected String endorsementsRestrictions;
    protected String fare;
    protected String fee;
    protected String tax;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;

    /**
     * Obtiene el valor de la propiedad carrierCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Define el valor de la propiedad carrierCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Obtiene el valor de la propiedad flightNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Define el valor de la propiedad flightNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad originatingAirportCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingAirportCode() {
        return originatingAirportCode;
    }

    /**
     * Define el valor de la propiedad originatingAirportCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingAirportCode(String value) {
        this.originatingAirportCode = value;
    }

    /**
     * Obtiene el valor de la propiedad clazz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Define el valor de la propiedad clazz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Obtiene el valor de la propiedad stopoverCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopoverCode() {
        return stopoverCode;
    }

    /**
     * Define el valor de la propiedad stopoverCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopoverCode(String value) {
        this.stopoverCode = value;
    }

    /**
     * Obtiene el valor de la propiedad departureDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Define el valor de la propiedad departureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Obtiene el valor de la propiedad destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Define el valor de la propiedad destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Obtiene el valor de la propiedad fareBasis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Define el valor de la propiedad fareBasis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Obtiene el valor de la propiedad departTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartTax() {
        return departTax;
    }

    /**
     * Define el valor de la propiedad departTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartTax(String value) {
        this.departTax = value;
    }

    /**
     * Obtiene el valor de la propiedad conjunctionTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConjunctionTicket() {
        return conjunctionTicket;
    }

    /**
     * Define el valor de la propiedad conjunctionTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConjunctionTicket(String value) {
        this.conjunctionTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeTicket() {
        return exchangeTicket;
    }

    /**
     * Define el valor de la propiedad exchangeTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeTicket(String value) {
        this.exchangeTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad couponNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponNumber() {
        return couponNumber;
    }

    /**
     * Define el valor de la propiedad couponNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponNumber(String value) {
        this.couponNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad departureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Define el valor de la propiedad departureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Obtiene el valor de la propiedad departureTimeSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTimeSegment() {
        return departureTimeSegment;
    }

    /**
     * Define el valor de la propiedad departureTimeSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTimeSegment(String value) {
        this.departureTimeSegment = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Define el valor de la propiedad arrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalTimeSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTimeSegment() {
        return arrivalTimeSegment;
    }

    /**
     * Define el valor de la propiedad arrivalTimeSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTimeSegment(String value) {
        this.arrivalTimeSegment = value;
    }

    /**
     * Obtiene el valor de la propiedad endorsementsRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementsRestrictions() {
        return endorsementsRestrictions;
    }

    /**
     * Define el valor de la propiedad endorsementsRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementsRestrictions(String value) {
        this.endorsementsRestrictions = value;
    }

    /**
     * Obtiene el valor de la propiedad fare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFare() {
        return fare;
    }

    /**
     * Define el valor de la propiedad fare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFare(String value) {
        this.fare = value;
    }

    /**
     * Obtiene el valor de la propiedad fee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFee() {
        return fee;
    }

    /**
     * Define el valor de la propiedad fee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFee(String value) {
        this.fee = value;
    }

    /**
     * Obtiene el valor de la propiedad tax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax() {
        return tax;
    }

    /**
     * Define el valor de la propiedad tax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax(String value) {
        this.tax = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}

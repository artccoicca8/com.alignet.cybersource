
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Aft complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Aft">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignExchangeFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aft", propOrder = {
    "indicator",
    "serviceFee",
    "foreignExchangeFee"
})
public class Aft {

    protected String indicator;
    protected String serviceFee;
    protected String foreignExchangeFee;

    /**
     * Obtiene el valor de la propiedad indicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Define el valor de la propiedad indicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFee() {
        return serviceFee;
    }

    /**
     * Define el valor de la propiedad serviceFee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFee(String value) {
        this.serviceFee = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignExchangeFee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignExchangeFee() {
        return foreignExchangeFee;
    }

    /**
     * Define el valor de la propiedad foreignExchangeFee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignExchangeFee(String value) {
        this.foreignExchangeFee = value;
    }

}

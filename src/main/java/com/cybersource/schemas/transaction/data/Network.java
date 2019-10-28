
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Network complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Network">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="octDomesticIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="octCrossBorderIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aftDomesticIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aftCrossBorderIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Network", propOrder = {

})
public class Network {

    protected String octDomesticIndicator;
    protected String octCrossBorderIndicator;
    protected String aftDomesticIndicator;
    protected String aftCrossBorderIndicator;
    protected String networkID;
    protected String networkOrder;
    @XmlAttribute(name = "id")
    protected BigInteger id;

    /**
     * Obtiene el valor de la propiedad octDomesticIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctDomesticIndicator() {
        return octDomesticIndicator;
    }

    /**
     * Define el valor de la propiedad octDomesticIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctDomesticIndicator(String value) {
        this.octDomesticIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad octCrossBorderIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOctCrossBorderIndicator() {
        return octCrossBorderIndicator;
    }

    /**
     * Define el valor de la propiedad octCrossBorderIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOctCrossBorderIndicator(String value) {
        this.octCrossBorderIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad aftDomesticIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAftDomesticIndicator() {
        return aftDomesticIndicator;
    }

    /**
     * Define el valor de la propiedad aftDomesticIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAftDomesticIndicator(String value) {
        this.aftDomesticIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad aftCrossBorderIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAftCrossBorderIndicator() {
        return aftCrossBorderIndicator;
    }

    /**
     * Define el valor de la propiedad aftCrossBorderIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAftCrossBorderIndicator(String value) {
        this.aftCrossBorderIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad networkID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkID() {
        return networkID;
    }

    /**
     * Define el valor de la propiedad networkID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkID(String value) {
        this.networkID = value;
    }

    /**
     * Obtiene el valor de la propiedad networkOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkOrder() {
        return networkOrder;
    }

    /**
     * Define el valor de la propiedad networkOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkOrder(String value) {
        this.networkOrder = value;
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

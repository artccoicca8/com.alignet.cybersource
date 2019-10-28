
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionGroup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subtotalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="prohibitDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionGroup", propOrder = {
    "subtotalAmount",
    "taxRate",
    "prohibitDiscount"
})
public class PromotionGroup {

    protected String subtotalAmount;
    protected String taxRate;
    protected String prohibitDiscount;
    @XmlAttribute(name = "id")
    protected BigInteger id;

    /**
     * Obtiene el valor de la propiedad subtotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Define el valor de la propiedad subtotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotalAmount(String value) {
        this.subtotalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Define el valor de la propiedad taxRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * Obtiene el valor de la propiedad prohibitDiscount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProhibitDiscount() {
        return prohibitDiscount;
    }

    /**
     * Define el valor de la propiedad prohibitDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProhibitDiscount(String value) {
        this.prohibitDiscount = value;
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

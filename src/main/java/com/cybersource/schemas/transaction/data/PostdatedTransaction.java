
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PostdatedTransaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PostdatedTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guaranteeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guaranteeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementDate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostdatedTransaction", propOrder = {
    "guaranteeIndicator",
    "guaranteeAmount",
    "settlementDate"
})
public class PostdatedTransaction {

    protected String guaranteeIndicator;
    protected String guaranteeAmount;
    protected BigInteger settlementDate;

    /**
     * Obtiene el valor de la propiedad guaranteeIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeIndicator() {
        return guaranteeIndicator;
    }

    /**
     * Define el valor de la propiedad guaranteeIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeIndicator(String value) {
        this.guaranteeIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad guaranteeAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /**
     * Define el valor de la propiedad guaranteeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeAmount(String value) {
        this.guaranteeAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad settlementDate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlementDate() {
        return settlementDate;
    }

    /**
     * Define el valor de la propiedad settlementDate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlementDate(BigInteger value) {
        this.settlementDate = value;
    }

}


package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UCAF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UCAF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downgradeReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UCAF", propOrder = {
    "authenticationData",
    "collectionIndicator",
    "downgradeReasonCode"
})
public class UCAF {

    protected String authenticationData;
    protected String collectionIndicator;
    protected String downgradeReasonCode;

    /**
     * Obtiene el valor de la propiedad authenticationData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationData() {
        return authenticationData;
    }

    /**
     * Define el valor de la propiedad authenticationData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationData(String value) {
        this.authenticationData = value;
    }

    /**
     * Obtiene el valor de la propiedad collectionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionIndicator() {
        return collectionIndicator;
    }

    /**
     * Define el valor de la propiedad collectionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionIndicator(String value) {
        this.collectionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad downgradeReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDowngradeReasonCode() {
        return downgradeReasonCode;
    }

    /**
     * Define el valor de la propiedad downgradeReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDowngradeReasonCode(String value) {
        this.downgradeReasonCode = value;
    }

}

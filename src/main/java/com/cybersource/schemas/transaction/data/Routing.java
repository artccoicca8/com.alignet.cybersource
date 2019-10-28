
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Routing complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Routing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="networkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signatureCVMRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Routing", propOrder = {
    "networkType",
    "networkLabel",
    "signatureCVMRequired"
})
public class Routing {

    protected String networkType;
    protected String networkLabel;
    protected String signatureCVMRequired;

    /**
     * Obtiene el valor de la propiedad networkType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Define el valor de la propiedad networkType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Obtiene el valor de la propiedad networkLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkLabel() {
        return networkLabel;
    }

    /**
     * Define el valor de la propiedad networkLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkLabel(String value) {
        this.networkLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureCVMRequired.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureCVMRequired() {
        return signatureCVMRequired;
    }

    /**
     * Define el valor de la propiedad signatureCVMRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureCVMRequired(String value) {
        this.signatureCVMRequired = value;
    }

}

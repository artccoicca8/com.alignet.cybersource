
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExportReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExportReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ipCountryConfidence" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="infoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportReply", propOrder = {
    "reasonCode",
    "ipCountryConfidence",
    "infoCode"
})
public class ExportReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected BigInteger ipCountryConfidence;
    protected String infoCode;

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad ipCountryConfidence.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIpCountryConfidence() {
        return ipCountryConfidence;
    }

    /**
     * Define el valor de la propiedad ipCountryConfidence.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIpCountryConfidence(BigInteger value) {
        this.ipCountryConfidence = value;
    }

    /**
     * Obtiene el valor de la propiedad infoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoCode() {
        return infoCode;
    }

    /**
     * Define el valor de la propiedad infoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoCode(String value) {
        this.infoCode = value;
    }

}


package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCDCCReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCDCCReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dccSupported" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="validHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marginRatePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCDCCReply", propOrder = {
    "reasonCode",
    "dccSupported",
    "validHours",
    "marginRatePercentage",
    "reconciliationID"
})
public class CCDCCReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String dccSupported;
    protected String validHours;
    protected String marginRatePercentage;
    protected String reconciliationID;

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
     * Obtiene el valor de la propiedad dccSupported.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccSupported() {
        return dccSupported;
    }

    /**
     * Define el valor de la propiedad dccSupported.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccSupported(String value) {
        this.dccSupported = value;
    }

    /**
     * Obtiene el valor de la propiedad validHours.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidHours() {
        return validHours;
    }

    /**
     * Define el valor de la propiedad validHours.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidHours(String value) {
        this.validHours = value;
    }

    /**
     * Obtiene el valor de la propiedad marginRatePercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginRatePercentage() {
        return marginRatePercentage;
    }

    /**
     * Define el valor de la propiedad marginRatePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginRatePercentage(String value) {
        this.marginRatePercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad reconciliationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Define el valor de la propiedad reconciliationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

}

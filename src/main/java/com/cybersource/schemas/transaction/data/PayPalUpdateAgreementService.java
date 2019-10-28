
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalUpdateAgreementService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalUpdateAgreementService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paypalBillingAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalBillingAgreementStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalBillingAgreementDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalBillingAgreementCustom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="run" use="required" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalUpdateAgreementService", propOrder = {
    "paypalBillingAgreementId",
    "paypalBillingAgreementStatus",
    "paypalBillingAgreementDesc",
    "paypalBillingAgreementCustom"
})
public class PayPalUpdateAgreementService {

    protected String paypalBillingAgreementId;
    protected String paypalBillingAgreementStatus;
    protected String paypalBillingAgreementDesc;
    protected String paypalBillingAgreementCustom;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad paypalBillingAgreementId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementId() {
        return paypalBillingAgreementId;
    }

    /**
     * Define el valor de la propiedad paypalBillingAgreementId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementId(String value) {
        this.paypalBillingAgreementId = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalBillingAgreementStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementStatus() {
        return paypalBillingAgreementStatus;
    }

    /**
     * Define el valor de la propiedad paypalBillingAgreementStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementStatus(String value) {
        this.paypalBillingAgreementStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalBillingAgreementDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementDesc() {
        return paypalBillingAgreementDesc;
    }

    /**
     * Define el valor de la propiedad paypalBillingAgreementDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementDesc(String value) {
        this.paypalBillingAgreementDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalBillingAgreementCustom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementCustom() {
        return paypalBillingAgreementCustom;
    }

    /**
     * Define el valor de la propiedad paypalBillingAgreementCustom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementCustom(String value) {
        this.paypalBillingAgreementCustom = value;
    }

    /**
     * Obtiene el valor de la propiedad run.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Define el valor de la propiedad run.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
    }

}

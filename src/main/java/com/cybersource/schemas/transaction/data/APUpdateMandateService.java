
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para APUpdateMandateService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="APUpdateMandateService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failureURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "APUpdateMandateService", propOrder = {
    "esign",
    "cancelURL",
    "successURL",
    "failureURL"
})
public class APUpdateMandateService {

    protected String esign;
    protected String cancelURL;
    protected String successURL;
    protected String failureURL;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad esign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsign() {
        return esign;
    }

    /**
     * Define el valor de la propiedad esign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsign(String value) {
        this.esign = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelURL() {
        return cancelURL;
    }

    /**
     * Define el valor de la propiedad cancelURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelURL(String value) {
        this.cancelURL = value;
    }

    /**
     * Obtiene el valor de la propiedad successURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessURL() {
        return successURL;
    }

    /**
     * Define el valor de la propiedad successURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessURL(String value) {
        this.successURL = value;
    }

    /**
     * Obtiene el valor de la propiedad failureURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureURL() {
        return failureURL;
    }

    /**
     * Define el valor de la propiedad failureURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureURL(String value) {
        this.failureURL = value;
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

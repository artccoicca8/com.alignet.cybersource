
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DirectDebitMandateService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitMandateService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mandateDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstDebitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DirectDebitMandateService", propOrder = {
    "mandateDescriptor",
    "firstDebitDate"
})
public class DirectDebitMandateService {

    protected String mandateDescriptor;
    protected String firstDebitDate;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad mandateDescriptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateDescriptor() {
        return mandateDescriptor;
    }

    /**
     * Define el valor de la propiedad mandateDescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateDescriptor(String value) {
        this.mandateDescriptor = value;
    }

    /**
     * Obtiene el valor de la propiedad firstDebitDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDebitDate() {
        return firstDebitDate;
    }

    /**
     * Define el valor de la propiedad firstDebitDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDebitDate(String value) {
        this.firstDebitDate = value;
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

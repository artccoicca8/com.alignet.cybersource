
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExportService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExportService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sanctionsLists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ExportService", propOrder = {
    "addressOperator",
    "addressWeight",
    "companyWeight",
    "nameWeight",
    "sanctionsLists"
})
public class ExportService {

    protected String addressOperator;
    protected String addressWeight;
    protected String companyWeight;
    protected String nameWeight;
    protected String sanctionsLists;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad addressOperator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOperator() {
        return addressOperator;
    }

    /**
     * Define el valor de la propiedad addressOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOperator(String value) {
        this.addressOperator = value;
    }

    /**
     * Obtiene el valor de la propiedad addressWeight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressWeight() {
        return addressWeight;
    }

    /**
     * Define el valor de la propiedad addressWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressWeight(String value) {
        this.addressWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad companyWeight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWeight() {
        return companyWeight;
    }

    /**
     * Define el valor de la propiedad companyWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWeight(String value) {
        this.companyWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad nameWeight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWeight() {
        return nameWeight;
    }

    /**
     * Define el valor de la propiedad nameWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWeight(String value) {
        this.nameWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad sanctionsLists.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionsLists() {
        return sanctionsLists;
    }

    /**
     * Define el valor de la propiedad sanctionsLists.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionsLists(String value) {
        this.sanctionsLists = value;
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

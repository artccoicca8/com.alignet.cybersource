
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AFSService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AFSService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="avsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disableAVSScoring" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="customRiskModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AFSService", propOrder = {
    "avsCode",
    "cvCode",
    "disableAVSScoring",
    "customRiskModel"
})
public class AFSService {

    protected String avsCode;
    protected String cvCode;
    protected String disableAVSScoring;
    protected String customRiskModel;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad avsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCode() {
        return avsCode;
    }

    /**
     * Define el valor de la propiedad avsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCode(String value) {
        this.avsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cvCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvCode() {
        return cvCode;
    }

    /**
     * Define el valor de la propiedad cvCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvCode(String value) {
        this.cvCode = value;
    }

    /**
     * Obtiene el valor de la propiedad disableAVSScoring.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableAVSScoring() {
        return disableAVSScoring;
    }

    /**
     * Define el valor de la propiedad disableAVSScoring.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableAVSScoring(String value) {
        this.disableAVSScoring = value;
    }

    /**
     * Obtiene el valor de la propiedad customRiskModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomRiskModel() {
        return customRiskModel;
    }

    /**
     * Define el valor de la propiedad customRiskModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomRiskModel(String value) {
        this.customRiskModel = value;
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

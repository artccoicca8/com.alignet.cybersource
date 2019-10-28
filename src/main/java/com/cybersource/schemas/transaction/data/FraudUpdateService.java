
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FraudUpdateService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FraudUpdateService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markingNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markingRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markingTransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markingAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="markingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "FraudUpdateService", propOrder = {
    "actionCode",
    "markedData",
    "markingReason",
    "markingNotes",
    "markingRequestID",
    "markingTransactionDate",
    "markingAmount",
    "markingCurrency",
    "markingIndicator"
})
public class FraudUpdateService {

    protected String actionCode;
    protected String markedData;
    protected String markingReason;
    protected String markingNotes;
    protected String markingRequestID;
    protected String markingTransactionDate;
    protected String markingAmount;
    protected String markingCurrency;
    protected String markingIndicator;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad actionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Define el valor de la propiedad actionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad markedData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkedData() {
        return markedData;
    }

    /**
     * Define el valor de la propiedad markedData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkedData(String value) {
        this.markedData = value;
    }

    /**
     * Obtiene el valor de la propiedad markingReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingReason() {
        return markingReason;
    }

    /**
     * Define el valor de la propiedad markingReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingReason(String value) {
        this.markingReason = value;
    }

    /**
     * Obtiene el valor de la propiedad markingNotes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingNotes() {
        return markingNotes;
    }

    /**
     * Define el valor de la propiedad markingNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingNotes(String value) {
        this.markingNotes = value;
    }

    /**
     * Obtiene el valor de la propiedad markingRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingRequestID() {
        return markingRequestID;
    }

    /**
     * Define el valor de la propiedad markingRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingRequestID(String value) {
        this.markingRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad markingTransactionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingTransactionDate() {
        return markingTransactionDate;
    }

    /**
     * Define el valor de la propiedad markingTransactionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingTransactionDate(String value) {
        this.markingTransactionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad markingAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingAmount() {
        return markingAmount;
    }

    /**
     * Define el valor de la propiedad markingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingAmount(String value) {
        this.markingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad markingCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingCurrency() {
        return markingCurrency;
    }

    /**
     * Define el valor de la propiedad markingCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingCurrency(String value) {
        this.markingCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad markingIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingIndicator() {
        return markingIndicator;
    }

    /**
     * Define el valor de la propiedad markingIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingIndicator(String value) {
        this.markingIndicator = value;
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

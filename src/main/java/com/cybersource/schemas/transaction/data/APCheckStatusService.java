
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para APCheckStatusService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="APCheckStatusService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apInitiateRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkStatusRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionsRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "APCheckStatusService", propOrder = {
    "apInitiateRequestID",
    "reconciliationID",
    "checkStatusRequestID",
    "sessionsRequestID"
})
public class APCheckStatusService {

    protected String apInitiateRequestID;
    protected String reconciliationID;
    protected String checkStatusRequestID;
    protected String sessionsRequestID;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad apInitiateRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApInitiateRequestID() {
        return apInitiateRequestID;
    }

    /**
     * Define el valor de la propiedad apInitiateRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApInitiateRequestID(String value) {
        this.apInitiateRequestID = value;
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

    /**
     * Obtiene el valor de la propiedad checkStatusRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatusRequestID() {
        return checkStatusRequestID;
    }

    /**
     * Define el valor de la propiedad checkStatusRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatusRequestID(String value) {
        this.checkStatusRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionsRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionsRequestID() {
        return sessionsRequestID;
    }

    /**
     * Define el valor de la propiedad sessionsRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionsRequestID(String value) {
        this.sessionsRequestID = value;
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

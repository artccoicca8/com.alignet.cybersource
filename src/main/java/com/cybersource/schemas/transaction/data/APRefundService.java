
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para APRefundService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="APRefundService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="captureRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apInitiateRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "APRefundService", propOrder = {
    "captureRequestID",
    "refundRequestID",
    "reason",
    "instant",
    "note",
    "apInitiateRequestID",
    "returnRef",
    "reconciliationID",
    "saleRequestID"
})
public class APRefundService {

    protected String captureRequestID;
    protected String refundRequestID;
    protected String reason;
    protected String instant;
    protected String note;
    protected String apInitiateRequestID;
    protected String returnRef;
    protected String reconciliationID;
    protected String saleRequestID;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad captureRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureRequestID() {
        return captureRequestID;
    }

    /**
     * Define el valor de la propiedad captureRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureRequestID(String value) {
        this.captureRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad refundRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundRequestID() {
        return refundRequestID;
    }

    /**
     * Define el valor de la propiedad refundRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundRequestID(String value) {
        this.refundRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad reason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Define el valor de la propiedad reason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Obtiene el valor de la propiedad instant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstant() {
        return instant;
    }

    /**
     * Define el valor de la propiedad instant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstant(String value) {
        this.instant = value;
    }

    /**
     * Obtiene el valor de la propiedad note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Define el valor de la propiedad note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

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
     * Obtiene el valor de la propiedad returnRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnRef() {
        return returnRef;
    }

    /**
     * Define el valor de la propiedad returnRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnRef(String value) {
        this.returnRef = value;
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
     * Obtiene el valor de la propiedad saleRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRequestID() {
        return saleRequestID;
    }

    /**
     * Define el valor de la propiedad saleRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRequestID(String value) {
        this.saleRequestID = value;
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

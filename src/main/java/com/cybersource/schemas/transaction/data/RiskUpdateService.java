
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RiskUpdateService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RiskUpdateService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="negativeAddress" type="{urn:schemas-cybersource-com:transaction-data-1.159}Address" minOccurs="0"/>
 *         &lt;element name="markingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markingNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markingRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceFingerprintSmartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceFingerprintTrueIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceFingerprintProxyIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RiskUpdateService", propOrder = {
    "actionCode",
    "recordID",
    "recordName",
    "negativeAddress",
    "markingReason",
    "markingNotes",
    "markingRequestID",
    "deviceFingerprintSmartID",
    "deviceFingerprintTrueIPAddress",
    "deviceFingerprintProxyIPAddress"
})
public class RiskUpdateService {

    protected String actionCode;
    protected String recordID;
    protected String recordName;
    protected Address negativeAddress;
    protected String markingReason;
    protected String markingNotes;
    protected String markingRequestID;
    protected String deviceFingerprintSmartID;
    protected String deviceFingerprintTrueIPAddress;
    protected String deviceFingerprintProxyIPAddress;
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
     * Obtiene el valor de la propiedad recordID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * Define el valor de la propiedad recordID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordID(String value) {
        this.recordID = value;
    }

    /**
     * Obtiene el valor de la propiedad recordName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Define el valor de la propiedad recordName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Obtiene el valor de la propiedad negativeAddress.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getNegativeAddress() {
        return negativeAddress;
    }

    /**
     * Define el valor de la propiedad negativeAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setNegativeAddress(Address value) {
        this.negativeAddress = value;
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
     * Obtiene el valor de la propiedad deviceFingerprintSmartID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintSmartID() {
        return deviceFingerprintSmartID;
    }

    /**
     * Define el valor de la propiedad deviceFingerprintSmartID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintSmartID(String value) {
        this.deviceFingerprintSmartID = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceFingerprintTrueIPAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintTrueIPAddress() {
        return deviceFingerprintTrueIPAddress;
    }

    /**
     * Define el valor de la propiedad deviceFingerprintTrueIPAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintTrueIPAddress(String value) {
        this.deviceFingerprintTrueIPAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceFingerprintProxyIPAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintProxyIPAddress() {
        return deviceFingerprintProxyIPAddress;
    }

    /**
     * Define el valor de la propiedad deviceFingerprintProxyIPAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintProxyIPAddress(String value) {
        this.deviceFingerprintProxyIPAddress = value;
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


package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BankTransferRefundService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BankTransferRefundService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankTransferRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransferRealTimeRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransferRealTimeReconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransferRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankTransferRealTimeRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BankTransferRefundService", propOrder = {
    "bankTransferRequestID",
    "bankTransferRealTimeRequestID",
    "reconciliationID",
    "bankTransferRealTimeReconciliationID",
    "bankTransferRequestToken",
    "bankTransferRealTimeRequestToken"
})
public class BankTransferRefundService {

    protected String bankTransferRequestID;
    protected String bankTransferRealTimeRequestID;
    protected String reconciliationID;
    protected String bankTransferRealTimeReconciliationID;
    protected String bankTransferRequestToken;
    protected String bankTransferRealTimeRequestToken;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad bankTransferRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransferRequestID() {
        return bankTransferRequestID;
    }

    /**
     * Define el valor de la propiedad bankTransferRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransferRequestID(String value) {
        this.bankTransferRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad bankTransferRealTimeRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransferRealTimeRequestID() {
        return bankTransferRealTimeRequestID;
    }

    /**
     * Define el valor de la propiedad bankTransferRealTimeRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransferRealTimeRequestID(String value) {
        this.bankTransferRealTimeRequestID = value;
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
     * Obtiene el valor de la propiedad bankTransferRealTimeReconciliationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransferRealTimeReconciliationID() {
        return bankTransferRealTimeReconciliationID;
    }

    /**
     * Define el valor de la propiedad bankTransferRealTimeReconciliationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransferRealTimeReconciliationID(String value) {
        this.bankTransferRealTimeReconciliationID = value;
    }

    /**
     * Obtiene el valor de la propiedad bankTransferRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransferRequestToken() {
        return bankTransferRequestToken;
    }

    /**
     * Define el valor de la propiedad bankTransferRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransferRequestToken(String value) {
        this.bankTransferRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad bankTransferRealTimeRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTransferRealTimeRequestToken() {
        return bankTransferRealTimeRequestToken;
    }

    /**
     * Define el valor de la propiedad bankTransferRealTimeRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTransferRealTimeRequestToken(String value) {
        this.bankTransferRealTimeRequestToken = value;
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

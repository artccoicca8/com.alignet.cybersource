
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ECAuthenticateReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ECAuthenticateReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="processorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkpointSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraudShieldIndicators" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECAuthenticateReply", propOrder = {
    "reasonCode",
    "requestDateTime",
    "processorResponse",
    "reconciliationID",
    "checkpointSummary",
    "fraudShieldIndicators"
})
public class ECAuthenticateReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String requestDateTime;
    protected String processorResponse;
    protected String reconciliationID;
    protected String checkpointSummary;
    protected String fraudShieldIndicators;

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad requestDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDateTime() {
        return requestDateTime;
    }

    /**
     * Define el valor de la propiedad requestDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDateTime(String value) {
        this.requestDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad processorResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Define el valor de la propiedad processorResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorResponse(String value) {
        this.processorResponse = value;
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
     * Obtiene el valor de la propiedad checkpointSummary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckpointSummary() {
        return checkpointSummary;
    }

    /**
     * Define el valor de la propiedad checkpointSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckpointSummary(String value) {
        this.checkpointSummary = value;
    }

    /**
     * Obtiene el valor de la propiedad fraudShieldIndicators.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudShieldIndicators() {
        return fraudShieldIndicators;
    }

    /**
     * Define el valor de la propiedad fraudShieldIndicators.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudShieldIndicators(String value) {
        this.fraudShieldIndicators = value;
    }

}

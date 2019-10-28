
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ECCreditService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ECCreditService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debitRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partialPaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debitRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ECCreditService", propOrder = {
    "referenceNumber",
    "settlementMethod",
    "transactionToken",
    "debitRequestID",
    "partialPaymentID",
    "commerceIndicator",
    "debitRequestToken",
    "effectiveDate"
})
public class ECCreditService {

    protected String referenceNumber;
    protected String settlementMethod;
    protected String transactionToken;
    protected String debitRequestID;
    protected String partialPaymentID;
    protected String commerceIndicator;
    protected String debitRequestToken;
    protected String effectiveDate;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad referenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Define el valor de la propiedad referenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad settlementMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementMethod() {
        return settlementMethod;
    }

    /**
     * Define el valor de la propiedad settlementMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementMethod(String value) {
        this.settlementMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionToken() {
        return transactionToken;
    }

    /**
     * Define el valor de la propiedad transactionToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionToken(String value) {
        this.transactionToken = value;
    }

    /**
     * Obtiene el valor de la propiedad debitRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitRequestID() {
        return debitRequestID;
    }

    /**
     * Define el valor de la propiedad debitRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitRequestID(String value) {
        this.debitRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad partialPaymentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialPaymentID() {
        return partialPaymentID;
    }

    /**
     * Define el valor de la propiedad partialPaymentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialPaymentID(String value) {
        this.partialPaymentID = value;
    }

    /**
     * Obtiene el valor de la propiedad commerceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceIndicator() {
        return commerceIndicator;
    }

    /**
     * Define el valor de la propiedad commerceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceIndicator(String value) {
        this.commerceIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad debitRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitRequestToken() {
        return debitRequestToken;
    }

    /**
     * Define el valor de la propiedad debitRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitRequestToken(String value) {
        this.debitRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad effectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Define el valor de la propiedad effectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
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

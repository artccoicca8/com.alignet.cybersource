
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCCaptureReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCCaptureReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundingTotals" type="{urn:schemas-cybersource-com:transaction-data-1.159}FundingTotals" minOccurs="0"/>
 *         &lt;element name="fxQuoteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fxQuoteRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="fxQuoteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fxQuoteExpirationDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="purchasingLevel3Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enhancedDataEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCaptureReply", propOrder = {
    "reasonCode",
    "requestDateTime",
    "amount",
    "reconciliationID",
    "fundingTotals",
    "fxQuoteID",
    "fxQuoteRate",
    "fxQuoteType",
    "fxQuoteExpirationDateTime",
    "purchasingLevel3Enabled",
    "enhancedDataEnabled",
    "reconciliationReferenceNumber"
})
public class CCCaptureReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String requestDateTime;
    protected String amount;
    protected String reconciliationID;
    protected FundingTotals fundingTotals;
    protected String fxQuoteID;
    protected String fxQuoteRate;
    protected String fxQuoteType;
    protected String fxQuoteExpirationDateTime;
    protected String purchasingLevel3Enabled;
    protected String enhancedDataEnabled;
    protected String reconciliationReferenceNumber;

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
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
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
     * Obtiene el valor de la propiedad fundingTotals.
     * 
     * @return
     *     possible object is
     *     {@link FundingTotals }
     *     
     */
    public FundingTotals getFundingTotals() {
        return fundingTotals;
    }

    /**
     * Define el valor de la propiedad fundingTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingTotals }
     *     
     */
    public void setFundingTotals(FundingTotals value) {
        this.fundingTotals = value;
    }

    /**
     * Obtiene el valor de la propiedad fxQuoteID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteID() {
        return fxQuoteID;
    }

    /**
     * Define el valor de la propiedad fxQuoteID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteID(String value) {
        this.fxQuoteID = value;
    }

    /**
     * Obtiene el valor de la propiedad fxQuoteRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteRate() {
        return fxQuoteRate;
    }

    /**
     * Define el valor de la propiedad fxQuoteRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteRate(String value) {
        this.fxQuoteRate = value;
    }

    /**
     * Obtiene el valor de la propiedad fxQuoteType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteType() {
        return fxQuoteType;
    }

    /**
     * Define el valor de la propiedad fxQuoteType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteType(String value) {
        this.fxQuoteType = value;
    }

    /**
     * Obtiene el valor de la propiedad fxQuoteExpirationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxQuoteExpirationDateTime() {
        return fxQuoteExpirationDateTime;
    }

    /**
     * Define el valor de la propiedad fxQuoteExpirationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxQuoteExpirationDateTime(String value) {
        this.fxQuoteExpirationDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad purchasingLevel3Enabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingLevel3Enabled() {
        return purchasingLevel3Enabled;
    }

    /**
     * Define el valor de la propiedad purchasingLevel3Enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingLevel3Enabled(String value) {
        this.purchasingLevel3Enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad enhancedDataEnabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedDataEnabled() {
        return enhancedDataEnabled;
    }

    /**
     * Define el valor de la propiedad enhancedDataEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedDataEnabled(String value) {
        this.enhancedDataEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad reconciliationReferenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationReferenceNumber() {
        return reconciliationReferenceNumber;
    }

    /**
     * Define el valor de la propiedad reconciliationReferenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationReferenceNumber(String value) {
        this.reconciliationReferenceNumber = value;
    }

}

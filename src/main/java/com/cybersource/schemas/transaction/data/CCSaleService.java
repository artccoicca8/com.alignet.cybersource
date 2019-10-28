
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCSaleService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCSaleService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overridePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partialAuthIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryDatatype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkTokenCryptogram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paSpecificationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directoryServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cryptocurrencyPurchase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowValueExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riskAnalysisExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trustedMerchantExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureCorporatePaymentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deferredAuthIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegatedAuthenticationExemptionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCSaleService", propOrder = {
    "overridePaymentMethod",
    "commerceIndicator",
    "partialAuthIndicator",
    "cavv",
    "xid",
    "reconciliationID",
    "industryDatatype",
    "networkTokenCryptogram",
    "paSpecificationVersion",
    "directoryServerTransactionID",
    "cryptocurrencyPurchase",
    "lowValueExemptionIndicator",
    "riskAnalysisExemptionIndicator",
    "trustedMerchantExemptionIndicator",
    "secureCorporatePaymentIndicator",
    "deferredAuthIndicator",
    "delegatedAuthenticationExemptionIndicator"
})
public class CCSaleService {

    protected String overridePaymentMethod;
    protected String commerceIndicator;
    protected String partialAuthIndicator;
    protected String cavv;
    protected String xid;
    protected String reconciliationID;
    protected String industryDatatype;
    protected String networkTokenCryptogram;
    protected String paSpecificationVersion;
    protected String directoryServerTransactionID;
    protected String cryptocurrencyPurchase;
    protected String lowValueExemptionIndicator;
    protected String riskAnalysisExemptionIndicator;
    protected String trustedMerchantExemptionIndicator;
    protected String secureCorporatePaymentIndicator;
    protected String deferredAuthIndicator;
    protected String delegatedAuthenticationExemptionIndicator;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad overridePaymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePaymentMethod() {
        return overridePaymentMethod;
    }

    /**
     * Define el valor de la propiedad overridePaymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePaymentMethod(String value) {
        this.overridePaymentMethod = value;
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
     * Obtiene el valor de la propiedad partialAuthIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialAuthIndicator() {
        return partialAuthIndicator;
    }

    /**
     * Define el valor de la propiedad partialAuthIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialAuthIndicator(String value) {
        this.partialAuthIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad cavv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Define el valor de la propiedad cavv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * Obtiene el valor de la propiedad xid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Define el valor de la propiedad xid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
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
     * Obtiene el valor de la propiedad industryDatatype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryDatatype() {
        return industryDatatype;
    }

    /**
     * Define el valor de la propiedad industryDatatype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryDatatype(String value) {
        this.industryDatatype = value;
    }

    /**
     * Obtiene el valor de la propiedad networkTokenCryptogram.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkTokenCryptogram() {
        return networkTokenCryptogram;
    }

    /**
     * Define el valor de la propiedad networkTokenCryptogram.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkTokenCryptogram(String value) {
        this.networkTokenCryptogram = value;
    }

    /**
     * Obtiene el valor de la propiedad paSpecificationVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaSpecificationVersion() {
        return paSpecificationVersion;
    }

    /**
     * Define el valor de la propiedad paSpecificationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaSpecificationVersion(String value) {
        this.paSpecificationVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad directoryServerTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryServerTransactionID() {
        return directoryServerTransactionID;
    }

    /**
     * Define el valor de la propiedad directoryServerTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryServerTransactionID(String value) {
        this.directoryServerTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad cryptocurrencyPurchase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptocurrencyPurchase() {
        return cryptocurrencyPurchase;
    }

    /**
     * Define el valor de la propiedad cryptocurrencyPurchase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptocurrencyPurchase(String value) {
        this.cryptocurrencyPurchase = value;
    }

    /**
     * Obtiene el valor de la propiedad lowValueExemptionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowValueExemptionIndicator() {
        return lowValueExemptionIndicator;
    }

    /**
     * Define el valor de la propiedad lowValueExemptionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowValueExemptionIndicator(String value) {
        this.lowValueExemptionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad riskAnalysisExemptionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAnalysisExemptionIndicator() {
        return riskAnalysisExemptionIndicator;
    }

    /**
     * Define el valor de la propiedad riskAnalysisExemptionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAnalysisExemptionIndicator(String value) {
        this.riskAnalysisExemptionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad trustedMerchantExemptionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustedMerchantExemptionIndicator() {
        return trustedMerchantExemptionIndicator;
    }

    /**
     * Define el valor de la propiedad trustedMerchantExemptionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustedMerchantExemptionIndicator(String value) {
        this.trustedMerchantExemptionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad secureCorporatePaymentIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureCorporatePaymentIndicator() {
        return secureCorporatePaymentIndicator;
    }

    /**
     * Define el valor de la propiedad secureCorporatePaymentIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureCorporatePaymentIndicator(String value) {
        this.secureCorporatePaymentIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad deferredAuthIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferredAuthIndicator() {
        return deferredAuthIndicator;
    }

    /**
     * Define el valor de la propiedad deferredAuthIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferredAuthIndicator(String value) {
        this.deferredAuthIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad delegatedAuthenticationExemptionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatedAuthenticationExemptionIndicator() {
        return delegatedAuthenticationExemptionIndicator;
    }

    /**
     * Define el valor de la propiedad delegatedAuthenticationExemptionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatedAuthenticationExemptionIndicator(String value) {
        this.delegatedAuthenticationExemptionIndicator = value;
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

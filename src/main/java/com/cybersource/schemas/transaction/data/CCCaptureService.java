
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCCaptureService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCCaptureService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verbalAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partialPaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchasingLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryDatatype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checksumKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gratuityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dpdeBillingMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationIDAlternate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aggregatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aggregatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCCaptureService", propOrder = {
    "authType",
    "verbalAuthCode",
    "authRequestID",
    "reconciliationID",
    "partialPaymentID",
    "purchasingLevel",
    "industryDatatype",
    "authRequestToken",
    "merchantReceiptNumber",
    "posData",
    "transactionID",
    "checksumKey",
    "gratuityAmount",
    "duration",
    "dpdeBillingMonth",
    "sequence",
    "totalCount",
    "reconciliationIDAlternate",
    "aggregatorID",
    "aggregatorName"
})
public class CCCaptureService {

    protected String authType;
    protected String verbalAuthCode;
    protected String authRequestID;
    protected String reconciliationID;
    protected String partialPaymentID;
    protected String purchasingLevel;
    protected String industryDatatype;
    protected String authRequestToken;
    protected String merchantReceiptNumber;
    protected String posData;
    protected String transactionID;
    protected String checksumKey;
    protected String gratuityAmount;
    protected BigInteger duration;
    protected BigInteger dpdeBillingMonth;
    protected String sequence;
    protected String totalCount;
    protected String reconciliationIDAlternate;
    protected String aggregatorID;
    protected String aggregatorName;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad authType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * Define el valor de la propiedad authType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * Obtiene el valor de la propiedad verbalAuthCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbalAuthCode() {
        return verbalAuthCode;
    }

    /**
     * Define el valor de la propiedad verbalAuthCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbalAuthCode(String value) {
        this.verbalAuthCode = value;
    }

    /**
     * Obtiene el valor de la propiedad authRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRequestID() {
        return authRequestID;
    }

    /**
     * Define el valor de la propiedad authRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRequestID(String value) {
        this.authRequestID = value;
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
     * Obtiene el valor de la propiedad purchasingLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingLevel() {
        return purchasingLevel;
    }

    /**
     * Define el valor de la propiedad purchasingLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingLevel(String value) {
        this.purchasingLevel = value;
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
     * Obtiene el valor de la propiedad authRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRequestToken() {
        return authRequestToken;
    }

    /**
     * Define el valor de la propiedad authRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRequestToken(String value) {
        this.authRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantReceiptNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReceiptNumber() {
        return merchantReceiptNumber;
    }

    /**
     * Define el valor de la propiedad merchantReceiptNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReceiptNumber(String value) {
        this.merchantReceiptNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad posData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosData() {
        return posData;
    }

    /**
     * Define el valor de la propiedad posData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosData(String value) {
        this.posData = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Define el valor de la propiedad transactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad checksumKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksumKey() {
        return checksumKey;
    }

    /**
     * Define el valor de la propiedad checksumKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksumKey(String value) {
        this.checksumKey = value;
    }

    /**
     * Obtiene el valor de la propiedad gratuityAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGratuityAmount() {
        return gratuityAmount;
    }

    /**
     * Define el valor de la propiedad gratuityAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGratuityAmount(String value) {
        this.gratuityAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * Obtiene el valor de la propiedad dpdeBillingMonth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDpdeBillingMonth() {
        return dpdeBillingMonth;
    }

    /**
     * Define el valor de la propiedad dpdeBillingMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDpdeBillingMonth(BigInteger value) {
        this.dpdeBillingMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad sequence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Define el valor de la propiedad sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCount() {
        return totalCount;
    }

    /**
     * Define el valor de la propiedad totalCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCount(String value) {
        this.totalCount = value;
    }

    /**
     * Obtiene el valor de la propiedad reconciliationIDAlternate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationIDAlternate() {
        return reconciliationIDAlternate;
    }

    /**
     * Define el valor de la propiedad reconciliationIDAlternate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationIDAlternate(String value) {
        this.reconciliationIDAlternate = value;
    }

    /**
     * Obtiene el valor de la propiedad aggregatorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorID() {
        return aggregatorID;
    }

    /**
     * Define el valor de la propiedad aggregatorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorID(String value) {
        this.aggregatorID = value;
    }

    /**
     * Obtiene el valor de la propiedad aggregatorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorName() {
        return aggregatorName;
    }

    /**
     * Define el valor de la propiedad aggregatorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorName(String value) {
        this.aggregatorName = value;
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


package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayerAuthEnrollReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayerAuthEnrollReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="acsURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavvAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proofXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ucafAuthenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ucafCollectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veresEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specificationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directoryServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="challengeRequired" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerAuthEnrollReply", propOrder = {
    "reasonCode",
    "acsURL",
    "authenticationResult",
    "authenticationStatusMessage",
    "cavv",
    "cavvAlgorithm",
    "commerceIndicator",
    "eci",
    "eciRaw",
    "paReq",
    "proxyPAN",
    "xid",
    "proofXML",
    "ucafAuthenticationData",
    "ucafCollectionIndicator",
    "paresStatus",
    "veresEnrolled",
    "authenticationPath",
    "specificationVersion",
    "authenticationTransactionID",
    "directoryServerTransactionID",
    "challengeRequired"
})
public class PayerAuthEnrollReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String acsURL;
    protected String authenticationResult;
    protected String authenticationStatusMessage;
    protected String cavv;
    protected String cavvAlgorithm;
    protected String commerceIndicator;
    protected String eci;
    protected String eciRaw;
    protected String paReq;
    protected String proxyPAN;
    protected String xid;
    protected String proofXML;
    protected String ucafAuthenticationData;
    protected String ucafCollectionIndicator;
    protected String paresStatus;
    protected String veresEnrolled;
    protected String authenticationPath;
    protected String specificationVersion;
    protected String authenticationTransactionID;
    protected String directoryServerTransactionID;
    protected String challengeRequired;

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
     * Obtiene el valor de la propiedad acsURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsURL() {
        return acsURL;
    }

    /**
     * Define el valor de la propiedad acsURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsURL(String value) {
        this.acsURL = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticationResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * Define el valor de la propiedad authenticationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationResult(String value) {
        this.authenticationResult = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticationStatusMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationStatusMessage() {
        return authenticationStatusMessage;
    }

    /**
     * Define el valor de la propiedad authenticationStatusMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationStatusMessage(String value) {
        this.authenticationStatusMessage = value;
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
     * Obtiene el valor de la propiedad cavvAlgorithm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvAlgorithm() {
        return cavvAlgorithm;
    }

    /**
     * Define el valor de la propiedad cavvAlgorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvAlgorithm(String value) {
        this.cavvAlgorithm = value;
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
     * Obtiene el valor de la propiedad eci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEci() {
        return eci;
    }

    /**
     * Define el valor de la propiedad eci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEci(String value) {
        this.eci = value;
    }

    /**
     * Obtiene el valor de la propiedad eciRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciRaw() {
        return eciRaw;
    }

    /**
     * Define el valor de la propiedad eciRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciRaw(String value) {
        this.eciRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad paReq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaReq() {
        return paReq;
    }

    /**
     * Define el valor de la propiedad paReq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaReq(String value) {
        this.paReq = value;
    }

    /**
     * Obtiene el valor de la propiedad proxyPAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyPAN() {
        return proxyPAN;
    }

    /**
     * Define el valor de la propiedad proxyPAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyPAN(String value) {
        this.proxyPAN = value;
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
     * Obtiene el valor de la propiedad proofXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProofXML() {
        return proofXML;
    }

    /**
     * Define el valor de la propiedad proofXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProofXML(String value) {
        this.proofXML = value;
    }

    /**
     * Obtiene el valor de la propiedad ucafAuthenticationData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcafAuthenticationData() {
        return ucafAuthenticationData;
    }

    /**
     * Define el valor de la propiedad ucafAuthenticationData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcafAuthenticationData(String value) {
        this.ucafAuthenticationData = value;
    }

    /**
     * Obtiene el valor de la propiedad ucafCollectionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcafCollectionIndicator() {
        return ucafCollectionIndicator;
    }

    /**
     * Define el valor de la propiedad ucafCollectionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcafCollectionIndicator(String value) {
        this.ucafCollectionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad paresStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParesStatus() {
        return paresStatus;
    }

    /**
     * Define el valor de la propiedad paresStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParesStatus(String value) {
        this.paresStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad veresEnrolled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeresEnrolled() {
        return veresEnrolled;
    }

    /**
     * Define el valor de la propiedad veresEnrolled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeresEnrolled(String value) {
        this.veresEnrolled = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticationPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationPath() {
        return authenticationPath;
    }

    /**
     * Define el valor de la propiedad authenticationPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationPath(String value) {
        this.authenticationPath = value;
    }

    /**
     * Obtiene el valor de la propiedad specificationVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationVersion() {
        return specificationVersion;
    }

    /**
     * Define el valor de la propiedad specificationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationVersion(String value) {
        this.specificationVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticationTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTransactionID() {
        return authenticationTransactionID;
    }

    /**
     * Define el valor de la propiedad authenticationTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTransactionID(String value) {
        this.authenticationTransactionID = value;
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
     * Obtiene el valor de la propiedad challengeRequired.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeRequired() {
        return challengeRequired;
    }

    /**
     * Define el valor de la propiedad challengeRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeRequired(String value) {
        this.challengeRequired = value;
    }

}

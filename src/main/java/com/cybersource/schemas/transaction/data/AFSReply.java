
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AFSReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AFSReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="afsResult" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="hostSeverity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="consumerLocalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afsFactorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotlistInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internetInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspiciousInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="velocityInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipRoutingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAnonymizerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreModelUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="binCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceFingerprint" type="{urn:schemas-cybersource-com:transaction-data-1.159}DeviceFingerprint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFSReply", propOrder = {
    "reasonCode",
    "afsResult",
    "hostSeverity",
    "consumerLocalTime",
    "afsFactorCode",
    "addressInfoCode",
    "hotlistInfoCode",
    "internetInfoCode",
    "phoneInfoCode",
    "suspiciousInfoCode",
    "velocityInfoCode",
    "identityInfoCode",
    "ipCountry",
    "ipState",
    "ipCity",
    "ipRoutingMethod",
    "ipAnonymizerStatus",
    "ipCarrier",
    "ipOrganization",
    "scoreModelUsed",
    "cardBin",
    "binCountry",
    "cardAccountType",
    "cardScheme",
    "cardIssuer",
    "deviceFingerprint"
})
public class AFSReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected BigInteger afsResult;
    protected BigInteger hostSeverity;
    protected String consumerLocalTime;
    protected String afsFactorCode;
    protected String addressInfoCode;
    protected String hotlistInfoCode;
    protected String internetInfoCode;
    protected String phoneInfoCode;
    protected String suspiciousInfoCode;
    protected String velocityInfoCode;
    protected String identityInfoCode;
    protected String ipCountry;
    protected String ipState;
    protected String ipCity;
    protected String ipRoutingMethod;
    protected String ipAnonymizerStatus;
    protected String ipCarrier;
    protected String ipOrganization;
    protected String scoreModelUsed;
    protected String cardBin;
    protected String binCountry;
    protected String cardAccountType;
    protected String cardScheme;
    protected String cardIssuer;
    protected DeviceFingerprint deviceFingerprint;

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
     * Obtiene el valor de la propiedad afsResult.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAfsResult() {
        return afsResult;
    }

    /**
     * Define el valor de la propiedad afsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAfsResult(BigInteger value) {
        this.afsResult = value;
    }

    /**
     * Obtiene el valor de la propiedad hostSeverity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHostSeverity() {
        return hostSeverity;
    }

    /**
     * Define el valor de la propiedad hostSeverity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHostSeverity(BigInteger value) {
        this.hostSeverity = value;
    }

    /**
     * Obtiene el valor de la propiedad consumerLocalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerLocalTime() {
        return consumerLocalTime;
    }

    /**
     * Define el valor de la propiedad consumerLocalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerLocalTime(String value) {
        this.consumerLocalTime = value;
    }

    /**
     * Obtiene el valor de la propiedad afsFactorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfsFactorCode() {
        return afsFactorCode;
    }

    /**
     * Define el valor de la propiedad afsFactorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfsFactorCode(String value) {
        this.afsFactorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad addressInfoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressInfoCode() {
        return addressInfoCode;
    }

    /**
     * Define el valor de la propiedad addressInfoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressInfoCode(String value) {
        this.addressInfoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad hotlistInfoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotlistInfoCode() {
        return hotlistInfoCode;
    }

    /**
     * Define el valor de la propiedad hotlistInfoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotlistInfoCode(String value) {
        this.hotlistInfoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad internetInfoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetInfoCode() {
        return internetInfoCode;
    }

    /**
     * Define el valor de la propiedad internetInfoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetInfoCode(String value) {
        this.internetInfoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneInfoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneInfoCode() {
        return phoneInfoCode;
    }

    /**
     * Define el valor de la propiedad phoneInfoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneInfoCode(String value) {
        this.phoneInfoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad suspiciousInfoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspiciousInfoCode() {
        return suspiciousInfoCode;
    }

    /**
     * Define el valor de la propiedad suspiciousInfoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspiciousInfoCode(String value) {
        this.suspiciousInfoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad velocityInfoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityInfoCode() {
        return velocityInfoCode;
    }

    /**
     * Define el valor de la propiedad velocityInfoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityInfoCode(String value) {
        this.velocityInfoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad identityInfoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityInfoCode() {
        return identityInfoCode;
    }

    /**
     * Define el valor de la propiedad identityInfoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityInfoCode(String value) {
        this.identityInfoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad ipCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpCountry() {
        return ipCountry;
    }

    /**
     * Define el valor de la propiedad ipCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpCountry(String value) {
        this.ipCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad ipState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpState() {
        return ipState;
    }

    /**
     * Define el valor de la propiedad ipState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpState(String value) {
        this.ipState = value;
    }

    /**
     * Obtiene el valor de la propiedad ipCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpCity() {
        return ipCity;
    }

    /**
     * Define el valor de la propiedad ipCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpCity(String value) {
        this.ipCity = value;
    }

    /**
     * Obtiene el valor de la propiedad ipRoutingMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpRoutingMethod() {
        return ipRoutingMethod;
    }

    /**
     * Define el valor de la propiedad ipRoutingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpRoutingMethod(String value) {
        this.ipRoutingMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad ipAnonymizerStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAnonymizerStatus() {
        return ipAnonymizerStatus;
    }

    /**
     * Define el valor de la propiedad ipAnonymizerStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAnonymizerStatus(String value) {
        this.ipAnonymizerStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad ipCarrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpCarrier() {
        return ipCarrier;
    }

    /**
     * Define el valor de la propiedad ipCarrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpCarrier(String value) {
        this.ipCarrier = value;
    }

    /**
     * Obtiene el valor de la propiedad ipOrganization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpOrganization() {
        return ipOrganization;
    }

    /**
     * Define el valor de la propiedad ipOrganization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpOrganization(String value) {
        this.ipOrganization = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreModelUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreModelUsed() {
        return scoreModelUsed;
    }

    /**
     * Define el valor de la propiedad scoreModelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreModelUsed(String value) {
        this.scoreModelUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad cardBin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBin() {
        return cardBin;
    }

    /**
     * Define el valor de la propiedad cardBin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBin(String value) {
        this.cardBin = value;
    }

    /**
     * Obtiene el valor de la propiedad binCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinCountry() {
        return binCountry;
    }

    /**
     * Define el valor de la propiedad binCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinCountry(String value) {
        this.binCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAccountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountType() {
        return cardAccountType;
    }

    /**
     * Define el valor de la propiedad cardAccountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountType(String value) {
        this.cardAccountType = value;
    }

    /**
     * Obtiene el valor de la propiedad cardScheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardScheme() {
        return cardScheme;
    }

    /**
     * Define el valor de la propiedad cardScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardScheme(String value) {
        this.cardScheme = value;
    }

    /**
     * Obtiene el valor de la propiedad cardIssuer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuer() {
        return cardIssuer;
    }

    /**
     * Define el valor de la propiedad cardIssuer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuer(String value) {
        this.cardIssuer = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceFingerprint.
     * 
     * @return
     *     possible object is
     *     {@link DeviceFingerprint }
     *     
     */
    public DeviceFingerprint getDeviceFingerprint() {
        return deviceFingerprint;
    }

    /**
     * Define el valor de la propiedad deviceFingerprint.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceFingerprint }
     *     
     */
    public void setDeviceFingerprint(DeviceFingerprint value) {
        this.deviceFingerprint = value;
    }

}


package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DeviceFingerprint complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeviceFingerprint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cookiesEnabled" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="flashEnabled" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagesEnabled" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="javascriptEnabled" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="proxyIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyIPAddressActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyIPAddressAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyServerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trueIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trueIPAddressActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trueIPAddressAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trueIPAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trueIPAddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trueIPAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smartIDConfidenceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="screenResolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="browserLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="profileDuration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="profiledURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeOnPage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deviceMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstEncounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flashOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flashVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceLatitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceLongitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gpsAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jbRoot" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="jbRootReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceFingerprint", propOrder = {
    "cookiesEnabled",
    "flashEnabled",
    "hash",
    "imagesEnabled",
    "javascriptEnabled",
    "proxyIPAddress",
    "proxyIPAddressActivities",
    "proxyIPAddressAttributes",
    "proxyServerType",
    "trueIPAddress",
    "trueIPAddressActivities",
    "trueIPAddressAttributes",
    "trueIPAddressCity",
    "trueIPAddressState",
    "trueIPAddressCountry",
    "smartID",
    "smartIDConfidenceLevel",
    "screenResolution",
    "browserLanguage",
    "agentType",
    "dateTime",
    "profileDuration",
    "profiledURL",
    "timeOnPage",
    "deviceMatch",
    "firstEncounter",
    "flashOS",
    "flashVersion",
    "deviceLatitude",
    "deviceLongitude",
    "gpsAccuracy",
    "jbRoot",
    "jbRootReason"
})
public class DeviceFingerprint {

    protected String cookiesEnabled;
    protected String flashEnabled;
    protected String hash;
    protected String imagesEnabled;
    protected String javascriptEnabled;
    protected String proxyIPAddress;
    protected String proxyIPAddressActivities;
    protected String proxyIPAddressAttributes;
    protected String proxyServerType;
    protected String trueIPAddress;
    protected String trueIPAddressActivities;
    protected String trueIPAddressAttributes;
    protected String trueIPAddressCity;
    protected String trueIPAddressState;
    protected String trueIPAddressCountry;
    protected String smartID;
    protected String smartIDConfidenceLevel;
    protected String screenResolution;
    protected String browserLanguage;
    protected String agentType;
    protected String dateTime;
    protected BigInteger profileDuration;
    protected String profiledURL;
    protected BigInteger timeOnPage;
    protected String deviceMatch;
    protected String firstEncounter;
    protected String flashOS;
    protected String flashVersion;
    protected String deviceLatitude;
    protected String deviceLongitude;
    protected String gpsAccuracy;
    protected BigInteger jbRoot;
    protected String jbRootReason;

    /**
     * Obtiene el valor de la propiedad cookiesEnabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookiesEnabled() {
        return cookiesEnabled;
    }

    /**
     * Define el valor de la propiedad cookiesEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookiesEnabled(String value) {
        this.cookiesEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad flashEnabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashEnabled() {
        return flashEnabled;
    }

    /**
     * Define el valor de la propiedad flashEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashEnabled(String value) {
        this.flashEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad hash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Define el valor de la propiedad hash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Obtiene el valor de la propiedad imagesEnabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagesEnabled() {
        return imagesEnabled;
    }

    /**
     * Define el valor de la propiedad imagesEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagesEnabled(String value) {
        this.imagesEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad javascriptEnabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavascriptEnabled() {
        return javascriptEnabled;
    }

    /**
     * Define el valor de la propiedad javascriptEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavascriptEnabled(String value) {
        this.javascriptEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad proxyIPAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyIPAddress() {
        return proxyIPAddress;
    }

    /**
     * Define el valor de la propiedad proxyIPAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyIPAddress(String value) {
        this.proxyIPAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad proxyIPAddressActivities.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyIPAddressActivities() {
        return proxyIPAddressActivities;
    }

    /**
     * Define el valor de la propiedad proxyIPAddressActivities.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyIPAddressActivities(String value) {
        this.proxyIPAddressActivities = value;
    }

    /**
     * Obtiene el valor de la propiedad proxyIPAddressAttributes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyIPAddressAttributes() {
        return proxyIPAddressAttributes;
    }

    /**
     * Define el valor de la propiedad proxyIPAddressAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyIPAddressAttributes(String value) {
        this.proxyIPAddressAttributes = value;
    }

    /**
     * Obtiene el valor de la propiedad proxyServerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyServerType() {
        return proxyServerType;
    }

    /**
     * Define el valor de la propiedad proxyServerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyServerType(String value) {
        this.proxyServerType = value;
    }

    /**
     * Obtiene el valor de la propiedad trueIPAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddress() {
        return trueIPAddress;
    }

    /**
     * Define el valor de la propiedad trueIPAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddress(String value) {
        this.trueIPAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad trueIPAddressActivities.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddressActivities() {
        return trueIPAddressActivities;
    }

    /**
     * Define el valor de la propiedad trueIPAddressActivities.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddressActivities(String value) {
        this.trueIPAddressActivities = value;
    }

    /**
     * Obtiene el valor de la propiedad trueIPAddressAttributes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddressAttributes() {
        return trueIPAddressAttributes;
    }

    /**
     * Define el valor de la propiedad trueIPAddressAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddressAttributes(String value) {
        this.trueIPAddressAttributes = value;
    }

    /**
     * Obtiene el valor de la propiedad trueIPAddressCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddressCity() {
        return trueIPAddressCity;
    }

    /**
     * Define el valor de la propiedad trueIPAddressCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddressCity(String value) {
        this.trueIPAddressCity = value;
    }

    /**
     * Obtiene el valor de la propiedad trueIPAddressState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddressState() {
        return trueIPAddressState;
    }

    /**
     * Define el valor de la propiedad trueIPAddressState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddressState(String value) {
        this.trueIPAddressState = value;
    }

    /**
     * Obtiene el valor de la propiedad trueIPAddressCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueIPAddressCountry() {
        return trueIPAddressCountry;
    }

    /**
     * Define el valor de la propiedad trueIPAddressCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueIPAddressCountry(String value) {
        this.trueIPAddressCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad smartID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartID() {
        return smartID;
    }

    /**
     * Define el valor de la propiedad smartID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartID(String value) {
        this.smartID = value;
    }

    /**
     * Obtiene el valor de la propiedad smartIDConfidenceLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartIDConfidenceLevel() {
        return smartIDConfidenceLevel;
    }

    /**
     * Define el valor de la propiedad smartIDConfidenceLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartIDConfidenceLevel(String value) {
        this.smartIDConfidenceLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad screenResolution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenResolution() {
        return screenResolution;
    }

    /**
     * Define el valor de la propiedad screenResolution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenResolution(String value) {
        this.screenResolution = value;
    }

    /**
     * Obtiene el valor de la propiedad browserLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserLanguage() {
        return browserLanguage;
    }

    /**
     * Define el valor de la propiedad browserLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserLanguage(String value) {
        this.browserLanguage = value;
    }

    /**
     * Obtiene el valor de la propiedad agentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentType() {
        return agentType;
    }

    /**
     * Define el valor de la propiedad agentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentType(String value) {
        this.agentType = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Define el valor de la propiedad dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad profileDuration.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProfileDuration() {
        return profileDuration;
    }

    /**
     * Define el valor de la propiedad profileDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProfileDuration(BigInteger value) {
        this.profileDuration = value;
    }

    /**
     * Obtiene el valor de la propiedad profiledURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfiledURL() {
        return profiledURL;
    }

    /**
     * Define el valor de la propiedad profiledURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfiledURL(String value) {
        this.profiledURL = value;
    }

    /**
     * Obtiene el valor de la propiedad timeOnPage.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeOnPage() {
        return timeOnPage;
    }

    /**
     * Define el valor de la propiedad timeOnPage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeOnPage(BigInteger value) {
        this.timeOnPage = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceMatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMatch() {
        return deviceMatch;
    }

    /**
     * Define el valor de la propiedad deviceMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMatch(String value) {
        this.deviceMatch = value;
    }

    /**
     * Obtiene el valor de la propiedad firstEncounter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstEncounter() {
        return firstEncounter;
    }

    /**
     * Define el valor de la propiedad firstEncounter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstEncounter(String value) {
        this.firstEncounter = value;
    }

    /**
     * Obtiene el valor de la propiedad flashOS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashOS() {
        return flashOS;
    }

    /**
     * Define el valor de la propiedad flashOS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashOS(String value) {
        this.flashOS = value;
    }

    /**
     * Obtiene el valor de la propiedad flashVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashVersion() {
        return flashVersion;
    }

    /**
     * Define el valor de la propiedad flashVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashVersion(String value) {
        this.flashVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceLatitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceLatitude() {
        return deviceLatitude;
    }

    /**
     * Define el valor de la propiedad deviceLatitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceLatitude(String value) {
        this.deviceLatitude = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceLongitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceLongitude() {
        return deviceLongitude;
    }

    /**
     * Define el valor de la propiedad deviceLongitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceLongitude(String value) {
        this.deviceLongitude = value;
    }

    /**
     * Obtiene el valor de la propiedad gpsAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsAccuracy() {
        return gpsAccuracy;
    }

    /**
     * Define el valor de la propiedad gpsAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsAccuracy(String value) {
        this.gpsAccuracy = value;
    }

    /**
     * Obtiene el valor de la propiedad jbRoot.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJbRoot() {
        return jbRoot;
    }

    /**
     * Define el valor de la propiedad jbRoot.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJbRoot(BigInteger value) {
        this.jbRoot = value;
    }

    /**
     * Obtiene el valor de la propiedad jbRootReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJbRootReason() {
        return jbRootReason;
    }

    /**
     * Define el valor de la propiedad jbRootReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJbRootReason(String value) {
        this.jbRootReason = value;
    }

}

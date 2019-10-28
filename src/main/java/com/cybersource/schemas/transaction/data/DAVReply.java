
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DAVReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DAVReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartmentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="barCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="barCodeCheckDigit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careOf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lvrInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="standardizedAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedAddressNoApt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedCSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardizedISOCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suffixInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCodeInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overallInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intlInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intlErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DAVReply", propOrder = {
    "reasonCode",
    "addressType",
    "apartmentInfo",
    "barCode",
    "barCodeCheckDigit",
    "careOf",
    "cityInfo",
    "countryInfo",
    "directionalInfo",
    "lvrInfo",
    "matchScore",
    "standardizedAddress1",
    "standardizedAddress2",
    "standardizedAddress3",
    "standardizedAddress4",
    "standardizedAddressNoApt",
    "standardizedCity",
    "standardizedCounty",
    "standardizedCSP",
    "standardizedState",
    "standardizedPostalCode",
    "standardizedCountry",
    "standardizedISOCountry",
    "stateInfo",
    "streetInfo",
    "suffixInfo",
    "postalCodeInfo",
    "overallInfo",
    "usInfo",
    "caInfo",
    "intlInfo",
    "usErrorInfo",
    "caErrorInfo",
    "intlErrorInfo"
})
public class DAVReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String addressType;
    protected String apartmentInfo;
    protected String barCode;
    protected String barCodeCheckDigit;
    protected String careOf;
    protected String cityInfo;
    protected String countryInfo;
    protected String directionalInfo;
    protected String lvrInfo;
    protected BigInteger matchScore;
    protected String standardizedAddress1;
    protected String standardizedAddress2;
    protected String standardizedAddress3;
    protected String standardizedAddress4;
    protected String standardizedAddressNoApt;
    protected String standardizedCity;
    protected String standardizedCounty;
    protected String standardizedCSP;
    protected String standardizedState;
    protected String standardizedPostalCode;
    protected String standardizedCountry;
    protected String standardizedISOCountry;
    protected String stateInfo;
    protected String streetInfo;
    protected String suffixInfo;
    protected String postalCodeInfo;
    protected String overallInfo;
    protected String usInfo;
    protected String caInfo;
    protected String intlInfo;
    protected String usErrorInfo;
    protected String caErrorInfo;
    protected String intlErrorInfo;

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
     * Obtiene el valor de la propiedad addressType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Define el valor de la propiedad addressType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Obtiene el valor de la propiedad apartmentInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentInfo() {
        return apartmentInfo;
    }

    /**
     * Define el valor de la propiedad apartmentInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentInfo(String value) {
        this.apartmentInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad barCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Define el valor de la propiedad barCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Obtiene el valor de la propiedad barCodeCheckDigit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCodeCheckDigit() {
        return barCodeCheckDigit;
    }

    /**
     * Define el valor de la propiedad barCodeCheckDigit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCodeCheckDigit(String value) {
        this.barCodeCheckDigit = value;
    }

    /**
     * Obtiene el valor de la propiedad careOf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOf() {
        return careOf;
    }

    /**
     * Define el valor de la propiedad careOf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOf(String value) {
        this.careOf = value;
    }

    /**
     * Obtiene el valor de la propiedad cityInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityInfo() {
        return cityInfo;
    }

    /**
     * Define el valor de la propiedad cityInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityInfo(String value) {
        this.cityInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad countryInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryInfo() {
        return countryInfo;
    }

    /**
     * Define el valor de la propiedad countryInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryInfo(String value) {
        this.countryInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad directionalInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionalInfo() {
        return directionalInfo;
    }

    /**
     * Define el valor de la propiedad directionalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionalInfo(String value) {
        this.directionalInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad lvrInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLvrInfo() {
        return lvrInfo;
    }

    /**
     * Define el valor de la propiedad lvrInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLvrInfo(String value) {
        this.lvrInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad matchScore.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchScore() {
        return matchScore;
    }

    /**
     * Define el valor de la propiedad matchScore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchScore(BigInteger value) {
        this.matchScore = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedAddress1() {
        return standardizedAddress1;
    }

    /**
     * Define el valor de la propiedad standardizedAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedAddress1(String value) {
        this.standardizedAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedAddress2() {
        return standardizedAddress2;
    }

    /**
     * Define el valor de la propiedad standardizedAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedAddress2(String value) {
        this.standardizedAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedAddress3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedAddress3() {
        return standardizedAddress3;
    }

    /**
     * Define el valor de la propiedad standardizedAddress3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedAddress3(String value) {
        this.standardizedAddress3 = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedAddress4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedAddress4() {
        return standardizedAddress4;
    }

    /**
     * Define el valor de la propiedad standardizedAddress4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedAddress4(String value) {
        this.standardizedAddress4 = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedAddressNoApt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedAddressNoApt() {
        return standardizedAddressNoApt;
    }

    /**
     * Define el valor de la propiedad standardizedAddressNoApt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedAddressNoApt(String value) {
        this.standardizedAddressNoApt = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedCity() {
        return standardizedCity;
    }

    /**
     * Define el valor de la propiedad standardizedCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedCity(String value) {
        this.standardizedCity = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedCounty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedCounty() {
        return standardizedCounty;
    }

    /**
     * Define el valor de la propiedad standardizedCounty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedCounty(String value) {
        this.standardizedCounty = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedCSP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedCSP() {
        return standardizedCSP;
    }

    /**
     * Define el valor de la propiedad standardizedCSP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedCSP(String value) {
        this.standardizedCSP = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedState() {
        return standardizedState;
    }

    /**
     * Define el valor de la propiedad standardizedState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedState(String value) {
        this.standardizedState = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedPostalCode() {
        return standardizedPostalCode;
    }

    /**
     * Define el valor de la propiedad standardizedPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedPostalCode(String value) {
        this.standardizedPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedCountry() {
        return standardizedCountry;
    }

    /**
     * Define el valor de la propiedad standardizedCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedCountry(String value) {
        this.standardizedCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad standardizedISOCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardizedISOCountry() {
        return standardizedISOCountry;
    }

    /**
     * Define el valor de la propiedad standardizedISOCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardizedISOCountry(String value) {
        this.standardizedISOCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad stateInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateInfo() {
        return stateInfo;
    }

    /**
     * Define el valor de la propiedad stateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateInfo(String value) {
        this.stateInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad streetInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetInfo() {
        return streetInfo;
    }

    /**
     * Define el valor de la propiedad streetInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetInfo(String value) {
        this.streetInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad suffixInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixInfo() {
        return suffixInfo;
    }

    /**
     * Define el valor de la propiedad suffixInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixInfo(String value) {
        this.suffixInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCodeInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeInfo() {
        return postalCodeInfo;
    }

    /**
     * Define el valor de la propiedad postalCodeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeInfo(String value) {
        this.postalCodeInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad overallInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallInfo() {
        return overallInfo;
    }

    /**
     * Define el valor de la propiedad overallInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallInfo(String value) {
        this.overallInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad usInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsInfo() {
        return usInfo;
    }

    /**
     * Define el valor de la propiedad usInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsInfo(String value) {
        this.usInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad caInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaInfo() {
        return caInfo;
    }

    /**
     * Define el valor de la propiedad caInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaInfo(String value) {
        this.caInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad intlInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlInfo() {
        return intlInfo;
    }

    /**
     * Define el valor de la propiedad intlInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlInfo(String value) {
        this.intlInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad usErrorInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsErrorInfo() {
        return usErrorInfo;
    }

    /**
     * Define el valor de la propiedad usErrorInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsErrorInfo(String value) {
        this.usErrorInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad caErrorInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaErrorInfo() {
        return caErrorInfo;
    }

    /**
     * Define el valor de la propiedad caErrorInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaErrorInfo(String value) {
        this.caErrorInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad intlErrorInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlErrorInfo() {
        return intlErrorInfo;
    }

    /**
     * Define el valor de la propiedad intlErrorInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlErrorInfo(String value) {
        this.intlErrorInfo = value;
    }

}

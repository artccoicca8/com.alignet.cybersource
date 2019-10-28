
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Pos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Pos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalCapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionSecurity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="environment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceReaderData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encryptionAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encodingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalIDAlternate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalCompliance" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="terminalCardCaptureCapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalOutputCapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalPINcapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalCVMcapabilities_0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalCVMcapabilities_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalCVMcapabilities_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalInputCapabilities_0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalInputCapabilities_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalInputCapabilities_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalInputCapabilities_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalInputCapabilities_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalInputCapabilities_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalInputCapabilities_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeAndForwardIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="panEntryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endlessAisleTransactionIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="terminalModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pos", propOrder = {
    "entryMode",
    "cardPresent",
    "terminalCapability",
    "trackData",
    "terminalID",
    "terminalType",
    "terminalLocation",
    "transactionSecurity",
    "catLevel",
    "conditionCode",
    "environment",
    "paymentData",
    "deviceReaderData",
    "encryptionAlgorithm",
    "encodingMethod",
    "deviceID",
    "serviceCode",
    "terminalIDAlternate",
    "terminalCompliance",
    "terminalCardCaptureCapability",
    "terminalOutputCapability",
    "terminalPINcapability",
    "terminalCVMcapabilities0",
    "terminalCVMcapabilities1",
    "terminalCVMcapabilities2",
    "terminalInputCapabilities0",
    "terminalInputCapabilities1",
    "terminalInputCapabilities2",
    "terminalInputCapabilities3",
    "terminalInputCapabilities4",
    "terminalInputCapabilities5",
    "terminalInputCapabilities6",
    "terminalSerialNumber",
    "storeAndForwardIndicator",
    "panEntryMode",
    "endlessAisleTransactionIndicator",
    "terminalModel"
})
public class Pos {

    protected String entryMode;
    protected String cardPresent;
    protected String terminalCapability;
    protected String trackData;
    protected String terminalID;
    protected String terminalType;
    protected String terminalLocation;
    protected String transactionSecurity;
    protected String catLevel;
    protected String conditionCode;
    protected String environment;
    protected String paymentData;
    protected String deviceReaderData;
    protected String encryptionAlgorithm;
    protected String encodingMethod;
    protected String deviceID;
    protected String serviceCode;
    protected String terminalIDAlternate;
    protected BigInteger terminalCompliance;
    protected String terminalCardCaptureCapability;
    protected String terminalOutputCapability;
    protected String terminalPINcapability;
    @XmlElement(name = "terminalCVMcapabilities_0")
    protected String terminalCVMcapabilities0;
    @XmlElement(name = "terminalCVMcapabilities_1")
    protected String terminalCVMcapabilities1;
    @XmlElement(name = "terminalCVMcapabilities_2")
    protected String terminalCVMcapabilities2;
    @XmlElement(name = "terminalInputCapabilities_0")
    protected String terminalInputCapabilities0;
    @XmlElement(name = "terminalInputCapabilities_1")
    protected String terminalInputCapabilities1;
    @XmlElement(name = "terminalInputCapabilities_2")
    protected String terminalInputCapabilities2;
    @XmlElement(name = "terminalInputCapabilities_3")
    protected String terminalInputCapabilities3;
    @XmlElement(name = "terminalInputCapabilities_4")
    protected String terminalInputCapabilities4;
    @XmlElement(name = "terminalInputCapabilities_5")
    protected String terminalInputCapabilities5;
    @XmlElement(name = "terminalInputCapabilities_6")
    protected String terminalInputCapabilities6;
    protected String terminalSerialNumber;
    protected String storeAndForwardIndicator;
    protected String panEntryMode;
    protected String endlessAisleTransactionIndicator;
    protected String terminalModel;

    /**
     * Obtiene el valor de la propiedad entryMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryMode() {
        return entryMode;
    }

    /**
     * Define el valor de la propiedad entryMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryMode(String value) {
        this.entryMode = value;
    }

    /**
     * Obtiene el valor de la propiedad cardPresent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPresent() {
        return cardPresent;
    }

    /**
     * Define el valor de la propiedad cardPresent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPresent(String value) {
        this.cardPresent = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalCapability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCapability() {
        return terminalCapability;
    }

    /**
     * Define el valor de la propiedad terminalCapability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCapability(String value) {
        this.terminalCapability = value;
    }

    /**
     * Obtiene el valor de la propiedad trackData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackData() {
        return trackData;
    }

    /**
     * Define el valor de la propiedad trackData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackData(String value) {
        this.trackData = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Define el valor de la propiedad terminalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * Define el valor de la propiedad terminalType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalLocation() {
        return terminalLocation;
    }

    /**
     * Define el valor de la propiedad terminalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalLocation(String value) {
        this.terminalLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionSecurity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSecurity() {
        return transactionSecurity;
    }

    /**
     * Define el valor de la propiedad transactionSecurity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSecurity(String value) {
        this.transactionSecurity = value;
    }

    /**
     * Obtiene el valor de la propiedad catLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatLevel() {
        return catLevel;
    }

    /**
     * Define el valor de la propiedad catLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatLevel(String value) {
        this.catLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad conditionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionCode() {
        return conditionCode;
    }

    /**
     * Define el valor de la propiedad conditionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionCode(String value) {
        this.conditionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad environment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Define el valor de la propiedad environment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentData() {
        return paymentData;
    }

    /**
     * Define el valor de la propiedad paymentData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentData(String value) {
        this.paymentData = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceReaderData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceReaderData() {
        return deviceReaderData;
    }

    /**
     * Define el valor de la propiedad deviceReaderData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceReaderData(String value) {
        this.deviceReaderData = value;
    }

    /**
     * Obtiene el valor de la propiedad encryptionAlgorithm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * Define el valor de la propiedad encryptionAlgorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionAlgorithm(String value) {
        this.encryptionAlgorithm = value;
    }

    /**
     * Obtiene el valor de la propiedad encodingMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingMethod() {
        return encodingMethod;
    }

    /**
     * Define el valor de la propiedad encodingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingMethod(String value) {
        this.encodingMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Define el valor de la propiedad deviceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Define el valor de la propiedad serviceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalIDAlternate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalIDAlternate() {
        return terminalIDAlternate;
    }

    /**
     * Define el valor de la propiedad terminalIDAlternate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalIDAlternate(String value) {
        this.terminalIDAlternate = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalCompliance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTerminalCompliance() {
        return terminalCompliance;
    }

    /**
     * Define el valor de la propiedad terminalCompliance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTerminalCompliance(BigInteger value) {
        this.terminalCompliance = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalCardCaptureCapability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCardCaptureCapability() {
        return terminalCardCaptureCapability;
    }

    /**
     * Define el valor de la propiedad terminalCardCaptureCapability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCardCaptureCapability(String value) {
        this.terminalCardCaptureCapability = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalOutputCapability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalOutputCapability() {
        return terminalOutputCapability;
    }

    /**
     * Define el valor de la propiedad terminalOutputCapability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalOutputCapability(String value) {
        this.terminalOutputCapability = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalPINcapability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalPINcapability() {
        return terminalPINcapability;
    }

    /**
     * Define el valor de la propiedad terminalPINcapability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalPINcapability(String value) {
        this.terminalPINcapability = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalCVMcapabilities0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCVMcapabilities0() {
        return terminalCVMcapabilities0;
    }

    /**
     * Define el valor de la propiedad terminalCVMcapabilities0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCVMcapabilities0(String value) {
        this.terminalCVMcapabilities0 = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalCVMcapabilities1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCVMcapabilities1() {
        return terminalCVMcapabilities1;
    }

    /**
     * Define el valor de la propiedad terminalCVMcapabilities1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCVMcapabilities1(String value) {
        this.terminalCVMcapabilities1 = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalCVMcapabilities2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCVMcapabilities2() {
        return terminalCVMcapabilities2;
    }

    /**
     * Define el valor de la propiedad terminalCVMcapabilities2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCVMcapabilities2(String value) {
        this.terminalCVMcapabilities2 = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalInputCapabilities0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalInputCapabilities0() {
        return terminalInputCapabilities0;
    }

    /**
     * Define el valor de la propiedad terminalInputCapabilities0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalInputCapabilities0(String value) {
        this.terminalInputCapabilities0 = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalInputCapabilities1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalInputCapabilities1() {
        return terminalInputCapabilities1;
    }

    /**
     * Define el valor de la propiedad terminalInputCapabilities1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalInputCapabilities1(String value) {
        this.terminalInputCapabilities1 = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalInputCapabilities2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalInputCapabilities2() {
        return terminalInputCapabilities2;
    }

    /**
     * Define el valor de la propiedad terminalInputCapabilities2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalInputCapabilities2(String value) {
        this.terminalInputCapabilities2 = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalInputCapabilities3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalInputCapabilities3() {
        return terminalInputCapabilities3;
    }

    /**
     * Define el valor de la propiedad terminalInputCapabilities3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalInputCapabilities3(String value) {
        this.terminalInputCapabilities3 = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalInputCapabilities4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalInputCapabilities4() {
        return terminalInputCapabilities4;
    }

    /**
     * Define el valor de la propiedad terminalInputCapabilities4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalInputCapabilities4(String value) {
        this.terminalInputCapabilities4 = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalInputCapabilities5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalInputCapabilities5() {
        return terminalInputCapabilities5;
    }

    /**
     * Define el valor de la propiedad terminalInputCapabilities5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalInputCapabilities5(String value) {
        this.terminalInputCapabilities5 = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalInputCapabilities6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalInputCapabilities6() {
        return terminalInputCapabilities6;
    }

    /**
     * Define el valor de la propiedad terminalInputCapabilities6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalInputCapabilities6(String value) {
        this.terminalInputCapabilities6 = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalSerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalSerialNumber() {
        return terminalSerialNumber;
    }

    /**
     * Define el valor de la propiedad terminalSerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalSerialNumber(String value) {
        this.terminalSerialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad storeAndForwardIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreAndForwardIndicator() {
        return storeAndForwardIndicator;
    }

    /**
     * Define el valor de la propiedad storeAndForwardIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreAndForwardIndicator(String value) {
        this.storeAndForwardIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad panEntryMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanEntryMode() {
        return panEntryMode;
    }

    /**
     * Define el valor de la propiedad panEntryMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanEntryMode(String value) {
        this.panEntryMode = value;
    }

    /**
     * Obtiene el valor de la propiedad endlessAisleTransactionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndlessAisleTransactionIndicator() {
        return endlessAisleTransactionIndicator;
    }

    /**
     * Define el valor de la propiedad endlessAisleTransactionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndlessAisleTransactionIndicator(String value) {
        this.endlessAisleTransactionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalModel() {
        return terminalModel;
    }

    /**
     * Define el valor de la propiedad terminalModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalModel(String value) {
        this.terminalModel = value;
    }

}

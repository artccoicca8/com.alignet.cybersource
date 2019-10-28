
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para JPO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="JPO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="bonusAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="bonuses" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="installments" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="firstBillingMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="jccaTerminalID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="issuerMessage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="jis2TrackData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessNameAlphanumeric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessNameJapanese" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessNameKatakana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JPO", propOrder = {
    "paymentMethod",
    "bonusAmount",
    "bonuses",
    "installments",
    "firstBillingMonth",
    "jccaTerminalID",
    "issuerMessage",
    "jis2TrackData",
    "businessNameAlphanumeric",
    "businessNameJapanese",
    "businessNameKatakana"
})
public class JPO {

    protected BigInteger paymentMethod;
    protected String bonusAmount;
    protected BigInteger bonuses;
    protected BigInteger installments;
    protected BigInteger firstBillingMonth;
    protected BigInteger jccaTerminalID;
    protected BigInteger issuerMessage;
    protected String jis2TrackData;
    protected String businessNameAlphanumeric;
    protected String businessNameJapanese;
    protected String businessNameKatakana;

    /**
     * Obtiene el valor de la propiedad paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define el valor de la propiedad paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentMethod(BigInteger value) {
        this.paymentMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad bonusAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusAmount() {
        return bonusAmount;
    }

    /**
     * Define el valor de la propiedad bonusAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusAmount(String value) {
        this.bonusAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad bonuses.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBonuses() {
        return bonuses;
    }

    /**
     * Define el valor de la propiedad bonuses.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBonuses(BigInteger value) {
        this.bonuses = value;
    }

    /**
     * Obtiene el valor de la propiedad installments.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstallments() {
        return installments;
    }

    /**
     * Define el valor de la propiedad installments.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstallments(BigInteger value) {
        this.installments = value;
    }

    /**
     * Obtiene el valor de la propiedad firstBillingMonth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstBillingMonth() {
        return firstBillingMonth;
    }

    /**
     * Define el valor de la propiedad firstBillingMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstBillingMonth(BigInteger value) {
        this.firstBillingMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad jccaTerminalID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJccaTerminalID() {
        return jccaTerminalID;
    }

    /**
     * Define el valor de la propiedad jccaTerminalID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJccaTerminalID(BigInteger value) {
        this.jccaTerminalID = value;
    }

    /**
     * Obtiene el valor de la propiedad issuerMessage.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIssuerMessage() {
        return issuerMessage;
    }

    /**
     * Define el valor de la propiedad issuerMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIssuerMessage(BigInteger value) {
        this.issuerMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad jis2TrackData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJis2TrackData() {
        return jis2TrackData;
    }

    /**
     * Define el valor de la propiedad jis2TrackData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJis2TrackData(String value) {
        this.jis2TrackData = value;
    }

    /**
     * Obtiene el valor de la propiedad businessNameAlphanumeric.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNameAlphanumeric() {
        return businessNameAlphanumeric;
    }

    /**
     * Define el valor de la propiedad businessNameAlphanumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNameAlphanumeric(String value) {
        this.businessNameAlphanumeric = value;
    }

    /**
     * Obtiene el valor de la propiedad businessNameJapanese.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNameJapanese() {
        return businessNameJapanese;
    }

    /**
     * Define el valor de la propiedad businessNameJapanese.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNameJapanese(String value) {
        this.businessNameJapanese = value;
    }

    /**
     * Obtiene el valor de la propiedad businessNameKatakana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNameKatakana() {
        return businessNameKatakana;
    }

    /**
     * Define el valor de la propiedad businessNameKatakana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNameKatakana(String value) {
        this.businessNameKatakana = value;
    }

}

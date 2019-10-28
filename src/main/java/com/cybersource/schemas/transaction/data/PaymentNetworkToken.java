
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentNetworkToken complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentNetworkToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assuranceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalCardCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceTechType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentNetworkToken", propOrder = {
    "requestorID",
    "transactionType",
    "assuranceLevel",
    "accountStatus",
    "originalCardCategory",
    "deviceTechType"
})
public class PaymentNetworkToken {

    protected String requestorID;
    protected String transactionType;
    protected String assuranceLevel;
    protected String accountStatus;
    protected String originalCardCategory;
    protected String deviceTechType;

    /**
     * Obtiene el valor de la propiedad requestorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorID() {
        return requestorID;
    }

    /**
     * Define el valor de la propiedad requestorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorID(String value) {
        this.requestorID = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Define el valor de la propiedad transactionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Obtiene el valor de la propiedad assuranceLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssuranceLevel() {
        return assuranceLevel;
    }

    /**
     * Define el valor de la propiedad assuranceLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssuranceLevel(String value) {
        this.assuranceLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad accountStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Define el valor de la propiedad accountStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad originalCardCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCardCategory() {
        return originalCardCategory;
    }

    /**
     * Define el valor de la propiedad originalCardCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCardCategory(String value) {
        this.originalCardCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceTechType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceTechType() {
        return deviceTechType;
    }

    /**
     * Define el valor de la propiedad deviceTechType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceTechType(String value) {
        this.deviceTechType = value;
    }

}

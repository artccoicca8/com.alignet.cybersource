
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncryptedPayment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncryptedPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wrappedKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keySerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedPayment", propOrder = {
    "descriptor",
    "data",
    "encoding",
    "wrappedKey",
    "referenceID",
    "errorCode",
    "keySerialNumber"
})
public class EncryptedPayment {

    protected String descriptor;
    protected String data;
    protected String encoding;
    protected String wrappedKey;
    protected BigInteger referenceID;
    protected String errorCode;
    protected String keySerialNumber;

    /**
     * Obtiene el valor de la propiedad descriptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * Define el valor de la propiedad descriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptor(String value) {
        this.descriptor = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad encoding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Define el valor de la propiedad encoding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Obtiene el valor de la propiedad wrappedKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrappedKey() {
        return wrappedKey;
    }

    /**
     * Define el valor de la propiedad wrappedKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrappedKey(String value) {
        this.wrappedKey = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferenceID() {
        return referenceID;
    }

    /**
     * Define el valor de la propiedad referenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferenceID(BigInteger value) {
        this.referenceID = value;
    }

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad keySerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySerialNumber() {
        return keySerialNumber;
    }

    /**
     * Define el valor de la propiedad keySerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySerialNumber(String value) {
        this.keySerialNumber = value;
    }

}

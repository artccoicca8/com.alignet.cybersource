
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChinaPaymentService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChinaPaymentService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickUpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ChinaPaymentService", propOrder = {
    "paymentMode",
    "returnURL",
    "pickUpAddress",
    "pickUpPhoneNumber",
    "pickUpPostalCode",
    "pickUpName"
})
public class ChinaPaymentService {

    protected String paymentMode;
    protected String returnURL;
    protected String pickUpAddress;
    protected String pickUpPhoneNumber;
    protected String pickUpPostalCode;
    protected String pickUpName;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad paymentMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Define el valor de la propiedad paymentMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
    }

    /**
     * Obtiene el valor de la propiedad returnURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Define el valor de la propiedad returnURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Obtiene el valor de la propiedad pickUpAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpAddress() {
        return pickUpAddress;
    }

    /**
     * Define el valor de la propiedad pickUpAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpAddress(String value) {
        this.pickUpAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad pickUpPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpPhoneNumber() {
        return pickUpPhoneNumber;
    }

    /**
     * Define el valor de la propiedad pickUpPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpPhoneNumber(String value) {
        this.pickUpPhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad pickUpPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpPostalCode() {
        return pickUpPostalCode;
    }

    /**
     * Define el valor de la propiedad pickUpPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpPostalCode(String value) {
        this.pickUpPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad pickUpName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpName() {
        return pickUpName;
    }

    /**
     * Define el valor de la propiedad pickUpName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpName(String value) {
        this.pickUpName = value;
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

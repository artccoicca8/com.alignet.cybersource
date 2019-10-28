
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalRefundService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalRefundService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paypalDoCaptureRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalDoCaptureRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalCaptureId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayPalRefundService", propOrder = {
    "paypalDoCaptureRequestID",
    "paypalDoCaptureRequestToken",
    "paypalCaptureId",
    "paypalNote"
})
public class PayPalRefundService {

    protected String paypalDoCaptureRequestID;
    protected String paypalDoCaptureRequestToken;
    protected String paypalCaptureId;
    protected String paypalNote;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad paypalDoCaptureRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDoCaptureRequestID() {
        return paypalDoCaptureRequestID;
    }

    /**
     * Define el valor de la propiedad paypalDoCaptureRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDoCaptureRequestID(String value) {
        this.paypalDoCaptureRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalDoCaptureRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDoCaptureRequestToken() {
        return paypalDoCaptureRequestToken;
    }

    /**
     * Define el valor de la propiedad paypalDoCaptureRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDoCaptureRequestToken(String value) {
        this.paypalDoCaptureRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalCaptureId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalCaptureId() {
        return paypalCaptureId;
    }

    /**
     * Define el valor de la propiedad paypalCaptureId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalCaptureId(String value) {
        this.paypalCaptureId = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalNote() {
        return paypalNote;
    }

    /**
     * Define el valor de la propiedad paypalNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalNote(String value) {
        this.paypalNote = value;
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

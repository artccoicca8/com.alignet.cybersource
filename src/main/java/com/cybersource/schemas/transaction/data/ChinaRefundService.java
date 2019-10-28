
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChinaRefundService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChinaRefundService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chinaPaymentRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chinaPaymentRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ChinaRefundService", propOrder = {
    "chinaPaymentRequestID",
    "chinaPaymentRequestToken",
    "refundReason"
})
public class ChinaRefundService {

    protected String chinaPaymentRequestID;
    protected String chinaPaymentRequestToken;
    protected String refundReason;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad chinaPaymentRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChinaPaymentRequestID() {
        return chinaPaymentRequestID;
    }

    /**
     * Define el valor de la propiedad chinaPaymentRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChinaPaymentRequestID(String value) {
        this.chinaPaymentRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad chinaPaymentRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChinaPaymentRequestToken() {
        return chinaPaymentRequestToken;
    }

    /**
     * Define el valor de la propiedad chinaPaymentRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChinaPaymentRequestToken(String value) {
        this.chinaPaymentRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad refundReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * Define el valor de la propiedad refundReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundReason(String value) {
        this.refundReason = value;
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

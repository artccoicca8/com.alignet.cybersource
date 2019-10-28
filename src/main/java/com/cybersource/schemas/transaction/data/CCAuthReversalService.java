
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCAuthReversalService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCAuthReversalService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reversalReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCAuthReversalService", propOrder = {
    "authRequestID",
    "authRequestToken",
    "reversalReason"
})
public class CCAuthReversalService {

    protected String authRequestID;
    protected String authRequestToken;
    protected String reversalReason;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad authRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRequestID() {
        return authRequestID;
    }

    /**
     * Define el valor de la propiedad authRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRequestID(String value) {
        this.authRequestID = value;
    }

    /**
     * Obtiene el valor de la propiedad authRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRequestToken() {
        return authRequestToken;
    }

    /**
     * Define el valor de la propiedad authRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRequestToken(String value) {
        this.authRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad reversalReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalReason() {
        return reversalReason;
    }

    /**
     * Define el valor de la propiedad reversalReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalReason(String value) {
        this.reversalReason = value;
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

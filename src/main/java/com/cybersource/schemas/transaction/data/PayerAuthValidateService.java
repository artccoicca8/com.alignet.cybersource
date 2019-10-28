
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayerAuthValidateService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayerAuthValidateService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signedPARes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayerAuthValidateService", propOrder = {
    "signedPARes",
    "authenticationTransactionID"
})
public class PayerAuthValidateService {

    protected String signedPARes;
    protected String authenticationTransactionID;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad signedPARes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedPARes() {
        return signedPARes;
    }

    /**
     * Define el valor de la propiedad signedPARes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedPARes(String value) {
        this.signedPARes = value;
    }

    /**
     * Obtiene el valor de la propiedad authenticationTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTransactionID() {
        return authenticationTransactionID;
    }

    /**
     * Define el valor de la propiedad authenticationTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTransactionID(String value) {
        this.authenticationTransactionID = value;
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

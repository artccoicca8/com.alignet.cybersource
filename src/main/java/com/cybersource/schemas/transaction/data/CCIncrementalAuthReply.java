
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CCIncrementalAuthReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CCIncrementalAuthReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizedDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentNetworkTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCIncrementalAuthReply", propOrder = {
    "reasonCode",
    "amount",
    "authorizationCode",
    "processorResponse",
    "authorizedDateTime",
    "reconciliationID",
    "paymentNetworkTransactionID",
    "cardCategory"
})
public class CCIncrementalAuthReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String amount;
    protected String authorizationCode;
    protected String processorResponse;
    protected String authorizedDateTime;
    protected String reconciliationID;
    protected String paymentNetworkTransactionID;
    protected String cardCategory;

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
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Define el valor de la propiedad authorizationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad processorResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Define el valor de la propiedad processorResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorResponse(String value) {
        this.processorResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizedDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedDateTime() {
        return authorizedDateTime;
    }

    /**
     * Define el valor de la propiedad authorizedDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedDateTime(String value) {
        this.authorizedDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad reconciliationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Define el valor de la propiedad reconciliationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentNetworkTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNetworkTransactionID() {
        return paymentNetworkTransactionID;
    }

    /**
     * Define el valor de la propiedad paymentNetworkTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNetworkTransactionID(String value) {
        this.paymentNetworkTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad cardCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCategory() {
        return cardCategory;
    }

    /**
     * Define el valor de la propiedad cardCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCategory(String value) {
        this.cardCategory = value;
    }

}


package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayPalDoRefTransactionService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayPalDoRefTransactionService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paypalBillingAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalReqconfirmshipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalReturnFmfDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalSoftDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalShippingdiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalEcNotifyUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PayPalDoRefTransactionService", propOrder = {
    "paypalBillingAgreementId",
    "paypalPaymentType",
    "paypalReqconfirmshipping",
    "paypalReturnFmfDetails",
    "paypalSoftDescriptor",
    "paypalShippingdiscount",
    "paypalDesc",
    "invoiceNumber",
    "paypalEcNotifyUrl"
})
public class PayPalDoRefTransactionService {

    protected String paypalBillingAgreementId;
    protected String paypalPaymentType;
    protected String paypalReqconfirmshipping;
    protected String paypalReturnFmfDetails;
    protected String paypalSoftDescriptor;
    protected String paypalShippingdiscount;
    protected String paypalDesc;
    protected String invoiceNumber;
    protected String paypalEcNotifyUrl;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad paypalBillingAgreementId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalBillingAgreementId() {
        return paypalBillingAgreementId;
    }

    /**
     * Define el valor de la propiedad paypalBillingAgreementId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalBillingAgreementId(String value) {
        this.paypalBillingAgreementId = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalPaymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalPaymentType() {
        return paypalPaymentType;
    }

    /**
     * Define el valor de la propiedad paypalPaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalPaymentType(String value) {
        this.paypalPaymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalReqconfirmshipping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalReqconfirmshipping() {
        return paypalReqconfirmshipping;
    }

    /**
     * Define el valor de la propiedad paypalReqconfirmshipping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalReqconfirmshipping(String value) {
        this.paypalReqconfirmshipping = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalReturnFmfDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalReturnFmfDetails() {
        return paypalReturnFmfDetails;
    }

    /**
     * Define el valor de la propiedad paypalReturnFmfDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalReturnFmfDetails(String value) {
        this.paypalReturnFmfDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalSoftDescriptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalSoftDescriptor() {
        return paypalSoftDescriptor;
    }

    /**
     * Define el valor de la propiedad paypalSoftDescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalSoftDescriptor(String value) {
        this.paypalSoftDescriptor = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalShippingdiscount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalShippingdiscount() {
        return paypalShippingdiscount;
    }

    /**
     * Define el valor de la propiedad paypalShippingdiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalShippingdiscount(String value) {
        this.paypalShippingdiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalDesc() {
        return paypalDesc;
    }

    /**
     * Define el valor de la propiedad paypalDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalDesc(String value) {
        this.paypalDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define el valor de la propiedad invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad paypalEcNotifyUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalEcNotifyUrl() {
        return paypalEcNotifyUrl;
    }

    /**
     * Define el valor de la propiedad paypalEcNotifyUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalEcNotifyUrl(String value) {
        this.paypalEcNotifyUrl = value;
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

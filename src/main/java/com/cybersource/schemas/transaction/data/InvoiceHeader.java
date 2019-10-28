
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceHeader complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorAlternate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isGift" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="returnsAccepted" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="tenderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantVATRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaserOrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaserVATRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatInvoiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summaryCommodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierOrderReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxable" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="amexDataTAA1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amexDataTAA2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amexDataTAA3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amexDataTAA4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTaxTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAcceptorRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizedContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesOrganizationID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="submerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submerchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submerchantStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submerchantCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submerchantPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submerchantState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submerchantCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submerchantEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submerchantTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submerchantRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submerchantMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceDataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceDataNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorStoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clerkID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customData_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeader", propOrder = {
    "merchantDescriptor",
    "merchantDescriptorContact",
    "merchantDescriptorAlternate",
    "merchantDescriptorStreet",
    "merchantDescriptorCity",
    "merchantDescriptorState",
    "merchantDescriptorPostalCode",
    "merchantDescriptorCountry",
    "isGift",
    "returnsAccepted",
    "tenderType",
    "merchantVATRegistrationNumber",
    "purchaserOrderDate",
    "purchaserVATRegistrationNumber",
    "vatInvoiceReferenceNumber",
    "summaryCommodityCode",
    "supplierOrderReference",
    "userPO",
    "costCenter",
    "purchaserCode",
    "taxable",
    "amexDataTAA1",
    "amexDataTAA2",
    "amexDataTAA3",
    "amexDataTAA4",
    "invoiceDate",
    "totalTaxTypeCode",
    "cardAcceptorRefNumber",
    "authorizedContactName",
    "businessApplicationID",
    "salesOrganizationID",
    "submerchantID",
    "submerchantName",
    "submerchantStreet",
    "submerchantCity",
    "submerchantPostalCode",
    "submerchantState",
    "submerchantCountry",
    "submerchantEmail",
    "submerchantTelephoneNumber",
    "submerchantRegion",
    "submerchantMerchantID",
    "merchantDescriptorCounty",
    "referenceDataCode",
    "referenceDataNumber",
    "merchantDescriptorStoreID",
    "clerkID",
    "customData1"
})
public class InvoiceHeader {

    protected String merchantDescriptor;
    protected String merchantDescriptorContact;
    protected String merchantDescriptorAlternate;
    protected String merchantDescriptorStreet;
    protected String merchantDescriptorCity;
    protected String merchantDescriptorState;
    protected String merchantDescriptorPostalCode;
    protected String merchantDescriptorCountry;
    protected String isGift;
    protected String returnsAccepted;
    protected String tenderType;
    protected String merchantVATRegistrationNumber;
    protected String purchaserOrderDate;
    protected String purchaserVATRegistrationNumber;
    protected String vatInvoiceReferenceNumber;
    protected String summaryCommodityCode;
    protected String supplierOrderReference;
    protected String userPO;
    protected String costCenter;
    protected String purchaserCode;
    protected String taxable;
    protected String amexDataTAA1;
    protected String amexDataTAA2;
    protected String amexDataTAA3;
    protected String amexDataTAA4;
    protected String invoiceDate;
    protected String totalTaxTypeCode;
    protected String cardAcceptorRefNumber;
    protected String authorizedContactName;
    protected String businessApplicationID;
    protected BigInteger salesOrganizationID;
    protected String submerchantID;
    protected String submerchantName;
    protected String submerchantStreet;
    protected String submerchantCity;
    protected String submerchantPostalCode;
    protected String submerchantState;
    protected String submerchantCountry;
    protected String submerchantEmail;
    protected String submerchantTelephoneNumber;
    protected String submerchantRegion;
    protected String submerchantMerchantID;
    protected String merchantDescriptorCounty;
    protected String referenceDataCode;
    protected String referenceDataNumber;
    protected String merchantDescriptorStoreID;
    protected String clerkID;
    @XmlElement(name = "customData_1")
    protected String customData1;

    /**
     * Obtiene el valor de la propiedad merchantDescriptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptor() {
        return merchantDescriptor;
    }

    /**
     * Define el valor de la propiedad merchantDescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptor(String value) {
        this.merchantDescriptor = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDescriptorContact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorContact() {
        return merchantDescriptorContact;
    }

    /**
     * Define el valor de la propiedad merchantDescriptorContact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorContact(String value) {
        this.merchantDescriptorContact = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDescriptorAlternate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorAlternate() {
        return merchantDescriptorAlternate;
    }

    /**
     * Define el valor de la propiedad merchantDescriptorAlternate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorAlternate(String value) {
        this.merchantDescriptorAlternate = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDescriptorStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorStreet() {
        return merchantDescriptorStreet;
    }

    /**
     * Define el valor de la propiedad merchantDescriptorStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorStreet(String value) {
        this.merchantDescriptorStreet = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDescriptorCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorCity() {
        return merchantDescriptorCity;
    }

    /**
     * Define el valor de la propiedad merchantDescriptorCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorCity(String value) {
        this.merchantDescriptorCity = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDescriptorState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorState() {
        return merchantDescriptorState;
    }

    /**
     * Define el valor de la propiedad merchantDescriptorState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorState(String value) {
        this.merchantDescriptorState = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDescriptorPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorPostalCode() {
        return merchantDescriptorPostalCode;
    }

    /**
     * Define el valor de la propiedad merchantDescriptorPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorPostalCode(String value) {
        this.merchantDescriptorPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDescriptorCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorCountry() {
        return merchantDescriptorCountry;
    }

    /**
     * Define el valor de la propiedad merchantDescriptorCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorCountry(String value) {
        this.merchantDescriptorCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad isGift.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsGift() {
        return isGift;
    }

    /**
     * Define el valor de la propiedad isGift.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsGift(String value) {
        this.isGift = value;
    }

    /**
     * Obtiene el valor de la propiedad returnsAccepted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsAccepted() {
        return returnsAccepted;
    }

    /**
     * Define el valor de la propiedad returnsAccepted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsAccepted(String value) {
        this.returnsAccepted = value;
    }

    /**
     * Obtiene el valor de la propiedad tenderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderType() {
        return tenderType;
    }

    /**
     * Define el valor de la propiedad tenderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderType(String value) {
        this.tenderType = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantVATRegistrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantVATRegistrationNumber() {
        return merchantVATRegistrationNumber;
    }

    /**
     * Define el valor de la propiedad merchantVATRegistrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantVATRegistrationNumber(String value) {
        this.merchantVATRegistrationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaserOrderDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserOrderDate() {
        return purchaserOrderDate;
    }

    /**
     * Define el valor de la propiedad purchaserOrderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserOrderDate(String value) {
        this.purchaserOrderDate = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaserVATRegistrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserVATRegistrationNumber() {
        return purchaserVATRegistrationNumber;
    }

    /**
     * Define el valor de la propiedad purchaserVATRegistrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserVATRegistrationNumber(String value) {
        this.purchaserVATRegistrationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad vatInvoiceReferenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatInvoiceReferenceNumber() {
        return vatInvoiceReferenceNumber;
    }

    /**
     * Define el valor de la propiedad vatInvoiceReferenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatInvoiceReferenceNumber(String value) {
        this.vatInvoiceReferenceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad summaryCommodityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryCommodityCode() {
        return summaryCommodityCode;
    }

    /**
     * Define el valor de la propiedad summaryCommodityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryCommodityCode(String value) {
        this.summaryCommodityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierOrderReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierOrderReference() {
        return supplierOrderReference;
    }

    /**
     * Define el valor de la propiedad supplierOrderReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierOrderReference(String value) {
        this.supplierOrderReference = value;
    }

    /**
     * Obtiene el valor de la propiedad userPO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPO() {
        return userPO;
    }

    /**
     * Define el valor de la propiedad userPO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPO(String value) {
        this.userPO = value;
    }

    /**
     * Obtiene el valor de la propiedad costCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Define el valor de la propiedad costCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaserCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserCode() {
        return purchaserCode;
    }

    /**
     * Define el valor de la propiedad purchaserCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserCode(String value) {
        this.purchaserCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxable() {
        return taxable;
    }

    /**
     * Define el valor de la propiedad taxable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxable(String value) {
        this.taxable = value;
    }

    /**
     * Obtiene el valor de la propiedad amexDataTAA1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA1() {
        return amexDataTAA1;
    }

    /**
     * Define el valor de la propiedad amexDataTAA1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA1(String value) {
        this.amexDataTAA1 = value;
    }

    /**
     * Obtiene el valor de la propiedad amexDataTAA2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA2() {
        return amexDataTAA2;
    }

    /**
     * Define el valor de la propiedad amexDataTAA2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA2(String value) {
        this.amexDataTAA2 = value;
    }

    /**
     * Obtiene el valor de la propiedad amexDataTAA3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA3() {
        return amexDataTAA3;
    }

    /**
     * Define el valor de la propiedad amexDataTAA3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA3(String value) {
        this.amexDataTAA3 = value;
    }

    /**
     * Obtiene el valor de la propiedad amexDataTAA4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA4() {
        return amexDataTAA4;
    }

    /**
     * Define el valor de la propiedad amexDataTAA4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA4(String value) {
        this.amexDataTAA4 = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Define el valor de la propiedad invoiceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTaxTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTaxTypeCode() {
        return totalTaxTypeCode;
    }

    /**
     * Define el valor de la propiedad totalTaxTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTaxTypeCode(String value) {
        this.totalTaxTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAcceptorRefNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorRefNumber() {
        return cardAcceptorRefNumber;
    }

    /**
     * Define el valor de la propiedad cardAcceptorRefNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorRefNumber(String value) {
        this.cardAcceptorRefNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizedContactName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedContactName() {
        return authorizedContactName;
    }

    /**
     * Define el valor de la propiedad authorizedContactName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedContactName(String value) {
        this.authorizedContactName = value;
    }

    /**
     * Obtiene el valor de la propiedad businessApplicationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessApplicationID() {
        return businessApplicationID;
    }

    /**
     * Define el valor de la propiedad businessApplicationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessApplicationID(String value) {
        this.businessApplicationID = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOrganizationID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSalesOrganizationID() {
        return salesOrganizationID;
    }

    /**
     * Define el valor de la propiedad salesOrganizationID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSalesOrganizationID(BigInteger value) {
        this.salesOrganizationID = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantID() {
        return submerchantID;
    }

    /**
     * Define el valor de la propiedad submerchantID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantID(String value) {
        this.submerchantID = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantName() {
        return submerchantName;
    }

    /**
     * Define el valor de la propiedad submerchantName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantName(String value) {
        this.submerchantName = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantStreet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantStreet() {
        return submerchantStreet;
    }

    /**
     * Define el valor de la propiedad submerchantStreet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantStreet(String value) {
        this.submerchantStreet = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantCity() {
        return submerchantCity;
    }

    /**
     * Define el valor de la propiedad submerchantCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantCity(String value) {
        this.submerchantCity = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantPostalCode() {
        return submerchantPostalCode;
    }

    /**
     * Define el valor de la propiedad submerchantPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantPostalCode(String value) {
        this.submerchantPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantState() {
        return submerchantState;
    }

    /**
     * Define el valor de la propiedad submerchantState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantState(String value) {
        this.submerchantState = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantCountry() {
        return submerchantCountry;
    }

    /**
     * Define el valor de la propiedad submerchantCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantCountry(String value) {
        this.submerchantCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantEmail() {
        return submerchantEmail;
    }

    /**
     * Define el valor de la propiedad submerchantEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantEmail(String value) {
        this.submerchantEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantTelephoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantTelephoneNumber() {
        return submerchantTelephoneNumber;
    }

    /**
     * Define el valor de la propiedad submerchantTelephoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantTelephoneNumber(String value) {
        this.submerchantTelephoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantRegion() {
        return submerchantRegion;
    }

    /**
     * Define el valor de la propiedad submerchantRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantRegion(String value) {
        this.submerchantRegion = value;
    }

    /**
     * Obtiene el valor de la propiedad submerchantMerchantID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmerchantMerchantID() {
        return submerchantMerchantID;
    }

    /**
     * Define el valor de la propiedad submerchantMerchantID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmerchantMerchantID(String value) {
        this.submerchantMerchantID = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDescriptorCounty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorCounty() {
        return merchantDescriptorCounty;
    }

    /**
     * Define el valor de la propiedad merchantDescriptorCounty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorCounty(String value) {
        this.merchantDescriptorCounty = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceDataCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDataCode() {
        return referenceDataCode;
    }

    /**
     * Define el valor de la propiedad referenceDataCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDataCode(String value) {
        this.referenceDataCode = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceDataNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDataNumber() {
        return referenceDataNumber;
    }

    /**
     * Define el valor de la propiedad referenceDataNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDataNumber(String value) {
        this.referenceDataNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDescriptorStoreID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorStoreID() {
        return merchantDescriptorStoreID;
    }

    /**
     * Define el valor de la propiedad merchantDescriptorStoreID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorStoreID(String value) {
        this.merchantDescriptorStoreID = value;
    }

    /**
     * Obtiene el valor de la propiedad clerkID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClerkID() {
        return clerkID;
    }

    /**
     * Define el valor de la propiedad clerkID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClerkID(String value) {
        this.clerkID = value;
    }

    /**
     * Obtiene el valor de la propiedad customData1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomData1() {
        return customData1;
    }

    /**
     * Define el valor de la propiedad customData1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomData1(String value) {
        this.customData1 = value;
    }

}

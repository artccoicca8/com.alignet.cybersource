
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TaxService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nexus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noNexus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderAcceptanceCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderAcceptanceCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderAcceptanceCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderAcceptanceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderAcceptancePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderOriginCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderOriginCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderOriginCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderOriginState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderOriginPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellerRegistration9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyerRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middlemanRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pointOfTitleTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commitIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOverrideReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TaxService", propOrder = {
    "nexus",
    "noNexus",
    "orderAcceptanceCity",
    "orderAcceptanceCounty",
    "orderAcceptanceCountry",
    "orderAcceptanceState",
    "orderAcceptancePostalCode",
    "orderOriginCity",
    "orderOriginCounty",
    "orderOriginCountry",
    "orderOriginState",
    "orderOriginPostalCode",
    "sellerRegistration",
    "sellerRegistration0",
    "sellerRegistration1",
    "sellerRegistration2",
    "sellerRegistration3",
    "sellerRegistration4",
    "sellerRegistration5",
    "sellerRegistration6",
    "sellerRegistration7",
    "sellerRegistration8",
    "sellerRegistration9",
    "buyerRegistration",
    "middlemanRegistration",
    "pointOfTitleTransfer",
    "commitIndicator",
    "refundIndicator",
    "dateOverrideReason",
    "reportingDate"
})
public class TaxService {

    protected String nexus;
    protected String noNexus;
    protected String orderAcceptanceCity;
    protected String orderAcceptanceCounty;
    protected String orderAcceptanceCountry;
    protected String orderAcceptanceState;
    protected String orderAcceptancePostalCode;
    protected String orderOriginCity;
    protected String orderOriginCounty;
    protected String orderOriginCountry;
    protected String orderOriginState;
    protected String orderOriginPostalCode;
    protected String sellerRegistration;
    protected String sellerRegistration0;
    protected String sellerRegistration1;
    protected String sellerRegistration2;
    protected String sellerRegistration3;
    protected String sellerRegistration4;
    protected String sellerRegistration5;
    protected String sellerRegistration6;
    protected String sellerRegistration7;
    protected String sellerRegistration8;
    protected String sellerRegistration9;
    protected String buyerRegistration;
    protected String middlemanRegistration;
    protected String pointOfTitleTransfer;
    protected String commitIndicator;
    protected String refundIndicator;
    protected String dateOverrideReason;
    protected String reportingDate;
    @XmlAttribute(name = "run", required = true)
    protected String run;

    /**
     * Obtiene el valor de la propiedad nexus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNexus() {
        return nexus;
    }

    /**
     * Define el valor de la propiedad nexus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNexus(String value) {
        this.nexus = value;
    }

    /**
     * Obtiene el valor de la propiedad noNexus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoNexus() {
        return noNexus;
    }

    /**
     * Define el valor de la propiedad noNexus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoNexus(String value) {
        this.noNexus = value;
    }

    /**
     * Obtiene el valor de la propiedad orderAcceptanceCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceCity() {
        return orderAcceptanceCity;
    }

    /**
     * Define el valor de la propiedad orderAcceptanceCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceCity(String value) {
        this.orderAcceptanceCity = value;
    }

    /**
     * Obtiene el valor de la propiedad orderAcceptanceCounty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceCounty() {
        return orderAcceptanceCounty;
    }

    /**
     * Define el valor de la propiedad orderAcceptanceCounty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceCounty(String value) {
        this.orderAcceptanceCounty = value;
    }

    /**
     * Obtiene el valor de la propiedad orderAcceptanceCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceCountry() {
        return orderAcceptanceCountry;
    }

    /**
     * Define el valor de la propiedad orderAcceptanceCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceCountry(String value) {
        this.orderAcceptanceCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad orderAcceptanceState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptanceState() {
        return orderAcceptanceState;
    }

    /**
     * Define el valor de la propiedad orderAcceptanceState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptanceState(String value) {
        this.orderAcceptanceState = value;
    }

    /**
     * Obtiene el valor de la propiedad orderAcceptancePostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAcceptancePostalCode() {
        return orderAcceptancePostalCode;
    }

    /**
     * Define el valor de la propiedad orderAcceptancePostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAcceptancePostalCode(String value) {
        this.orderAcceptancePostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad orderOriginCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginCity() {
        return orderOriginCity;
    }

    /**
     * Define el valor de la propiedad orderOriginCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginCity(String value) {
        this.orderOriginCity = value;
    }

    /**
     * Obtiene el valor de la propiedad orderOriginCounty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginCounty() {
        return orderOriginCounty;
    }

    /**
     * Define el valor de la propiedad orderOriginCounty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginCounty(String value) {
        this.orderOriginCounty = value;
    }

    /**
     * Obtiene el valor de la propiedad orderOriginCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginCountry() {
        return orderOriginCountry;
    }

    /**
     * Define el valor de la propiedad orderOriginCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginCountry(String value) {
        this.orderOriginCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad orderOriginState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginState() {
        return orderOriginState;
    }

    /**
     * Define el valor de la propiedad orderOriginState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginState(String value) {
        this.orderOriginState = value;
    }

    /**
     * Obtiene el valor de la propiedad orderOriginPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOriginPostalCode() {
        return orderOriginPostalCode;
    }

    /**
     * Define el valor de la propiedad orderOriginPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOriginPostalCode(String value) {
        this.orderOriginPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration() {
        return sellerRegistration;
    }

    /**
     * Define el valor de la propiedad sellerRegistration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration(String value) {
        this.sellerRegistration = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration0() {
        return sellerRegistration0;
    }

    /**
     * Define el valor de la propiedad sellerRegistration0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration0(String value) {
        this.sellerRegistration0 = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration1() {
        return sellerRegistration1;
    }

    /**
     * Define el valor de la propiedad sellerRegistration1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration1(String value) {
        this.sellerRegistration1 = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration2() {
        return sellerRegistration2;
    }

    /**
     * Define el valor de la propiedad sellerRegistration2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration2(String value) {
        this.sellerRegistration2 = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration3() {
        return sellerRegistration3;
    }

    /**
     * Define el valor de la propiedad sellerRegistration3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration3(String value) {
        this.sellerRegistration3 = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration4() {
        return sellerRegistration4;
    }

    /**
     * Define el valor de la propiedad sellerRegistration4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration4(String value) {
        this.sellerRegistration4 = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration5() {
        return sellerRegistration5;
    }

    /**
     * Define el valor de la propiedad sellerRegistration5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration5(String value) {
        this.sellerRegistration5 = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration6() {
        return sellerRegistration6;
    }

    /**
     * Define el valor de la propiedad sellerRegistration6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration6(String value) {
        this.sellerRegistration6 = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration7() {
        return sellerRegistration7;
    }

    /**
     * Define el valor de la propiedad sellerRegistration7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration7(String value) {
        this.sellerRegistration7 = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration8() {
        return sellerRegistration8;
    }

    /**
     * Define el valor de la propiedad sellerRegistration8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration8(String value) {
        this.sellerRegistration8 = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerRegistration9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerRegistration9() {
        return sellerRegistration9;
    }

    /**
     * Define el valor de la propiedad sellerRegistration9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerRegistration9(String value) {
        this.sellerRegistration9 = value;
    }

    /**
     * Obtiene el valor de la propiedad buyerRegistration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerRegistration() {
        return buyerRegistration;
    }

    /**
     * Define el valor de la propiedad buyerRegistration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerRegistration(String value) {
        this.buyerRegistration = value;
    }

    /**
     * Obtiene el valor de la propiedad middlemanRegistration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlemanRegistration() {
        return middlemanRegistration;
    }

    /**
     * Define el valor de la propiedad middlemanRegistration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlemanRegistration(String value) {
        this.middlemanRegistration = value;
    }

    /**
     * Obtiene el valor de la propiedad pointOfTitleTransfer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfTitleTransfer() {
        return pointOfTitleTransfer;
    }

    /**
     * Define el valor de la propiedad pointOfTitleTransfer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfTitleTransfer(String value) {
        this.pointOfTitleTransfer = value;
    }

    /**
     * Obtiene el valor de la propiedad commitIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitIndicator() {
        return commitIndicator;
    }

    /**
     * Define el valor de la propiedad commitIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitIndicator(String value) {
        this.commitIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad refundIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundIndicator() {
        return refundIndicator;
    }

    /**
     * Define el valor de la propiedad refundIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundIndicator(String value) {
        this.refundIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad dateOverrideReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOverrideReason() {
        return dateOverrideReason;
    }

    /**
     * Define el valor de la propiedad dateOverrideReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOverrideReason(String value) {
        this.dateOverrideReason = value;
    }

    /**
     * Obtiene el valor de la propiedad reportingDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingDate() {
        return reportingDate;
    }

    /**
     * Define el valor de la propiedad reportingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingDate(String value) {
        this.reportingDate = value;
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

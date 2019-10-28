
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ECAVSReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ECAVSReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="validationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfReturns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastReturnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastReturnProcessorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addedOrClosedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fcraDisputeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoredAccountProcessorResponse1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoredAccountProcessorResponse2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoredAccountProcessorResponse3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoredAccountProcessorResponse5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerDataConditionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToCompanyPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToCompanyTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchBillToDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchPersonalIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchPersonalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchPersonalIDIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overallMatchScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="calculatedResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECAVSReply", propOrder = {
    "reasonCode",
    "validationType",
    "primaryStatusCode",
    "secondaryStatusCode",
    "additionalStatusCode",
    "numberOfReturns",
    "lastReturnDate",
    "lastReturnProcessorResponse",
    "lastUpdateDate",
    "addedOrClosedDate",
    "previousStatusCode",
    "fcraDisputeCode",
    "scoredAccountProcessorResponse1",
    "scoredAccountProcessorResponse2",
    "scoredAccountProcessorResponse3",
    "scoredAccountProcessorResponse5",
    "customerDataConditionCode",
    "matchBillToFullName",
    "matchBillToPrefix",
    "matchBillToFirstName",
    "matchBillToMiddleName",
    "matchBillToLastName",
    "matchBillToSuffix",
    "matchBillToCompany",
    "matchBillToAddress",
    "matchBillToCity",
    "matchBillToState",
    "matchBillToPostalCode",
    "matchBillToPhoneNumber",
    "matchBillToCompanyPhoneNumber",
    "matchBillToCompanyTaxID",
    "matchBillToSSN",
    "matchBillToDateOfBirth",
    "matchPersonalIDType",
    "matchPersonalID",
    "matchPersonalIDIssuedBy",
    "overallMatchScore",
    "calculatedResponse"
})
public class ECAVSReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String validationType;
    protected String primaryStatusCode;
    protected String secondaryStatusCode;
    protected String additionalStatusCode;
    protected String numberOfReturns;
    protected String lastReturnDate;
    protected String lastReturnProcessorResponse;
    protected String lastUpdateDate;
    protected String addedOrClosedDate;
    protected String previousStatusCode;
    protected String fcraDisputeCode;
    protected String scoredAccountProcessorResponse1;
    protected String scoredAccountProcessorResponse2;
    protected String scoredAccountProcessorResponse3;
    protected String scoredAccountProcessorResponse5;
    protected String customerDataConditionCode;
    protected String matchBillToFullName;
    protected String matchBillToPrefix;
    protected String matchBillToFirstName;
    protected String matchBillToMiddleName;
    protected String matchBillToLastName;
    protected String matchBillToSuffix;
    protected String matchBillToCompany;
    protected String matchBillToAddress;
    protected String matchBillToCity;
    protected String matchBillToState;
    protected String matchBillToPostalCode;
    protected String matchBillToPhoneNumber;
    protected String matchBillToCompanyPhoneNumber;
    protected String matchBillToCompanyTaxID;
    protected String matchBillToSSN;
    protected String matchBillToDateOfBirth;
    protected String matchPersonalIDType;
    protected String matchPersonalID;
    protected String matchPersonalIDIssuedBy;
    protected BigInteger overallMatchScore;
    protected String calculatedResponse;

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
     * Obtiene el valor de la propiedad validationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Define el valor de la propiedad validationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryStatusCode() {
        return primaryStatusCode;
    }

    /**
     * Define el valor de la propiedad primaryStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryStatusCode(String value) {
        this.primaryStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad secondaryStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryStatusCode() {
        return secondaryStatusCode;
    }

    /**
     * Define el valor de la propiedad secondaryStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryStatusCode(String value) {
        this.secondaryStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalStatusCode() {
        return additionalStatusCode;
    }

    /**
     * Define el valor de la propiedad additionalStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStatusCode(String value) {
        this.additionalStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfReturns.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfReturns() {
        return numberOfReturns;
    }

    /**
     * Define el valor de la propiedad numberOfReturns.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfReturns(String value) {
        this.numberOfReturns = value;
    }

    /**
     * Obtiene el valor de la propiedad lastReturnDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReturnDate() {
        return lastReturnDate;
    }

    /**
     * Define el valor de la propiedad lastReturnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReturnDate(String value) {
        this.lastReturnDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lastReturnProcessorResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReturnProcessorResponse() {
        return lastReturnProcessorResponse;
    }

    /**
     * Define el valor de la propiedad lastReturnProcessorResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReturnProcessorResponse(String value) {
        this.lastReturnProcessorResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad lastUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Define el valor de la propiedad lastUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDate(String value) {
        this.lastUpdateDate = value;
    }

    /**
     * Obtiene el valor de la propiedad addedOrClosedDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedOrClosedDate() {
        return addedOrClosedDate;
    }

    /**
     * Define el valor de la propiedad addedOrClosedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedOrClosedDate(String value) {
        this.addedOrClosedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad previousStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousStatusCode() {
        return previousStatusCode;
    }

    /**
     * Define el valor de la propiedad previousStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousStatusCode(String value) {
        this.previousStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad fcraDisputeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcraDisputeCode() {
        return fcraDisputeCode;
    }

    /**
     * Define el valor de la propiedad fcraDisputeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcraDisputeCode(String value) {
        this.fcraDisputeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad scoredAccountProcessorResponse1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoredAccountProcessorResponse1() {
        return scoredAccountProcessorResponse1;
    }

    /**
     * Define el valor de la propiedad scoredAccountProcessorResponse1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoredAccountProcessorResponse1(String value) {
        this.scoredAccountProcessorResponse1 = value;
    }

    /**
     * Obtiene el valor de la propiedad scoredAccountProcessorResponse2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoredAccountProcessorResponse2() {
        return scoredAccountProcessorResponse2;
    }

    /**
     * Define el valor de la propiedad scoredAccountProcessorResponse2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoredAccountProcessorResponse2(String value) {
        this.scoredAccountProcessorResponse2 = value;
    }

    /**
     * Obtiene el valor de la propiedad scoredAccountProcessorResponse3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoredAccountProcessorResponse3() {
        return scoredAccountProcessorResponse3;
    }

    /**
     * Define el valor de la propiedad scoredAccountProcessorResponse3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoredAccountProcessorResponse3(String value) {
        this.scoredAccountProcessorResponse3 = value;
    }

    /**
     * Obtiene el valor de la propiedad scoredAccountProcessorResponse5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoredAccountProcessorResponse5() {
        return scoredAccountProcessorResponse5;
    }

    /**
     * Define el valor de la propiedad scoredAccountProcessorResponse5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoredAccountProcessorResponse5(String value) {
        this.scoredAccountProcessorResponse5 = value;
    }

    /**
     * Obtiene el valor de la propiedad customerDataConditionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDataConditionCode() {
        return customerDataConditionCode;
    }

    /**
     * Define el valor de la propiedad customerDataConditionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDataConditionCode(String value) {
        this.customerDataConditionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToFullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToFullName() {
        return matchBillToFullName;
    }

    /**
     * Define el valor de la propiedad matchBillToFullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToFullName(String value) {
        this.matchBillToFullName = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToPrefix() {
        return matchBillToPrefix;
    }

    /**
     * Define el valor de la propiedad matchBillToPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToPrefix(String value) {
        this.matchBillToPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToFirstName() {
        return matchBillToFirstName;
    }

    /**
     * Define el valor de la propiedad matchBillToFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToFirstName(String value) {
        this.matchBillToFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToMiddleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToMiddleName() {
        return matchBillToMiddleName;
    }

    /**
     * Define el valor de la propiedad matchBillToMiddleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToMiddleName(String value) {
        this.matchBillToMiddleName = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToLastName() {
        return matchBillToLastName;
    }

    /**
     * Define el valor de la propiedad matchBillToLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToLastName(String value) {
        this.matchBillToLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToSuffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToSuffix() {
        return matchBillToSuffix;
    }

    /**
     * Define el valor de la propiedad matchBillToSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToSuffix(String value) {
        this.matchBillToSuffix = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToCompany() {
        return matchBillToCompany;
    }

    /**
     * Define el valor de la propiedad matchBillToCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToCompany(String value) {
        this.matchBillToCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToAddress() {
        return matchBillToAddress;
    }

    /**
     * Define el valor de la propiedad matchBillToAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToAddress(String value) {
        this.matchBillToAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToCity() {
        return matchBillToCity;
    }

    /**
     * Define el valor de la propiedad matchBillToCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToCity(String value) {
        this.matchBillToCity = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToState() {
        return matchBillToState;
    }

    /**
     * Define el valor de la propiedad matchBillToState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToState(String value) {
        this.matchBillToState = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToPostalCode() {
        return matchBillToPostalCode;
    }

    /**
     * Define el valor de la propiedad matchBillToPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToPostalCode(String value) {
        this.matchBillToPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToPhoneNumber() {
        return matchBillToPhoneNumber;
    }

    /**
     * Define el valor de la propiedad matchBillToPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToPhoneNumber(String value) {
        this.matchBillToPhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToCompanyPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToCompanyPhoneNumber() {
        return matchBillToCompanyPhoneNumber;
    }

    /**
     * Define el valor de la propiedad matchBillToCompanyPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToCompanyPhoneNumber(String value) {
        this.matchBillToCompanyPhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToCompanyTaxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToCompanyTaxID() {
        return matchBillToCompanyTaxID;
    }

    /**
     * Define el valor de la propiedad matchBillToCompanyTaxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToCompanyTaxID(String value) {
        this.matchBillToCompanyTaxID = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToSSN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToSSN() {
        return matchBillToSSN;
    }

    /**
     * Define el valor de la propiedad matchBillToSSN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToSSN(String value) {
        this.matchBillToSSN = value;
    }

    /**
     * Obtiene el valor de la propiedad matchBillToDateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchBillToDateOfBirth() {
        return matchBillToDateOfBirth;
    }

    /**
     * Define el valor de la propiedad matchBillToDateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchBillToDateOfBirth(String value) {
        this.matchBillToDateOfBirth = value;
    }

    /**
     * Obtiene el valor de la propiedad matchPersonalIDType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchPersonalIDType() {
        return matchPersonalIDType;
    }

    /**
     * Define el valor de la propiedad matchPersonalIDType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchPersonalIDType(String value) {
        this.matchPersonalIDType = value;
    }

    /**
     * Obtiene el valor de la propiedad matchPersonalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchPersonalID() {
        return matchPersonalID;
    }

    /**
     * Define el valor de la propiedad matchPersonalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchPersonalID(String value) {
        this.matchPersonalID = value;
    }

    /**
     * Obtiene el valor de la propiedad matchPersonalIDIssuedBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchPersonalIDIssuedBy() {
        return matchPersonalIDIssuedBy;
    }

    /**
     * Define el valor de la propiedad matchPersonalIDIssuedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchPersonalIDIssuedBy(String value) {
        this.matchPersonalIDIssuedBy = value;
    }

    /**
     * Obtiene el valor de la propiedad overallMatchScore.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverallMatchScore() {
        return overallMatchScore;
    }

    /**
     * Define el valor de la propiedad overallMatchScore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverallMatchScore(BigInteger value) {
        this.overallMatchScore = value;
    }

    /**
     * Obtiene el valor de la propiedad calculatedResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedResponse() {
        return calculatedResponse;
    }

    /**
     * Define el valor de la propiedad calculatedResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedResponse(String value) {
        this.calculatedResponse = value;
    }

}


package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BML complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerBillingAddressChange" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="customerEmailChange" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="customerHasCheckingAccount" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="customerHasSavingsAccount" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="customerPasswordChange" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="customerPhoneChange" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="customerRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grossHouseholdIncome" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="householdIncomeCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantPromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preapprovalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDeliveryTypeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residenceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tcVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yearsAtCurrentResidence" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="yearsWithCurrentEmployer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="employerStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employerStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employerCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employerPhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employerPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToPhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billToPhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAuthenticatedByMerchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backOfficeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToEqualsBillToNameIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipToEqualsBillToAddressIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dbaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessMainPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisorLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisorFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisorEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessDAndBNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessNAICSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessYearsInBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessNumberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessPONumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgAnnualIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgIncomeCurrencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgResidenceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgCheckingAccountIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgSavingsAccountIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgYearsAtEmployer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgYearsAtResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgHomeAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgHomeAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgHomeCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgHomeState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgHomePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgHomeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BML", propOrder = {
    "customerBillingAddressChange",
    "customerEmailChange",
    "customerHasCheckingAccount",
    "customerHasSavingsAccount",
    "customerPasswordChange",
    "customerPhoneChange",
    "customerRegistrationDate",
    "customerTypeFlag",
    "grossHouseholdIncome",
    "householdIncomeCurrency",
    "itemCategory",
    "merchantPromotionCode",
    "preapprovalNumber",
    "productDeliveryTypeIndicator",
    "residenceStatus",
    "tcVersion",
    "yearsAtCurrentResidence",
    "yearsWithCurrentEmployer",
    "employerStreet1",
    "employerStreet2",
    "employerCity",
    "employerCompanyName",
    "employerCountry",
    "employerPhoneNumber",
    "employerPhoneType",
    "employerState",
    "employerPostalCode",
    "shipToPhoneType",
    "billToPhoneType",
    "methodOfPayment",
    "productType",
    "customerAuthenticatedByMerchant",
    "backOfficeIndicator",
    "shipToEqualsBillToNameIndicator",
    "shipToEqualsBillToAddressIndicator",
    "alternateIPAddress",
    "businessLegalName",
    "dbaName",
    "businessAddress1",
    "businessAddress2",
    "businessCity",
    "businessState",
    "businessPostalCode",
    "businessCountry",
    "businessMainPhone",
    "userID",
    "pin",
    "adminLastName",
    "adminFirstName",
    "adminPhone",
    "adminFax",
    "adminEmailAddress",
    "adminTitle",
    "supervisorLastName",
    "supervisorFirstName",
    "supervisorEmailAddress",
    "businessDAndBNumber",
    "businessTaxID",
    "businessNAICSCode",
    "businessType",
    "businessYearsInBusiness",
    "businessNumberOfEmployees",
    "businessPONumber",
    "businessLoanType",
    "businessApplicationID",
    "businessProductCode",
    "pgLastName",
    "pgFirstName",
    "pgSSN",
    "pgDateOfBirth",
    "pgAnnualIncome",
    "pgIncomeCurrencyType",
    "pgResidenceStatus",
    "pgCheckingAccountIndicator",
    "pgSavingsAccountIndicator",
    "pgYearsAtEmployer",
    "pgYearsAtResidence",
    "pgHomeAddress1",
    "pgHomeAddress2",
    "pgHomeCity",
    "pgHomeState",
    "pgHomePostalCode",
    "pgHomeCountry",
    "pgEmailAddress",
    "pgHomePhone",
    "pgTitle"
})
public class BML {

    protected String customerBillingAddressChange;
    protected String customerEmailChange;
    protected String customerHasCheckingAccount;
    protected String customerHasSavingsAccount;
    protected String customerPasswordChange;
    protected String customerPhoneChange;
    protected String customerRegistrationDate;
    protected String customerTypeFlag;
    protected String grossHouseholdIncome;
    protected String householdIncomeCurrency;
    protected String itemCategory;
    protected String merchantPromotionCode;
    protected String preapprovalNumber;
    protected String productDeliveryTypeIndicator;
    protected String residenceStatus;
    protected String tcVersion;
    protected BigInteger yearsAtCurrentResidence;
    protected BigInteger yearsWithCurrentEmployer;
    protected String employerStreet1;
    protected String employerStreet2;
    protected String employerCity;
    protected String employerCompanyName;
    protected String employerCountry;
    protected String employerPhoneNumber;
    protected String employerPhoneType;
    protected String employerState;
    protected String employerPostalCode;
    protected String shipToPhoneType;
    protected String billToPhoneType;
    protected String methodOfPayment;
    protected String productType;
    protected String customerAuthenticatedByMerchant;
    protected String backOfficeIndicator;
    protected String shipToEqualsBillToNameIndicator;
    protected String shipToEqualsBillToAddressIndicator;
    protected String alternateIPAddress;
    protected String businessLegalName;
    protected String dbaName;
    protected String businessAddress1;
    protected String businessAddress2;
    protected String businessCity;
    protected String businessState;
    protected String businessPostalCode;
    protected String businessCountry;
    protected String businessMainPhone;
    protected String userID;
    protected String pin;
    protected String adminLastName;
    protected String adminFirstName;
    protected String adminPhone;
    protected String adminFax;
    protected String adminEmailAddress;
    protected String adminTitle;
    protected String supervisorLastName;
    protected String supervisorFirstName;
    protected String supervisorEmailAddress;
    protected String businessDAndBNumber;
    protected String businessTaxID;
    protected String businessNAICSCode;
    protected String businessType;
    protected String businessYearsInBusiness;
    protected String businessNumberOfEmployees;
    protected String businessPONumber;
    protected String businessLoanType;
    protected String businessApplicationID;
    protected String businessProductCode;
    protected String pgLastName;
    protected String pgFirstName;
    protected String pgSSN;
    protected String pgDateOfBirth;
    protected String pgAnnualIncome;
    protected String pgIncomeCurrencyType;
    protected String pgResidenceStatus;
    protected String pgCheckingAccountIndicator;
    protected String pgSavingsAccountIndicator;
    protected String pgYearsAtEmployer;
    protected String pgYearsAtResidence;
    protected String pgHomeAddress1;
    protected String pgHomeAddress2;
    protected String pgHomeCity;
    protected String pgHomeState;
    protected String pgHomePostalCode;
    protected String pgHomeCountry;
    protected String pgEmailAddress;
    protected String pgHomePhone;
    protected String pgTitle;

    /**
     * Obtiene el valor de la propiedad customerBillingAddressChange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBillingAddressChange() {
        return customerBillingAddressChange;
    }

    /**
     * Define el valor de la propiedad customerBillingAddressChange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBillingAddressChange(String value) {
        this.customerBillingAddressChange = value;
    }

    /**
     * Obtiene el valor de la propiedad customerEmailChange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmailChange() {
        return customerEmailChange;
    }

    /**
     * Define el valor de la propiedad customerEmailChange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmailChange(String value) {
        this.customerEmailChange = value;
    }

    /**
     * Obtiene el valor de la propiedad customerHasCheckingAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerHasCheckingAccount() {
        return customerHasCheckingAccount;
    }

    /**
     * Define el valor de la propiedad customerHasCheckingAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerHasCheckingAccount(String value) {
        this.customerHasCheckingAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad customerHasSavingsAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerHasSavingsAccount() {
        return customerHasSavingsAccount;
    }

    /**
     * Define el valor de la propiedad customerHasSavingsAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerHasSavingsAccount(String value) {
        this.customerHasSavingsAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad customerPasswordChange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPasswordChange() {
        return customerPasswordChange;
    }

    /**
     * Define el valor de la propiedad customerPasswordChange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPasswordChange(String value) {
        this.customerPasswordChange = value;
    }

    /**
     * Obtiene el valor de la propiedad customerPhoneChange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhoneChange() {
        return customerPhoneChange;
    }

    /**
     * Define el valor de la propiedad customerPhoneChange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhoneChange(String value) {
        this.customerPhoneChange = value;
    }

    /**
     * Obtiene el valor de la propiedad customerRegistrationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRegistrationDate() {
        return customerRegistrationDate;
    }

    /**
     * Define el valor de la propiedad customerRegistrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRegistrationDate(String value) {
        this.customerRegistrationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad customerTypeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeFlag() {
        return customerTypeFlag;
    }

    /**
     * Define el valor de la propiedad customerTypeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeFlag(String value) {
        this.customerTypeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad grossHouseholdIncome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossHouseholdIncome() {
        return grossHouseholdIncome;
    }

    /**
     * Define el valor de la propiedad grossHouseholdIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossHouseholdIncome(String value) {
        this.grossHouseholdIncome = value;
    }

    /**
     * Obtiene el valor de la propiedad householdIncomeCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdIncomeCurrency() {
        return householdIncomeCurrency;
    }

    /**
     * Define el valor de la propiedad householdIncomeCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdIncomeCurrency(String value) {
        this.householdIncomeCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad itemCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCategory() {
        return itemCategory;
    }

    /**
     * Define el valor de la propiedad itemCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCategory(String value) {
        this.itemCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantPromotionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPromotionCode() {
        return merchantPromotionCode;
    }

    /**
     * Define el valor de la propiedad merchantPromotionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPromotionCode(String value) {
        this.merchantPromotionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad preapprovalNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreapprovalNumber() {
        return preapprovalNumber;
    }

    /**
     * Define el valor de la propiedad preapprovalNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreapprovalNumber(String value) {
        this.preapprovalNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad productDeliveryTypeIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDeliveryTypeIndicator() {
        return productDeliveryTypeIndicator;
    }

    /**
     * Define el valor de la propiedad productDeliveryTypeIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDeliveryTypeIndicator(String value) {
        this.productDeliveryTypeIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad residenceStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceStatus() {
        return residenceStatus;
    }

    /**
     * Define el valor de la propiedad residenceStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceStatus(String value) {
        this.residenceStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad tcVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcVersion() {
        return tcVersion;
    }

    /**
     * Define el valor de la propiedad tcVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcVersion(String value) {
        this.tcVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad yearsAtCurrentResidence.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearsAtCurrentResidence() {
        return yearsAtCurrentResidence;
    }

    /**
     * Define el valor de la propiedad yearsAtCurrentResidence.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearsAtCurrentResidence(BigInteger value) {
        this.yearsAtCurrentResidence = value;
    }

    /**
     * Obtiene el valor de la propiedad yearsWithCurrentEmployer.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearsWithCurrentEmployer() {
        return yearsWithCurrentEmployer;
    }

    /**
     * Define el valor de la propiedad yearsWithCurrentEmployer.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearsWithCurrentEmployer(BigInteger value) {
        this.yearsWithCurrentEmployer = value;
    }

    /**
     * Obtiene el valor de la propiedad employerStreet1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerStreet1() {
        return employerStreet1;
    }

    /**
     * Define el valor de la propiedad employerStreet1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerStreet1(String value) {
        this.employerStreet1 = value;
    }

    /**
     * Obtiene el valor de la propiedad employerStreet2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerStreet2() {
        return employerStreet2;
    }

    /**
     * Define el valor de la propiedad employerStreet2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerStreet2(String value) {
        this.employerStreet2 = value;
    }

    /**
     * Obtiene el valor de la propiedad employerCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerCity() {
        return employerCity;
    }

    /**
     * Define el valor de la propiedad employerCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerCity(String value) {
        this.employerCity = value;
    }

    /**
     * Obtiene el valor de la propiedad employerCompanyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerCompanyName() {
        return employerCompanyName;
    }

    /**
     * Define el valor de la propiedad employerCompanyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerCompanyName(String value) {
        this.employerCompanyName = value;
    }

    /**
     * Obtiene el valor de la propiedad employerCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerCountry() {
        return employerCountry;
    }

    /**
     * Define el valor de la propiedad employerCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerCountry(String value) {
        this.employerCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad employerPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerPhoneNumber() {
        return employerPhoneNumber;
    }

    /**
     * Define el valor de la propiedad employerPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerPhoneNumber(String value) {
        this.employerPhoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad employerPhoneType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerPhoneType() {
        return employerPhoneType;
    }

    /**
     * Define el valor de la propiedad employerPhoneType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerPhoneType(String value) {
        this.employerPhoneType = value;
    }

    /**
     * Obtiene el valor de la propiedad employerState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerState() {
        return employerState;
    }

    /**
     * Define el valor de la propiedad employerState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerState(String value) {
        this.employerState = value;
    }

    /**
     * Obtiene el valor de la propiedad employerPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerPostalCode() {
        return employerPostalCode;
    }

    /**
     * Define el valor de la propiedad employerPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerPostalCode(String value) {
        this.employerPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToPhoneType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToPhoneType() {
        return shipToPhoneType;
    }

    /**
     * Define el valor de la propiedad shipToPhoneType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToPhoneType(String value) {
        this.shipToPhoneType = value;
    }

    /**
     * Obtiene el valor de la propiedad billToPhoneType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToPhoneType() {
        return billToPhoneType;
    }

    /**
     * Define el valor de la propiedad billToPhoneType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToPhoneType(String value) {
        this.billToPhoneType = value;
    }

    /**
     * Obtiene el valor de la propiedad methodOfPayment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodOfPayment() {
        return methodOfPayment;
    }

    /**
     * Define el valor de la propiedad methodOfPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodOfPayment(String value) {
        this.methodOfPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad productType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Define el valor de la propiedad productType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAuthenticatedByMerchant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAuthenticatedByMerchant() {
        return customerAuthenticatedByMerchant;
    }

    /**
     * Define el valor de la propiedad customerAuthenticatedByMerchant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAuthenticatedByMerchant(String value) {
        this.customerAuthenticatedByMerchant = value;
    }

    /**
     * Obtiene el valor de la propiedad backOfficeIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackOfficeIndicator() {
        return backOfficeIndicator;
    }

    /**
     * Define el valor de la propiedad backOfficeIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackOfficeIndicator(String value) {
        this.backOfficeIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToEqualsBillToNameIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToEqualsBillToNameIndicator() {
        return shipToEqualsBillToNameIndicator;
    }

    /**
     * Define el valor de la propiedad shipToEqualsBillToNameIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToEqualsBillToNameIndicator(String value) {
        this.shipToEqualsBillToNameIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToEqualsBillToAddressIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToEqualsBillToAddressIndicator() {
        return shipToEqualsBillToAddressIndicator;
    }

    /**
     * Define el valor de la propiedad shipToEqualsBillToAddressIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToEqualsBillToAddressIndicator(String value) {
        this.shipToEqualsBillToAddressIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateIPAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateIPAddress() {
        return alternateIPAddress;
    }

    /**
     * Define el valor de la propiedad alternateIPAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateIPAddress(String value) {
        this.alternateIPAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad businessLegalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessLegalName() {
        return businessLegalName;
    }

    /**
     * Define el valor de la propiedad businessLegalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessLegalName(String value) {
        this.businessLegalName = value;
    }

    /**
     * Obtiene el valor de la propiedad dbaName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbaName() {
        return dbaName;
    }

    /**
     * Define el valor de la propiedad dbaName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbaName(String value) {
        this.dbaName = value;
    }

    /**
     * Obtiene el valor de la propiedad businessAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAddress1() {
        return businessAddress1;
    }

    /**
     * Define el valor de la propiedad businessAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAddress1(String value) {
        this.businessAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad businessAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAddress2() {
        return businessAddress2;
    }

    /**
     * Define el valor de la propiedad businessAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAddress2(String value) {
        this.businessAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad businessCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCity() {
        return businessCity;
    }

    /**
     * Define el valor de la propiedad businessCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCity(String value) {
        this.businessCity = value;
    }

    /**
     * Obtiene el valor de la propiedad businessState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessState() {
        return businessState;
    }

    /**
     * Define el valor de la propiedad businessState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessState(String value) {
        this.businessState = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPostalCode() {
        return businessPostalCode;
    }

    /**
     * Define el valor de la propiedad businessPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPostalCode(String value) {
        this.businessPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad businessCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCountry() {
        return businessCountry;
    }

    /**
     * Define el valor de la propiedad businessCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCountry(String value) {
        this.businessCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad businessMainPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessMainPhone() {
        return businessMainPhone;
    }

    /**
     * Define el valor de la propiedad businessMainPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessMainPhone(String value) {
        this.businessMainPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad userID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Define el valor de la propiedad userID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Obtiene el valor de la propiedad pin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Define el valor de la propiedad pin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Obtiene el valor de la propiedad adminLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminLastName() {
        return adminLastName;
    }

    /**
     * Define el valor de la propiedad adminLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminLastName(String value) {
        this.adminLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad adminFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminFirstName() {
        return adminFirstName;
    }

    /**
     * Define el valor de la propiedad adminFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminFirstName(String value) {
        this.adminFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad adminPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminPhone() {
        return adminPhone;
    }

    /**
     * Define el valor de la propiedad adminPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminPhone(String value) {
        this.adminPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad adminFax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminFax() {
        return adminFax;
    }

    /**
     * Define el valor de la propiedad adminFax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminFax(String value) {
        this.adminFax = value;
    }

    /**
     * Obtiene el valor de la propiedad adminEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminEmailAddress() {
        return adminEmailAddress;
    }

    /**
     * Define el valor de la propiedad adminEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminEmailAddress(String value) {
        this.adminEmailAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad adminTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminTitle() {
        return adminTitle;
    }

    /**
     * Define el valor de la propiedad adminTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminTitle(String value) {
        this.adminTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad supervisorLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorLastName() {
        return supervisorLastName;
    }

    /**
     * Define el valor de la propiedad supervisorLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorLastName(String value) {
        this.supervisorLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad supervisorFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorFirstName() {
        return supervisorFirstName;
    }

    /**
     * Define el valor de la propiedad supervisorFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorFirstName(String value) {
        this.supervisorFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad supervisorEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorEmailAddress() {
        return supervisorEmailAddress;
    }

    /**
     * Define el valor de la propiedad supervisorEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorEmailAddress(String value) {
        this.supervisorEmailAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad businessDAndBNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDAndBNumber() {
        return businessDAndBNumber;
    }

    /**
     * Define el valor de la propiedad businessDAndBNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDAndBNumber(String value) {
        this.businessDAndBNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad businessTaxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTaxID() {
        return businessTaxID;
    }

    /**
     * Define el valor de la propiedad businessTaxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTaxID(String value) {
        this.businessTaxID = value;
    }

    /**
     * Obtiene el valor de la propiedad businessNAICSCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNAICSCode() {
        return businessNAICSCode;
    }

    /**
     * Define el valor de la propiedad businessNAICSCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNAICSCode(String value) {
        this.businessNAICSCode = value;
    }

    /**
     * Obtiene el valor de la propiedad businessType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * Define el valor de la propiedad businessType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType(String value) {
        this.businessType = value;
    }

    /**
     * Obtiene el valor de la propiedad businessYearsInBusiness.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessYearsInBusiness() {
        return businessYearsInBusiness;
    }

    /**
     * Define el valor de la propiedad businessYearsInBusiness.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessYearsInBusiness(String value) {
        this.businessYearsInBusiness = value;
    }

    /**
     * Obtiene el valor de la propiedad businessNumberOfEmployees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNumberOfEmployees() {
        return businessNumberOfEmployees;
    }

    /**
     * Define el valor de la propiedad businessNumberOfEmployees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNumberOfEmployees(String value) {
        this.businessNumberOfEmployees = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPONumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPONumber() {
        return businessPONumber;
    }

    /**
     * Define el valor de la propiedad businessPONumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPONumber(String value) {
        this.businessPONumber = value;
    }

    /**
     * Obtiene el valor de la propiedad businessLoanType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessLoanType() {
        return businessLoanType;
    }

    /**
     * Define el valor de la propiedad businessLoanType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessLoanType(String value) {
        this.businessLoanType = value;
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
     * Obtiene el valor de la propiedad businessProductCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessProductCode() {
        return businessProductCode;
    }

    /**
     * Define el valor de la propiedad businessProductCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessProductCode(String value) {
        this.businessProductCode = value;
    }

    /**
     * Obtiene el valor de la propiedad pgLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgLastName() {
        return pgLastName;
    }

    /**
     * Define el valor de la propiedad pgLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgLastName(String value) {
        this.pgLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad pgFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgFirstName() {
        return pgFirstName;
    }

    /**
     * Define el valor de la propiedad pgFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgFirstName(String value) {
        this.pgFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad pgSSN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgSSN() {
        return pgSSN;
    }

    /**
     * Define el valor de la propiedad pgSSN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgSSN(String value) {
        this.pgSSN = value;
    }

    /**
     * Obtiene el valor de la propiedad pgDateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgDateOfBirth() {
        return pgDateOfBirth;
    }

    /**
     * Define el valor de la propiedad pgDateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgDateOfBirth(String value) {
        this.pgDateOfBirth = value;
    }

    /**
     * Obtiene el valor de la propiedad pgAnnualIncome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgAnnualIncome() {
        return pgAnnualIncome;
    }

    /**
     * Define el valor de la propiedad pgAnnualIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgAnnualIncome(String value) {
        this.pgAnnualIncome = value;
    }

    /**
     * Obtiene el valor de la propiedad pgIncomeCurrencyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgIncomeCurrencyType() {
        return pgIncomeCurrencyType;
    }

    /**
     * Define el valor de la propiedad pgIncomeCurrencyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgIncomeCurrencyType(String value) {
        this.pgIncomeCurrencyType = value;
    }

    /**
     * Obtiene el valor de la propiedad pgResidenceStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgResidenceStatus() {
        return pgResidenceStatus;
    }

    /**
     * Define el valor de la propiedad pgResidenceStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgResidenceStatus(String value) {
        this.pgResidenceStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad pgCheckingAccountIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgCheckingAccountIndicator() {
        return pgCheckingAccountIndicator;
    }

    /**
     * Define el valor de la propiedad pgCheckingAccountIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgCheckingAccountIndicator(String value) {
        this.pgCheckingAccountIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad pgSavingsAccountIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgSavingsAccountIndicator() {
        return pgSavingsAccountIndicator;
    }

    /**
     * Define el valor de la propiedad pgSavingsAccountIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgSavingsAccountIndicator(String value) {
        this.pgSavingsAccountIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad pgYearsAtEmployer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgYearsAtEmployer() {
        return pgYearsAtEmployer;
    }

    /**
     * Define el valor de la propiedad pgYearsAtEmployer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgYearsAtEmployer(String value) {
        this.pgYearsAtEmployer = value;
    }

    /**
     * Obtiene el valor de la propiedad pgYearsAtResidence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgYearsAtResidence() {
        return pgYearsAtResidence;
    }

    /**
     * Define el valor de la propiedad pgYearsAtResidence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgYearsAtResidence(String value) {
        this.pgYearsAtResidence = value;
    }

    /**
     * Obtiene el valor de la propiedad pgHomeAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomeAddress1() {
        return pgHomeAddress1;
    }

    /**
     * Define el valor de la propiedad pgHomeAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomeAddress1(String value) {
        this.pgHomeAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad pgHomeAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomeAddress2() {
        return pgHomeAddress2;
    }

    /**
     * Define el valor de la propiedad pgHomeAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomeAddress2(String value) {
        this.pgHomeAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad pgHomeCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomeCity() {
        return pgHomeCity;
    }

    /**
     * Define el valor de la propiedad pgHomeCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomeCity(String value) {
        this.pgHomeCity = value;
    }

    /**
     * Obtiene el valor de la propiedad pgHomeState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomeState() {
        return pgHomeState;
    }

    /**
     * Define el valor de la propiedad pgHomeState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomeState(String value) {
        this.pgHomeState = value;
    }

    /**
     * Obtiene el valor de la propiedad pgHomePostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomePostalCode() {
        return pgHomePostalCode;
    }

    /**
     * Define el valor de la propiedad pgHomePostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomePostalCode(String value) {
        this.pgHomePostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad pgHomeCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomeCountry() {
        return pgHomeCountry;
    }

    /**
     * Define el valor de la propiedad pgHomeCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomeCountry(String value) {
        this.pgHomeCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad pgEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgEmailAddress() {
        return pgEmailAddress;
    }

    /**
     * Define el valor de la propiedad pgEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgEmailAddress(String value) {
        this.pgEmailAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad pgHomePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgHomePhone() {
        return pgHomePhone;
    }

    /**
     * Define el valor de la propiedad pgHomePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgHomePhone(String value) {
        this.pgHomePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad pgTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgTitle() {
        return pgTitle;
    }

    /**
     * Define el valor de la propiedad pgTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgTitle(String value) {
        this.pgTitle = value;
    }

}

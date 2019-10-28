
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BillTo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BillTo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipNetworkAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driversLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driversLicenseState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="httpBrowserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="httpBrowserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="httpBrowserCookiesAccepted" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="nif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAccountCreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAccountChangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAccountPasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pointOfReference" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="defaultIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="companyStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillTo", propOrder = {
    "title",
    "firstName",
    "middleName",
    "lastName",
    "suffix",
    "buildingNumber",
    "street1",
    "street2",
    "street3",
    "street4",
    "street5",
    "city",
    "district",
    "county",
    "state",
    "postalCode",
    "country",
    "company",
    "companyTaxID",
    "phoneNumber",
    "email",
    "ipAddress",
    "customerUserName",
    "customerPassword",
    "ipNetworkAddress",
    "hostname",
    "domainName",
    "dateOfBirth",
    "driversLicenseNumber",
    "driversLicenseState",
    "ssn",
    "customerID",
    "httpBrowserType",
    "httpBrowserEmail",
    "httpBrowserCookiesAccepted",
    "nif",
    "personalID",
    "language",
    "name",
    "gender",
    "merchantTaxID",
    "passportNumber",
    "passportCountry",
    "customerAccountCreateDate",
    "customerAccountChangeDate",
    "customerAccountPasswordChangeDate",
    "pointOfReference",
    "defaultIndicator",
    "companyStreet1",
    "companyStreet2",
    "companyCity",
    "companyCountry",
    "companyState",
    "companyPostalCode",
    "prefix",
    "companyPhoneNumber"
})
public class BillTo {

    protected String title;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String suffix;
    protected String buildingNumber;
    protected String street1;
    protected String street2;
    protected String street3;
    protected String street4;
    protected String street5;
    protected String city;
    protected String district;
    protected String county;
    protected String state;
    protected String postalCode;
    protected String country;
    protected String company;
    protected String companyTaxID;
    protected String phoneNumber;
    protected String email;
    protected String ipAddress;
    protected String customerUserName;
    protected String customerPassword;
    protected String ipNetworkAddress;
    protected String hostname;
    protected String domainName;
    protected String dateOfBirth;
    protected String driversLicenseNumber;
    protected String driversLicenseState;
    protected String ssn;
    protected String customerID;
    protected String httpBrowserType;
    protected String httpBrowserEmail;
    protected String httpBrowserCookiesAccepted;
    protected String nif;
    protected String personalID;
    protected String language;
    protected String name;
    protected String gender;
    protected String merchantTaxID;
    protected String passportNumber;
    protected String passportCountry;
    protected String customerAccountCreateDate;
    protected String customerAccountChangeDate;
    protected String customerAccountPasswordChangeDate;
    protected String pointOfReference;
    protected String defaultIndicator;
    protected String companyStreet1;
    protected String companyStreet2;
    protected String companyCity;
    protected String companyCountry;
    protected String companyState;
    protected String companyPostalCode;
    protected String prefix;
    protected String companyPhoneNumber;

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Define el valor de la propiedad middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad suffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Define el valor de la propiedad suffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Obtiene el valor de la propiedad buildingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Define el valor de la propiedad buildingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad street1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Define el valor de la propiedad street1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Obtiene el valor de la propiedad street2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Define el valor de la propiedad street2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Obtiene el valor de la propiedad street3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet3() {
        return street3;
    }

    /**
     * Define el valor de la propiedad street3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet3(String value) {
        this.street3 = value;
    }

    /**
     * Obtiene el valor de la propiedad street4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet4() {
        return street4;
    }

    /**
     * Define el valor de la propiedad street4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet4(String value) {
        this.street4 = value;
    }

    /**
     * Obtiene el valor de la propiedad street5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet5() {
        return street5;
    }

    /**
     * Define el valor de la propiedad street5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet5(String value) {
        this.street5 = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad district.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Define el valor de la propiedad district.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Obtiene el valor de la propiedad county.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Define el valor de la propiedad county.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define el valor de la propiedad postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Define el valor de la propiedad company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Obtiene el valor de la propiedad companyTaxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyTaxID() {
        return companyTaxID;
    }

    /**
     * Define el valor de la propiedad companyTaxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyTaxID(String value) {
        this.companyTaxID = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad ipAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Define el valor de la propiedad ipAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad customerUserName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUserName() {
        return customerUserName;
    }

    /**
     * Define el valor de la propiedad customerUserName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUserName(String value) {
        this.customerUserName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * Define el valor de la propiedad customerPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPassword(String value) {
        this.customerPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad ipNetworkAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpNetworkAddress() {
        return ipNetworkAddress;
    }

    /**
     * Define el valor de la propiedad ipNetworkAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpNetworkAddress(String value) {
        this.ipNetworkAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad hostname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Define el valor de la propiedad hostname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Obtiene el valor de la propiedad domainName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Define el valor de la propiedad domainName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Obtiene el valor de la propiedad dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Define el valor de la propiedad dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Obtiene el valor de la propiedad driversLicenseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseNumber() {
        return driversLicenseNumber;
    }

    /**
     * Define el valor de la propiedad driversLicenseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseNumber(String value) {
        this.driversLicenseNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad driversLicenseState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseState() {
        return driversLicenseState;
    }

    /**
     * Define el valor de la propiedad driversLicenseState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseState(String value) {
        this.driversLicenseState = value;
    }

    /**
     * Obtiene el valor de la propiedad ssn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Define el valor de la propiedad ssn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Obtiene el valor de la propiedad httpBrowserType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserType() {
        return httpBrowserType;
    }

    /**
     * Define el valor de la propiedad httpBrowserType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserType(String value) {
        this.httpBrowserType = value;
    }

    /**
     * Obtiene el valor de la propiedad httpBrowserEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserEmail() {
        return httpBrowserEmail;
    }

    /**
     * Define el valor de la propiedad httpBrowserEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserEmail(String value) {
        this.httpBrowserEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad httpBrowserCookiesAccepted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserCookiesAccepted() {
        return httpBrowserCookiesAccepted;
    }

    /**
     * Define el valor de la propiedad httpBrowserCookiesAccepted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserCookiesAccepted(String value) {
        this.httpBrowserCookiesAccepted = value;
    }

    /**
     * Obtiene el valor de la propiedad nif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNif() {
        return nif;
    }

    /**
     * Define el valor de la propiedad nif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNif(String value) {
        this.nif = value;
    }

    /**
     * Obtiene el valor de la propiedad personalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalID() {
        return personalID;
    }

    /**
     * Define el valor de la propiedad personalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalID(String value) {
        this.personalID = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantTaxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTaxID() {
        return merchantTaxID;
    }

    /**
     * Define el valor de la propiedad merchantTaxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTaxID(String value) {
        this.merchantTaxID = value;
    }

    /**
     * Obtiene el valor de la propiedad passportNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Define el valor de la propiedad passportNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad passportCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportCountry() {
        return passportCountry;
    }

    /**
     * Define el valor de la propiedad passportCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportCountry(String value) {
        this.passportCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAccountCreateDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountCreateDate() {
        return customerAccountCreateDate;
    }

    /**
     * Define el valor de la propiedad customerAccountCreateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountCreateDate(String value) {
        this.customerAccountCreateDate = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAccountChangeDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountChangeDate() {
        return customerAccountChangeDate;
    }

    /**
     * Define el valor de la propiedad customerAccountChangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountChangeDate(String value) {
        this.customerAccountChangeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAccountPasswordChangeDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountPasswordChangeDate() {
        return customerAccountPasswordChangeDate;
    }

    /**
     * Define el valor de la propiedad customerAccountPasswordChangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountPasswordChangeDate(String value) {
        this.customerAccountPasswordChangeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad pointOfReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfReference() {
        return pointOfReference;
    }

    /**
     * Define el valor de la propiedad pointOfReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfReference(String value) {
        this.pointOfReference = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * Define el valor de la propiedad defaultIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultIndicator(String value) {
        this.defaultIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad companyStreet1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyStreet1() {
        return companyStreet1;
    }

    /**
     * Define el valor de la propiedad companyStreet1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyStreet1(String value) {
        this.companyStreet1 = value;
    }

    /**
     * Obtiene el valor de la propiedad companyStreet2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyStreet2() {
        return companyStreet2;
    }

    /**
     * Define el valor de la propiedad companyStreet2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyStreet2(String value) {
        this.companyStreet2 = value;
    }

    /**
     * Obtiene el valor de la propiedad companyCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCity() {
        return companyCity;
    }

    /**
     * Define el valor de la propiedad companyCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCity(String value) {
        this.companyCity = value;
    }

    /**
     * Obtiene el valor de la propiedad companyCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCountry() {
        return companyCountry;
    }

    /**
     * Define el valor de la propiedad companyCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCountry(String value) {
        this.companyCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad companyState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyState() {
        return companyState;
    }

    /**
     * Define el valor de la propiedad companyState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyState(String value) {
        this.companyState = value;
    }

    /**
     * Obtiene el valor de la propiedad companyPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPostalCode() {
        return companyPostalCode;
    }

    /**
     * Define el valor de la propiedad companyPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPostalCode(String value) {
        this.companyPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad prefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Define el valor de la propiedad prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Obtiene el valor de la propiedad companyPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    /**
     * Define el valor de la propiedad companyPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPhoneNumber(String value) {
        this.companyPhoneNumber = value;
    }

}

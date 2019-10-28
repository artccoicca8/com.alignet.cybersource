
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Item complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitPrice" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="quantity" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productRisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="cityOverrideAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="cityOverrideRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="countyOverrideAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="countyOverrideRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="districtOverrideAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="districtOverrideRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="stateOverrideAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="stateOverrideRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="countryOverrideAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="countryOverrideRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
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
 *         &lt;element name="shipFromCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipFromCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipFromCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipFromState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipFromPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="export" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noExport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalTax" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="vatRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
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
 *         &lt;element name="giftCategory" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="timeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="velocityHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonsensicalHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obscenitiesHedge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="discountAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="discountRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="commodityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grossNetIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxTypeApplied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateTaxAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="alternateTaxTypeApplied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateTaxRate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="alternateTaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localTax" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="zeroCostToCustomerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfSupply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weightAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weightID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weightUnitMeasurement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_1_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_1_amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_1_rate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_1_statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_2_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_2_amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_2_rate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_2_statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_3_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_3_amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_3_rate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_3_statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_4_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_4_amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_4_rate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_4_statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_5_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_5_amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_5_rate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_5_statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_6_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_6_amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_6_rate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_6_statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_7_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTax_7_amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_7_rate" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="otherTax_7_statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_1_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_1_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_2_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_2_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_3_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_3_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_4_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_4_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_5_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_5_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_6_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_6_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_7_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceData_7_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "unitPrice",
    "quantity",
    "productCode",
    "productName",
    "productSKU",
    "productRisk",
    "taxAmount",
    "cityOverrideAmount",
    "cityOverrideRate",
    "countyOverrideAmount",
    "countyOverrideRate",
    "districtOverrideAmount",
    "districtOverrideRate",
    "stateOverrideAmount",
    "stateOverrideRate",
    "countryOverrideAmount",
    "countryOverrideRate",
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
    "shipFromCity",
    "shipFromCounty",
    "shipFromCountry",
    "shipFromState",
    "shipFromPostalCode",
    "export",
    "noExport",
    "nationalTax",
    "vatRate",
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
    "giftCategory",
    "timeCategory",
    "hostHedge",
    "timeHedge",
    "velocityHedge",
    "nonsensicalHedge",
    "phoneHedge",
    "obscenitiesHedge",
    "unitOfMeasure",
    "taxRate",
    "totalAmount",
    "discountAmount",
    "discountRate",
    "commodityCode",
    "grossNetIndicator",
    "taxTypeApplied",
    "discountIndicator",
    "alternateTaxID",
    "alternateTaxAmount",
    "alternateTaxTypeApplied",
    "alternateTaxRate",
    "alternateTaxType",
    "localTax",
    "zeroCostToCustomerIndicator",
    "passengerFirstName",
    "passengerLastName",
    "passengerID",
    "passengerStatus",
    "passengerType",
    "passengerEmail",
    "passengerPhone",
    "passengerNationality",
    "invoiceNumber",
    "productDescription",
    "taxStatusIndicator",
    "discountManagementIndicator",
    "typeOfSupply",
    "sign",
    "unitTaxAmount",
    "weightAmount",
    "weightID",
    "weightUnitMeasurement",
    "otherTax1Type",
    "otherTax1Amount",
    "otherTax1Rate",
    "otherTax1StatusIndicator",
    "otherTax2Type",
    "otherTax2Amount",
    "otherTax2Rate",
    "otherTax2StatusIndicator",
    "otherTax3Type",
    "otherTax3Amount",
    "otherTax3Rate",
    "otherTax3StatusIndicator",
    "otherTax4Type",
    "otherTax4Amount",
    "otherTax4Rate",
    "otherTax4StatusIndicator",
    "otherTax5Type",
    "otherTax5Amount",
    "otherTax5Rate",
    "otherTax5StatusIndicator",
    "otherTax6Type",
    "otherTax6Amount",
    "otherTax6Rate",
    "otherTax6StatusIndicator",
    "otherTax7Type",
    "otherTax7Amount",
    "otherTax7Rate",
    "otherTax7StatusIndicator",
    "referenceData1Number",
    "referenceData1Code",
    "referenceData2Number",
    "referenceData2Code",
    "referenceData3Number",
    "referenceData3Code",
    "referenceData4Number",
    "referenceData4Code",
    "referenceData5Number",
    "referenceData5Code",
    "referenceData6Number",
    "referenceData6Code",
    "referenceData7Number",
    "referenceData7Code"
})
public class Item {

    protected String unitPrice;
    protected String quantity;
    protected String productCode;
    protected String productName;
    protected String productSKU;
    protected String productRisk;
    protected String taxAmount;
    protected String cityOverrideAmount;
    protected String cityOverrideRate;
    protected String countyOverrideAmount;
    protected String countyOverrideRate;
    protected String districtOverrideAmount;
    protected String districtOverrideRate;
    protected String stateOverrideAmount;
    protected String stateOverrideRate;
    protected String countryOverrideAmount;
    protected String countryOverrideRate;
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
    protected String shipFromCity;
    protected String shipFromCounty;
    protected String shipFromCountry;
    protected String shipFromState;
    protected String shipFromPostalCode;
    protected String export;
    protected String noExport;
    protected String nationalTax;
    protected String vatRate;
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
    protected String giftCategory;
    protected String timeCategory;
    protected String hostHedge;
    protected String timeHedge;
    protected String velocityHedge;
    protected String nonsensicalHedge;
    protected String phoneHedge;
    protected String obscenitiesHedge;
    protected String unitOfMeasure;
    protected String taxRate;
    protected String totalAmount;
    protected String discountAmount;
    protected String discountRate;
    protected String commodityCode;
    protected String grossNetIndicator;
    protected String taxTypeApplied;
    protected String discountIndicator;
    protected String alternateTaxID;
    protected String alternateTaxAmount;
    protected String alternateTaxTypeApplied;
    protected String alternateTaxRate;
    protected String alternateTaxType;
    protected String localTax;
    protected String zeroCostToCustomerIndicator;
    protected String passengerFirstName;
    protected String passengerLastName;
    protected String passengerID;
    protected String passengerStatus;
    protected String passengerType;
    protected String passengerEmail;
    protected String passengerPhone;
    protected String passengerNationality;
    protected String invoiceNumber;
    protected String productDescription;
    protected String taxStatusIndicator;
    protected String discountManagementIndicator;
    protected String typeOfSupply;
    protected String sign;
    protected String unitTaxAmount;
    protected String weightAmount;
    protected String weightID;
    protected String weightUnitMeasurement;
    @XmlElement(name = "otherTax_1_type")
    protected String otherTax1Type;
    @XmlElement(name = "otherTax_1_amount")
    protected String otherTax1Amount;
    @XmlElement(name = "otherTax_1_rate")
    protected String otherTax1Rate;
    @XmlElement(name = "otherTax_1_statusIndicator")
    protected String otherTax1StatusIndicator;
    @XmlElement(name = "otherTax_2_type")
    protected String otherTax2Type;
    @XmlElement(name = "otherTax_2_amount")
    protected String otherTax2Amount;
    @XmlElement(name = "otherTax_2_rate")
    protected String otherTax2Rate;
    @XmlElement(name = "otherTax_2_statusIndicator")
    protected String otherTax2StatusIndicator;
    @XmlElement(name = "otherTax_3_type")
    protected String otherTax3Type;
    @XmlElement(name = "otherTax_3_amount")
    protected String otherTax3Amount;
    @XmlElement(name = "otherTax_3_rate")
    protected String otherTax3Rate;
    @XmlElement(name = "otherTax_3_statusIndicator")
    protected String otherTax3StatusIndicator;
    @XmlElement(name = "otherTax_4_type")
    protected String otherTax4Type;
    @XmlElement(name = "otherTax_4_amount")
    protected String otherTax4Amount;
    @XmlElement(name = "otherTax_4_rate")
    protected String otherTax4Rate;
    @XmlElement(name = "otherTax_4_statusIndicator")
    protected String otherTax4StatusIndicator;
    @XmlElement(name = "otherTax_5_type")
    protected String otherTax5Type;
    @XmlElement(name = "otherTax_5_amount")
    protected String otherTax5Amount;
    @XmlElement(name = "otherTax_5_rate")
    protected String otherTax5Rate;
    @XmlElement(name = "otherTax_5_statusIndicator")
    protected String otherTax5StatusIndicator;
    @XmlElement(name = "otherTax_6_type")
    protected String otherTax6Type;
    @XmlElement(name = "otherTax_6_amount")
    protected String otherTax6Amount;
    @XmlElement(name = "otherTax_6_rate")
    protected String otherTax6Rate;
    @XmlElement(name = "otherTax_6_statusIndicator")
    protected String otherTax6StatusIndicator;
    @XmlElement(name = "otherTax_7_type")
    protected String otherTax7Type;
    @XmlElement(name = "otherTax_7_amount")
    protected String otherTax7Amount;
    @XmlElement(name = "otherTax_7_rate")
    protected String otherTax7Rate;
    @XmlElement(name = "otherTax_7_statusIndicator")
    protected String otherTax7StatusIndicator;
    @XmlElement(name = "referenceData_1_number")
    protected String referenceData1Number;
    @XmlElement(name = "referenceData_1_code")
    protected String referenceData1Code;
    @XmlElement(name = "referenceData_2_number")
    protected String referenceData2Number;
    @XmlElement(name = "referenceData_2_code")
    protected String referenceData2Code;
    @XmlElement(name = "referenceData_3_number")
    protected String referenceData3Number;
    @XmlElement(name = "referenceData_3_code")
    protected String referenceData3Code;
    @XmlElement(name = "referenceData_4_number")
    protected String referenceData4Number;
    @XmlElement(name = "referenceData_4_code")
    protected String referenceData4Code;
    @XmlElement(name = "referenceData_5_number")
    protected String referenceData5Number;
    @XmlElement(name = "referenceData_5_code")
    protected String referenceData5Code;
    @XmlElement(name = "referenceData_6_number")
    protected String referenceData6Number;
    @XmlElement(name = "referenceData_6_code")
    protected String referenceData6Code;
    @XmlElement(name = "referenceData_7_number")
    protected String referenceData7Number;
    @XmlElement(name = "referenceData_7_code")
    protected String referenceData7Code;
    @XmlAttribute(name = "id")
    protected BigInteger id;

    /**
     * Obtiene el valor de la propiedad unitPrice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Define el valor de la propiedad unitPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad productCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Define el valor de la propiedad productCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Obtiene el valor de la propiedad productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define el valor de la propiedad productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Obtiene el valor de la propiedad productSKU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSKU() {
        return productSKU;
    }

    /**
     * Define el valor de la propiedad productSKU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSKU(String value) {
        this.productSKU = value;
    }

    /**
     * Obtiene el valor de la propiedad productRisk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRisk() {
        return productRisk;
    }

    /**
     * Define el valor de la propiedad productRisk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRisk(String value) {
        this.productRisk = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad cityOverrideAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOverrideAmount() {
        return cityOverrideAmount;
    }

    /**
     * Define el valor de la propiedad cityOverrideAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOverrideAmount(String value) {
        this.cityOverrideAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad cityOverrideRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOverrideRate() {
        return cityOverrideRate;
    }

    /**
     * Define el valor de la propiedad cityOverrideRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOverrideRate(String value) {
        this.cityOverrideRate = value;
    }

    /**
     * Obtiene el valor de la propiedad countyOverrideAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyOverrideAmount() {
        return countyOverrideAmount;
    }

    /**
     * Define el valor de la propiedad countyOverrideAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyOverrideAmount(String value) {
        this.countyOverrideAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad countyOverrideRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyOverrideRate() {
        return countyOverrideRate;
    }

    /**
     * Define el valor de la propiedad countyOverrideRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyOverrideRate(String value) {
        this.countyOverrideRate = value;
    }

    /**
     * Obtiene el valor de la propiedad districtOverrideAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictOverrideAmount() {
        return districtOverrideAmount;
    }

    /**
     * Define el valor de la propiedad districtOverrideAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictOverrideAmount(String value) {
        this.districtOverrideAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad districtOverrideRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictOverrideRate() {
        return districtOverrideRate;
    }

    /**
     * Define el valor de la propiedad districtOverrideRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictOverrideRate(String value) {
        this.districtOverrideRate = value;
    }

    /**
     * Obtiene el valor de la propiedad stateOverrideAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOverrideAmount() {
        return stateOverrideAmount;
    }

    /**
     * Define el valor de la propiedad stateOverrideAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOverrideAmount(String value) {
        this.stateOverrideAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad stateOverrideRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOverrideRate() {
        return stateOverrideRate;
    }

    /**
     * Define el valor de la propiedad stateOverrideRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOverrideRate(String value) {
        this.stateOverrideRate = value;
    }

    /**
     * Obtiene el valor de la propiedad countryOverrideAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOverrideAmount() {
        return countryOverrideAmount;
    }

    /**
     * Define el valor de la propiedad countryOverrideAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOverrideAmount(String value) {
        this.countryOverrideAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad countryOverrideRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOverrideRate() {
        return countryOverrideRate;
    }

    /**
     * Define el valor de la propiedad countryOverrideRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOverrideRate(String value) {
        this.countryOverrideRate = value;
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
     * Obtiene el valor de la propiedad shipFromCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromCity() {
        return shipFromCity;
    }

    /**
     * Define el valor de la propiedad shipFromCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromCity(String value) {
        this.shipFromCity = value;
    }

    /**
     * Obtiene el valor de la propiedad shipFromCounty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromCounty() {
        return shipFromCounty;
    }

    /**
     * Define el valor de la propiedad shipFromCounty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromCounty(String value) {
        this.shipFromCounty = value;
    }

    /**
     * Obtiene el valor de la propiedad shipFromCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromCountry() {
        return shipFromCountry;
    }

    /**
     * Define el valor de la propiedad shipFromCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromCountry(String value) {
        this.shipFromCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad shipFromState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromState() {
        return shipFromState;
    }

    /**
     * Define el valor de la propiedad shipFromState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromState(String value) {
        this.shipFromState = value;
    }

    /**
     * Obtiene el valor de la propiedad shipFromPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromPostalCode() {
        return shipFromPostalCode;
    }

    /**
     * Define el valor de la propiedad shipFromPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromPostalCode(String value) {
        this.shipFromPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad export.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExport() {
        return export;
    }

    /**
     * Define el valor de la propiedad export.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExport(String value) {
        this.export = value;
    }

    /**
     * Obtiene el valor de la propiedad noExport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoExport() {
        return noExport;
    }

    /**
     * Define el valor de la propiedad noExport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoExport(String value) {
        this.noExport = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalTax() {
        return nationalTax;
    }

    /**
     * Define el valor de la propiedad nationalTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalTax(String value) {
        this.nationalTax = value;
    }

    /**
     * Obtiene el valor de la propiedad vatRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRate() {
        return vatRate;
    }

    /**
     * Define el valor de la propiedad vatRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRate(String value) {
        this.vatRate = value;
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
     * Obtiene el valor de la propiedad giftCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCategory() {
        return giftCategory;
    }

    /**
     * Define el valor de la propiedad giftCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCategory(String value) {
        this.giftCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad timeCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCategory() {
        return timeCategory;
    }

    /**
     * Define el valor de la propiedad timeCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCategory(String value) {
        this.timeCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad hostHedge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostHedge() {
        return hostHedge;
    }

    /**
     * Define el valor de la propiedad hostHedge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostHedge(String value) {
        this.hostHedge = value;
    }

    /**
     * Obtiene el valor de la propiedad timeHedge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeHedge() {
        return timeHedge;
    }

    /**
     * Define el valor de la propiedad timeHedge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeHedge(String value) {
        this.timeHedge = value;
    }

    /**
     * Obtiene el valor de la propiedad velocityHedge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityHedge() {
        return velocityHedge;
    }

    /**
     * Define el valor de la propiedad velocityHedge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityHedge(String value) {
        this.velocityHedge = value;
    }

    /**
     * Obtiene el valor de la propiedad nonsensicalHedge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonsensicalHedge() {
        return nonsensicalHedge;
    }

    /**
     * Define el valor de la propiedad nonsensicalHedge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonsensicalHedge(String value) {
        this.nonsensicalHedge = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneHedge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneHedge() {
        return phoneHedge;
    }

    /**
     * Define el valor de la propiedad phoneHedge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneHedge(String value) {
        this.phoneHedge = value;
    }

    /**
     * Obtiene el valor de la propiedad obscenitiesHedge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObscenitiesHedge() {
        return obscenitiesHedge;
    }

    /**
     * Define el valor de la propiedad obscenitiesHedge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObscenitiesHedge(String value) {
        this.obscenitiesHedge = value;
    }

    /**
     * Obtiene el valor de la propiedad unitOfMeasure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Define el valor de la propiedad unitOfMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Define el valor de la propiedad taxRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad discountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Define el valor de la propiedad discountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad discountRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountRate() {
        return discountRate;
    }

    /**
     * Define el valor de la propiedad discountRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountRate(String value) {
        this.discountRate = value;
    }

    /**
     * Obtiene el valor de la propiedad commodityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Define el valor de la propiedad commodityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad grossNetIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossNetIndicator() {
        return grossNetIndicator;
    }

    /**
     * Define el valor de la propiedad grossNetIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossNetIndicator(String value) {
        this.grossNetIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad taxTypeApplied.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTypeApplied() {
        return taxTypeApplied;
    }

    /**
     * Define el valor de la propiedad taxTypeApplied.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTypeApplied(String value) {
        this.taxTypeApplied = value;
    }

    /**
     * Obtiene el valor de la propiedad discountIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountIndicator() {
        return discountIndicator;
    }

    /**
     * Define el valor de la propiedad discountIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountIndicator(String value) {
        this.discountIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateTaxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxID() {
        return alternateTaxID;
    }

    /**
     * Define el valor de la propiedad alternateTaxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxID(String value) {
        this.alternateTaxID = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxAmount() {
        return alternateTaxAmount;
    }

    /**
     * Define el valor de la propiedad alternateTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxAmount(String value) {
        this.alternateTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateTaxTypeApplied.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxTypeApplied() {
        return alternateTaxTypeApplied;
    }

    /**
     * Define el valor de la propiedad alternateTaxTypeApplied.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxTypeApplied(String value) {
        this.alternateTaxTypeApplied = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateTaxRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxRate() {
        return alternateTaxRate;
    }

    /**
     * Define el valor de la propiedad alternateTaxRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxRate(String value) {
        this.alternateTaxRate = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateTaxType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxType() {
        return alternateTaxType;
    }

    /**
     * Define el valor de la propiedad alternateTaxType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxType(String value) {
        this.alternateTaxType = value;
    }

    /**
     * Obtiene el valor de la propiedad localTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTax() {
        return localTax;
    }

    /**
     * Define el valor de la propiedad localTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTax(String value) {
        this.localTax = value;
    }

    /**
     * Obtiene el valor de la propiedad zeroCostToCustomerIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroCostToCustomerIndicator() {
        return zeroCostToCustomerIndicator;
    }

    /**
     * Define el valor de la propiedad zeroCostToCustomerIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroCostToCustomerIndicator(String value) {
        this.zeroCostToCustomerIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerFirstName() {
        return passengerFirstName;
    }

    /**
     * Define el valor de la propiedad passengerFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerFirstName(String value) {
        this.passengerFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerLastName() {
        return passengerLastName;
    }

    /**
     * Define el valor de la propiedad passengerLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerLastName(String value) {
        this.passengerLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerID() {
        return passengerID;
    }

    /**
     * Define el valor de la propiedad passengerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerID(String value) {
        this.passengerID = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerStatus() {
        return passengerStatus;
    }

    /**
     * Define el valor de la propiedad passengerStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerStatus(String value) {
        this.passengerStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Define el valor de la propiedad passengerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerEmail() {
        return passengerEmail;
    }

    /**
     * Define el valor de la propiedad passengerEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerEmail(String value) {
        this.passengerEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerPhone() {
        return passengerPhone;
    }

    /**
     * Define el valor de la propiedad passengerPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerPhone(String value) {
        this.passengerPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerNationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerNationality() {
        return passengerNationality;
    }

    /**
     * Define el valor de la propiedad passengerNationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerNationality(String value) {
        this.passengerNationality = value;
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
     * Obtiene el valor de la propiedad productDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Define el valor de la propiedad productDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad taxStatusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxStatusIndicator() {
        return taxStatusIndicator;
    }

    /**
     * Define el valor de la propiedad taxStatusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxStatusIndicator(String value) {
        this.taxStatusIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad discountManagementIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountManagementIndicator() {
        return discountManagementIndicator;
    }

    /**
     * Define el valor de la propiedad discountManagementIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountManagementIndicator(String value) {
        this.discountManagementIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad typeOfSupply.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfSupply() {
        return typeOfSupply;
    }

    /**
     * Define el valor de la propiedad typeOfSupply.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfSupply(String value) {
        this.typeOfSupply = value;
    }

    /**
     * Obtiene el valor de la propiedad sign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign() {
        return sign;
    }

    /**
     * Define el valor de la propiedad sign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * Obtiene el valor de la propiedad unitTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTaxAmount() {
        return unitTaxAmount;
    }

    /**
     * Define el valor de la propiedad unitTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTaxAmount(String value) {
        this.unitTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad weightAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightAmount() {
        return weightAmount;
    }

    /**
     * Define el valor de la propiedad weightAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightAmount(String value) {
        this.weightAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad weightID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightID() {
        return weightID;
    }

    /**
     * Define el valor de la propiedad weightID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightID(String value) {
        this.weightID = value;
    }

    /**
     * Obtiene el valor de la propiedad weightUnitMeasurement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnitMeasurement() {
        return weightUnitMeasurement;
    }

    /**
     * Define el valor de la propiedad weightUnitMeasurement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnitMeasurement(String value) {
        this.weightUnitMeasurement = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax1Type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax1Type() {
        return otherTax1Type;
    }

    /**
     * Define el valor de la propiedad otherTax1Type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax1Type(String value) {
        this.otherTax1Type = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax1Amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax1Amount() {
        return otherTax1Amount;
    }

    /**
     * Define el valor de la propiedad otherTax1Amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax1Amount(String value) {
        this.otherTax1Amount = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax1Rate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax1Rate() {
        return otherTax1Rate;
    }

    /**
     * Define el valor de la propiedad otherTax1Rate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax1Rate(String value) {
        this.otherTax1Rate = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax1StatusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax1StatusIndicator() {
        return otherTax1StatusIndicator;
    }

    /**
     * Define el valor de la propiedad otherTax1StatusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax1StatusIndicator(String value) {
        this.otherTax1StatusIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax2Type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax2Type() {
        return otherTax2Type;
    }

    /**
     * Define el valor de la propiedad otherTax2Type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax2Type(String value) {
        this.otherTax2Type = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax2Amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax2Amount() {
        return otherTax2Amount;
    }

    /**
     * Define el valor de la propiedad otherTax2Amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax2Amount(String value) {
        this.otherTax2Amount = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax2Rate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax2Rate() {
        return otherTax2Rate;
    }

    /**
     * Define el valor de la propiedad otherTax2Rate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax2Rate(String value) {
        this.otherTax2Rate = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax2StatusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax2StatusIndicator() {
        return otherTax2StatusIndicator;
    }

    /**
     * Define el valor de la propiedad otherTax2StatusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax2StatusIndicator(String value) {
        this.otherTax2StatusIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax3Type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax3Type() {
        return otherTax3Type;
    }

    /**
     * Define el valor de la propiedad otherTax3Type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax3Type(String value) {
        this.otherTax3Type = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax3Amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax3Amount() {
        return otherTax3Amount;
    }

    /**
     * Define el valor de la propiedad otherTax3Amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax3Amount(String value) {
        this.otherTax3Amount = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax3Rate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax3Rate() {
        return otherTax3Rate;
    }

    /**
     * Define el valor de la propiedad otherTax3Rate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax3Rate(String value) {
        this.otherTax3Rate = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax3StatusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax3StatusIndicator() {
        return otherTax3StatusIndicator;
    }

    /**
     * Define el valor de la propiedad otherTax3StatusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax3StatusIndicator(String value) {
        this.otherTax3StatusIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax4Type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax4Type() {
        return otherTax4Type;
    }

    /**
     * Define el valor de la propiedad otherTax4Type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax4Type(String value) {
        this.otherTax4Type = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax4Amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax4Amount() {
        return otherTax4Amount;
    }

    /**
     * Define el valor de la propiedad otherTax4Amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax4Amount(String value) {
        this.otherTax4Amount = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax4Rate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax4Rate() {
        return otherTax4Rate;
    }

    /**
     * Define el valor de la propiedad otherTax4Rate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax4Rate(String value) {
        this.otherTax4Rate = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax4StatusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax4StatusIndicator() {
        return otherTax4StatusIndicator;
    }

    /**
     * Define el valor de la propiedad otherTax4StatusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax4StatusIndicator(String value) {
        this.otherTax4StatusIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax5Type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax5Type() {
        return otherTax5Type;
    }

    /**
     * Define el valor de la propiedad otherTax5Type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax5Type(String value) {
        this.otherTax5Type = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax5Amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax5Amount() {
        return otherTax5Amount;
    }

    /**
     * Define el valor de la propiedad otherTax5Amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax5Amount(String value) {
        this.otherTax5Amount = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax5Rate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax5Rate() {
        return otherTax5Rate;
    }

    /**
     * Define el valor de la propiedad otherTax5Rate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax5Rate(String value) {
        this.otherTax5Rate = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax5StatusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax5StatusIndicator() {
        return otherTax5StatusIndicator;
    }

    /**
     * Define el valor de la propiedad otherTax5StatusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax5StatusIndicator(String value) {
        this.otherTax5StatusIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax6Type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax6Type() {
        return otherTax6Type;
    }

    /**
     * Define el valor de la propiedad otherTax6Type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax6Type(String value) {
        this.otherTax6Type = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax6Amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax6Amount() {
        return otherTax6Amount;
    }

    /**
     * Define el valor de la propiedad otherTax6Amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax6Amount(String value) {
        this.otherTax6Amount = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax6Rate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax6Rate() {
        return otherTax6Rate;
    }

    /**
     * Define el valor de la propiedad otherTax6Rate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax6Rate(String value) {
        this.otherTax6Rate = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax6StatusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax6StatusIndicator() {
        return otherTax6StatusIndicator;
    }

    /**
     * Define el valor de la propiedad otherTax6StatusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax6StatusIndicator(String value) {
        this.otherTax6StatusIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax7Type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax7Type() {
        return otherTax7Type;
    }

    /**
     * Define el valor de la propiedad otherTax7Type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax7Type(String value) {
        this.otherTax7Type = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax7Amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax7Amount() {
        return otherTax7Amount;
    }

    /**
     * Define el valor de la propiedad otherTax7Amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax7Amount(String value) {
        this.otherTax7Amount = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax7Rate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax7Rate() {
        return otherTax7Rate;
    }

    /**
     * Define el valor de la propiedad otherTax7Rate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax7Rate(String value) {
        this.otherTax7Rate = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax7StatusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTax7StatusIndicator() {
        return otherTax7StatusIndicator;
    }

    /**
     * Define el valor de la propiedad otherTax7StatusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTax7StatusIndicator(String value) {
        this.otherTax7StatusIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData1Number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData1Number() {
        return referenceData1Number;
    }

    /**
     * Define el valor de la propiedad referenceData1Number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData1Number(String value) {
        this.referenceData1Number = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData1Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData1Code() {
        return referenceData1Code;
    }

    /**
     * Define el valor de la propiedad referenceData1Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData1Code(String value) {
        this.referenceData1Code = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData2Number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData2Number() {
        return referenceData2Number;
    }

    /**
     * Define el valor de la propiedad referenceData2Number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData2Number(String value) {
        this.referenceData2Number = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData2Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData2Code() {
        return referenceData2Code;
    }

    /**
     * Define el valor de la propiedad referenceData2Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData2Code(String value) {
        this.referenceData2Code = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData3Number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData3Number() {
        return referenceData3Number;
    }

    /**
     * Define el valor de la propiedad referenceData3Number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData3Number(String value) {
        this.referenceData3Number = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData3Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData3Code() {
        return referenceData3Code;
    }

    /**
     * Define el valor de la propiedad referenceData3Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData3Code(String value) {
        this.referenceData3Code = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData4Number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData4Number() {
        return referenceData4Number;
    }

    /**
     * Define el valor de la propiedad referenceData4Number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData4Number(String value) {
        this.referenceData4Number = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData4Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData4Code() {
        return referenceData4Code;
    }

    /**
     * Define el valor de la propiedad referenceData4Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData4Code(String value) {
        this.referenceData4Code = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData5Number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData5Number() {
        return referenceData5Number;
    }

    /**
     * Define el valor de la propiedad referenceData5Number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData5Number(String value) {
        this.referenceData5Number = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData5Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData5Code() {
        return referenceData5Code;
    }

    /**
     * Define el valor de la propiedad referenceData5Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData5Code(String value) {
        this.referenceData5Code = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData6Number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData6Number() {
        return referenceData6Number;
    }

    /**
     * Define el valor de la propiedad referenceData6Number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData6Number(String value) {
        this.referenceData6Number = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData6Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData6Code() {
        return referenceData6Code;
    }

    /**
     * Define el valor de la propiedad referenceData6Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData6Code(String value) {
        this.referenceData6Code = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData7Number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData7Number() {
        return referenceData7Number;
    }

    /**
     * Define el valor de la propiedad referenceData7Number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData7Number(String value) {
        this.referenceData7Number = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceData7Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceData7Code() {
        return referenceData7Code;
    }

    /**
     * Define el valor de la propiedad referenceData7Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceData7Code(String value) {
        this.referenceData7Code = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}

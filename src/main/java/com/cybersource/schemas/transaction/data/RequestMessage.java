
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RequestMessage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debtIndicator" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="clientLibrary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientLibraryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientSecurityLibraryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientApplicationUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceHeader" type="{urn:schemas-cybersource-com:transaction-data-1.159}InvoiceHeader" minOccurs="0"/>
 *         &lt;element name="paymentScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aggregatorMerchantIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billTo" type="{urn:schemas-cybersource-com:transaction-data-1.159}BillTo" minOccurs="0"/>
 *         &lt;element name="shipTo" type="{urn:schemas-cybersource-com:transaction-data-1.159}ShipTo" minOccurs="0"/>
 *         &lt;element name="personalID" type="{urn:schemas-cybersource-com:transaction-data-1.159}PersonalID" minOccurs="0"/>
 *         &lt;element name="shipFrom" type="{urn:schemas-cybersource-com:transaction-data-1.159}ShipFrom" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:schemas-cybersource-com:transaction-data-1.159}Item" maxOccurs="1000" minOccurs="0"/>
 *         &lt;element name="purchaseTotals" type="{urn:schemas-cybersource-com:transaction-data-1.159}PurchaseTotals" minOccurs="0"/>
 *         &lt;element name="fundingTotals" type="{urn:schemas-cybersource-com:transaction-data-1.159}FundingTotals" minOccurs="0"/>
 *         &lt;element name="dcc" type="{urn:schemas-cybersource-com:transaction-data-1.159}DCC" minOccurs="0"/>
 *         &lt;element name="pos" type="{urn:schemas-cybersource-com:transaction-data-1.159}Pos" minOccurs="0"/>
 *         &lt;element name="pin" type="{urn:schemas-cybersource-com:transaction-data-1.159}Pin" minOccurs="0"/>
 *         &lt;element name="encryptedPayment" type="{urn:schemas-cybersource-com:transaction-data-1.159}EncryptedPayment" minOccurs="0"/>
 *         &lt;element name="installment" type="{urn:schemas-cybersource-com:transaction-data-1.159}Installment" minOccurs="0"/>
 *         &lt;element name="card" type="{urn:schemas-cybersource-com:transaction-data-1.159}Card" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:schemas-cybersource-com:transaction-data-1.159}Category" minOccurs="0"/>
 *         &lt;element name="check" type="{urn:schemas-cybersource-com:transaction-data-1.159}Check" minOccurs="0"/>
 *         &lt;element name="bml" type="{urn:schemas-cybersource-com:transaction-data-1.159}BML" minOccurs="0"/>
 *         &lt;element name="gecc" type="{urn:schemas-cybersource-com:transaction-data-1.159}GECC" minOccurs="0"/>
 *         &lt;element name="ucaf" type="{urn:schemas-cybersource-com:transaction-data-1.159}UCAF" minOccurs="0"/>
 *         &lt;element name="fundTransfer" type="{urn:schemas-cybersource-com:transaction-data-1.159}FundTransfer" minOccurs="0"/>
 *         &lt;element name="bankInfo" type="{urn:schemas-cybersource-com:transaction-data-1.159}BankInfo" minOccurs="0"/>
 *         &lt;element name="subscription" type="{urn:schemas-cybersource-com:transaction-data-1.159}Subscription" minOccurs="0"/>
 *         &lt;element name="recurringSubscriptionInfo" type="{urn:schemas-cybersource-com:transaction-data-1.159}RecurringSubscriptionInfo" minOccurs="0"/>
 *         &lt;element name="tokenSource" type="{urn:schemas-cybersource-com:transaction-data-1.159}TokenSource" minOccurs="0"/>
 *         &lt;element name="decisionManager" type="{urn:schemas-cybersource-com:transaction-data-1.159}DecisionManager" minOccurs="0"/>
 *         &lt;element name="otherTax" type="{urn:schemas-cybersource-com:transaction-data-1.159}OtherTax" minOccurs="0"/>
 *         &lt;element name="paypal" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPal" minOccurs="0"/>
 *         &lt;element name="merchantDefinedData" type="{urn:schemas-cybersource-com:transaction-data-1.159}MerchantDefinedData" minOccurs="0"/>
 *         &lt;element name="merchantSecureData" type="{urn:schemas-cybersource-com:transaction-data-1.159}MerchantSecureData" minOccurs="0"/>
 *         &lt;element name="jpo" type="{urn:schemas-cybersource-com:transaction-data-1.159}JPO" minOccurs="0"/>
 *         &lt;element name="orderRequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkToRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceFee" type="{urn:schemas-cybersource-com:transaction-data-1.159}ServiceFee" minOccurs="0"/>
 *         &lt;element name="giftCard" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCard" minOccurs="0"/>
 *         &lt;element name="ccAuthService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCAuthService" minOccurs="0"/>
 *         &lt;element name="octService" type="{urn:schemas-cybersource-com:transaction-data-1.159}OCTService" minOccurs="0"/>
 *         &lt;element name="ecAVSService" type="{urn:schemas-cybersource-com:transaction-data-1.159}ECAVSService" minOccurs="0"/>
 *         &lt;element name="giftCardActivationService" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCardActivationService" minOccurs="0"/>
 *         &lt;element name="giftCardBalanceInquiryService" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCardBalanceInquiryService" minOccurs="0"/>
 *         &lt;element name="giftCardRedemptionService" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCardRedemptionService" minOccurs="0"/>
 *         &lt;element name="giftCardVoidService" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCardVoidService" minOccurs="0"/>
 *         &lt;element name="giftCardReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCardReversalService" minOccurs="0"/>
 *         &lt;element name="verificationService" type="{urn:schemas-cybersource-com:transaction-data-1.159}VerificationService" minOccurs="0"/>
 *         &lt;element name="ccSaleService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCSaleService" minOccurs="0"/>
 *         &lt;element name="ccSaleCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCSaleCreditService" minOccurs="0"/>
 *         &lt;element name="ccSaleReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCSaleReversalService" minOccurs="0"/>
 *         &lt;element name="ccIncrementalAuthService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCIncrementalAuthService" minOccurs="0"/>
 *         &lt;element name="ccCaptureService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCCaptureService" minOccurs="0"/>
 *         &lt;element name="ccCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCCreditService" minOccurs="0"/>
 *         &lt;element name="ccAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCAuthReversalService" minOccurs="0"/>
 *         &lt;element name="ccAutoAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCAutoAuthReversalService" minOccurs="0"/>
 *         &lt;element name="ccDCCService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCDCCService" minOccurs="0"/>
 *         &lt;element name="serviceFeeCalculateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}ServiceFeeCalculateService" minOccurs="0"/>
 *         &lt;element name="ecDebitService" type="{urn:schemas-cybersource-com:transaction-data-1.159}ECDebitService" minOccurs="0"/>
 *         &lt;element name="ecCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.159}ECCreditService" minOccurs="0"/>
 *         &lt;element name="ecAuthenticateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}ECAuthenticateService" minOccurs="0"/>
 *         &lt;element name="payerAuthEnrollService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayerAuthEnrollService" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayerAuthValidateService" minOccurs="0"/>
 *         &lt;element name="taxService" type="{urn:schemas-cybersource-com:transaction-data-1.159}TaxService" minOccurs="0"/>
 *         &lt;element name="dmeService" type="{urn:schemas-cybersource-com:transaction-data-1.159}DMEService" minOccurs="0"/>
 *         &lt;element name="afsService" type="{urn:schemas-cybersource-com:transaction-data-1.159}AFSService" minOccurs="0"/>
 *         &lt;element name="davService" type="{urn:schemas-cybersource-com:transaction-data-1.159}DAVService" minOccurs="0"/>
 *         &lt;element name="exportService" type="{urn:schemas-cybersource-com:transaction-data-1.159}ExportService" minOccurs="0"/>
 *         &lt;element name="fxRatesService" type="{urn:schemas-cybersource-com:transaction-data-1.159}FXRatesService" minOccurs="0"/>
 *         &lt;element name="bankTransferService" type="{urn:schemas-cybersource-com:transaction-data-1.159}BankTransferService" minOccurs="0"/>
 *         &lt;element name="bankTransferRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.159}BankTransferRefundService" minOccurs="0"/>
 *         &lt;element name="bankTransferRealTimeService" type="{urn:schemas-cybersource-com:transaction-data-1.159}BankTransferRealTimeService" minOccurs="0"/>
 *         &lt;element name="directDebitMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}DirectDebitMandateService" minOccurs="0"/>
 *         &lt;element name="directDebitService" type="{urn:schemas-cybersource-com:transaction-data-1.159}DirectDebitService" minOccurs="0"/>
 *         &lt;element name="directDebitRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.159}DirectDebitRefundService" minOccurs="0"/>
 *         &lt;element name="directDebitValidateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}DirectDebitValidateService" minOccurs="0"/>
 *         &lt;element name="deviceFingerprintData" type="{urn:schemas-cybersource-com:transaction-data-1.159}DeviceFingerprintData" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="paySubscriptionCreateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionCreateService" minOccurs="0"/>
 *         &lt;element name="paySubscriptionUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionUpdateService" minOccurs="0"/>
 *         &lt;element name="paySubscriptionEventUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionEventUpdateService" minOccurs="0"/>
 *         &lt;element name="paySubscriptionRetrieveService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionRetrieveService" minOccurs="0"/>
 *         &lt;element name="paySubscriptionDeleteService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionDeleteService" minOccurs="0"/>
 *         &lt;element name="payPalPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalPaymentService" minOccurs="0"/>
 *         &lt;element name="payPalCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalCreditService" minOccurs="0"/>
 *         &lt;element name="voidService" type="{urn:schemas-cybersource-com:transaction-data-1.159}VoidService" minOccurs="0"/>
 *         &lt;element name="businessRules" type="{urn:schemas-cybersource-com:transaction-data-1.159}BusinessRules" minOccurs="0"/>
 *         &lt;element name="pinlessDebitService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinlessDebitService" minOccurs="0"/>
 *         &lt;element name="pinlessDebitValidateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinlessDebitValidateService" minOccurs="0"/>
 *         &lt;element name="pinlessDebitReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinlessDebitReversalService" minOccurs="0"/>
 *         &lt;element name="batch" type="{urn:schemas-cybersource-com:transaction-data-1.159}Batch" minOccurs="0"/>
 *         &lt;element name="airlineData" type="{urn:schemas-cybersource-com:transaction-data-1.159}AirlineData" minOccurs="0"/>
 *         &lt;element name="ancillaryData" type="{urn:schemas-cybersource-com:transaction-data-1.159}AncillaryData" minOccurs="0"/>
 *         &lt;element name="lodgingData" type="{urn:schemas-cybersource-com:transaction-data-1.159}LodgingData" minOccurs="0"/>
 *         &lt;element name="payPalButtonCreateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalButtonCreateService" minOccurs="0"/>
 *         &lt;element name="payPalPreapprovedPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalPreapprovedPaymentService" minOccurs="0"/>
 *         &lt;element name="payPalPreapprovedUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalPreapprovedUpdateService" minOccurs="0"/>
 *         &lt;element name="riskUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}RiskUpdateService" minOccurs="0"/>
 *         &lt;element name="fraudUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}FraudUpdateService" minOccurs="0"/>
 *         &lt;element name="caseManagementActionService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CaseManagementActionService" minOccurs="0"/>
 *         &lt;element name="reserved" type="{urn:schemas-cybersource-com:transaction-data-1.159}RequestReserved" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="deviceFingerprintID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceFingerprintRaw" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="deviceFingerprintHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payPalRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalRefundService" minOccurs="0"/>
 *         &lt;element name="payPalAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalAuthReversalService" minOccurs="0"/>
 *         &lt;element name="payPalDoCaptureService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalDoCaptureService" minOccurs="0"/>
 *         &lt;element name="payPalEcDoPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalEcDoPaymentService" minOccurs="0"/>
 *         &lt;element name="payPalEcGetDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalEcGetDetailsService" minOccurs="0"/>
 *         &lt;element name="payPalEcSetService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalEcSetService" minOccurs="0"/>
 *         &lt;element name="payPalEcOrderSetupService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalEcOrderSetupService" minOccurs="0"/>
 *         &lt;element name="payPalAuthorizationService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalAuthorizationService" minOccurs="0"/>
 *         &lt;element name="payPalUpdateAgreementService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalUpdateAgreementService" minOccurs="0"/>
 *         &lt;element name="payPalCreateAgreementService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalCreateAgreementService" minOccurs="0"/>
 *         &lt;element name="payPalDoRefTransactionService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalDoRefTransactionService" minOccurs="0"/>
 *         &lt;element name="chinaPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.159}ChinaPaymentService" minOccurs="0"/>
 *         &lt;element name="chinaRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.159}ChinaRefundService" minOccurs="0"/>
 *         &lt;element name="boletoPaymentService" type="{urn:schemas-cybersource-com:transaction-data-1.159}BoletoPaymentService" minOccurs="0"/>
 *         &lt;element name="apPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apInitiateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APInitiateService" minOccurs="0"/>
 *         &lt;element name="apCheckStatusService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APCheckStatusService" minOccurs="0"/>
 *         &lt;element name="ignoreCardExpiration" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="reportGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyCertificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionLocalDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="solutionProviderTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surchargeAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="surchargeSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinDataEncryptedPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinDataKeySerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinDataPinBlockEncodingFormat" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cashbackAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="pinDebitPurchaseService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinDebitPurchaseService" minOccurs="0"/>
 *         &lt;element name="pinDebitCreditService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinDebitCreditService" minOccurs="0"/>
 *         &lt;element name="pinDebitReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinDebitReversalService" minOccurs="0"/>
 *         &lt;element name="ap" type="{urn:schemas-cybersource-com:transaction-data-1.159}AP" minOccurs="0"/>
 *         &lt;element name="apAuthService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APAuthService" minOccurs="0"/>
 *         &lt;element name="apAuthReversalService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APAuthReversalService" minOccurs="0"/>
 *         &lt;element name="apCaptureService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APCaptureService" minOccurs="0"/>
 *         &lt;element name="apOptionsService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APOptionsService" minOccurs="0"/>
 *         &lt;element name="apRefundService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APRefundService" minOccurs="0"/>
 *         &lt;element name="apSaleService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APSaleService" minOccurs="0"/>
 *         &lt;element name="apCheckoutDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APCheckOutDetailsService" minOccurs="0"/>
 *         &lt;element name="apSessionsService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APSessionsService" minOccurs="0"/>
 *         &lt;element name="apUI" type="{urn:schemas-cybersource-com:transaction-data-1.159}APUI" minOccurs="0"/>
 *         &lt;element name="apTransactionDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APTransactionDetailsService" minOccurs="0"/>
 *         &lt;element name="apConfirmPurchaseService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APConfirmPurchaseService" minOccurs="0"/>
 *         &lt;element name="payPalGetTxnDetailsService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalGetTxnDetailsService" minOccurs="0"/>
 *         &lt;element name="payPalTransactionSearchService" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalTransactionSearchService" minOccurs="0"/>
 *         &lt;element name="ccDCCUpdateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCDCCUpdateService" minOccurs="0"/>
 *         &lt;element name="emvRequest" type="{urn:schemas-cybersource-com:transaction-data-1.159}EmvRequest" minOccurs="0"/>
 *         &lt;element name="merchant" type="{urn:schemas-cybersource-com:transaction-data-1.159}merchant" minOccurs="0"/>
 *         &lt;element name="merchantTransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostedDataCreateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}HostedDataCreateService" minOccurs="0"/>
 *         &lt;element name="hostedDataRetrieveService" type="{urn:schemas-cybersource-com:transaction-data-1.159}HostedDataRetrieveService" minOccurs="0"/>
 *         &lt;element name="merchantCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantCategoryCodeDomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesSlipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchandiseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchandiseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentInitiationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedCreditTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentNetworkToken" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaymentNetworkToken" minOccurs="0"/>
 *         &lt;element name="recipient" type="{urn:schemas-cybersource-com:transaction-data-1.159}Recipient" minOccurs="0"/>
 *         &lt;element name="sender" type="{urn:schemas-cybersource-com:transaction-data-1.159}Sender" minOccurs="0"/>
 *         &lt;element name="autoRentalData" type="{urn:schemas-cybersource-com:transaction-data-1.159}AutoRentalData" minOccurs="0"/>
 *         &lt;element name="paymentSolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vc" type="{urn:schemas-cybersource-com:transaction-data-1.159}VC" minOccurs="0"/>
 *         &lt;element name="decryptVisaCheckoutDataService" type="{urn:schemas-cybersource-com:transaction-data-1.159}DecryptVisaCheckoutDataService" minOccurs="0"/>
 *         &lt;element name="taxManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionGroup" type="{urn:schemas-cybersource-com:transaction-data-1.159}PromotionGroup" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="wallet" type="{urn:schemas-cybersource-com:transaction-data-1.159}Wallet" minOccurs="0"/>
 *         &lt;element name="aft" type="{urn:schemas-cybersource-com:transaction-data-1.159}Aft" minOccurs="0"/>
 *         &lt;element name="balanceInquiry" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="prenoteTransaction" type="{urn:schemas-cybersource-com:transaction-data-1.159}boolean" minOccurs="0"/>
 *         &lt;element name="encryptPaymentDataService" type="{urn:schemas-cybersource-com:transaction-data-1.159}EncryptPaymentDataService" minOccurs="0"/>
 *         &lt;element name="nationalNetDomesticData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsequentAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsequentAuthOriginalAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="binLookupService" type="{urn:schemas-cybersource-com:transaction-data-1.159}BinLookupService" minOccurs="0"/>
 *         &lt;element name="verificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuer" type="{urn:schemas-cybersource-com:transaction-data-1.159}issuer" minOccurs="0"/>
 *         &lt;element name="partnerSolutionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="getVisaCheckoutDataService" type="{urn:schemas-cybersource-com:transaction-data-1.159}GETVisaCheckoutDataService" minOccurs="0"/>
 *         &lt;element name="customerSignatureImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionMetadataService" type="{urn:schemas-cybersource-com:transaction-data-1.159}TransactionMetadataService" minOccurs="0"/>
 *         &lt;element name="subsequentAuthFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsequentAuthReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsequentAuthTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsequentAuthStoredCredential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loan" type="{urn:schemas-cybersource-com:transaction-data-1.159}Loan" minOccurs="0"/>
 *         &lt;element name="eligibilityInquiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redemptionInquiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeProgramIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apOrderService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APOrderService" minOccurs="0"/>
 *         &lt;element name="apCancelService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APCancelService" minOccurs="0"/>
 *         &lt;element name="apBillingAgreementService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APBillingAgreementService" minOccurs="0"/>
 *         &lt;element name="note_toPayee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note_toPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientMetadataID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerSDKversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerOriginalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardTypeSelectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apCreateMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APCreateMandateService" minOccurs="0"/>
 *         &lt;element name="apMandateStatusService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APMandateStatusService" minOccurs="0"/>
 *         &lt;element name="apUpdateMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APUpdateMandateService" minOccurs="0"/>
 *         &lt;element name="apImportMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APImportMandateService" minOccurs="0"/>
 *         &lt;element name="apRevokeMandateService" type="{urn:schemas-cybersource-com:transaction-data-1.159}APRevokeMandateService" minOccurs="0"/>
 *         &lt;element name="billPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postdatedTransaction" type="{urn:schemas-cybersource-com:transaction-data-1.159}PostdatedTransaction" minOccurs="0"/>
 *         &lt;element name="getMasterpassDataService" type="{urn:schemas-cybersource-com:transaction-data-1.159}GetMasterpassDataService" minOccurs="0"/>
 *         &lt;element name="ccCheckStatusService" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCCheckStatusService" minOccurs="0"/>
 *         &lt;element name="mPOS" type="{urn:schemas-cybersource-com:transaction-data-1.159}mPOS" minOccurs="0"/>
 *         &lt;element name="abortService" type="{urn:schemas-cybersource-com:transaction-data-1.159}AbortService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessage", propOrder = {
    "merchantID",
    "merchantReferenceCode",
    "debtIndicator",
    "clientLibrary",
    "clientLibraryVersion",
    "clientEnvironment",
    "clientSecurityLibraryVersion",
    "clientApplication",
    "clientApplicationVersion",
    "clientApplicationUser",
    "routingCode",
    "comments",
    "returnURL",
    "invoiceHeader",
    "paymentScheme",
    "mandateID",
    "aggregatorMerchantIdentifier",
    "customerID",
    "customerFirstName",
    "customerLastName",
    "billTo",
    "shipTo",
    "personalID",
    "shipFrom",
    "item",
    "purchaseTotals",
    "fundingTotals",
    "dcc",
    "pos",
    "pin",
    "encryptedPayment",
    "installment",
    "card",
    "category",
    "check",
    "bml",
    "gecc",
    "ucaf",
    "fundTransfer",
    "bankInfo",
    "subscription",
    "recurringSubscriptionInfo",
    "tokenSource",
    "decisionManager",
    "otherTax",
    "paypal",
    "merchantDefinedData",
    "merchantSecureData",
    "jpo",
    "orderRequestToken",
    "linkToRequest",
    "serviceFee",
    "giftCard",
    "ccAuthService",
    "octService",
    "ecAVSService",
    "giftCardActivationService",
    "giftCardBalanceInquiryService",
    "giftCardRedemptionService",
    "giftCardVoidService",
    "giftCardReversalService",
    "verificationService",
    "ccSaleService",
    "ccSaleCreditService",
    "ccSaleReversalService",
    "ccIncrementalAuthService",
    "ccCaptureService",
    "ccCreditService",
    "ccAuthReversalService",
    "ccAutoAuthReversalService",
    "ccDCCService",
    "serviceFeeCalculateService",
    "ecDebitService",
    "ecCreditService",
    "ecAuthenticateService",
    "payerAuthEnrollService",
    "payerAuthValidateService",
    "taxService",
    "dmeService",
    "afsService",
    "davService",
    "exportService",
    "fxRatesService",
    "bankTransferService",
    "bankTransferRefundService",
    "bankTransferRealTimeService",
    "directDebitMandateService",
    "directDebitService",
    "directDebitRefundService",
    "directDebitValidateService",
    "deviceFingerprintData",
    "paySubscriptionCreateService",
    "paySubscriptionUpdateService",
    "paySubscriptionEventUpdateService",
    "paySubscriptionRetrieveService",
    "paySubscriptionDeleteService",
    "payPalPaymentService",
    "payPalCreditService",
    "voidService",
    "businessRules",
    "pinlessDebitService",
    "pinlessDebitValidateService",
    "pinlessDebitReversalService",
    "batch",
    "airlineData",
    "ancillaryData",
    "lodgingData",
    "payPalButtonCreateService",
    "payPalPreapprovedPaymentService",
    "payPalPreapprovedUpdateService",
    "riskUpdateService",
    "fraudUpdateService",
    "caseManagementActionService",
    "reserved",
    "deviceFingerprintID",
    "deviceFingerprintRaw",
    "deviceFingerprintHash",
    "payPalRefundService",
    "payPalAuthReversalService",
    "payPalDoCaptureService",
    "payPalEcDoPaymentService",
    "payPalEcGetDetailsService",
    "payPalEcSetService",
    "payPalEcOrderSetupService",
    "payPalAuthorizationService",
    "payPalUpdateAgreementService",
    "payPalCreateAgreementService",
    "payPalDoRefTransactionService",
    "chinaPaymentService",
    "chinaRefundService",
    "boletoPaymentService",
    "apPaymentType",
    "apInitiateService",
    "apCheckStatusService",
    "ignoreCardExpiration",
    "reportGroup",
    "processorID",
    "thirdPartyCertificationNumber",
    "transactionLocalDateTime",
    "solutionProviderTransactionID",
    "surchargeAmount",
    "surchargeSign",
    "pinDataEncryptedPIN",
    "pinDataKeySerialNumber",
    "pinDataPinBlockEncodingFormat",
    "cashbackAmount",
    "pinDebitPurchaseService",
    "pinDebitCreditService",
    "pinDebitReversalService",
    "ap",
    "apAuthService",
    "apAuthReversalService",
    "apCaptureService",
    "apOptionsService",
    "apRefundService",
    "apSaleService",
    "apCheckoutDetailsService",
    "apSessionsService",
    "apUI",
    "apTransactionDetailsService",
    "apConfirmPurchaseService",
    "payPalGetTxnDetailsService",
    "payPalTransactionSearchService",
    "ccDCCUpdateService",
    "emvRequest",
    "merchant",
    "merchantTransactionIdentifier",
    "hostedDataCreateService",
    "hostedDataRetrieveService",
    "merchantCategoryCode",
    "merchantCategoryCodeDomestic",
    "salesSlipNumber",
    "merchandiseCode",
    "merchandiseDescription",
    "paymentInitiationChannel",
    "extendedCreditTotalCount",
    "authIndicator",
    "paymentNetworkToken",
    "recipient",
    "sender",
    "autoRentalData",
    "paymentSolution",
    "vc",
    "decryptVisaCheckoutDataService",
    "taxManagementIndicator",
    "promotionGroup",
    "wallet",
    "aft",
    "balanceInquiry",
    "prenoteTransaction",
    "encryptPaymentDataService",
    "nationalNetDomesticData",
    "subsequentAuth",
    "subsequentAuthOriginalAmount",
    "binLookupService",
    "verificationCode",
    "mobileNumber",
    "issuer",
    "partnerSolutionID",
    "developerID",
    "getVisaCheckoutDataService",
    "customerSignatureImage",
    "transactionMetadataService",
    "subsequentAuthFirst",
    "subsequentAuthReason",
    "subsequentAuthTransactionID",
    "subsequentAuthStoredCredential",
    "loan",
    "eligibilityInquiry",
    "redemptionInquiry",
    "feeProgramIndicator",
    "apOrderService",
    "apCancelService",
    "apBillingAgreementService",
    "noteToPayee",
    "noteToPayer",
    "clientMetadataID",
    "partnerSDKversion",
    "partnerOriginalTransactionID",
    "cardTypeSelectionIndicator",
    "apCreateMandateService",
    "apMandateStatusService",
    "apUpdateMandateService",
    "apImportMandateService",
    "apRevokeMandateService",
    "billPaymentType",
    "postdatedTransaction",
    "getMasterpassDataService",
    "ccCheckStatusService",
    "mpos",
    "abortService"
})
public class RequestMessage {

    protected String merchantID;
    protected String merchantReferenceCode;
    protected String debtIndicator;
    protected String clientLibrary;
    protected String clientLibraryVersion;
    protected String clientEnvironment;
    protected String clientSecurityLibraryVersion;
    protected String clientApplication;
    protected String clientApplicationVersion;
    protected String clientApplicationUser;
    protected String routingCode;
    protected String comments;
    protected String returnURL;
    protected InvoiceHeader invoiceHeader;
    protected String paymentScheme;
    protected String mandateID;
    protected String aggregatorMerchantIdentifier;
    protected String customerID;
    protected String customerFirstName;
    protected String customerLastName;
    protected BillTo billTo;
    protected ShipTo shipTo;
    protected PersonalID personalID;
    protected ShipFrom shipFrom;
    protected List<Item> item;
    protected PurchaseTotals purchaseTotals;
    protected FundingTotals fundingTotals;
    protected DCC dcc;
    protected Pos pos;
    protected Pin pin;
    protected EncryptedPayment encryptedPayment;
    protected Installment installment;
    protected Card card;
    protected Category category;
    protected Check check;
    protected BML bml;
    protected GECC gecc;
    protected UCAF ucaf;
    protected FundTransfer fundTransfer;
    protected BankInfo bankInfo;
    protected Subscription subscription;
    protected RecurringSubscriptionInfo recurringSubscriptionInfo;
    protected TokenSource tokenSource;
    protected DecisionManager decisionManager;
    protected OtherTax otherTax;
    protected PayPal paypal;
    protected MerchantDefinedData merchantDefinedData;
    protected MerchantSecureData merchantSecureData;
    protected JPO jpo;
    protected String orderRequestToken;
    protected String linkToRequest;
    protected ServiceFee serviceFee;
    protected GiftCard giftCard;
    protected CCAuthService ccAuthService;
    protected OCTService octService;
    protected ECAVSService ecAVSService;
    protected GiftCardActivationService giftCardActivationService;
    protected GiftCardBalanceInquiryService giftCardBalanceInquiryService;
    protected GiftCardRedemptionService giftCardRedemptionService;
    protected GiftCardVoidService giftCardVoidService;
    protected GiftCardReversalService giftCardReversalService;
    protected VerificationService verificationService;
    protected CCSaleService ccSaleService;
    protected CCSaleCreditService ccSaleCreditService;
    protected CCSaleReversalService ccSaleReversalService;
    protected CCIncrementalAuthService ccIncrementalAuthService;
    protected CCCaptureService ccCaptureService;
    protected CCCreditService ccCreditService;
    protected CCAuthReversalService ccAuthReversalService;
    protected CCAutoAuthReversalService ccAutoAuthReversalService;
    protected CCDCCService ccDCCService;
    protected ServiceFeeCalculateService serviceFeeCalculateService;
    protected ECDebitService ecDebitService;
    protected ECCreditService ecCreditService;
    protected ECAuthenticateService ecAuthenticateService;
    protected PayerAuthEnrollService payerAuthEnrollService;
    protected PayerAuthValidateService payerAuthValidateService;
    protected TaxService taxService;
    protected DMEService dmeService;
    protected AFSService afsService;
    protected DAVService davService;
    protected ExportService exportService;
    protected FXRatesService fxRatesService;
    protected BankTransferService bankTransferService;
    protected BankTransferRefundService bankTransferRefundService;
    protected BankTransferRealTimeService bankTransferRealTimeService;
    protected DirectDebitMandateService directDebitMandateService;
    protected DirectDebitService directDebitService;
    protected DirectDebitRefundService directDebitRefundService;
    protected DirectDebitValidateService directDebitValidateService;
    protected List<DeviceFingerprintData> deviceFingerprintData;
    protected PaySubscriptionCreateService paySubscriptionCreateService;
    protected PaySubscriptionUpdateService paySubscriptionUpdateService;
    protected PaySubscriptionEventUpdateService paySubscriptionEventUpdateService;
    protected PaySubscriptionRetrieveService paySubscriptionRetrieveService;
    protected PaySubscriptionDeleteService paySubscriptionDeleteService;
    protected PayPalPaymentService payPalPaymentService;
    protected PayPalCreditService payPalCreditService;
    protected VoidService voidService;
    protected BusinessRules businessRules;
    protected PinlessDebitService pinlessDebitService;
    protected PinlessDebitValidateService pinlessDebitValidateService;
    protected PinlessDebitReversalService pinlessDebitReversalService;
    protected Batch batch;
    protected AirlineData airlineData;
    protected AncillaryData ancillaryData;
    protected LodgingData lodgingData;
    protected PayPalButtonCreateService payPalButtonCreateService;
    protected PayPalPreapprovedPaymentService payPalPreapprovedPaymentService;
    protected PayPalPreapprovedUpdateService payPalPreapprovedUpdateService;
    protected RiskUpdateService riskUpdateService;
    protected FraudUpdateService fraudUpdateService;
    protected CaseManagementActionService caseManagementActionService;
    protected List<RequestReserved> reserved;
    protected String deviceFingerprintID;
    protected String deviceFingerprintRaw;
    protected String deviceFingerprintHash;
    protected PayPalRefundService payPalRefundService;
    protected PayPalAuthReversalService payPalAuthReversalService;
    protected PayPalDoCaptureService payPalDoCaptureService;
    protected PayPalEcDoPaymentService payPalEcDoPaymentService;
    protected PayPalEcGetDetailsService payPalEcGetDetailsService;
    protected PayPalEcSetService payPalEcSetService;
    protected PayPalEcOrderSetupService payPalEcOrderSetupService;
    protected PayPalAuthorizationService payPalAuthorizationService;
    protected PayPalUpdateAgreementService payPalUpdateAgreementService;
    protected PayPalCreateAgreementService payPalCreateAgreementService;
    protected PayPalDoRefTransactionService payPalDoRefTransactionService;
    protected ChinaPaymentService chinaPaymentService;
    protected ChinaRefundService chinaRefundService;
    protected BoletoPaymentService boletoPaymentService;
    protected String apPaymentType;
    protected APInitiateService apInitiateService;
    protected APCheckStatusService apCheckStatusService;
    protected String ignoreCardExpiration;
    protected String reportGroup;
    protected String processorID;
    protected String thirdPartyCertificationNumber;
    protected String transactionLocalDateTime;
    protected String solutionProviderTransactionID;
    protected String surchargeAmount;
    protected String surchargeSign;
    protected String pinDataEncryptedPIN;
    protected String pinDataKeySerialNumber;
    protected BigInteger pinDataPinBlockEncodingFormat;
    protected String cashbackAmount;
    protected PinDebitPurchaseService pinDebitPurchaseService;
    protected PinDebitCreditService pinDebitCreditService;
    protected PinDebitReversalService pinDebitReversalService;
    protected AP ap;
    protected APAuthService apAuthService;
    protected APAuthReversalService apAuthReversalService;
    protected APCaptureService apCaptureService;
    protected APOptionsService apOptionsService;
    protected APRefundService apRefundService;
    protected APSaleService apSaleService;
    protected APCheckOutDetailsService apCheckoutDetailsService;
    protected APSessionsService apSessionsService;
    protected APUI apUI;
    protected APTransactionDetailsService apTransactionDetailsService;
    protected APConfirmPurchaseService apConfirmPurchaseService;
    protected PayPalGetTxnDetailsService payPalGetTxnDetailsService;
    protected PayPalTransactionSearchService payPalTransactionSearchService;
    protected CCDCCUpdateService ccDCCUpdateService;
    protected EmvRequest emvRequest;
    protected Merchant merchant;
    protected String merchantTransactionIdentifier;
    protected HostedDataCreateService hostedDataCreateService;
    protected HostedDataRetrieveService hostedDataRetrieveService;
    protected String merchantCategoryCode;
    protected String merchantCategoryCodeDomestic;
    protected String salesSlipNumber;
    protected String merchandiseCode;
    protected String merchandiseDescription;
    protected String paymentInitiationChannel;
    protected String extendedCreditTotalCount;
    protected String authIndicator;
    protected PaymentNetworkToken paymentNetworkToken;
    protected Recipient recipient;
    protected Sender sender;
    protected AutoRentalData autoRentalData;
    protected String paymentSolution;
    protected VC vc;
    protected DecryptVisaCheckoutDataService decryptVisaCheckoutDataService;
    protected String taxManagementIndicator;
    protected List<PromotionGroup> promotionGroup;
    protected Wallet wallet;
    protected Aft aft;
    protected String balanceInquiry;
    protected String prenoteTransaction;
    protected EncryptPaymentDataService encryptPaymentDataService;
    protected String nationalNetDomesticData;
    protected String subsequentAuth;
    protected String subsequentAuthOriginalAmount;
    protected BinLookupService binLookupService;
    protected String verificationCode;
    protected String mobileNumber;
    protected Issuer issuer;
    protected String partnerSolutionID;
    protected String developerID;
    protected GETVisaCheckoutDataService getVisaCheckoutDataService;
    protected String customerSignatureImage;
    protected TransactionMetadataService transactionMetadataService;
    protected String subsequentAuthFirst;
    protected String subsequentAuthReason;
    protected String subsequentAuthTransactionID;
    protected String subsequentAuthStoredCredential;
    protected Loan loan;
    protected String eligibilityInquiry;
    protected String redemptionInquiry;
    protected String feeProgramIndicator;
    protected APOrderService apOrderService;
    protected APCancelService apCancelService;
    protected APBillingAgreementService apBillingAgreementService;
    @XmlElement(name = "note_toPayee")
    protected String noteToPayee;
    @XmlElement(name = "note_toPayer")
    protected String noteToPayer;
    protected String clientMetadataID;
    protected String partnerSDKversion;
    protected String partnerOriginalTransactionID;
    protected String cardTypeSelectionIndicator;
    protected APCreateMandateService apCreateMandateService;
    protected APMandateStatusService apMandateStatusService;
    protected APUpdateMandateService apUpdateMandateService;
    protected APImportMandateService apImportMandateService;
    protected APRevokeMandateService apRevokeMandateService;
    protected String billPaymentType;
    protected PostdatedTransaction postdatedTransaction;
    protected GetMasterpassDataService getMasterpassDataService;
    protected CCCheckStatusService ccCheckStatusService;
    @XmlElement(name = "mPOS")
    protected MPOS mpos;
    protected AbortService abortService;

    /**
     * Obtiene el valor de la propiedad merchantID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Define el valor de la propiedad merchantID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantReferenceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReferenceCode() {
        return merchantReferenceCode;
    }

    /**
     * Define el valor de la propiedad merchantReferenceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReferenceCode(String value) {
        this.merchantReferenceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad debtIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtIndicator() {
        return debtIndicator;
    }

    /**
     * Define el valor de la propiedad debtIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtIndicator(String value) {
        this.debtIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad clientLibrary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLibrary() {
        return clientLibrary;
    }

    /**
     * Define el valor de la propiedad clientLibrary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLibrary(String value) {
        this.clientLibrary = value;
    }

    /**
     * Obtiene el valor de la propiedad clientLibraryVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLibraryVersion() {
        return clientLibraryVersion;
    }

    /**
     * Define el valor de la propiedad clientLibraryVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLibraryVersion(String value) {
        this.clientLibraryVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad clientEnvironment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientEnvironment() {
        return clientEnvironment;
    }

    /**
     * Define el valor de la propiedad clientEnvironment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientEnvironment(String value) {
        this.clientEnvironment = value;
    }

    /**
     * Obtiene el valor de la propiedad clientSecurityLibraryVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSecurityLibraryVersion() {
        return clientSecurityLibraryVersion;
    }

    /**
     * Define el valor de la propiedad clientSecurityLibraryVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSecurityLibraryVersion(String value) {
        this.clientSecurityLibraryVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad clientApplication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplication() {
        return clientApplication;
    }

    /**
     * Define el valor de la propiedad clientApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplication(String value) {
        this.clientApplication = value;
    }

    /**
     * Obtiene el valor de la propiedad clientApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplicationVersion() {
        return clientApplicationVersion;
    }

    /**
     * Define el valor de la propiedad clientApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplicationVersion(String value) {
        this.clientApplicationVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad clientApplicationUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientApplicationUser() {
        return clientApplicationUser;
    }

    /**
     * Define el valor de la propiedad clientApplicationUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientApplicationUser(String value) {
        this.clientApplicationUser = value;
    }

    /**
     * Obtiene el valor de la propiedad routingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Define el valor de la propiedad routingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad returnURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Define el valor de la propiedad returnURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceHeader.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeader }
     *     
     */
    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * Define el valor de la propiedad invoiceHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeader }
     *     
     */
    public void setInvoiceHeader(InvoiceHeader value) {
        this.invoiceHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentScheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentScheme() {
        return paymentScheme;
    }

    /**
     * Define el valor de la propiedad paymentScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentScheme(String value) {
        this.paymentScheme = value;
    }

    /**
     * Obtiene el valor de la propiedad mandateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateID() {
        return mandateID;
    }

    /**
     * Define el valor de la propiedad mandateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateID(String value) {
        this.mandateID = value;
    }

    /**
     * Obtiene el valor de la propiedad aggregatorMerchantIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorMerchantIdentifier() {
        return aggregatorMerchantIdentifier;
    }

    /**
     * Define el valor de la propiedad aggregatorMerchantIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorMerchantIdentifier(String value) {
        this.aggregatorMerchantIdentifier = value;
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
     * Obtiene el valor de la propiedad customerFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Define el valor de la propiedad customerFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstName(String value) {
        this.customerFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Define el valor de la propiedad customerLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastName(String value) {
        this.customerLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad billTo.
     * 
     * @return
     *     possible object is
     *     {@link BillTo }
     *     
     */
    public BillTo getBillTo() {
        return billTo;
    }

    /**
     * Define el valor de la propiedad billTo.
     * 
     * @param value
     *     allowed object is
     *     {@link BillTo }
     *     
     */
    public void setBillTo(BillTo value) {
        this.billTo = value;
    }

    /**
     * Obtiene el valor de la propiedad shipTo.
     * 
     * @return
     *     possible object is
     *     {@link ShipTo }
     *     
     */
    public ShipTo getShipTo() {
        return shipTo;
    }

    /**
     * Define el valor de la propiedad shipTo.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipTo }
     *     
     */
    public void setShipTo(ShipTo value) {
        this.shipTo = value;
    }

    /**
     * Obtiene el valor de la propiedad personalID.
     * 
     * @return
     *     possible object is
     *     {@link PersonalID }
     *     
     */
    public PersonalID getPersonalID() {
        return personalID;
    }

    /**
     * Define el valor de la propiedad personalID.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalID }
     *     
     */
    public void setPersonalID(PersonalID value) {
        this.personalID = value;
    }

    /**
     * Obtiene el valor de la propiedad shipFrom.
     * 
     * @return
     *     possible object is
     *     {@link ShipFrom }
     *     
     */
    public ShipFrom getShipFrom() {
        return shipFrom;
    }

    /**
     * Define el valor de la propiedad shipFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipFrom }
     *     
     */
    public void setShipFrom(ShipFrom value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

    /**
     * Obtiene el valor de la propiedad purchaseTotals.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseTotals }
     *     
     */
    public PurchaseTotals getPurchaseTotals() {
        return purchaseTotals;
    }

    /**
     * Define el valor de la propiedad purchaseTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseTotals }
     *     
     */
    public void setPurchaseTotals(PurchaseTotals value) {
        this.purchaseTotals = value;
    }

    /**
     * Obtiene el valor de la propiedad fundingTotals.
     * 
     * @return
     *     possible object is
     *     {@link FundingTotals }
     *     
     */
    public FundingTotals getFundingTotals() {
        return fundingTotals;
    }

    /**
     * Define el valor de la propiedad fundingTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingTotals }
     *     
     */
    public void setFundingTotals(FundingTotals value) {
        this.fundingTotals = value;
    }

    /**
     * Obtiene el valor de la propiedad dcc.
     * 
     * @return
     *     possible object is
     *     {@link DCC }
     *     
     */
    public DCC getDcc() {
        return dcc;
    }

    /**
     * Define el valor de la propiedad dcc.
     * 
     * @param value
     *     allowed object is
     *     {@link DCC }
     *     
     */
    public void setDcc(DCC value) {
        this.dcc = value;
    }

    /**
     * Obtiene el valor de la propiedad pos.
     * 
     * @return
     *     possible object is
     *     {@link Pos }
     *     
     */
    public Pos getPos() {
        return pos;
    }

    /**
     * Define el valor de la propiedad pos.
     * 
     * @param value
     *     allowed object is
     *     {@link Pos }
     *     
     */
    public void setPos(Pos value) {
        this.pos = value;
    }

    /**
     * Obtiene el valor de la propiedad pin.
     * 
     * @return
     *     possible object is
     *     {@link Pin }
     *     
     */
    public Pin getPin() {
        return pin;
    }

    /**
     * Define el valor de la propiedad pin.
     * 
     * @param value
     *     allowed object is
     *     {@link Pin }
     *     
     */
    public void setPin(Pin value) {
        this.pin = value;
    }

    /**
     * Obtiene el valor de la propiedad encryptedPayment.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedPayment }
     *     
     */
    public EncryptedPayment getEncryptedPayment() {
        return encryptedPayment;
    }

    /**
     * Define el valor de la propiedad encryptedPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedPayment }
     *     
     */
    public void setEncryptedPayment(EncryptedPayment value) {
        this.encryptedPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad installment.
     * 
     * @return
     *     possible object is
     *     {@link Installment }
     *     
     */
    public Installment getInstallment() {
        return installment;
    }

    /**
     * Define el valor de la propiedad installment.
     * 
     * @param value
     *     allowed object is
     *     {@link Installment }
     *     
     */
    public void setInstallment(Installment value) {
        this.installment = value;
    }

    /**
     * Obtiene el valor de la propiedad card.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getCard() {
        return card;
    }

    /**
     * Define el valor de la propiedad card.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setCard(Card value) {
        this.card = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad check.
     * 
     * @return
     *     possible object is
     *     {@link Check }
     *     
     */
    public Check getCheck() {
        return check;
    }

    /**
     * Define el valor de la propiedad check.
     * 
     * @param value
     *     allowed object is
     *     {@link Check }
     *     
     */
    public void setCheck(Check value) {
        this.check = value;
    }

    /**
     * Obtiene el valor de la propiedad bml.
     * 
     * @return
     *     possible object is
     *     {@link BML }
     *     
     */
    public BML getBml() {
        return bml;
    }

    /**
     * Define el valor de la propiedad bml.
     * 
     * @param value
     *     allowed object is
     *     {@link BML }
     *     
     */
    public void setBml(BML value) {
        this.bml = value;
    }

    /**
     * Obtiene el valor de la propiedad gecc.
     * 
     * @return
     *     possible object is
     *     {@link GECC }
     *     
     */
    public GECC getGecc() {
        return gecc;
    }

    /**
     * Define el valor de la propiedad gecc.
     * 
     * @param value
     *     allowed object is
     *     {@link GECC }
     *     
     */
    public void setGecc(GECC value) {
        this.gecc = value;
    }

    /**
     * Obtiene el valor de la propiedad ucaf.
     * 
     * @return
     *     possible object is
     *     {@link UCAF }
     *     
     */
    public UCAF getUcaf() {
        return ucaf;
    }

    /**
     * Define el valor de la propiedad ucaf.
     * 
     * @param value
     *     allowed object is
     *     {@link UCAF }
     *     
     */
    public void setUcaf(UCAF value) {
        this.ucaf = value;
    }

    /**
     * Obtiene el valor de la propiedad fundTransfer.
     * 
     * @return
     *     possible object is
     *     {@link FundTransfer }
     *     
     */
    public FundTransfer getFundTransfer() {
        return fundTransfer;
    }

    /**
     * Define el valor de la propiedad fundTransfer.
     * 
     * @param value
     *     allowed object is
     *     {@link FundTransfer }
     *     
     */
    public void setFundTransfer(FundTransfer value) {
        this.fundTransfer = value;
    }

    /**
     * Obtiene el valor de la propiedad bankInfo.
     * 
     * @return
     *     possible object is
     *     {@link BankInfo }
     *     
     */
    public BankInfo getBankInfo() {
        return bankInfo;
    }

    /**
     * Define el valor de la propiedad bankInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInfo }
     *     
     */
    public void setBankInfo(BankInfo value) {
        this.bankInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad subscription.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Define el valor de la propiedad subscription.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Obtiene el valor de la propiedad recurringSubscriptionInfo.
     * 
     * @return
     *     possible object is
     *     {@link RecurringSubscriptionInfo }
     *     
     */
    public RecurringSubscriptionInfo getRecurringSubscriptionInfo() {
        return recurringSubscriptionInfo;
    }

    /**
     * Define el valor de la propiedad recurringSubscriptionInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringSubscriptionInfo }
     *     
     */
    public void setRecurringSubscriptionInfo(RecurringSubscriptionInfo value) {
        this.recurringSubscriptionInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenSource.
     * 
     * @return
     *     possible object is
     *     {@link TokenSource }
     *     
     */
    public TokenSource getTokenSource() {
        return tokenSource;
    }

    /**
     * Define el valor de la propiedad tokenSource.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenSource }
     *     
     */
    public void setTokenSource(TokenSource value) {
        this.tokenSource = value;
    }

    /**
     * Obtiene el valor de la propiedad decisionManager.
     * 
     * @return
     *     possible object is
     *     {@link DecisionManager }
     *     
     */
    public DecisionManager getDecisionManager() {
        return decisionManager;
    }

    /**
     * Define el valor de la propiedad decisionManager.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionManager }
     *     
     */
    public void setDecisionManager(DecisionManager value) {
        this.decisionManager = value;
    }

    /**
     * Obtiene el valor de la propiedad otherTax.
     * 
     * @return
     *     possible object is
     *     {@link OtherTax }
     *     
     */
    public OtherTax getOtherTax() {
        return otherTax;
    }

    /**
     * Define el valor de la propiedad otherTax.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTax }
     *     
     */
    public void setOtherTax(OtherTax value) {
        this.otherTax = value;
    }

    /**
     * Obtiene el valor de la propiedad paypal.
     * 
     * @return
     *     possible object is
     *     {@link PayPal }
     *     
     */
    public PayPal getPaypal() {
        return paypal;
    }

    /**
     * Define el valor de la propiedad paypal.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPal }
     *     
     */
    public void setPaypal(PayPal value) {
        this.paypal = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantDefinedData.
     * 
     * @return
     *     possible object is
     *     {@link MerchantDefinedData }
     *     
     */
    public MerchantDefinedData getMerchantDefinedData() {
        return merchantDefinedData;
    }

    /**
     * Define el valor de la propiedad merchantDefinedData.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantDefinedData }
     *     
     */
    public void setMerchantDefinedData(MerchantDefinedData value) {
        this.merchantDefinedData = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantSecureData.
     * 
     * @return
     *     possible object is
     *     {@link MerchantSecureData }
     *     
     */
    public MerchantSecureData getMerchantSecureData() {
        return merchantSecureData;
    }

    /**
     * Define el valor de la propiedad merchantSecureData.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantSecureData }
     *     
     */
    public void setMerchantSecureData(MerchantSecureData value) {
        this.merchantSecureData = value;
    }

    /**
     * Obtiene el valor de la propiedad jpo.
     * 
     * @return
     *     possible object is
     *     {@link JPO }
     *     
     */
    public JPO getJpo() {
        return jpo;
    }

    /**
     * Define el valor de la propiedad jpo.
     * 
     * @param value
     *     allowed object is
     *     {@link JPO }
     *     
     */
    public void setJpo(JPO value) {
        this.jpo = value;
    }

    /**
     * Obtiene el valor de la propiedad orderRequestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRequestToken() {
        return orderRequestToken;
    }

    /**
     * Define el valor de la propiedad orderRequestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRequestToken(String value) {
        this.orderRequestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad linkToRequest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkToRequest() {
        return linkToRequest;
    }

    /**
     * Define el valor de la propiedad linkToRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkToRequest(String value) {
        this.linkToRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFee.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFee }
     *     
     */
    public ServiceFee getServiceFee() {
        return serviceFee;
    }

    /**
     * Define el valor de la propiedad serviceFee.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFee }
     *     
     */
    public void setServiceFee(ServiceFee value) {
        this.serviceFee = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCard.
     * 
     * @return
     *     possible object is
     *     {@link GiftCard }
     *     
     */
    public GiftCard getGiftCard() {
        return giftCard;
    }

    /**
     * Define el valor de la propiedad giftCard.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCard }
     *     
     */
    public void setGiftCard(GiftCard value) {
        this.giftCard = value;
    }

    /**
     * Obtiene el valor de la propiedad ccAuthService.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthService }
     *     
     */
    public CCAuthService getCcAuthService() {
        return ccAuthService;
    }

    /**
     * Define el valor de la propiedad ccAuthService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthService }
     *     
     */
    public void setCcAuthService(CCAuthService value) {
        this.ccAuthService = value;
    }

    /**
     * Obtiene el valor de la propiedad octService.
     * 
     * @return
     *     possible object is
     *     {@link OCTService }
     *     
     */
    public OCTService getOctService() {
        return octService;
    }

    /**
     * Define el valor de la propiedad octService.
     * 
     * @param value
     *     allowed object is
     *     {@link OCTService }
     *     
     */
    public void setOctService(OCTService value) {
        this.octService = value;
    }

    /**
     * Obtiene el valor de la propiedad ecAVSService.
     * 
     * @return
     *     possible object is
     *     {@link ECAVSService }
     *     
     */
    public ECAVSService getEcAVSService() {
        return ecAVSService;
    }

    /**
     * Define el valor de la propiedad ecAVSService.
     * 
     * @param value
     *     allowed object is
     *     {@link ECAVSService }
     *     
     */
    public void setEcAVSService(ECAVSService value) {
        this.ecAVSService = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardActivationService.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardActivationService }
     *     
     */
    public GiftCardActivationService getGiftCardActivationService() {
        return giftCardActivationService;
    }

    /**
     * Define el valor de la propiedad giftCardActivationService.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardActivationService }
     *     
     */
    public void setGiftCardActivationService(GiftCardActivationService value) {
        this.giftCardActivationService = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardBalanceInquiryService.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardBalanceInquiryService }
     *     
     */
    public GiftCardBalanceInquiryService getGiftCardBalanceInquiryService() {
        return giftCardBalanceInquiryService;
    }

    /**
     * Define el valor de la propiedad giftCardBalanceInquiryService.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardBalanceInquiryService }
     *     
     */
    public void setGiftCardBalanceInquiryService(GiftCardBalanceInquiryService value) {
        this.giftCardBalanceInquiryService = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardRedemptionService.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardRedemptionService }
     *     
     */
    public GiftCardRedemptionService getGiftCardRedemptionService() {
        return giftCardRedemptionService;
    }

    /**
     * Define el valor de la propiedad giftCardRedemptionService.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardRedemptionService }
     *     
     */
    public void setGiftCardRedemptionService(GiftCardRedemptionService value) {
        this.giftCardRedemptionService = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardVoidService.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardVoidService }
     *     
     */
    public GiftCardVoidService getGiftCardVoidService() {
        return giftCardVoidService;
    }

    /**
     * Define el valor de la propiedad giftCardVoidService.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardVoidService }
     *     
     */
    public void setGiftCardVoidService(GiftCardVoidService value) {
        this.giftCardVoidService = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardReversalService.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardReversalService }
     *     
     */
    public GiftCardReversalService getGiftCardReversalService() {
        return giftCardReversalService;
    }

    /**
     * Define el valor de la propiedad giftCardReversalService.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardReversalService }
     *     
     */
    public void setGiftCardReversalService(GiftCardReversalService value) {
        this.giftCardReversalService = value;
    }

    /**
     * Obtiene el valor de la propiedad verificationService.
     * 
     * @return
     *     possible object is
     *     {@link VerificationService }
     *     
     */
    public VerificationService getVerificationService() {
        return verificationService;
    }

    /**
     * Define el valor de la propiedad verificationService.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationService }
     *     
     */
    public void setVerificationService(VerificationService value) {
        this.verificationService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccSaleService.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleService }
     *     
     */
    public CCSaleService getCcSaleService() {
        return ccSaleService;
    }

    /**
     * Define el valor de la propiedad ccSaleService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleService }
     *     
     */
    public void setCcSaleService(CCSaleService value) {
        this.ccSaleService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccSaleCreditService.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleCreditService }
     *     
     */
    public CCSaleCreditService getCcSaleCreditService() {
        return ccSaleCreditService;
    }

    /**
     * Define el valor de la propiedad ccSaleCreditService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleCreditService }
     *     
     */
    public void setCcSaleCreditService(CCSaleCreditService value) {
        this.ccSaleCreditService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccSaleReversalService.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleReversalService }
     *     
     */
    public CCSaleReversalService getCcSaleReversalService() {
        return ccSaleReversalService;
    }

    /**
     * Define el valor de la propiedad ccSaleReversalService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleReversalService }
     *     
     */
    public void setCcSaleReversalService(CCSaleReversalService value) {
        this.ccSaleReversalService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccIncrementalAuthService.
     * 
     * @return
     *     possible object is
     *     {@link CCIncrementalAuthService }
     *     
     */
    public CCIncrementalAuthService getCcIncrementalAuthService() {
        return ccIncrementalAuthService;
    }

    /**
     * Define el valor de la propiedad ccIncrementalAuthService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCIncrementalAuthService }
     *     
     */
    public void setCcIncrementalAuthService(CCIncrementalAuthService value) {
        this.ccIncrementalAuthService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccCaptureService.
     * 
     * @return
     *     possible object is
     *     {@link CCCaptureService }
     *     
     */
    public CCCaptureService getCcCaptureService() {
        return ccCaptureService;
    }

    /**
     * Define el valor de la propiedad ccCaptureService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCaptureService }
     *     
     */
    public void setCcCaptureService(CCCaptureService value) {
        this.ccCaptureService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccCreditService.
     * 
     * @return
     *     possible object is
     *     {@link CCCreditService }
     *     
     */
    public CCCreditService getCcCreditService() {
        return ccCreditService;
    }

    /**
     * Define el valor de la propiedad ccCreditService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCreditService }
     *     
     */
    public void setCcCreditService(CCCreditService value) {
        this.ccCreditService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccAuthReversalService.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthReversalService }
     *     
     */
    public CCAuthReversalService getCcAuthReversalService() {
        return ccAuthReversalService;
    }

    /**
     * Define el valor de la propiedad ccAuthReversalService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthReversalService }
     *     
     */
    public void setCcAuthReversalService(CCAuthReversalService value) {
        this.ccAuthReversalService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccAutoAuthReversalService.
     * 
     * @return
     *     possible object is
     *     {@link CCAutoAuthReversalService }
     *     
     */
    public CCAutoAuthReversalService getCcAutoAuthReversalService() {
        return ccAutoAuthReversalService;
    }

    /**
     * Define el valor de la propiedad ccAutoAuthReversalService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAutoAuthReversalService }
     *     
     */
    public void setCcAutoAuthReversalService(CCAutoAuthReversalService value) {
        this.ccAutoAuthReversalService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccDCCService.
     * 
     * @return
     *     possible object is
     *     {@link CCDCCService }
     *     
     */
    public CCDCCService getCcDCCService() {
        return ccDCCService;
    }

    /**
     * Define el valor de la propiedad ccDCCService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDCCService }
     *     
     */
    public void setCcDCCService(CCDCCService value) {
        this.ccDCCService = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeCalculateService.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeCalculateService }
     *     
     */
    public ServiceFeeCalculateService getServiceFeeCalculateService() {
        return serviceFeeCalculateService;
    }

    /**
     * Define el valor de la propiedad serviceFeeCalculateService.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeCalculateService }
     *     
     */
    public void setServiceFeeCalculateService(ServiceFeeCalculateService value) {
        this.serviceFeeCalculateService = value;
    }

    /**
     * Obtiene el valor de la propiedad ecDebitService.
     * 
     * @return
     *     possible object is
     *     {@link ECDebitService }
     *     
     */
    public ECDebitService getEcDebitService() {
        return ecDebitService;
    }

    /**
     * Define el valor de la propiedad ecDebitService.
     * 
     * @param value
     *     allowed object is
     *     {@link ECDebitService }
     *     
     */
    public void setEcDebitService(ECDebitService value) {
        this.ecDebitService = value;
    }

    /**
     * Obtiene el valor de la propiedad ecCreditService.
     * 
     * @return
     *     possible object is
     *     {@link ECCreditService }
     *     
     */
    public ECCreditService getEcCreditService() {
        return ecCreditService;
    }

    /**
     * Define el valor de la propiedad ecCreditService.
     * 
     * @param value
     *     allowed object is
     *     {@link ECCreditService }
     *     
     */
    public void setEcCreditService(ECCreditService value) {
        this.ecCreditService = value;
    }

    /**
     * Obtiene el valor de la propiedad ecAuthenticateService.
     * 
     * @return
     *     possible object is
     *     {@link ECAuthenticateService }
     *     
     */
    public ECAuthenticateService getEcAuthenticateService() {
        return ecAuthenticateService;
    }

    /**
     * Define el valor de la propiedad ecAuthenticateService.
     * 
     * @param value
     *     allowed object is
     *     {@link ECAuthenticateService }
     *     
     */
    public void setEcAuthenticateService(ECAuthenticateService value) {
        this.ecAuthenticateService = value;
    }

    /**
     * Obtiene el valor de la propiedad payerAuthEnrollService.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthEnrollService }
     *     
     */
    public PayerAuthEnrollService getPayerAuthEnrollService() {
        return payerAuthEnrollService;
    }

    /**
     * Define el valor de la propiedad payerAuthEnrollService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthEnrollService }
     *     
     */
    public void setPayerAuthEnrollService(PayerAuthEnrollService value) {
        this.payerAuthEnrollService = value;
    }

    /**
     * Obtiene el valor de la propiedad payerAuthValidateService.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthValidateService }
     *     
     */
    public PayerAuthValidateService getPayerAuthValidateService() {
        return payerAuthValidateService;
    }

    /**
     * Define el valor de la propiedad payerAuthValidateService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthValidateService }
     *     
     */
    public void setPayerAuthValidateService(PayerAuthValidateService value) {
        this.payerAuthValidateService = value;
    }

    /**
     * Obtiene el valor de la propiedad taxService.
     * 
     * @return
     *     possible object is
     *     {@link TaxService }
     *     
     */
    public TaxService getTaxService() {
        return taxService;
    }

    /**
     * Define el valor de la propiedad taxService.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxService }
     *     
     */
    public void setTaxService(TaxService value) {
        this.taxService = value;
    }

    /**
     * Obtiene el valor de la propiedad dmeService.
     * 
     * @return
     *     possible object is
     *     {@link DMEService }
     *     
     */
    public DMEService getDmeService() {
        return dmeService;
    }

    /**
     * Define el valor de la propiedad dmeService.
     * 
     * @param value
     *     allowed object is
     *     {@link DMEService }
     *     
     */
    public void setDmeService(DMEService value) {
        this.dmeService = value;
    }

    /**
     * Obtiene el valor de la propiedad afsService.
     * 
     * @return
     *     possible object is
     *     {@link AFSService }
     *     
     */
    public AFSService getAfsService() {
        return afsService;
    }

    /**
     * Define el valor de la propiedad afsService.
     * 
     * @param value
     *     allowed object is
     *     {@link AFSService }
     *     
     */
    public void setAfsService(AFSService value) {
        this.afsService = value;
    }

    /**
     * Obtiene el valor de la propiedad davService.
     * 
     * @return
     *     possible object is
     *     {@link DAVService }
     *     
     */
    public DAVService getDavService() {
        return davService;
    }

    /**
     * Define el valor de la propiedad davService.
     * 
     * @param value
     *     allowed object is
     *     {@link DAVService }
     *     
     */
    public void setDavService(DAVService value) {
        this.davService = value;
    }

    /**
     * Obtiene el valor de la propiedad exportService.
     * 
     * @return
     *     possible object is
     *     {@link ExportService }
     *     
     */
    public ExportService getExportService() {
        return exportService;
    }

    /**
     * Define el valor de la propiedad exportService.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportService }
     *     
     */
    public void setExportService(ExportService value) {
        this.exportService = value;
    }

    /**
     * Obtiene el valor de la propiedad fxRatesService.
     * 
     * @return
     *     possible object is
     *     {@link FXRatesService }
     *     
     */
    public FXRatesService getFxRatesService() {
        return fxRatesService;
    }

    /**
     * Define el valor de la propiedad fxRatesService.
     * 
     * @param value
     *     allowed object is
     *     {@link FXRatesService }
     *     
     */
    public void setFxRatesService(FXRatesService value) {
        this.fxRatesService = value;
    }

    /**
     * Obtiene el valor de la propiedad bankTransferService.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferService }
     *     
     */
    public BankTransferService getBankTransferService() {
        return bankTransferService;
    }

    /**
     * Define el valor de la propiedad bankTransferService.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferService }
     *     
     */
    public void setBankTransferService(BankTransferService value) {
        this.bankTransferService = value;
    }

    /**
     * Obtiene el valor de la propiedad bankTransferRefundService.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferRefundService }
     *     
     */
    public BankTransferRefundService getBankTransferRefundService() {
        return bankTransferRefundService;
    }

    /**
     * Define el valor de la propiedad bankTransferRefundService.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferRefundService }
     *     
     */
    public void setBankTransferRefundService(BankTransferRefundService value) {
        this.bankTransferRefundService = value;
    }

    /**
     * Obtiene el valor de la propiedad bankTransferRealTimeService.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferRealTimeService }
     *     
     */
    public BankTransferRealTimeService getBankTransferRealTimeService() {
        return bankTransferRealTimeService;
    }

    /**
     * Define el valor de la propiedad bankTransferRealTimeService.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferRealTimeService }
     *     
     */
    public void setBankTransferRealTimeService(BankTransferRealTimeService value) {
        this.bankTransferRealTimeService = value;
    }

    /**
     * Obtiene el valor de la propiedad directDebitMandateService.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandateService }
     *     
     */
    public DirectDebitMandateService getDirectDebitMandateService() {
        return directDebitMandateService;
    }

    /**
     * Define el valor de la propiedad directDebitMandateService.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandateService }
     *     
     */
    public void setDirectDebitMandateService(DirectDebitMandateService value) {
        this.directDebitMandateService = value;
    }

    /**
     * Obtiene el valor de la propiedad directDebitService.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitService }
     *     
     */
    public DirectDebitService getDirectDebitService() {
        return directDebitService;
    }

    /**
     * Define el valor de la propiedad directDebitService.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitService }
     *     
     */
    public void setDirectDebitService(DirectDebitService value) {
        this.directDebitService = value;
    }

    /**
     * Obtiene el valor de la propiedad directDebitRefundService.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitRefundService }
     *     
     */
    public DirectDebitRefundService getDirectDebitRefundService() {
        return directDebitRefundService;
    }

    /**
     * Define el valor de la propiedad directDebitRefundService.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitRefundService }
     *     
     */
    public void setDirectDebitRefundService(DirectDebitRefundService value) {
        this.directDebitRefundService = value;
    }

    /**
     * Obtiene el valor de la propiedad directDebitValidateService.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitValidateService }
     *     
     */
    public DirectDebitValidateService getDirectDebitValidateService() {
        return directDebitValidateService;
    }

    /**
     * Define el valor de la propiedad directDebitValidateService.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitValidateService }
     *     
     */
    public void setDirectDebitValidateService(DirectDebitValidateService value) {
        this.directDebitValidateService = value;
    }

    /**
     * Gets the value of the deviceFingerprintData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceFingerprintData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceFingerprintData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceFingerprintData }
     * 
     * 
     */
    public List<DeviceFingerprintData> getDeviceFingerprintData() {
        if (deviceFingerprintData == null) {
            deviceFingerprintData = new ArrayList<DeviceFingerprintData>();
        }
        return this.deviceFingerprintData;
    }

    /**
     * Obtiene el valor de la propiedad paySubscriptionCreateService.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionCreateService }
     *     
     */
    public PaySubscriptionCreateService getPaySubscriptionCreateService() {
        return paySubscriptionCreateService;
    }

    /**
     * Define el valor de la propiedad paySubscriptionCreateService.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionCreateService }
     *     
     */
    public void setPaySubscriptionCreateService(PaySubscriptionCreateService value) {
        this.paySubscriptionCreateService = value;
    }

    /**
     * Obtiene el valor de la propiedad paySubscriptionUpdateService.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionUpdateService }
     *     
     */
    public PaySubscriptionUpdateService getPaySubscriptionUpdateService() {
        return paySubscriptionUpdateService;
    }

    /**
     * Define el valor de la propiedad paySubscriptionUpdateService.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionUpdateService }
     *     
     */
    public void setPaySubscriptionUpdateService(PaySubscriptionUpdateService value) {
        this.paySubscriptionUpdateService = value;
    }

    /**
     * Obtiene el valor de la propiedad paySubscriptionEventUpdateService.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionEventUpdateService }
     *     
     */
    public PaySubscriptionEventUpdateService getPaySubscriptionEventUpdateService() {
        return paySubscriptionEventUpdateService;
    }

    /**
     * Define el valor de la propiedad paySubscriptionEventUpdateService.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionEventUpdateService }
     *     
     */
    public void setPaySubscriptionEventUpdateService(PaySubscriptionEventUpdateService value) {
        this.paySubscriptionEventUpdateService = value;
    }

    /**
     * Obtiene el valor de la propiedad paySubscriptionRetrieveService.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionRetrieveService }
     *     
     */
    public PaySubscriptionRetrieveService getPaySubscriptionRetrieveService() {
        return paySubscriptionRetrieveService;
    }

    /**
     * Define el valor de la propiedad paySubscriptionRetrieveService.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionRetrieveService }
     *     
     */
    public void setPaySubscriptionRetrieveService(PaySubscriptionRetrieveService value) {
        this.paySubscriptionRetrieveService = value;
    }

    /**
     * Obtiene el valor de la propiedad paySubscriptionDeleteService.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionDeleteService }
     *     
     */
    public PaySubscriptionDeleteService getPaySubscriptionDeleteService() {
        return paySubscriptionDeleteService;
    }

    /**
     * Define el valor de la propiedad paySubscriptionDeleteService.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionDeleteService }
     *     
     */
    public void setPaySubscriptionDeleteService(PaySubscriptionDeleteService value) {
        this.paySubscriptionDeleteService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalPaymentService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPaymentService }
     *     
     */
    public PayPalPaymentService getPayPalPaymentService() {
        return payPalPaymentService;
    }

    /**
     * Define el valor de la propiedad payPalPaymentService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPaymentService }
     *     
     */
    public void setPayPalPaymentService(PayPalPaymentService value) {
        this.payPalPaymentService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalCreditService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalCreditService }
     *     
     */
    public PayPalCreditService getPayPalCreditService() {
        return payPalCreditService;
    }

    /**
     * Define el valor de la propiedad payPalCreditService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalCreditService }
     *     
     */
    public void setPayPalCreditService(PayPalCreditService value) {
        this.payPalCreditService = value;
    }

    /**
     * Obtiene el valor de la propiedad voidService.
     * 
     * @return
     *     possible object is
     *     {@link VoidService }
     *     
     */
    public VoidService getVoidService() {
        return voidService;
    }

    /**
     * Define el valor de la propiedad voidService.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidService }
     *     
     */
    public void setVoidService(VoidService value) {
        this.voidService = value;
    }

    /**
     * Obtiene el valor de la propiedad businessRules.
     * 
     * @return
     *     possible object is
     *     {@link BusinessRules }
     *     
     */
    public BusinessRules getBusinessRules() {
        return businessRules;
    }

    /**
     * Define el valor de la propiedad businessRules.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessRules }
     *     
     */
    public void setBusinessRules(BusinessRules value) {
        this.businessRules = value;
    }

    /**
     * Obtiene el valor de la propiedad pinlessDebitService.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitService }
     *     
     */
    public PinlessDebitService getPinlessDebitService() {
        return pinlessDebitService;
    }

    /**
     * Define el valor de la propiedad pinlessDebitService.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitService }
     *     
     */
    public void setPinlessDebitService(PinlessDebitService value) {
        this.pinlessDebitService = value;
    }

    /**
     * Obtiene el valor de la propiedad pinlessDebitValidateService.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitValidateService }
     *     
     */
    public PinlessDebitValidateService getPinlessDebitValidateService() {
        return pinlessDebitValidateService;
    }

    /**
     * Define el valor de la propiedad pinlessDebitValidateService.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitValidateService }
     *     
     */
    public void setPinlessDebitValidateService(PinlessDebitValidateService value) {
        this.pinlessDebitValidateService = value;
    }

    /**
     * Obtiene el valor de la propiedad pinlessDebitReversalService.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitReversalService }
     *     
     */
    public PinlessDebitReversalService getPinlessDebitReversalService() {
        return pinlessDebitReversalService;
    }

    /**
     * Define el valor de la propiedad pinlessDebitReversalService.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitReversalService }
     *     
     */
    public void setPinlessDebitReversalService(PinlessDebitReversalService value) {
        this.pinlessDebitReversalService = value;
    }

    /**
     * Obtiene el valor de la propiedad batch.
     * 
     * @return
     *     possible object is
     *     {@link Batch }
     *     
     */
    public Batch getBatch() {
        return batch;
    }

    /**
     * Define el valor de la propiedad batch.
     * 
     * @param value
     *     allowed object is
     *     {@link Batch }
     *     
     */
    public void setBatch(Batch value) {
        this.batch = value;
    }

    /**
     * Obtiene el valor de la propiedad airlineData.
     * 
     * @return
     *     possible object is
     *     {@link AirlineData }
     *     
     */
    public AirlineData getAirlineData() {
        return airlineData;
    }

    /**
     * Define el valor de la propiedad airlineData.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineData }
     *     
     */
    public void setAirlineData(AirlineData value) {
        this.airlineData = value;
    }

    /**
     * Obtiene el valor de la propiedad ancillaryData.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryData }
     *     
     */
    public AncillaryData getAncillaryData() {
        return ancillaryData;
    }

    /**
     * Define el valor de la propiedad ancillaryData.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryData }
     *     
     */
    public void setAncillaryData(AncillaryData value) {
        this.ancillaryData = value;
    }

    /**
     * Obtiene el valor de la propiedad lodgingData.
     * 
     * @return
     *     possible object is
     *     {@link LodgingData }
     *     
     */
    public LodgingData getLodgingData() {
        return lodgingData;
    }

    /**
     * Define el valor de la propiedad lodgingData.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingData }
     *     
     */
    public void setLodgingData(LodgingData value) {
        this.lodgingData = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalButtonCreateService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalButtonCreateService }
     *     
     */
    public PayPalButtonCreateService getPayPalButtonCreateService() {
        return payPalButtonCreateService;
    }

    /**
     * Define el valor de la propiedad payPalButtonCreateService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalButtonCreateService }
     *     
     */
    public void setPayPalButtonCreateService(PayPalButtonCreateService value) {
        this.payPalButtonCreateService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalPreapprovedPaymentService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPreapprovedPaymentService }
     *     
     */
    public PayPalPreapprovedPaymentService getPayPalPreapprovedPaymentService() {
        return payPalPreapprovedPaymentService;
    }

    /**
     * Define el valor de la propiedad payPalPreapprovedPaymentService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPreapprovedPaymentService }
     *     
     */
    public void setPayPalPreapprovedPaymentService(PayPalPreapprovedPaymentService value) {
        this.payPalPreapprovedPaymentService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalPreapprovedUpdateService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPreapprovedUpdateService }
     *     
     */
    public PayPalPreapprovedUpdateService getPayPalPreapprovedUpdateService() {
        return payPalPreapprovedUpdateService;
    }

    /**
     * Define el valor de la propiedad payPalPreapprovedUpdateService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPreapprovedUpdateService }
     *     
     */
    public void setPayPalPreapprovedUpdateService(PayPalPreapprovedUpdateService value) {
        this.payPalPreapprovedUpdateService = value;
    }

    /**
     * Obtiene el valor de la propiedad riskUpdateService.
     * 
     * @return
     *     possible object is
     *     {@link RiskUpdateService }
     *     
     */
    public RiskUpdateService getRiskUpdateService() {
        return riskUpdateService;
    }

    /**
     * Define el valor de la propiedad riskUpdateService.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskUpdateService }
     *     
     */
    public void setRiskUpdateService(RiskUpdateService value) {
        this.riskUpdateService = value;
    }

    /**
     * Obtiene el valor de la propiedad fraudUpdateService.
     * 
     * @return
     *     possible object is
     *     {@link FraudUpdateService }
     *     
     */
    public FraudUpdateService getFraudUpdateService() {
        return fraudUpdateService;
    }

    /**
     * Define el valor de la propiedad fraudUpdateService.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudUpdateService }
     *     
     */
    public void setFraudUpdateService(FraudUpdateService value) {
        this.fraudUpdateService = value;
    }

    /**
     * Obtiene el valor de la propiedad caseManagementActionService.
     * 
     * @return
     *     possible object is
     *     {@link CaseManagementActionService }
     *     
     */
    public CaseManagementActionService getCaseManagementActionService() {
        return caseManagementActionService;
    }

    /**
     * Define el valor de la propiedad caseManagementActionService.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseManagementActionService }
     *     
     */
    public void setCaseManagementActionService(CaseManagementActionService value) {
        this.caseManagementActionService = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reserved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReserved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestReserved }
     * 
     * 
     */
    public List<RequestReserved> getReserved() {
        if (reserved == null) {
            reserved = new ArrayList<RequestReserved>();
        }
        return this.reserved;
    }

    /**
     * Obtiene el valor de la propiedad deviceFingerprintID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintID() {
        return deviceFingerprintID;
    }

    /**
     * Define el valor de la propiedad deviceFingerprintID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintID(String value) {
        this.deviceFingerprintID = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceFingerprintRaw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintRaw() {
        return deviceFingerprintRaw;
    }

    /**
     * Define el valor de la propiedad deviceFingerprintRaw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintRaw(String value) {
        this.deviceFingerprintRaw = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceFingerprintHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprintHash() {
        return deviceFingerprintHash;
    }

    /**
     * Define el valor de la propiedad deviceFingerprintHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprintHash(String value) {
        this.deviceFingerprintHash = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalRefundService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalRefundService }
     *     
     */
    public PayPalRefundService getPayPalRefundService() {
        return payPalRefundService;
    }

    /**
     * Define el valor de la propiedad payPalRefundService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalRefundService }
     *     
     */
    public void setPayPalRefundService(PayPalRefundService value) {
        this.payPalRefundService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalAuthReversalService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAuthReversalService }
     *     
     */
    public PayPalAuthReversalService getPayPalAuthReversalService() {
        return payPalAuthReversalService;
    }

    /**
     * Define el valor de la propiedad payPalAuthReversalService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAuthReversalService }
     *     
     */
    public void setPayPalAuthReversalService(PayPalAuthReversalService value) {
        this.payPalAuthReversalService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalDoCaptureService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalDoCaptureService }
     *     
     */
    public PayPalDoCaptureService getPayPalDoCaptureService() {
        return payPalDoCaptureService;
    }

    /**
     * Define el valor de la propiedad payPalDoCaptureService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalDoCaptureService }
     *     
     */
    public void setPayPalDoCaptureService(PayPalDoCaptureService value) {
        this.payPalDoCaptureService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalEcDoPaymentService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcDoPaymentService }
     *     
     */
    public PayPalEcDoPaymentService getPayPalEcDoPaymentService() {
        return payPalEcDoPaymentService;
    }

    /**
     * Define el valor de la propiedad payPalEcDoPaymentService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcDoPaymentService }
     *     
     */
    public void setPayPalEcDoPaymentService(PayPalEcDoPaymentService value) {
        this.payPalEcDoPaymentService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalEcGetDetailsService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcGetDetailsService }
     *     
     */
    public PayPalEcGetDetailsService getPayPalEcGetDetailsService() {
        return payPalEcGetDetailsService;
    }

    /**
     * Define el valor de la propiedad payPalEcGetDetailsService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcGetDetailsService }
     *     
     */
    public void setPayPalEcGetDetailsService(PayPalEcGetDetailsService value) {
        this.payPalEcGetDetailsService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalEcSetService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcSetService }
     *     
     */
    public PayPalEcSetService getPayPalEcSetService() {
        return payPalEcSetService;
    }

    /**
     * Define el valor de la propiedad payPalEcSetService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcSetService }
     *     
     */
    public void setPayPalEcSetService(PayPalEcSetService value) {
        this.payPalEcSetService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalEcOrderSetupService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcOrderSetupService }
     *     
     */
    public PayPalEcOrderSetupService getPayPalEcOrderSetupService() {
        return payPalEcOrderSetupService;
    }

    /**
     * Define el valor de la propiedad payPalEcOrderSetupService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcOrderSetupService }
     *     
     */
    public void setPayPalEcOrderSetupService(PayPalEcOrderSetupService value) {
        this.payPalEcOrderSetupService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalAuthorizationService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAuthorizationService }
     *     
     */
    public PayPalAuthorizationService getPayPalAuthorizationService() {
        return payPalAuthorizationService;
    }

    /**
     * Define el valor de la propiedad payPalAuthorizationService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAuthorizationService }
     *     
     */
    public void setPayPalAuthorizationService(PayPalAuthorizationService value) {
        this.payPalAuthorizationService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalUpdateAgreementService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalUpdateAgreementService }
     *     
     */
    public PayPalUpdateAgreementService getPayPalUpdateAgreementService() {
        return payPalUpdateAgreementService;
    }

    /**
     * Define el valor de la propiedad payPalUpdateAgreementService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalUpdateAgreementService }
     *     
     */
    public void setPayPalUpdateAgreementService(PayPalUpdateAgreementService value) {
        this.payPalUpdateAgreementService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalCreateAgreementService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalCreateAgreementService }
     *     
     */
    public PayPalCreateAgreementService getPayPalCreateAgreementService() {
        return payPalCreateAgreementService;
    }

    /**
     * Define el valor de la propiedad payPalCreateAgreementService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalCreateAgreementService }
     *     
     */
    public void setPayPalCreateAgreementService(PayPalCreateAgreementService value) {
        this.payPalCreateAgreementService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalDoRefTransactionService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalDoRefTransactionService }
     *     
     */
    public PayPalDoRefTransactionService getPayPalDoRefTransactionService() {
        return payPalDoRefTransactionService;
    }

    /**
     * Define el valor de la propiedad payPalDoRefTransactionService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalDoRefTransactionService }
     *     
     */
    public void setPayPalDoRefTransactionService(PayPalDoRefTransactionService value) {
        this.payPalDoRefTransactionService = value;
    }

    /**
     * Obtiene el valor de la propiedad chinaPaymentService.
     * 
     * @return
     *     possible object is
     *     {@link ChinaPaymentService }
     *     
     */
    public ChinaPaymentService getChinaPaymentService() {
        return chinaPaymentService;
    }

    /**
     * Define el valor de la propiedad chinaPaymentService.
     * 
     * @param value
     *     allowed object is
     *     {@link ChinaPaymentService }
     *     
     */
    public void setChinaPaymentService(ChinaPaymentService value) {
        this.chinaPaymentService = value;
    }

    /**
     * Obtiene el valor de la propiedad chinaRefundService.
     * 
     * @return
     *     possible object is
     *     {@link ChinaRefundService }
     *     
     */
    public ChinaRefundService getChinaRefundService() {
        return chinaRefundService;
    }

    /**
     * Define el valor de la propiedad chinaRefundService.
     * 
     * @param value
     *     allowed object is
     *     {@link ChinaRefundService }
     *     
     */
    public void setChinaRefundService(ChinaRefundService value) {
        this.chinaRefundService = value;
    }

    /**
     * Obtiene el valor de la propiedad boletoPaymentService.
     * 
     * @return
     *     possible object is
     *     {@link BoletoPaymentService }
     *     
     */
    public BoletoPaymentService getBoletoPaymentService() {
        return boletoPaymentService;
    }

    /**
     * Define el valor de la propiedad boletoPaymentService.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletoPaymentService }
     *     
     */
    public void setBoletoPaymentService(BoletoPaymentService value) {
        this.boletoPaymentService = value;
    }

    /**
     * Obtiene el valor de la propiedad apPaymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApPaymentType() {
        return apPaymentType;
    }

    /**
     * Define el valor de la propiedad apPaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApPaymentType(String value) {
        this.apPaymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad apInitiateService.
     * 
     * @return
     *     possible object is
     *     {@link APInitiateService }
     *     
     */
    public APInitiateService getApInitiateService() {
        return apInitiateService;
    }

    /**
     * Define el valor de la propiedad apInitiateService.
     * 
     * @param value
     *     allowed object is
     *     {@link APInitiateService }
     *     
     */
    public void setApInitiateService(APInitiateService value) {
        this.apInitiateService = value;
    }

    /**
     * Obtiene el valor de la propiedad apCheckStatusService.
     * 
     * @return
     *     possible object is
     *     {@link APCheckStatusService }
     *     
     */
    public APCheckStatusService getApCheckStatusService() {
        return apCheckStatusService;
    }

    /**
     * Define el valor de la propiedad apCheckStatusService.
     * 
     * @param value
     *     allowed object is
     *     {@link APCheckStatusService }
     *     
     */
    public void setApCheckStatusService(APCheckStatusService value) {
        this.apCheckStatusService = value;
    }

    /**
     * Obtiene el valor de la propiedad ignoreCardExpiration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreCardExpiration() {
        return ignoreCardExpiration;
    }

    /**
     * Define el valor de la propiedad ignoreCardExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreCardExpiration(String value) {
        this.ignoreCardExpiration = value;
    }

    /**
     * Obtiene el valor de la propiedad reportGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportGroup() {
        return reportGroup;
    }

    /**
     * Define el valor de la propiedad reportGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportGroup(String value) {
        this.reportGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad processorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorID() {
        return processorID;
    }

    /**
     * Define el valor de la propiedad processorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorID(String value) {
        this.processorID = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPartyCertificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyCertificationNumber() {
        return thirdPartyCertificationNumber;
    }

    /**
     * Define el valor de la propiedad thirdPartyCertificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyCertificationNumber(String value) {
        this.thirdPartyCertificationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionLocalDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLocalDateTime() {
        return transactionLocalDateTime;
    }

    /**
     * Define el valor de la propiedad transactionLocalDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLocalDateTime(String value) {
        this.transactionLocalDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad solutionProviderTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionProviderTransactionID() {
        return solutionProviderTransactionID;
    }

    /**
     * Define el valor de la propiedad solutionProviderTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionProviderTransactionID(String value) {
        this.solutionProviderTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad surchargeAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Define el valor de la propiedad surchargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeAmount(String value) {
        this.surchargeAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad surchargeSign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeSign() {
        return surchargeSign;
    }

    /**
     * Define el valor de la propiedad surchargeSign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeSign(String value) {
        this.surchargeSign = value;
    }

    /**
     * Obtiene el valor de la propiedad pinDataEncryptedPIN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinDataEncryptedPIN() {
        return pinDataEncryptedPIN;
    }

    /**
     * Define el valor de la propiedad pinDataEncryptedPIN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinDataEncryptedPIN(String value) {
        this.pinDataEncryptedPIN = value;
    }

    /**
     * Obtiene el valor de la propiedad pinDataKeySerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinDataKeySerialNumber() {
        return pinDataKeySerialNumber;
    }

    /**
     * Define el valor de la propiedad pinDataKeySerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinDataKeySerialNumber(String value) {
        this.pinDataKeySerialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad pinDataPinBlockEncodingFormat.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPinDataPinBlockEncodingFormat() {
        return pinDataPinBlockEncodingFormat;
    }

    /**
     * Define el valor de la propiedad pinDataPinBlockEncodingFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPinDataPinBlockEncodingFormat(BigInteger value) {
        this.pinDataPinBlockEncodingFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad cashbackAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashbackAmount() {
        return cashbackAmount;
    }

    /**
     * Define el valor de la propiedad cashbackAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashbackAmount(String value) {
        this.cashbackAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad pinDebitPurchaseService.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitPurchaseService }
     *     
     */
    public PinDebitPurchaseService getPinDebitPurchaseService() {
        return pinDebitPurchaseService;
    }

    /**
     * Define el valor de la propiedad pinDebitPurchaseService.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitPurchaseService }
     *     
     */
    public void setPinDebitPurchaseService(PinDebitPurchaseService value) {
        this.pinDebitPurchaseService = value;
    }

    /**
     * Obtiene el valor de la propiedad pinDebitCreditService.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitCreditService }
     *     
     */
    public PinDebitCreditService getPinDebitCreditService() {
        return pinDebitCreditService;
    }

    /**
     * Define el valor de la propiedad pinDebitCreditService.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitCreditService }
     *     
     */
    public void setPinDebitCreditService(PinDebitCreditService value) {
        this.pinDebitCreditService = value;
    }

    /**
     * Obtiene el valor de la propiedad pinDebitReversalService.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitReversalService }
     *     
     */
    public PinDebitReversalService getPinDebitReversalService() {
        return pinDebitReversalService;
    }

    /**
     * Define el valor de la propiedad pinDebitReversalService.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitReversalService }
     *     
     */
    public void setPinDebitReversalService(PinDebitReversalService value) {
        this.pinDebitReversalService = value;
    }

    /**
     * Obtiene el valor de la propiedad ap.
     * 
     * @return
     *     possible object is
     *     {@link AP }
     *     
     */
    public AP getAp() {
        return ap;
    }

    /**
     * Define el valor de la propiedad ap.
     * 
     * @param value
     *     allowed object is
     *     {@link AP }
     *     
     */
    public void setAp(AP value) {
        this.ap = value;
    }

    /**
     * Obtiene el valor de la propiedad apAuthService.
     * 
     * @return
     *     possible object is
     *     {@link APAuthService }
     *     
     */
    public APAuthService getApAuthService() {
        return apAuthService;
    }

    /**
     * Define el valor de la propiedad apAuthService.
     * 
     * @param value
     *     allowed object is
     *     {@link APAuthService }
     *     
     */
    public void setApAuthService(APAuthService value) {
        this.apAuthService = value;
    }

    /**
     * Obtiene el valor de la propiedad apAuthReversalService.
     * 
     * @return
     *     possible object is
     *     {@link APAuthReversalService }
     *     
     */
    public APAuthReversalService getApAuthReversalService() {
        return apAuthReversalService;
    }

    /**
     * Define el valor de la propiedad apAuthReversalService.
     * 
     * @param value
     *     allowed object is
     *     {@link APAuthReversalService }
     *     
     */
    public void setApAuthReversalService(APAuthReversalService value) {
        this.apAuthReversalService = value;
    }

    /**
     * Obtiene el valor de la propiedad apCaptureService.
     * 
     * @return
     *     possible object is
     *     {@link APCaptureService }
     *     
     */
    public APCaptureService getApCaptureService() {
        return apCaptureService;
    }

    /**
     * Define el valor de la propiedad apCaptureService.
     * 
     * @param value
     *     allowed object is
     *     {@link APCaptureService }
     *     
     */
    public void setApCaptureService(APCaptureService value) {
        this.apCaptureService = value;
    }

    /**
     * Obtiene el valor de la propiedad apOptionsService.
     * 
     * @return
     *     possible object is
     *     {@link APOptionsService }
     *     
     */
    public APOptionsService getApOptionsService() {
        return apOptionsService;
    }

    /**
     * Define el valor de la propiedad apOptionsService.
     * 
     * @param value
     *     allowed object is
     *     {@link APOptionsService }
     *     
     */
    public void setApOptionsService(APOptionsService value) {
        this.apOptionsService = value;
    }

    /**
     * Obtiene el valor de la propiedad apRefundService.
     * 
     * @return
     *     possible object is
     *     {@link APRefundService }
     *     
     */
    public APRefundService getApRefundService() {
        return apRefundService;
    }

    /**
     * Define el valor de la propiedad apRefundService.
     * 
     * @param value
     *     allowed object is
     *     {@link APRefundService }
     *     
     */
    public void setApRefundService(APRefundService value) {
        this.apRefundService = value;
    }

    /**
     * Obtiene el valor de la propiedad apSaleService.
     * 
     * @return
     *     possible object is
     *     {@link APSaleService }
     *     
     */
    public APSaleService getApSaleService() {
        return apSaleService;
    }

    /**
     * Define el valor de la propiedad apSaleService.
     * 
     * @param value
     *     allowed object is
     *     {@link APSaleService }
     *     
     */
    public void setApSaleService(APSaleService value) {
        this.apSaleService = value;
    }

    /**
     * Obtiene el valor de la propiedad apCheckoutDetailsService.
     * 
     * @return
     *     possible object is
     *     {@link APCheckOutDetailsService }
     *     
     */
    public APCheckOutDetailsService getApCheckoutDetailsService() {
        return apCheckoutDetailsService;
    }

    /**
     * Define el valor de la propiedad apCheckoutDetailsService.
     * 
     * @param value
     *     allowed object is
     *     {@link APCheckOutDetailsService }
     *     
     */
    public void setApCheckoutDetailsService(APCheckOutDetailsService value) {
        this.apCheckoutDetailsService = value;
    }

    /**
     * Obtiene el valor de la propiedad apSessionsService.
     * 
     * @return
     *     possible object is
     *     {@link APSessionsService }
     *     
     */
    public APSessionsService getApSessionsService() {
        return apSessionsService;
    }

    /**
     * Define el valor de la propiedad apSessionsService.
     * 
     * @param value
     *     allowed object is
     *     {@link APSessionsService }
     *     
     */
    public void setApSessionsService(APSessionsService value) {
        this.apSessionsService = value;
    }

    /**
     * Obtiene el valor de la propiedad apUI.
     * 
     * @return
     *     possible object is
     *     {@link APUI }
     *     
     */
    public APUI getApUI() {
        return apUI;
    }

    /**
     * Define el valor de la propiedad apUI.
     * 
     * @param value
     *     allowed object is
     *     {@link APUI }
     *     
     */
    public void setApUI(APUI value) {
        this.apUI = value;
    }

    /**
     * Obtiene el valor de la propiedad apTransactionDetailsService.
     * 
     * @return
     *     possible object is
     *     {@link APTransactionDetailsService }
     *     
     */
    public APTransactionDetailsService getApTransactionDetailsService() {
        return apTransactionDetailsService;
    }

    /**
     * Define el valor de la propiedad apTransactionDetailsService.
     * 
     * @param value
     *     allowed object is
     *     {@link APTransactionDetailsService }
     *     
     */
    public void setApTransactionDetailsService(APTransactionDetailsService value) {
        this.apTransactionDetailsService = value;
    }

    /**
     * Obtiene el valor de la propiedad apConfirmPurchaseService.
     * 
     * @return
     *     possible object is
     *     {@link APConfirmPurchaseService }
     *     
     */
    public APConfirmPurchaseService getApConfirmPurchaseService() {
        return apConfirmPurchaseService;
    }

    /**
     * Define el valor de la propiedad apConfirmPurchaseService.
     * 
     * @param value
     *     allowed object is
     *     {@link APConfirmPurchaseService }
     *     
     */
    public void setApConfirmPurchaseService(APConfirmPurchaseService value) {
        this.apConfirmPurchaseService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalGetTxnDetailsService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalGetTxnDetailsService }
     *     
     */
    public PayPalGetTxnDetailsService getPayPalGetTxnDetailsService() {
        return payPalGetTxnDetailsService;
    }

    /**
     * Define el valor de la propiedad payPalGetTxnDetailsService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalGetTxnDetailsService }
     *     
     */
    public void setPayPalGetTxnDetailsService(PayPalGetTxnDetailsService value) {
        this.payPalGetTxnDetailsService = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalTransactionSearchService.
     * 
     * @return
     *     possible object is
     *     {@link PayPalTransactionSearchService }
     *     
     */
    public PayPalTransactionSearchService getPayPalTransactionSearchService() {
        return payPalTransactionSearchService;
    }

    /**
     * Define el valor de la propiedad payPalTransactionSearchService.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalTransactionSearchService }
     *     
     */
    public void setPayPalTransactionSearchService(PayPalTransactionSearchService value) {
        this.payPalTransactionSearchService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccDCCUpdateService.
     * 
     * @return
     *     possible object is
     *     {@link CCDCCUpdateService }
     *     
     */
    public CCDCCUpdateService getCcDCCUpdateService() {
        return ccDCCUpdateService;
    }

    /**
     * Define el valor de la propiedad ccDCCUpdateService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDCCUpdateService }
     *     
     */
    public void setCcDCCUpdateService(CCDCCUpdateService value) {
        this.ccDCCUpdateService = value;
    }

    /**
     * Obtiene el valor de la propiedad emvRequest.
     * 
     * @return
     *     possible object is
     *     {@link EmvRequest }
     *     
     */
    public EmvRequest getEmvRequest() {
        return emvRequest;
    }

    /**
     * Define el valor de la propiedad emvRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmvRequest }
     *     
     */
    public void setEmvRequest(EmvRequest value) {
        this.emvRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad merchant.
     * 
     * @return
     *     possible object is
     *     {@link Merchant }
     *     
     */
    public Merchant getMerchant() {
        return merchant;
    }

    /**
     * Define el valor de la propiedad merchant.
     * 
     * @param value
     *     allowed object is
     *     {@link Merchant }
     *     
     */
    public void setMerchant(Merchant value) {
        this.merchant = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantTransactionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTransactionIdentifier() {
        return merchantTransactionIdentifier;
    }

    /**
     * Define el valor de la propiedad merchantTransactionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTransactionIdentifier(String value) {
        this.merchantTransactionIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad hostedDataCreateService.
     * 
     * @return
     *     possible object is
     *     {@link HostedDataCreateService }
     *     
     */
    public HostedDataCreateService getHostedDataCreateService() {
        return hostedDataCreateService;
    }

    /**
     * Define el valor de la propiedad hostedDataCreateService.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedDataCreateService }
     *     
     */
    public void setHostedDataCreateService(HostedDataCreateService value) {
        this.hostedDataCreateService = value;
    }

    /**
     * Obtiene el valor de la propiedad hostedDataRetrieveService.
     * 
     * @return
     *     possible object is
     *     {@link HostedDataRetrieveService }
     *     
     */
    public HostedDataRetrieveService getHostedDataRetrieveService() {
        return hostedDataRetrieveService;
    }

    /**
     * Define el valor de la propiedad hostedDataRetrieveService.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedDataRetrieveService }
     *     
     */
    public void setHostedDataRetrieveService(HostedDataRetrieveService value) {
        this.hostedDataRetrieveService = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Define el valor de la propiedad merchantCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryCode(String value) {
        this.merchantCategoryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantCategoryCodeDomestic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryCodeDomestic() {
        return merchantCategoryCodeDomestic;
    }

    /**
     * Define el valor de la propiedad merchantCategoryCodeDomestic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryCodeDomestic(String value) {
        this.merchantCategoryCodeDomestic = value;
    }

    /**
     * Obtiene el valor de la propiedad salesSlipNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesSlipNumber() {
        return salesSlipNumber;
    }

    /**
     * Define el valor de la propiedad salesSlipNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesSlipNumber(String value) {
        this.salesSlipNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad merchandiseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseCode() {
        return merchandiseCode;
    }

    /**
     * Define el valor de la propiedad merchandiseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseCode(String value) {
        this.merchandiseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad merchandiseDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseDescription() {
        return merchandiseDescription;
    }

    /**
     * Define el valor de la propiedad merchandiseDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseDescription(String value) {
        this.merchandiseDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentInitiationChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInitiationChannel() {
        return paymentInitiationChannel;
    }

    /**
     * Define el valor de la propiedad paymentInitiationChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInitiationChannel(String value) {
        this.paymentInitiationChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad extendedCreditTotalCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedCreditTotalCount() {
        return extendedCreditTotalCount;
    }

    /**
     * Define el valor de la propiedad extendedCreditTotalCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedCreditTotalCount(String value) {
        this.extendedCreditTotalCount = value;
    }

    /**
     * Obtiene el valor de la propiedad authIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthIndicator() {
        return authIndicator;
    }

    /**
     * Define el valor de la propiedad authIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthIndicator(String value) {
        this.authIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentNetworkToken.
     * 
     * @return
     *     possible object is
     *     {@link PaymentNetworkToken }
     *     
     */
    public PaymentNetworkToken getPaymentNetworkToken() {
        return paymentNetworkToken;
    }

    /**
     * Define el valor de la propiedad paymentNetworkToken.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentNetworkToken }
     *     
     */
    public void setPaymentNetworkToken(PaymentNetworkToken value) {
        this.paymentNetworkToken = value;
    }

    /**
     * Obtiene el valor de la propiedad recipient.
     * 
     * @return
     *     possible object is
     *     {@link Recipient }
     *     
     */
    public Recipient getRecipient() {
        return recipient;
    }

    /**
     * Define el valor de la propiedad recipient.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient }
     *     
     */
    public void setRecipient(Recipient value) {
        this.recipient = value;
    }

    /**
     * Obtiene el valor de la propiedad sender.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Define el valor de la propiedad sender.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Obtiene el valor de la propiedad autoRentalData.
     * 
     * @return
     *     possible object is
     *     {@link AutoRentalData }
     *     
     */
    public AutoRentalData getAutoRentalData() {
        return autoRentalData;
    }

    /**
     * Define el valor de la propiedad autoRentalData.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoRentalData }
     *     
     */
    public void setAutoRentalData(AutoRentalData value) {
        this.autoRentalData = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentSolution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSolution() {
        return paymentSolution;
    }

    /**
     * Define el valor de la propiedad paymentSolution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSolution(String value) {
        this.paymentSolution = value;
    }

    /**
     * Obtiene el valor de la propiedad vc.
     * 
     * @return
     *     possible object is
     *     {@link VC }
     *     
     */
    public VC getVc() {
        return vc;
    }

    /**
     * Define el valor de la propiedad vc.
     * 
     * @param value
     *     allowed object is
     *     {@link VC }
     *     
     */
    public void setVc(VC value) {
        this.vc = value;
    }

    /**
     * Obtiene el valor de la propiedad decryptVisaCheckoutDataService.
     * 
     * @return
     *     possible object is
     *     {@link DecryptVisaCheckoutDataService }
     *     
     */
    public DecryptVisaCheckoutDataService getDecryptVisaCheckoutDataService() {
        return decryptVisaCheckoutDataService;
    }

    /**
     * Define el valor de la propiedad decryptVisaCheckoutDataService.
     * 
     * @param value
     *     allowed object is
     *     {@link DecryptVisaCheckoutDataService }
     *     
     */
    public void setDecryptVisaCheckoutDataService(DecryptVisaCheckoutDataService value) {
        this.decryptVisaCheckoutDataService = value;
    }

    /**
     * Obtiene el valor de la propiedad taxManagementIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxManagementIndicator() {
        return taxManagementIndicator;
    }

    /**
     * Define el valor de la propiedad taxManagementIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxManagementIndicator(String value) {
        this.taxManagementIndicator = value;
    }

    /**
     * Gets the value of the promotionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionGroup }
     * 
     * 
     */
    public List<PromotionGroup> getPromotionGroup() {
        if (promotionGroup == null) {
            promotionGroup = new ArrayList<PromotionGroup>();
        }
        return this.promotionGroup;
    }

    /**
     * Obtiene el valor de la propiedad wallet.
     * 
     * @return
     *     possible object is
     *     {@link Wallet }
     *     
     */
    public Wallet getWallet() {
        return wallet;
    }

    /**
     * Define el valor de la propiedad wallet.
     * 
     * @param value
     *     allowed object is
     *     {@link Wallet }
     *     
     */
    public void setWallet(Wallet value) {
        this.wallet = value;
    }

    /**
     * Obtiene el valor de la propiedad aft.
     * 
     * @return
     *     possible object is
     *     {@link Aft }
     *     
     */
    public Aft getAft() {
        return aft;
    }

    /**
     * Define el valor de la propiedad aft.
     * 
     * @param value
     *     allowed object is
     *     {@link Aft }
     *     
     */
    public void setAft(Aft value) {
        this.aft = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceInquiry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceInquiry() {
        return balanceInquiry;
    }

    /**
     * Define el valor de la propiedad balanceInquiry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceInquiry(String value) {
        this.balanceInquiry = value;
    }

    /**
     * Obtiene el valor de la propiedad prenoteTransaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenoteTransaction() {
        return prenoteTransaction;
    }

    /**
     * Define el valor de la propiedad prenoteTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenoteTransaction(String value) {
        this.prenoteTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad encryptPaymentDataService.
     * 
     * @return
     *     possible object is
     *     {@link EncryptPaymentDataService }
     *     
     */
    public EncryptPaymentDataService getEncryptPaymentDataService() {
        return encryptPaymentDataService;
    }

    /**
     * Define el valor de la propiedad encryptPaymentDataService.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptPaymentDataService }
     *     
     */
    public void setEncryptPaymentDataService(EncryptPaymentDataService value) {
        this.encryptPaymentDataService = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalNetDomesticData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalNetDomesticData() {
        return nationalNetDomesticData;
    }

    /**
     * Define el valor de la propiedad nationalNetDomesticData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalNetDomesticData(String value) {
        this.nationalNetDomesticData = value;
    }

    /**
     * Obtiene el valor de la propiedad subsequentAuth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuth() {
        return subsequentAuth;
    }

    /**
     * Define el valor de la propiedad subsequentAuth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuth(String value) {
        this.subsequentAuth = value;
    }

    /**
     * Obtiene el valor de la propiedad subsequentAuthOriginalAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthOriginalAmount() {
        return subsequentAuthOriginalAmount;
    }

    /**
     * Define el valor de la propiedad subsequentAuthOriginalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthOriginalAmount(String value) {
        this.subsequentAuthOriginalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad binLookupService.
     * 
     * @return
     *     possible object is
     *     {@link BinLookupService }
     *     
     */
    public BinLookupService getBinLookupService() {
        return binLookupService;
    }

    /**
     * Define el valor de la propiedad binLookupService.
     * 
     * @param value
     *     allowed object is
     *     {@link BinLookupService }
     *     
     */
    public void setBinLookupService(BinLookupService value) {
        this.binLookupService = value;
    }

    /**
     * Obtiene el valor de la propiedad verificationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * Define el valor de la propiedad verificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationCode(String value) {
        this.verificationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad mobileNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Define el valor de la propiedad mobileNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad issuer.
     * 
     * @return
     *     possible object is
     *     {@link Issuer }
     *     
     */
    public Issuer getIssuer() {
        return issuer;
    }

    /**
     * Define el valor de la propiedad issuer.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuer }
     *     
     */
    public void setIssuer(Issuer value) {
        this.issuer = value;
    }

    /**
     * Obtiene el valor de la propiedad partnerSolutionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSolutionID() {
        return partnerSolutionID;
    }

    /**
     * Define el valor de la propiedad partnerSolutionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSolutionID(String value) {
        this.partnerSolutionID = value;
    }

    /**
     * Obtiene el valor de la propiedad developerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperID() {
        return developerID;
    }

    /**
     * Define el valor de la propiedad developerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperID(String value) {
        this.developerID = value;
    }

    /**
     * Obtiene el valor de la propiedad getVisaCheckoutDataService.
     * 
     * @return
     *     possible object is
     *     {@link GETVisaCheckoutDataService }
     *     
     */
    public GETVisaCheckoutDataService getGetVisaCheckoutDataService() {
        return getVisaCheckoutDataService;
    }

    /**
     * Define el valor de la propiedad getVisaCheckoutDataService.
     * 
     * @param value
     *     allowed object is
     *     {@link GETVisaCheckoutDataService }
     *     
     */
    public void setGetVisaCheckoutDataService(GETVisaCheckoutDataService value) {
        this.getVisaCheckoutDataService = value;
    }

    /**
     * Obtiene el valor de la propiedad customerSignatureImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSignatureImage() {
        return customerSignatureImage;
    }

    /**
     * Define el valor de la propiedad customerSignatureImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSignatureImage(String value) {
        this.customerSignatureImage = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionMetadataService.
     * 
     * @return
     *     possible object is
     *     {@link TransactionMetadataService }
     *     
     */
    public TransactionMetadataService getTransactionMetadataService() {
        return transactionMetadataService;
    }

    /**
     * Define el valor de la propiedad transactionMetadataService.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionMetadataService }
     *     
     */
    public void setTransactionMetadataService(TransactionMetadataService value) {
        this.transactionMetadataService = value;
    }

    /**
     * Obtiene el valor de la propiedad subsequentAuthFirst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthFirst() {
        return subsequentAuthFirst;
    }

    /**
     * Define el valor de la propiedad subsequentAuthFirst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthFirst(String value) {
        this.subsequentAuthFirst = value;
    }

    /**
     * Obtiene el valor de la propiedad subsequentAuthReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthReason() {
        return subsequentAuthReason;
    }

    /**
     * Define el valor de la propiedad subsequentAuthReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthReason(String value) {
        this.subsequentAuthReason = value;
    }

    /**
     * Obtiene el valor de la propiedad subsequentAuthTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthTransactionID() {
        return subsequentAuthTransactionID;
    }

    /**
     * Define el valor de la propiedad subsequentAuthTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthTransactionID(String value) {
        this.subsequentAuthTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad subsequentAuthStoredCredential.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentAuthStoredCredential() {
        return subsequentAuthStoredCredential;
    }

    /**
     * Define el valor de la propiedad subsequentAuthStoredCredential.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentAuthStoredCredential(String value) {
        this.subsequentAuthStoredCredential = value;
    }

    /**
     * Obtiene el valor de la propiedad loan.
     * 
     * @return
     *     possible object is
     *     {@link Loan }
     *     
     */
    public Loan getLoan() {
        return loan;
    }

    /**
     * Define el valor de la propiedad loan.
     * 
     * @param value
     *     allowed object is
     *     {@link Loan }
     *     
     */
    public void setLoan(Loan value) {
        this.loan = value;
    }

    /**
     * Obtiene el valor de la propiedad eligibilityInquiry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityInquiry() {
        return eligibilityInquiry;
    }

    /**
     * Define el valor de la propiedad eligibilityInquiry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityInquiry(String value) {
        this.eligibilityInquiry = value;
    }

    /**
     * Obtiene el valor de la propiedad redemptionInquiry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionInquiry() {
        return redemptionInquiry;
    }

    /**
     * Define el valor de la propiedad redemptionInquiry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionInquiry(String value) {
        this.redemptionInquiry = value;
    }

    /**
     * Obtiene el valor de la propiedad feeProgramIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeProgramIndicator() {
        return feeProgramIndicator;
    }

    /**
     * Define el valor de la propiedad feeProgramIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeProgramIndicator(String value) {
        this.feeProgramIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad apOrderService.
     * 
     * @return
     *     possible object is
     *     {@link APOrderService }
     *     
     */
    public APOrderService getApOrderService() {
        return apOrderService;
    }

    /**
     * Define el valor de la propiedad apOrderService.
     * 
     * @param value
     *     allowed object is
     *     {@link APOrderService }
     *     
     */
    public void setApOrderService(APOrderService value) {
        this.apOrderService = value;
    }

    /**
     * Obtiene el valor de la propiedad apCancelService.
     * 
     * @return
     *     possible object is
     *     {@link APCancelService }
     *     
     */
    public APCancelService getApCancelService() {
        return apCancelService;
    }

    /**
     * Define el valor de la propiedad apCancelService.
     * 
     * @param value
     *     allowed object is
     *     {@link APCancelService }
     *     
     */
    public void setApCancelService(APCancelService value) {
        this.apCancelService = value;
    }

    /**
     * Obtiene el valor de la propiedad apBillingAgreementService.
     * 
     * @return
     *     possible object is
     *     {@link APBillingAgreementService }
     *     
     */
    public APBillingAgreementService getApBillingAgreementService() {
        return apBillingAgreementService;
    }

    /**
     * Define el valor de la propiedad apBillingAgreementService.
     * 
     * @param value
     *     allowed object is
     *     {@link APBillingAgreementService }
     *     
     */
    public void setApBillingAgreementService(APBillingAgreementService value) {
        this.apBillingAgreementService = value;
    }

    /**
     * Obtiene el valor de la propiedad noteToPayee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToPayee() {
        return noteToPayee;
    }

    /**
     * Define el valor de la propiedad noteToPayee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToPayee(String value) {
        this.noteToPayee = value;
    }

    /**
     * Obtiene el valor de la propiedad noteToPayer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToPayer() {
        return noteToPayer;
    }

    /**
     * Define el valor de la propiedad noteToPayer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToPayer(String value) {
        this.noteToPayer = value;
    }

    /**
     * Obtiene el valor de la propiedad clientMetadataID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientMetadataID() {
        return clientMetadataID;
    }

    /**
     * Define el valor de la propiedad clientMetadataID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientMetadataID(String value) {
        this.clientMetadataID = value;
    }

    /**
     * Obtiene el valor de la propiedad partnerSDKversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSDKversion() {
        return partnerSDKversion;
    }

    /**
     * Define el valor de la propiedad partnerSDKversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSDKversion(String value) {
        this.partnerSDKversion = value;
    }

    /**
     * Obtiene el valor de la propiedad partnerOriginalTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerOriginalTransactionID() {
        return partnerOriginalTransactionID;
    }

    /**
     * Define el valor de la propiedad partnerOriginalTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerOriginalTransactionID(String value) {
        this.partnerOriginalTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad cardTypeSelectionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeSelectionIndicator() {
        return cardTypeSelectionIndicator;
    }

    /**
     * Define el valor de la propiedad cardTypeSelectionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeSelectionIndicator(String value) {
        this.cardTypeSelectionIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad apCreateMandateService.
     * 
     * @return
     *     possible object is
     *     {@link APCreateMandateService }
     *     
     */
    public APCreateMandateService getApCreateMandateService() {
        return apCreateMandateService;
    }

    /**
     * Define el valor de la propiedad apCreateMandateService.
     * 
     * @param value
     *     allowed object is
     *     {@link APCreateMandateService }
     *     
     */
    public void setApCreateMandateService(APCreateMandateService value) {
        this.apCreateMandateService = value;
    }

    /**
     * Obtiene el valor de la propiedad apMandateStatusService.
     * 
     * @return
     *     possible object is
     *     {@link APMandateStatusService }
     *     
     */
    public APMandateStatusService getApMandateStatusService() {
        return apMandateStatusService;
    }

    /**
     * Define el valor de la propiedad apMandateStatusService.
     * 
     * @param value
     *     allowed object is
     *     {@link APMandateStatusService }
     *     
     */
    public void setApMandateStatusService(APMandateStatusService value) {
        this.apMandateStatusService = value;
    }

    /**
     * Obtiene el valor de la propiedad apUpdateMandateService.
     * 
     * @return
     *     possible object is
     *     {@link APUpdateMandateService }
     *     
     */
    public APUpdateMandateService getApUpdateMandateService() {
        return apUpdateMandateService;
    }

    /**
     * Define el valor de la propiedad apUpdateMandateService.
     * 
     * @param value
     *     allowed object is
     *     {@link APUpdateMandateService }
     *     
     */
    public void setApUpdateMandateService(APUpdateMandateService value) {
        this.apUpdateMandateService = value;
    }

    /**
     * Obtiene el valor de la propiedad apImportMandateService.
     * 
     * @return
     *     possible object is
     *     {@link APImportMandateService }
     *     
     */
    public APImportMandateService getApImportMandateService() {
        return apImportMandateService;
    }

    /**
     * Define el valor de la propiedad apImportMandateService.
     * 
     * @param value
     *     allowed object is
     *     {@link APImportMandateService }
     *     
     */
    public void setApImportMandateService(APImportMandateService value) {
        this.apImportMandateService = value;
    }

    /**
     * Obtiene el valor de la propiedad apRevokeMandateService.
     * 
     * @return
     *     possible object is
     *     {@link APRevokeMandateService }
     *     
     */
    public APRevokeMandateService getApRevokeMandateService() {
        return apRevokeMandateService;
    }

    /**
     * Define el valor de la propiedad apRevokeMandateService.
     * 
     * @param value
     *     allowed object is
     *     {@link APRevokeMandateService }
     *     
     */
    public void setApRevokeMandateService(APRevokeMandateService value) {
        this.apRevokeMandateService = value;
    }

    /**
     * Obtiene el valor de la propiedad billPaymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPaymentType() {
        return billPaymentType;
    }

    /**
     * Define el valor de la propiedad billPaymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPaymentType(String value) {
        this.billPaymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad postdatedTransaction.
     * 
     * @return
     *     possible object is
     *     {@link PostdatedTransaction }
     *     
     */
    public PostdatedTransaction getPostdatedTransaction() {
        return postdatedTransaction;
    }

    /**
     * Define el valor de la propiedad postdatedTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link PostdatedTransaction }
     *     
     */
    public void setPostdatedTransaction(PostdatedTransaction value) {
        this.postdatedTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad getMasterpassDataService.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterpassDataService }
     *     
     */
    public GetMasterpassDataService getGetMasterpassDataService() {
        return getMasterpassDataService;
    }

    /**
     * Define el valor de la propiedad getMasterpassDataService.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterpassDataService }
     *     
     */
    public void setGetMasterpassDataService(GetMasterpassDataService value) {
        this.getMasterpassDataService = value;
    }

    /**
     * Obtiene el valor de la propiedad ccCheckStatusService.
     * 
     * @return
     *     possible object is
     *     {@link CCCheckStatusService }
     *     
     */
    public CCCheckStatusService getCcCheckStatusService() {
        return ccCheckStatusService;
    }

    /**
     * Define el valor de la propiedad ccCheckStatusService.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCheckStatusService }
     *     
     */
    public void setCcCheckStatusService(CCCheckStatusService value) {
        this.ccCheckStatusService = value;
    }

    /**
     * Obtiene el valor de la propiedad mpos.
     * 
     * @return
     *     possible object is
     *     {@link MPOS }
     *     
     */
    public MPOS getMPOS() {
        return mpos;
    }

    /**
     * Define el valor de la propiedad mpos.
     * 
     * @param value
     *     allowed object is
     *     {@link MPOS }
     *     
     */
    public void setMPOS(MPOS value) {
        this.mpos = value;
    }

    /**
     * Obtiene el valor de la propiedad abortService.
     * 
     * @return
     *     possible object is
     *     {@link AbortService }
     *     
     */
    public AbortService getAbortService() {
        return abortService;
    }

    /**
     * Define el valor de la propiedad abortService.
     * 
     * @param value
     *     allowed object is
     *     {@link AbortService }
     *     
     */
    public void setAbortService(AbortService value) {
        this.abortService = value;
    }

}

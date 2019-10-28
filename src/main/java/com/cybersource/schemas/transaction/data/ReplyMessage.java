
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReplyMessage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReplyMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="decision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="missingField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="1000" minOccurs="0"/>
 *         &lt;element name="invalidField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="1000" minOccurs="0"/>
 *         &lt;element name="requestToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseTotals" type="{urn:schemas-cybersource-com:transaction-data-1.159}PurchaseTotals" minOccurs="0"/>
 *         &lt;element name="deniedPartiesMatch" type="{urn:schemas-cybersource-com:transaction-data-1.159}DeniedPartiesMatch" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="ccAuthReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCAuthReply" minOccurs="0"/>
 *         &lt;element name="octReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}OCTReply" minOccurs="0"/>
 *         &lt;element name="verificationReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}VerificationReply" minOccurs="0"/>
 *         &lt;element name="ccSaleReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCSaleReply" minOccurs="0"/>
 *         &lt;element name="ccSaleCreditReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCSaleCreditReply" minOccurs="0"/>
 *         &lt;element name="ccSaleReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCSaleReversalReply" minOccurs="0"/>
 *         &lt;element name="ccIncrementalAuthReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCIncrementalAuthReply" minOccurs="0"/>
 *         &lt;element name="serviceFeeCalculateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}ServiceFeeCalculateReply" minOccurs="0"/>
 *         &lt;element name="ccCaptureReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCCaptureReply" minOccurs="0"/>
 *         &lt;element name="ccCreditReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCCreditReply" minOccurs="0"/>
 *         &lt;element name="ccAuthReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCAuthReversalReply" minOccurs="0"/>
 *         &lt;element name="ccAutoAuthReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCAutoAuthReversalReply" minOccurs="0"/>
 *         &lt;element name="ccDCCReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCDCCReply" minOccurs="0"/>
 *         &lt;element name="ccDCCUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCDCCUpdateReply" minOccurs="0"/>
 *         &lt;element name="ecDebitReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}ECDebitReply" minOccurs="0"/>
 *         &lt;element name="ecCreditReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}ECCreditReply" minOccurs="0"/>
 *         &lt;element name="ecAuthenticateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}ECAuthenticateReply" minOccurs="0"/>
 *         &lt;element name="payerAuthEnrollReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayerAuthEnrollReply" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayerAuthValidateReply" minOccurs="0"/>
 *         &lt;element name="taxReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}TaxReply" minOccurs="0"/>
 *         &lt;element name="encryptedPayment" type="{urn:schemas-cybersource-com:transaction-data-1.159}EncryptedPayment" minOccurs="0"/>
 *         &lt;element name="encryptPaymentDataReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}EncryptPaymentDataReply" minOccurs="0"/>
 *         &lt;element name="dmeReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}DMEReply" minOccurs="0"/>
 *         &lt;element name="afsReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}AFSReply" minOccurs="0"/>
 *         &lt;element name="davReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}DAVReply" minOccurs="0"/>
 *         &lt;element name="exportReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}ExportReply" minOccurs="0"/>
 *         &lt;element name="fxRatesReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}FXRatesReply" minOccurs="0"/>
 *         &lt;element name="bankTransferReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}BankTransferReply" minOccurs="0"/>
 *         &lt;element name="bankTransferRefundReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}BankTransferRefundReply" minOccurs="0"/>
 *         &lt;element name="bankTransferRealTimeReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}BankTransferRealTimeReply" minOccurs="0"/>
 *         &lt;element name="directDebitMandateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}DirectDebitMandateReply" minOccurs="0"/>
 *         &lt;element name="directDebitReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}DirectDebitReply" minOccurs="0"/>
 *         &lt;element name="directDebitValidateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}DirectDebitValidateReply" minOccurs="0"/>
 *         &lt;element name="directDebitRefundReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}DirectDebitRefundReply" minOccurs="0"/>
 *         &lt;element name="paySubscriptionCreateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionCreateReply" minOccurs="0"/>
 *         &lt;element name="paySubscriptionUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionUpdateReply" minOccurs="0"/>
 *         &lt;element name="paySubscriptionEventUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionEventUpdateReply" minOccurs="0"/>
 *         &lt;element name="paySubscriptionRetrieveReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionRetrieveReply" minOccurs="0"/>
 *         &lt;element name="paySubscriptionDeleteReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaySubscriptionDeleteReply" minOccurs="0"/>
 *         &lt;element name="payPalPaymentReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalPaymentReply" minOccurs="0"/>
 *         &lt;element name="payPalCreditReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalCreditReply" minOccurs="0"/>
 *         &lt;element name="voidReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}VoidReply" minOccurs="0"/>
 *         &lt;element name="pinlessDebitReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinlessDebitReply" minOccurs="0"/>
 *         &lt;element name="pinlessDebitValidateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinlessDebitValidateReply" minOccurs="0"/>
 *         &lt;element name="pinlessDebitReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinlessDebitReversalReply" minOccurs="0"/>
 *         &lt;element name="payPalButtonCreateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalButtonCreateReply" minOccurs="0"/>
 *         &lt;element name="payPalPreapprovedPaymentReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalPreapprovedPaymentReply" minOccurs="0"/>
 *         &lt;element name="payPalPreapprovedUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalPreapprovedUpdateReply" minOccurs="0"/>
 *         &lt;element name="riskUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}RiskUpdateReply" minOccurs="0"/>
 *         &lt;element name="fraudUpdateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}FraudUpdateReply" minOccurs="0"/>
 *         &lt;element name="caseManagementActionReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CaseManagementActionReply" minOccurs="0"/>
 *         &lt;element name="decisionReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}DecisionReply" minOccurs="0"/>
 *         &lt;element name="payPalRefundReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalRefundReply" minOccurs="0"/>
 *         &lt;element name="payPalAuthReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalAuthReversalReply" minOccurs="0"/>
 *         &lt;element name="payPalDoCaptureReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalDoCaptureReply" minOccurs="0"/>
 *         &lt;element name="payPalEcDoPaymentReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalEcDoPaymentReply" minOccurs="0"/>
 *         &lt;element name="payPalEcGetDetailsReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalEcGetDetailsReply" minOccurs="0"/>
 *         &lt;element name="payPalEcSetReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalEcSetReply" minOccurs="0"/>
 *         &lt;element name="payPalAuthorizationReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalAuthorizationReply" minOccurs="0"/>
 *         &lt;element name="payPalEcOrderSetupReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalEcOrderSetupReply" minOccurs="0"/>
 *         &lt;element name="payPalUpdateAgreementReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalUpdateAgreementReply" minOccurs="0"/>
 *         &lt;element name="payPalCreateAgreementReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalCreateAgreementReply" minOccurs="0"/>
 *         &lt;element name="payPalDoRefTransactionReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalDoRefTransactionReply" minOccurs="0"/>
 *         &lt;element name="chinaPaymentReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}ChinaPaymentReply" minOccurs="0"/>
 *         &lt;element name="chinaRefundReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}ChinaRefundReply" minOccurs="0"/>
 *         &lt;element name="boletoPaymentReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}BoletoPaymentReply" minOccurs="0"/>
 *         &lt;element name="pinDebitPurchaseReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinDebitPurchaseReply" minOccurs="0"/>
 *         &lt;element name="pinDebitCreditReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinDebitCreditReply" minOccurs="0"/>
 *         &lt;element name="pinDebitReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PinDebitReversalReply" minOccurs="0"/>
 *         &lt;element name="apInitiateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APInitiateReply" minOccurs="0"/>
 *         &lt;element name="apCheckStatusReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APCheckStatusReply" minOccurs="0"/>
 *         &lt;element name="receiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solutionProviderTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APReply" minOccurs="0"/>
 *         &lt;element name="shipTo" type="{urn:schemas-cybersource-com:transaction-data-1.159}ShipTo" minOccurs="0"/>
 *         &lt;element name="billTo" type="{urn:schemas-cybersource-com:transaction-data-1.159}BillTo" minOccurs="0"/>
 *         &lt;element name="apAuthReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APAuthReply" minOccurs="0"/>
 *         &lt;element name="apSessionsReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APSessionsReply" minOccurs="0"/>
 *         &lt;element name="apAuthReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APAuthReversalReply" minOccurs="0"/>
 *         &lt;element name="apCaptureReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APCaptureReply" minOccurs="0"/>
 *         &lt;element name="apOptionsReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APOptionsReply" minOccurs="0"/>
 *         &lt;element name="apRefundReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APRefundReply" minOccurs="0"/>
 *         &lt;element name="apSaleReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APSaleReply" minOccurs="0"/>
 *         &lt;element name="apCheckoutDetailsReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APCheckOutDetailsReply" minOccurs="0"/>
 *         &lt;element name="apTransactionDetailsReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APTransactionDetailsReply" minOccurs="0"/>
 *         &lt;element name="apConfirmPurchaseReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APConfirmPurchaseReply" minOccurs="0"/>
 *         &lt;element name="promotion" type="{urn:schemas-cybersource-com:transaction-data-1.159}Promotion" minOccurs="0"/>
 *         &lt;element name="promotionGroup" type="{urn:schemas-cybersource-com:transaction-data-1.159}PromotionGroupReply" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="payPalGetTxnDetailsReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalGetTxnDetailsReply" minOccurs="0"/>
 *         &lt;element name="payPalTransactionSearchReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}PayPalTransactionSearchReply" minOccurs="0"/>
 *         &lt;element name="emvReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}EmvReply" minOccurs="0"/>
 *         &lt;element name="originalTransaction" type="{urn:schemas-cybersource-com:transaction-data-1.159}OriginalTransaction" minOccurs="0"/>
 *         &lt;element name="hostedDataCreateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}HostedDataCreateReply" minOccurs="0"/>
 *         &lt;element name="hostedDataRetrieveReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}HostedDataRetrieveReply" minOccurs="0"/>
 *         &lt;element name="salesSlipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalProcessorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jpo" type="{urn:schemas-cybersource-com:transaction-data-1.159}JPO" minOccurs="0"/>
 *         &lt;element name="card" type="{urn:schemas-cybersource-com:transaction-data-1.159}Card" minOccurs="0"/>
 *         &lt;element name="paymentNetworkToken" type="{urn:schemas-cybersource-com:transaction-data-1.159}PaymentNetworkToken" minOccurs="0"/>
 *         &lt;element name="vcReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}VCReply" minOccurs="0"/>
 *         &lt;element name="decryptVisaCheckoutDataReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}DecryptVisaCheckoutDataReply" minOccurs="0"/>
 *         &lt;element name="getVisaCheckoutDataReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}GetVisaCheckoutDataReply" minOccurs="0"/>
 *         &lt;element name="binLookupReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}BinLookupReply" minOccurs="0"/>
 *         &lt;element name="issuerMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token" type="{urn:schemas-cybersource-com:transaction-data-1.159}Token" minOccurs="0"/>
 *         &lt;element name="issuer" type="{urn:schemas-cybersource-com:transaction-data-1.159}issuer" minOccurs="0"/>
 *         &lt;element name="recipient" type="{urn:schemas-cybersource-com:transaction-data-1.159}Recipient" minOccurs="0"/>
 *         &lt;element name="feeProgramIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installment" type="{urn:schemas-cybersource-com:transaction-data-1.159}Installment" minOccurs="0"/>
 *         &lt;element name="paymentAccountReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ucaf" type="{urn:schemas-cybersource-com:transaction-data-1.159}UCAF" minOccurs="0"/>
 *         &lt;element name="network" type="{urn:schemas-cybersource-com:transaction-data-1.159}Network" maxOccurs="100" minOccurs="0"/>
 *         &lt;element name="invoiceHeader" type="{urn:schemas-cybersource-com:transaction-data-1.159}InvoiceHeader" minOccurs="0"/>
 *         &lt;element name="apOrderReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APOrderReply" minOccurs="0"/>
 *         &lt;element name="apCancelReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APCancelReply" minOccurs="0"/>
 *         &lt;element name="apBillingAgreementReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APBillingAgreementReply" minOccurs="0"/>
 *         &lt;element name="customerVerificationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalID" type="{urn:schemas-cybersource-com:transaction-data-1.159}PersonalID" minOccurs="0"/>
 *         &lt;element name="acquirerMerchantNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pos" type="{urn:schemas-cybersource-com:transaction-data-1.159}Pos" minOccurs="0"/>
 *         &lt;element name="issuerMessageAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routing" type="{urn:schemas-cybersource-com:transaction-data-1.159}Routing" minOccurs="0"/>
 *         &lt;element name="transactionLocalDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *         &lt;element name="apCreateMandateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APCreateMandateReply" minOccurs="0"/>
 *         &lt;element name="apMandateStatusReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APMandateStatusReply" minOccurs="0"/>
 *         &lt;element name="apUpdateMandateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APUpdateMandateReply" minOccurs="0"/>
 *         &lt;element name="apImportMandateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APImportMandateReply" minOccurs="0"/>
 *         &lt;element name="apRevokeMandateReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}APRevokeMandateReply" minOccurs="0"/>
 *         &lt;element name="getMasterpassDataReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}GetMasterpassDataReply" minOccurs="0"/>
 *         &lt;element name="paymentNetworkMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wallet" type="{urn:schemas-cybersource-com:transaction-data-1.159}Wallet" minOccurs="0"/>
 *         &lt;element name="cashbackAmount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="giftCard" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCard" minOccurs="0"/>
 *         &lt;element name="giftCardActivationReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCardActivationReply" minOccurs="0"/>
 *         &lt;element name="giftCardBalanceInquiryReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCardBalanceInquiryReply" minOccurs="0"/>
 *         &lt;element name="giftCardRedemptionReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCardRedemptionReply" minOccurs="0"/>
 *         &lt;element name="giftCardVoidReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCardVoidReply" minOccurs="0"/>
 *         &lt;element name="giftCardReversalReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}GiftCardReversalReply" minOccurs="0"/>
 *         &lt;element name="ccCheckStatusReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}CCCheckStatusReply" minOccurs="0"/>
 *         &lt;element name="ecAVSReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}ECAVSReply" minOccurs="0"/>
 *         &lt;element name="abortReply" type="{urn:schemas-cybersource-com:transaction-data-1.159}AbortReply" minOccurs="0"/>
 *         &lt;element name="reserved" type="{urn:schemas-cybersource-com:transaction-data-1.159}ReplyReserved" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyMessage", propOrder = {
    "merchantReferenceCode",
    "requestID",
    "decision",
    "reasonCode",
    "missingField",
    "invalidField",
    "requestToken",
    "purchaseTotals",
    "deniedPartiesMatch",
    "ccAuthReply",
    "octReply",
    "verificationReply",
    "ccSaleReply",
    "ccSaleCreditReply",
    "ccSaleReversalReply",
    "ccIncrementalAuthReply",
    "serviceFeeCalculateReply",
    "ccCaptureReply",
    "ccCreditReply",
    "ccAuthReversalReply",
    "ccAutoAuthReversalReply",
    "ccDCCReply",
    "ccDCCUpdateReply",
    "ecDebitReply",
    "ecCreditReply",
    "ecAuthenticateReply",
    "payerAuthEnrollReply",
    "payerAuthValidateReply",
    "taxReply",
    "encryptedPayment",
    "encryptPaymentDataReply",
    "dmeReply",
    "afsReply",
    "davReply",
    "exportReply",
    "fxRatesReply",
    "bankTransferReply",
    "bankTransferRefundReply",
    "bankTransferRealTimeReply",
    "directDebitMandateReply",
    "directDebitReply",
    "directDebitValidateReply",
    "directDebitRefundReply",
    "paySubscriptionCreateReply",
    "paySubscriptionUpdateReply",
    "paySubscriptionEventUpdateReply",
    "paySubscriptionRetrieveReply",
    "paySubscriptionDeleteReply",
    "payPalPaymentReply",
    "payPalCreditReply",
    "voidReply",
    "pinlessDebitReply",
    "pinlessDebitValidateReply",
    "pinlessDebitReversalReply",
    "payPalButtonCreateReply",
    "payPalPreapprovedPaymentReply",
    "payPalPreapprovedUpdateReply",
    "riskUpdateReply",
    "fraudUpdateReply",
    "caseManagementActionReply",
    "decisionReply",
    "payPalRefundReply",
    "payPalAuthReversalReply",
    "payPalDoCaptureReply",
    "payPalEcDoPaymentReply",
    "payPalEcGetDetailsReply",
    "payPalEcSetReply",
    "payPalAuthorizationReply",
    "payPalEcOrderSetupReply",
    "payPalUpdateAgreementReply",
    "payPalCreateAgreementReply",
    "payPalDoRefTransactionReply",
    "chinaPaymentReply",
    "chinaRefundReply",
    "boletoPaymentReply",
    "pinDebitPurchaseReply",
    "pinDebitCreditReply",
    "pinDebitReversalReply",
    "apInitiateReply",
    "apCheckStatusReply",
    "receiptNumber",
    "additionalData",
    "solutionProviderTransactionID",
    "apReply",
    "shipTo",
    "billTo",
    "apAuthReply",
    "apSessionsReply",
    "apAuthReversalReply",
    "apCaptureReply",
    "apOptionsReply",
    "apRefundReply",
    "apSaleReply",
    "apCheckoutDetailsReply",
    "apTransactionDetailsReply",
    "apConfirmPurchaseReply",
    "promotion",
    "promotionGroup",
    "payPalGetTxnDetailsReply",
    "payPalTransactionSearchReply",
    "emvReply",
    "originalTransaction",
    "hostedDataCreateReply",
    "hostedDataRetrieveReply",
    "salesSlipNumber",
    "additionalProcessorResponse",
    "jpo",
    "card",
    "paymentNetworkToken",
    "vcReply",
    "decryptVisaCheckoutDataReply",
    "getVisaCheckoutDataReply",
    "binLookupReply",
    "issuerMessage",
    "token",
    "issuer",
    "recipient",
    "feeProgramIndicator",
    "installment",
    "paymentAccountReference",
    "authIndicator",
    "ucaf",
    "network",
    "invoiceHeader",
    "apOrderReply",
    "apCancelReply",
    "apBillingAgreementReply",
    "customerVerificationStatus",
    "personalID",
    "acquirerMerchantNumber",
    "pos",
    "issuerMessageAction",
    "customerID",
    "routing",
    "transactionLocalDateTime",
    "apCreateMandateReply",
    "apMandateStatusReply",
    "apUpdateMandateReply",
    "apImportMandateReply",
    "apRevokeMandateReply",
    "getMasterpassDataReply",
    "paymentNetworkMerchantID",
    "wallet",
    "cashbackAmount",
    "giftCard",
    "giftCardActivationReply",
    "giftCardBalanceInquiryReply",
    "giftCardRedemptionReply",
    "giftCardVoidReply",
    "giftCardReversalReply",
    "ccCheckStatusReply",
    "ecAVSReply",
    "abortReply",
    "reserved"
})
public class ReplyMessage {

    protected String merchantReferenceCode;
    @XmlElement(required = true)
    protected String requestID;
    @XmlElement(required = true)
    protected String decision;
    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected List<String> missingField;
    protected List<String> invalidField;
    @XmlElement(required = true)
    protected String requestToken;
    protected PurchaseTotals purchaseTotals;
    protected List<DeniedPartiesMatch> deniedPartiesMatch;
    protected CCAuthReply ccAuthReply;
    protected OCTReply octReply;
    protected VerificationReply verificationReply;
    protected CCSaleReply ccSaleReply;
    protected CCSaleCreditReply ccSaleCreditReply;
    protected CCSaleReversalReply ccSaleReversalReply;
    protected CCIncrementalAuthReply ccIncrementalAuthReply;
    protected ServiceFeeCalculateReply serviceFeeCalculateReply;
    protected CCCaptureReply ccCaptureReply;
    protected CCCreditReply ccCreditReply;
    protected CCAuthReversalReply ccAuthReversalReply;
    protected CCAutoAuthReversalReply ccAutoAuthReversalReply;
    protected CCDCCReply ccDCCReply;
    protected CCDCCUpdateReply ccDCCUpdateReply;
    protected ECDebitReply ecDebitReply;
    protected ECCreditReply ecCreditReply;
    protected ECAuthenticateReply ecAuthenticateReply;
    protected PayerAuthEnrollReply payerAuthEnrollReply;
    protected PayerAuthValidateReply payerAuthValidateReply;
    protected TaxReply taxReply;
    protected EncryptedPayment encryptedPayment;
    protected EncryptPaymentDataReply encryptPaymentDataReply;
    protected DMEReply dmeReply;
    protected AFSReply afsReply;
    protected DAVReply davReply;
    protected ExportReply exportReply;
    protected FXRatesReply fxRatesReply;
    protected BankTransferReply bankTransferReply;
    protected BankTransferRefundReply bankTransferRefundReply;
    protected BankTransferRealTimeReply bankTransferRealTimeReply;
    protected DirectDebitMandateReply directDebitMandateReply;
    protected DirectDebitReply directDebitReply;
    protected DirectDebitValidateReply directDebitValidateReply;
    protected DirectDebitRefundReply directDebitRefundReply;
    protected PaySubscriptionCreateReply paySubscriptionCreateReply;
    protected PaySubscriptionUpdateReply paySubscriptionUpdateReply;
    protected PaySubscriptionEventUpdateReply paySubscriptionEventUpdateReply;
    protected PaySubscriptionRetrieveReply paySubscriptionRetrieveReply;
    protected PaySubscriptionDeleteReply paySubscriptionDeleteReply;
    protected PayPalPaymentReply payPalPaymentReply;
    protected PayPalCreditReply payPalCreditReply;
    protected VoidReply voidReply;
    protected PinlessDebitReply pinlessDebitReply;
    protected PinlessDebitValidateReply pinlessDebitValidateReply;
    protected PinlessDebitReversalReply pinlessDebitReversalReply;
    protected PayPalButtonCreateReply payPalButtonCreateReply;
    protected PayPalPreapprovedPaymentReply payPalPreapprovedPaymentReply;
    protected PayPalPreapprovedUpdateReply payPalPreapprovedUpdateReply;
    protected RiskUpdateReply riskUpdateReply;
    protected FraudUpdateReply fraudUpdateReply;
    protected CaseManagementActionReply caseManagementActionReply;
    protected DecisionReply decisionReply;
    protected PayPalRefundReply payPalRefundReply;
    protected PayPalAuthReversalReply payPalAuthReversalReply;
    protected PayPalDoCaptureReply payPalDoCaptureReply;
    protected PayPalEcDoPaymentReply payPalEcDoPaymentReply;
    protected PayPalEcGetDetailsReply payPalEcGetDetailsReply;
    protected PayPalEcSetReply payPalEcSetReply;
    protected PayPalAuthorizationReply payPalAuthorizationReply;
    protected PayPalEcOrderSetupReply payPalEcOrderSetupReply;
    protected PayPalUpdateAgreementReply payPalUpdateAgreementReply;
    protected PayPalCreateAgreementReply payPalCreateAgreementReply;
    protected PayPalDoRefTransactionReply payPalDoRefTransactionReply;
    protected ChinaPaymentReply chinaPaymentReply;
    protected ChinaRefundReply chinaRefundReply;
    protected BoletoPaymentReply boletoPaymentReply;
    protected PinDebitPurchaseReply pinDebitPurchaseReply;
    protected PinDebitCreditReply pinDebitCreditReply;
    protected PinDebitReversalReply pinDebitReversalReply;
    protected APInitiateReply apInitiateReply;
    protected APCheckStatusReply apCheckStatusReply;
    protected String receiptNumber;
    protected String additionalData;
    protected String solutionProviderTransactionID;
    protected APReply apReply;
    protected ShipTo shipTo;
    protected BillTo billTo;
    protected APAuthReply apAuthReply;
    protected APSessionsReply apSessionsReply;
    protected APAuthReversalReply apAuthReversalReply;
    protected APCaptureReply apCaptureReply;
    protected APOptionsReply apOptionsReply;
    protected APRefundReply apRefundReply;
    protected APSaleReply apSaleReply;
    protected APCheckOutDetailsReply apCheckoutDetailsReply;
    protected APTransactionDetailsReply apTransactionDetailsReply;
    protected APConfirmPurchaseReply apConfirmPurchaseReply;
    protected Promotion promotion;
    protected List<PromotionGroupReply> promotionGroup;
    protected PayPalGetTxnDetailsReply payPalGetTxnDetailsReply;
    protected PayPalTransactionSearchReply payPalTransactionSearchReply;
    protected EmvReply emvReply;
    protected OriginalTransaction originalTransaction;
    protected HostedDataCreateReply hostedDataCreateReply;
    protected HostedDataRetrieveReply hostedDataRetrieveReply;
    protected String salesSlipNumber;
    protected String additionalProcessorResponse;
    protected JPO jpo;
    protected Card card;
    protected PaymentNetworkToken paymentNetworkToken;
    protected VCReply vcReply;
    protected DecryptVisaCheckoutDataReply decryptVisaCheckoutDataReply;
    protected GetVisaCheckoutDataReply getVisaCheckoutDataReply;
    protected BinLookupReply binLookupReply;
    protected String issuerMessage;
    protected Token token;
    protected Issuer issuer;
    protected Recipient recipient;
    protected String feeProgramIndicator;
    protected Installment installment;
    protected String paymentAccountReference;
    protected String authIndicator;
    protected UCAF ucaf;
    protected List<Network> network;
    protected InvoiceHeader invoiceHeader;
    protected APOrderReply apOrderReply;
    protected APCancelReply apCancelReply;
    protected APBillingAgreementReply apBillingAgreementReply;
    protected String customerVerificationStatus;
    protected PersonalID personalID;
    protected String acquirerMerchantNumber;
    protected Pos pos;
    protected String issuerMessageAction;
    protected String customerID;
    protected Routing routing;
    protected String transactionLocalDateTime;
    protected APCreateMandateReply apCreateMandateReply;
    protected APMandateStatusReply apMandateStatusReply;
    protected APUpdateMandateReply apUpdateMandateReply;
    protected APImportMandateReply apImportMandateReply;
    protected APRevokeMandateReply apRevokeMandateReply;
    protected GetMasterpassDataReply getMasterpassDataReply;
    protected String paymentNetworkMerchantID;
    protected Wallet wallet;
    protected String cashbackAmount;
    protected GiftCard giftCard;
    protected GiftCardActivationReply giftCardActivationReply;
    protected GiftCardBalanceInquiryReply giftCardBalanceInquiryReply;
    protected GiftCardRedemptionReply giftCardRedemptionReply;
    protected GiftCardVoidReply giftCardVoidReply;
    protected GiftCardReversalReply giftCardReversalReply;
    protected CCCheckStatusReply ccCheckStatusReply;
    protected ECAVSReply ecAVSReply;
    protected AbortReply abortReply;
    protected ReplyReserved reserved;

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
     * Obtiene el valor de la propiedad requestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Define el valor de la propiedad requestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Obtiene el valor de la propiedad decision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision() {
        return decision;
    }

    /**
     * Define el valor de la propiedad decision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision(String value) {
        this.decision = value;
    }

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
     * Gets the value of the missingField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissingField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMissingField() {
        if (missingField == null) {
            missingField = new ArrayList<String>();
        }
        return this.missingField;
    }

    /**
     * Gets the value of the invalidField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invalidField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvalidField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInvalidField() {
        if (invalidField == null) {
            invalidField = new ArrayList<String>();
        }
        return this.invalidField;
    }

    /**
     * Obtiene el valor de la propiedad requestToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Define el valor de la propiedad requestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestToken(String value) {
        this.requestToken = value;
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
     * Gets the value of the deniedPartiesMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deniedPartiesMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeniedPartiesMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeniedPartiesMatch }
     * 
     * 
     */
    public List<DeniedPartiesMatch> getDeniedPartiesMatch() {
        if (deniedPartiesMatch == null) {
            deniedPartiesMatch = new ArrayList<DeniedPartiesMatch>();
        }
        return this.deniedPartiesMatch;
    }

    /**
     * Obtiene el valor de la propiedad ccAuthReply.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthReply }
     *     
     */
    public CCAuthReply getCcAuthReply() {
        return ccAuthReply;
    }

    /**
     * Define el valor de la propiedad ccAuthReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthReply }
     *     
     */
    public void setCcAuthReply(CCAuthReply value) {
        this.ccAuthReply = value;
    }

    /**
     * Obtiene el valor de la propiedad octReply.
     * 
     * @return
     *     possible object is
     *     {@link OCTReply }
     *     
     */
    public OCTReply getOctReply() {
        return octReply;
    }

    /**
     * Define el valor de la propiedad octReply.
     * 
     * @param value
     *     allowed object is
     *     {@link OCTReply }
     *     
     */
    public void setOctReply(OCTReply value) {
        this.octReply = value;
    }

    /**
     * Obtiene el valor de la propiedad verificationReply.
     * 
     * @return
     *     possible object is
     *     {@link VerificationReply }
     *     
     */
    public VerificationReply getVerificationReply() {
        return verificationReply;
    }

    /**
     * Define el valor de la propiedad verificationReply.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationReply }
     *     
     */
    public void setVerificationReply(VerificationReply value) {
        this.verificationReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccSaleReply.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleReply }
     *     
     */
    public CCSaleReply getCcSaleReply() {
        return ccSaleReply;
    }

    /**
     * Define el valor de la propiedad ccSaleReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleReply }
     *     
     */
    public void setCcSaleReply(CCSaleReply value) {
        this.ccSaleReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccSaleCreditReply.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleCreditReply }
     *     
     */
    public CCSaleCreditReply getCcSaleCreditReply() {
        return ccSaleCreditReply;
    }

    /**
     * Define el valor de la propiedad ccSaleCreditReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleCreditReply }
     *     
     */
    public void setCcSaleCreditReply(CCSaleCreditReply value) {
        this.ccSaleCreditReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccSaleReversalReply.
     * 
     * @return
     *     possible object is
     *     {@link CCSaleReversalReply }
     *     
     */
    public CCSaleReversalReply getCcSaleReversalReply() {
        return ccSaleReversalReply;
    }

    /**
     * Define el valor de la propiedad ccSaleReversalReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSaleReversalReply }
     *     
     */
    public void setCcSaleReversalReply(CCSaleReversalReply value) {
        this.ccSaleReversalReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccIncrementalAuthReply.
     * 
     * @return
     *     possible object is
     *     {@link CCIncrementalAuthReply }
     *     
     */
    public CCIncrementalAuthReply getCcIncrementalAuthReply() {
        return ccIncrementalAuthReply;
    }

    /**
     * Define el valor de la propiedad ccIncrementalAuthReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCIncrementalAuthReply }
     *     
     */
    public void setCcIncrementalAuthReply(CCIncrementalAuthReply value) {
        this.ccIncrementalAuthReply = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceFeeCalculateReply.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeCalculateReply }
     *     
     */
    public ServiceFeeCalculateReply getServiceFeeCalculateReply() {
        return serviceFeeCalculateReply;
    }

    /**
     * Define el valor de la propiedad serviceFeeCalculateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeCalculateReply }
     *     
     */
    public void setServiceFeeCalculateReply(ServiceFeeCalculateReply value) {
        this.serviceFeeCalculateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccCaptureReply.
     * 
     * @return
     *     possible object is
     *     {@link CCCaptureReply }
     *     
     */
    public CCCaptureReply getCcCaptureReply() {
        return ccCaptureReply;
    }

    /**
     * Define el valor de la propiedad ccCaptureReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCaptureReply }
     *     
     */
    public void setCcCaptureReply(CCCaptureReply value) {
        this.ccCaptureReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccCreditReply.
     * 
     * @return
     *     possible object is
     *     {@link CCCreditReply }
     *     
     */
    public CCCreditReply getCcCreditReply() {
        return ccCreditReply;
    }

    /**
     * Define el valor de la propiedad ccCreditReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCreditReply }
     *     
     */
    public void setCcCreditReply(CCCreditReply value) {
        this.ccCreditReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccAuthReversalReply.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthReversalReply }
     *     
     */
    public CCAuthReversalReply getCcAuthReversalReply() {
        return ccAuthReversalReply;
    }

    /**
     * Define el valor de la propiedad ccAuthReversalReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthReversalReply }
     *     
     */
    public void setCcAuthReversalReply(CCAuthReversalReply value) {
        this.ccAuthReversalReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccAutoAuthReversalReply.
     * 
     * @return
     *     possible object is
     *     {@link CCAutoAuthReversalReply }
     *     
     */
    public CCAutoAuthReversalReply getCcAutoAuthReversalReply() {
        return ccAutoAuthReversalReply;
    }

    /**
     * Define el valor de la propiedad ccAutoAuthReversalReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAutoAuthReversalReply }
     *     
     */
    public void setCcAutoAuthReversalReply(CCAutoAuthReversalReply value) {
        this.ccAutoAuthReversalReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccDCCReply.
     * 
     * @return
     *     possible object is
     *     {@link CCDCCReply }
     *     
     */
    public CCDCCReply getCcDCCReply() {
        return ccDCCReply;
    }

    /**
     * Define el valor de la propiedad ccDCCReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDCCReply }
     *     
     */
    public void setCcDCCReply(CCDCCReply value) {
        this.ccDCCReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccDCCUpdateReply.
     * 
     * @return
     *     possible object is
     *     {@link CCDCCUpdateReply }
     *     
     */
    public CCDCCUpdateReply getCcDCCUpdateReply() {
        return ccDCCUpdateReply;
    }

    /**
     * Define el valor de la propiedad ccDCCUpdateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDCCUpdateReply }
     *     
     */
    public void setCcDCCUpdateReply(CCDCCUpdateReply value) {
        this.ccDCCUpdateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ecDebitReply.
     * 
     * @return
     *     possible object is
     *     {@link ECDebitReply }
     *     
     */
    public ECDebitReply getEcDebitReply() {
        return ecDebitReply;
    }

    /**
     * Define el valor de la propiedad ecDebitReply.
     * 
     * @param value
     *     allowed object is
     *     {@link ECDebitReply }
     *     
     */
    public void setEcDebitReply(ECDebitReply value) {
        this.ecDebitReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ecCreditReply.
     * 
     * @return
     *     possible object is
     *     {@link ECCreditReply }
     *     
     */
    public ECCreditReply getEcCreditReply() {
        return ecCreditReply;
    }

    /**
     * Define el valor de la propiedad ecCreditReply.
     * 
     * @param value
     *     allowed object is
     *     {@link ECCreditReply }
     *     
     */
    public void setEcCreditReply(ECCreditReply value) {
        this.ecCreditReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ecAuthenticateReply.
     * 
     * @return
     *     possible object is
     *     {@link ECAuthenticateReply }
     *     
     */
    public ECAuthenticateReply getEcAuthenticateReply() {
        return ecAuthenticateReply;
    }

    /**
     * Define el valor de la propiedad ecAuthenticateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link ECAuthenticateReply }
     *     
     */
    public void setEcAuthenticateReply(ECAuthenticateReply value) {
        this.ecAuthenticateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payerAuthEnrollReply.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthEnrollReply }
     *     
     */
    public PayerAuthEnrollReply getPayerAuthEnrollReply() {
        return payerAuthEnrollReply;
    }

    /**
     * Define el valor de la propiedad payerAuthEnrollReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthEnrollReply }
     *     
     */
    public void setPayerAuthEnrollReply(PayerAuthEnrollReply value) {
        this.payerAuthEnrollReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payerAuthValidateReply.
     * 
     * @return
     *     possible object is
     *     {@link PayerAuthValidateReply }
     *     
     */
    public PayerAuthValidateReply getPayerAuthValidateReply() {
        return payerAuthValidateReply;
    }

    /**
     * Define el valor de la propiedad payerAuthValidateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerAuthValidateReply }
     *     
     */
    public void setPayerAuthValidateReply(PayerAuthValidateReply value) {
        this.payerAuthValidateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad taxReply.
     * 
     * @return
     *     possible object is
     *     {@link TaxReply }
     *     
     */
    public TaxReply getTaxReply() {
        return taxReply;
    }

    /**
     * Define el valor de la propiedad taxReply.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReply }
     *     
     */
    public void setTaxReply(TaxReply value) {
        this.taxReply = value;
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
     * Obtiene el valor de la propiedad encryptPaymentDataReply.
     * 
     * @return
     *     possible object is
     *     {@link EncryptPaymentDataReply }
     *     
     */
    public EncryptPaymentDataReply getEncryptPaymentDataReply() {
        return encryptPaymentDataReply;
    }

    /**
     * Define el valor de la propiedad encryptPaymentDataReply.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptPaymentDataReply }
     *     
     */
    public void setEncryptPaymentDataReply(EncryptPaymentDataReply value) {
        this.encryptPaymentDataReply = value;
    }

    /**
     * Obtiene el valor de la propiedad dmeReply.
     * 
     * @return
     *     possible object is
     *     {@link DMEReply }
     *     
     */
    public DMEReply getDmeReply() {
        return dmeReply;
    }

    /**
     * Define el valor de la propiedad dmeReply.
     * 
     * @param value
     *     allowed object is
     *     {@link DMEReply }
     *     
     */
    public void setDmeReply(DMEReply value) {
        this.dmeReply = value;
    }

    /**
     * Obtiene el valor de la propiedad afsReply.
     * 
     * @return
     *     possible object is
     *     {@link AFSReply }
     *     
     */
    public AFSReply getAfsReply() {
        return afsReply;
    }

    /**
     * Define el valor de la propiedad afsReply.
     * 
     * @param value
     *     allowed object is
     *     {@link AFSReply }
     *     
     */
    public void setAfsReply(AFSReply value) {
        this.afsReply = value;
    }

    /**
     * Obtiene el valor de la propiedad davReply.
     * 
     * @return
     *     possible object is
     *     {@link DAVReply }
     *     
     */
    public DAVReply getDavReply() {
        return davReply;
    }

    /**
     * Define el valor de la propiedad davReply.
     * 
     * @param value
     *     allowed object is
     *     {@link DAVReply }
     *     
     */
    public void setDavReply(DAVReply value) {
        this.davReply = value;
    }

    /**
     * Obtiene el valor de la propiedad exportReply.
     * 
     * @return
     *     possible object is
     *     {@link ExportReply }
     *     
     */
    public ExportReply getExportReply() {
        return exportReply;
    }

    /**
     * Define el valor de la propiedad exportReply.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportReply }
     *     
     */
    public void setExportReply(ExportReply value) {
        this.exportReply = value;
    }

    /**
     * Obtiene el valor de la propiedad fxRatesReply.
     * 
     * @return
     *     possible object is
     *     {@link FXRatesReply }
     *     
     */
    public FXRatesReply getFxRatesReply() {
        return fxRatesReply;
    }

    /**
     * Define el valor de la propiedad fxRatesReply.
     * 
     * @param value
     *     allowed object is
     *     {@link FXRatesReply }
     *     
     */
    public void setFxRatesReply(FXRatesReply value) {
        this.fxRatesReply = value;
    }

    /**
     * Obtiene el valor de la propiedad bankTransferReply.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferReply }
     *     
     */
    public BankTransferReply getBankTransferReply() {
        return bankTransferReply;
    }

    /**
     * Define el valor de la propiedad bankTransferReply.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferReply }
     *     
     */
    public void setBankTransferReply(BankTransferReply value) {
        this.bankTransferReply = value;
    }

    /**
     * Obtiene el valor de la propiedad bankTransferRefundReply.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferRefundReply }
     *     
     */
    public BankTransferRefundReply getBankTransferRefundReply() {
        return bankTransferRefundReply;
    }

    /**
     * Define el valor de la propiedad bankTransferRefundReply.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferRefundReply }
     *     
     */
    public void setBankTransferRefundReply(BankTransferRefundReply value) {
        this.bankTransferRefundReply = value;
    }

    /**
     * Obtiene el valor de la propiedad bankTransferRealTimeReply.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferRealTimeReply }
     *     
     */
    public BankTransferRealTimeReply getBankTransferRealTimeReply() {
        return bankTransferRealTimeReply;
    }

    /**
     * Define el valor de la propiedad bankTransferRealTimeReply.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferRealTimeReply }
     *     
     */
    public void setBankTransferRealTimeReply(BankTransferRealTimeReply value) {
        this.bankTransferRealTimeReply = value;
    }

    /**
     * Obtiene el valor de la propiedad directDebitMandateReply.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandateReply }
     *     
     */
    public DirectDebitMandateReply getDirectDebitMandateReply() {
        return directDebitMandateReply;
    }

    /**
     * Define el valor de la propiedad directDebitMandateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandateReply }
     *     
     */
    public void setDirectDebitMandateReply(DirectDebitMandateReply value) {
        this.directDebitMandateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad directDebitReply.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitReply }
     *     
     */
    public DirectDebitReply getDirectDebitReply() {
        return directDebitReply;
    }

    /**
     * Define el valor de la propiedad directDebitReply.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitReply }
     *     
     */
    public void setDirectDebitReply(DirectDebitReply value) {
        this.directDebitReply = value;
    }

    /**
     * Obtiene el valor de la propiedad directDebitValidateReply.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitValidateReply }
     *     
     */
    public DirectDebitValidateReply getDirectDebitValidateReply() {
        return directDebitValidateReply;
    }

    /**
     * Define el valor de la propiedad directDebitValidateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitValidateReply }
     *     
     */
    public void setDirectDebitValidateReply(DirectDebitValidateReply value) {
        this.directDebitValidateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad directDebitRefundReply.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitRefundReply }
     *     
     */
    public DirectDebitRefundReply getDirectDebitRefundReply() {
        return directDebitRefundReply;
    }

    /**
     * Define el valor de la propiedad directDebitRefundReply.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitRefundReply }
     *     
     */
    public void setDirectDebitRefundReply(DirectDebitRefundReply value) {
        this.directDebitRefundReply = value;
    }

    /**
     * Obtiene el valor de la propiedad paySubscriptionCreateReply.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionCreateReply }
     *     
     */
    public PaySubscriptionCreateReply getPaySubscriptionCreateReply() {
        return paySubscriptionCreateReply;
    }

    /**
     * Define el valor de la propiedad paySubscriptionCreateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionCreateReply }
     *     
     */
    public void setPaySubscriptionCreateReply(PaySubscriptionCreateReply value) {
        this.paySubscriptionCreateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad paySubscriptionUpdateReply.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionUpdateReply }
     *     
     */
    public PaySubscriptionUpdateReply getPaySubscriptionUpdateReply() {
        return paySubscriptionUpdateReply;
    }

    /**
     * Define el valor de la propiedad paySubscriptionUpdateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionUpdateReply }
     *     
     */
    public void setPaySubscriptionUpdateReply(PaySubscriptionUpdateReply value) {
        this.paySubscriptionUpdateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad paySubscriptionEventUpdateReply.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionEventUpdateReply }
     *     
     */
    public PaySubscriptionEventUpdateReply getPaySubscriptionEventUpdateReply() {
        return paySubscriptionEventUpdateReply;
    }

    /**
     * Define el valor de la propiedad paySubscriptionEventUpdateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionEventUpdateReply }
     *     
     */
    public void setPaySubscriptionEventUpdateReply(PaySubscriptionEventUpdateReply value) {
        this.paySubscriptionEventUpdateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad paySubscriptionRetrieveReply.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionRetrieveReply }
     *     
     */
    public PaySubscriptionRetrieveReply getPaySubscriptionRetrieveReply() {
        return paySubscriptionRetrieveReply;
    }

    /**
     * Define el valor de la propiedad paySubscriptionRetrieveReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionRetrieveReply }
     *     
     */
    public void setPaySubscriptionRetrieveReply(PaySubscriptionRetrieveReply value) {
        this.paySubscriptionRetrieveReply = value;
    }

    /**
     * Obtiene el valor de la propiedad paySubscriptionDeleteReply.
     * 
     * @return
     *     possible object is
     *     {@link PaySubscriptionDeleteReply }
     *     
     */
    public PaySubscriptionDeleteReply getPaySubscriptionDeleteReply() {
        return paySubscriptionDeleteReply;
    }

    /**
     * Define el valor de la propiedad paySubscriptionDeleteReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySubscriptionDeleteReply }
     *     
     */
    public void setPaySubscriptionDeleteReply(PaySubscriptionDeleteReply value) {
        this.paySubscriptionDeleteReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalPaymentReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPaymentReply }
     *     
     */
    public PayPalPaymentReply getPayPalPaymentReply() {
        return payPalPaymentReply;
    }

    /**
     * Define el valor de la propiedad payPalPaymentReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPaymentReply }
     *     
     */
    public void setPayPalPaymentReply(PayPalPaymentReply value) {
        this.payPalPaymentReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalCreditReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalCreditReply }
     *     
     */
    public PayPalCreditReply getPayPalCreditReply() {
        return payPalCreditReply;
    }

    /**
     * Define el valor de la propiedad payPalCreditReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalCreditReply }
     *     
     */
    public void setPayPalCreditReply(PayPalCreditReply value) {
        this.payPalCreditReply = value;
    }

    /**
     * Obtiene el valor de la propiedad voidReply.
     * 
     * @return
     *     possible object is
     *     {@link VoidReply }
     *     
     */
    public VoidReply getVoidReply() {
        return voidReply;
    }

    /**
     * Define el valor de la propiedad voidReply.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidReply }
     *     
     */
    public void setVoidReply(VoidReply value) {
        this.voidReply = value;
    }

    /**
     * Obtiene el valor de la propiedad pinlessDebitReply.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitReply }
     *     
     */
    public PinlessDebitReply getPinlessDebitReply() {
        return pinlessDebitReply;
    }

    /**
     * Define el valor de la propiedad pinlessDebitReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitReply }
     *     
     */
    public void setPinlessDebitReply(PinlessDebitReply value) {
        this.pinlessDebitReply = value;
    }

    /**
     * Obtiene el valor de la propiedad pinlessDebitValidateReply.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitValidateReply }
     *     
     */
    public PinlessDebitValidateReply getPinlessDebitValidateReply() {
        return pinlessDebitValidateReply;
    }

    /**
     * Define el valor de la propiedad pinlessDebitValidateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitValidateReply }
     *     
     */
    public void setPinlessDebitValidateReply(PinlessDebitValidateReply value) {
        this.pinlessDebitValidateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad pinlessDebitReversalReply.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitReversalReply }
     *     
     */
    public PinlessDebitReversalReply getPinlessDebitReversalReply() {
        return pinlessDebitReversalReply;
    }

    /**
     * Define el valor de la propiedad pinlessDebitReversalReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitReversalReply }
     *     
     */
    public void setPinlessDebitReversalReply(PinlessDebitReversalReply value) {
        this.pinlessDebitReversalReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalButtonCreateReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalButtonCreateReply }
     *     
     */
    public PayPalButtonCreateReply getPayPalButtonCreateReply() {
        return payPalButtonCreateReply;
    }

    /**
     * Define el valor de la propiedad payPalButtonCreateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalButtonCreateReply }
     *     
     */
    public void setPayPalButtonCreateReply(PayPalButtonCreateReply value) {
        this.payPalButtonCreateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalPreapprovedPaymentReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPreapprovedPaymentReply }
     *     
     */
    public PayPalPreapprovedPaymentReply getPayPalPreapprovedPaymentReply() {
        return payPalPreapprovedPaymentReply;
    }

    /**
     * Define el valor de la propiedad payPalPreapprovedPaymentReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPreapprovedPaymentReply }
     *     
     */
    public void setPayPalPreapprovedPaymentReply(PayPalPreapprovedPaymentReply value) {
        this.payPalPreapprovedPaymentReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalPreapprovedUpdateReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalPreapprovedUpdateReply }
     *     
     */
    public PayPalPreapprovedUpdateReply getPayPalPreapprovedUpdateReply() {
        return payPalPreapprovedUpdateReply;
    }

    /**
     * Define el valor de la propiedad payPalPreapprovedUpdateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalPreapprovedUpdateReply }
     *     
     */
    public void setPayPalPreapprovedUpdateReply(PayPalPreapprovedUpdateReply value) {
        this.payPalPreapprovedUpdateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad riskUpdateReply.
     * 
     * @return
     *     possible object is
     *     {@link RiskUpdateReply }
     *     
     */
    public RiskUpdateReply getRiskUpdateReply() {
        return riskUpdateReply;
    }

    /**
     * Define el valor de la propiedad riskUpdateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskUpdateReply }
     *     
     */
    public void setRiskUpdateReply(RiskUpdateReply value) {
        this.riskUpdateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad fraudUpdateReply.
     * 
     * @return
     *     possible object is
     *     {@link FraudUpdateReply }
     *     
     */
    public FraudUpdateReply getFraudUpdateReply() {
        return fraudUpdateReply;
    }

    /**
     * Define el valor de la propiedad fraudUpdateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudUpdateReply }
     *     
     */
    public void setFraudUpdateReply(FraudUpdateReply value) {
        this.fraudUpdateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad caseManagementActionReply.
     * 
     * @return
     *     possible object is
     *     {@link CaseManagementActionReply }
     *     
     */
    public CaseManagementActionReply getCaseManagementActionReply() {
        return caseManagementActionReply;
    }

    /**
     * Define el valor de la propiedad caseManagementActionReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseManagementActionReply }
     *     
     */
    public void setCaseManagementActionReply(CaseManagementActionReply value) {
        this.caseManagementActionReply = value;
    }

    /**
     * Obtiene el valor de la propiedad decisionReply.
     * 
     * @return
     *     possible object is
     *     {@link DecisionReply }
     *     
     */
    public DecisionReply getDecisionReply() {
        return decisionReply;
    }

    /**
     * Define el valor de la propiedad decisionReply.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionReply }
     *     
     */
    public void setDecisionReply(DecisionReply value) {
        this.decisionReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalRefundReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalRefundReply }
     *     
     */
    public PayPalRefundReply getPayPalRefundReply() {
        return payPalRefundReply;
    }

    /**
     * Define el valor de la propiedad payPalRefundReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalRefundReply }
     *     
     */
    public void setPayPalRefundReply(PayPalRefundReply value) {
        this.payPalRefundReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalAuthReversalReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAuthReversalReply }
     *     
     */
    public PayPalAuthReversalReply getPayPalAuthReversalReply() {
        return payPalAuthReversalReply;
    }

    /**
     * Define el valor de la propiedad payPalAuthReversalReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAuthReversalReply }
     *     
     */
    public void setPayPalAuthReversalReply(PayPalAuthReversalReply value) {
        this.payPalAuthReversalReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalDoCaptureReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalDoCaptureReply }
     *     
     */
    public PayPalDoCaptureReply getPayPalDoCaptureReply() {
        return payPalDoCaptureReply;
    }

    /**
     * Define el valor de la propiedad payPalDoCaptureReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalDoCaptureReply }
     *     
     */
    public void setPayPalDoCaptureReply(PayPalDoCaptureReply value) {
        this.payPalDoCaptureReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalEcDoPaymentReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcDoPaymentReply }
     *     
     */
    public PayPalEcDoPaymentReply getPayPalEcDoPaymentReply() {
        return payPalEcDoPaymentReply;
    }

    /**
     * Define el valor de la propiedad payPalEcDoPaymentReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcDoPaymentReply }
     *     
     */
    public void setPayPalEcDoPaymentReply(PayPalEcDoPaymentReply value) {
        this.payPalEcDoPaymentReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalEcGetDetailsReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcGetDetailsReply }
     *     
     */
    public PayPalEcGetDetailsReply getPayPalEcGetDetailsReply() {
        return payPalEcGetDetailsReply;
    }

    /**
     * Define el valor de la propiedad payPalEcGetDetailsReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcGetDetailsReply }
     *     
     */
    public void setPayPalEcGetDetailsReply(PayPalEcGetDetailsReply value) {
        this.payPalEcGetDetailsReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalEcSetReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcSetReply }
     *     
     */
    public PayPalEcSetReply getPayPalEcSetReply() {
        return payPalEcSetReply;
    }

    /**
     * Define el valor de la propiedad payPalEcSetReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcSetReply }
     *     
     */
    public void setPayPalEcSetReply(PayPalEcSetReply value) {
        this.payPalEcSetReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalAuthorizationReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAuthorizationReply }
     *     
     */
    public PayPalAuthorizationReply getPayPalAuthorizationReply() {
        return payPalAuthorizationReply;
    }

    /**
     * Define el valor de la propiedad payPalAuthorizationReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAuthorizationReply }
     *     
     */
    public void setPayPalAuthorizationReply(PayPalAuthorizationReply value) {
        this.payPalAuthorizationReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalEcOrderSetupReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalEcOrderSetupReply }
     *     
     */
    public PayPalEcOrderSetupReply getPayPalEcOrderSetupReply() {
        return payPalEcOrderSetupReply;
    }

    /**
     * Define el valor de la propiedad payPalEcOrderSetupReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalEcOrderSetupReply }
     *     
     */
    public void setPayPalEcOrderSetupReply(PayPalEcOrderSetupReply value) {
        this.payPalEcOrderSetupReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalUpdateAgreementReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalUpdateAgreementReply }
     *     
     */
    public PayPalUpdateAgreementReply getPayPalUpdateAgreementReply() {
        return payPalUpdateAgreementReply;
    }

    /**
     * Define el valor de la propiedad payPalUpdateAgreementReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalUpdateAgreementReply }
     *     
     */
    public void setPayPalUpdateAgreementReply(PayPalUpdateAgreementReply value) {
        this.payPalUpdateAgreementReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalCreateAgreementReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalCreateAgreementReply }
     *     
     */
    public PayPalCreateAgreementReply getPayPalCreateAgreementReply() {
        return payPalCreateAgreementReply;
    }

    /**
     * Define el valor de la propiedad payPalCreateAgreementReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalCreateAgreementReply }
     *     
     */
    public void setPayPalCreateAgreementReply(PayPalCreateAgreementReply value) {
        this.payPalCreateAgreementReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalDoRefTransactionReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalDoRefTransactionReply }
     *     
     */
    public PayPalDoRefTransactionReply getPayPalDoRefTransactionReply() {
        return payPalDoRefTransactionReply;
    }

    /**
     * Define el valor de la propiedad payPalDoRefTransactionReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalDoRefTransactionReply }
     *     
     */
    public void setPayPalDoRefTransactionReply(PayPalDoRefTransactionReply value) {
        this.payPalDoRefTransactionReply = value;
    }

    /**
     * Obtiene el valor de la propiedad chinaPaymentReply.
     * 
     * @return
     *     possible object is
     *     {@link ChinaPaymentReply }
     *     
     */
    public ChinaPaymentReply getChinaPaymentReply() {
        return chinaPaymentReply;
    }

    /**
     * Define el valor de la propiedad chinaPaymentReply.
     * 
     * @param value
     *     allowed object is
     *     {@link ChinaPaymentReply }
     *     
     */
    public void setChinaPaymentReply(ChinaPaymentReply value) {
        this.chinaPaymentReply = value;
    }

    /**
     * Obtiene el valor de la propiedad chinaRefundReply.
     * 
     * @return
     *     possible object is
     *     {@link ChinaRefundReply }
     *     
     */
    public ChinaRefundReply getChinaRefundReply() {
        return chinaRefundReply;
    }

    /**
     * Define el valor de la propiedad chinaRefundReply.
     * 
     * @param value
     *     allowed object is
     *     {@link ChinaRefundReply }
     *     
     */
    public void setChinaRefundReply(ChinaRefundReply value) {
        this.chinaRefundReply = value;
    }

    /**
     * Obtiene el valor de la propiedad boletoPaymentReply.
     * 
     * @return
     *     possible object is
     *     {@link BoletoPaymentReply }
     *     
     */
    public BoletoPaymentReply getBoletoPaymentReply() {
        return boletoPaymentReply;
    }

    /**
     * Define el valor de la propiedad boletoPaymentReply.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletoPaymentReply }
     *     
     */
    public void setBoletoPaymentReply(BoletoPaymentReply value) {
        this.boletoPaymentReply = value;
    }

    /**
     * Obtiene el valor de la propiedad pinDebitPurchaseReply.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitPurchaseReply }
     *     
     */
    public PinDebitPurchaseReply getPinDebitPurchaseReply() {
        return pinDebitPurchaseReply;
    }

    /**
     * Define el valor de la propiedad pinDebitPurchaseReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitPurchaseReply }
     *     
     */
    public void setPinDebitPurchaseReply(PinDebitPurchaseReply value) {
        this.pinDebitPurchaseReply = value;
    }

    /**
     * Obtiene el valor de la propiedad pinDebitCreditReply.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitCreditReply }
     *     
     */
    public PinDebitCreditReply getPinDebitCreditReply() {
        return pinDebitCreditReply;
    }

    /**
     * Define el valor de la propiedad pinDebitCreditReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitCreditReply }
     *     
     */
    public void setPinDebitCreditReply(PinDebitCreditReply value) {
        this.pinDebitCreditReply = value;
    }

    /**
     * Obtiene el valor de la propiedad pinDebitReversalReply.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitReversalReply }
     *     
     */
    public PinDebitReversalReply getPinDebitReversalReply() {
        return pinDebitReversalReply;
    }

    /**
     * Define el valor de la propiedad pinDebitReversalReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitReversalReply }
     *     
     */
    public void setPinDebitReversalReply(PinDebitReversalReply value) {
        this.pinDebitReversalReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apInitiateReply.
     * 
     * @return
     *     possible object is
     *     {@link APInitiateReply }
     *     
     */
    public APInitiateReply getApInitiateReply() {
        return apInitiateReply;
    }

    /**
     * Define el valor de la propiedad apInitiateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APInitiateReply }
     *     
     */
    public void setApInitiateReply(APInitiateReply value) {
        this.apInitiateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apCheckStatusReply.
     * 
     * @return
     *     possible object is
     *     {@link APCheckStatusReply }
     *     
     */
    public APCheckStatusReply getApCheckStatusReply() {
        return apCheckStatusReply;
    }

    /**
     * Define el valor de la propiedad apCheckStatusReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APCheckStatusReply }
     *     
     */
    public void setApCheckStatusReply(APCheckStatusReply value) {
        this.apCheckStatusReply = value;
    }

    /**
     * Obtiene el valor de la propiedad receiptNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Define el valor de la propiedad receiptNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNumber(String value) {
        this.receiptNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Define el valor de la propiedad additionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData(String value) {
        this.additionalData = value;
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
     * Obtiene el valor de la propiedad apReply.
     * 
     * @return
     *     possible object is
     *     {@link APReply }
     *     
     */
    public APReply getApReply() {
        return apReply;
    }

    /**
     * Define el valor de la propiedad apReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APReply }
     *     
     */
    public void setApReply(APReply value) {
        this.apReply = value;
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
     * Obtiene el valor de la propiedad apAuthReply.
     * 
     * @return
     *     possible object is
     *     {@link APAuthReply }
     *     
     */
    public APAuthReply getApAuthReply() {
        return apAuthReply;
    }

    /**
     * Define el valor de la propiedad apAuthReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APAuthReply }
     *     
     */
    public void setApAuthReply(APAuthReply value) {
        this.apAuthReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apSessionsReply.
     * 
     * @return
     *     possible object is
     *     {@link APSessionsReply }
     *     
     */
    public APSessionsReply getApSessionsReply() {
        return apSessionsReply;
    }

    /**
     * Define el valor de la propiedad apSessionsReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APSessionsReply }
     *     
     */
    public void setApSessionsReply(APSessionsReply value) {
        this.apSessionsReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apAuthReversalReply.
     * 
     * @return
     *     possible object is
     *     {@link APAuthReversalReply }
     *     
     */
    public APAuthReversalReply getApAuthReversalReply() {
        return apAuthReversalReply;
    }

    /**
     * Define el valor de la propiedad apAuthReversalReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APAuthReversalReply }
     *     
     */
    public void setApAuthReversalReply(APAuthReversalReply value) {
        this.apAuthReversalReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apCaptureReply.
     * 
     * @return
     *     possible object is
     *     {@link APCaptureReply }
     *     
     */
    public APCaptureReply getApCaptureReply() {
        return apCaptureReply;
    }

    /**
     * Define el valor de la propiedad apCaptureReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APCaptureReply }
     *     
     */
    public void setApCaptureReply(APCaptureReply value) {
        this.apCaptureReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apOptionsReply.
     * 
     * @return
     *     possible object is
     *     {@link APOptionsReply }
     *     
     */
    public APOptionsReply getApOptionsReply() {
        return apOptionsReply;
    }

    /**
     * Define el valor de la propiedad apOptionsReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APOptionsReply }
     *     
     */
    public void setApOptionsReply(APOptionsReply value) {
        this.apOptionsReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apRefundReply.
     * 
     * @return
     *     possible object is
     *     {@link APRefundReply }
     *     
     */
    public APRefundReply getApRefundReply() {
        return apRefundReply;
    }

    /**
     * Define el valor de la propiedad apRefundReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APRefundReply }
     *     
     */
    public void setApRefundReply(APRefundReply value) {
        this.apRefundReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apSaleReply.
     * 
     * @return
     *     possible object is
     *     {@link APSaleReply }
     *     
     */
    public APSaleReply getApSaleReply() {
        return apSaleReply;
    }

    /**
     * Define el valor de la propiedad apSaleReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APSaleReply }
     *     
     */
    public void setApSaleReply(APSaleReply value) {
        this.apSaleReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apCheckoutDetailsReply.
     * 
     * @return
     *     possible object is
     *     {@link APCheckOutDetailsReply }
     *     
     */
    public APCheckOutDetailsReply getApCheckoutDetailsReply() {
        return apCheckoutDetailsReply;
    }

    /**
     * Define el valor de la propiedad apCheckoutDetailsReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APCheckOutDetailsReply }
     *     
     */
    public void setApCheckoutDetailsReply(APCheckOutDetailsReply value) {
        this.apCheckoutDetailsReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apTransactionDetailsReply.
     * 
     * @return
     *     possible object is
     *     {@link APTransactionDetailsReply }
     *     
     */
    public APTransactionDetailsReply getApTransactionDetailsReply() {
        return apTransactionDetailsReply;
    }

    /**
     * Define el valor de la propiedad apTransactionDetailsReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APTransactionDetailsReply }
     *     
     */
    public void setApTransactionDetailsReply(APTransactionDetailsReply value) {
        this.apTransactionDetailsReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apConfirmPurchaseReply.
     * 
     * @return
     *     possible object is
     *     {@link APConfirmPurchaseReply }
     *     
     */
    public APConfirmPurchaseReply getApConfirmPurchaseReply() {
        return apConfirmPurchaseReply;
    }

    /**
     * Define el valor de la propiedad apConfirmPurchaseReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APConfirmPurchaseReply }
     *     
     */
    public void setApConfirmPurchaseReply(APConfirmPurchaseReply value) {
        this.apConfirmPurchaseReply = value;
    }

    /**
     * Obtiene el valor de la propiedad promotion.
     * 
     * @return
     *     possible object is
     *     {@link Promotion }
     *     
     */
    public Promotion getPromotion() {
        return promotion;
    }

    /**
     * Define el valor de la propiedad promotion.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion }
     *     
     */
    public void setPromotion(Promotion value) {
        this.promotion = value;
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
     * {@link PromotionGroupReply }
     * 
     * 
     */
    public List<PromotionGroupReply> getPromotionGroup() {
        if (promotionGroup == null) {
            promotionGroup = new ArrayList<PromotionGroupReply>();
        }
        return this.promotionGroup;
    }

    /**
     * Obtiene el valor de la propiedad payPalGetTxnDetailsReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalGetTxnDetailsReply }
     *     
     */
    public PayPalGetTxnDetailsReply getPayPalGetTxnDetailsReply() {
        return payPalGetTxnDetailsReply;
    }

    /**
     * Define el valor de la propiedad payPalGetTxnDetailsReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalGetTxnDetailsReply }
     *     
     */
    public void setPayPalGetTxnDetailsReply(PayPalGetTxnDetailsReply value) {
        this.payPalGetTxnDetailsReply = value;
    }

    /**
     * Obtiene el valor de la propiedad payPalTransactionSearchReply.
     * 
     * @return
     *     possible object is
     *     {@link PayPalTransactionSearchReply }
     *     
     */
    public PayPalTransactionSearchReply getPayPalTransactionSearchReply() {
        return payPalTransactionSearchReply;
    }

    /**
     * Define el valor de la propiedad payPalTransactionSearchReply.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalTransactionSearchReply }
     *     
     */
    public void setPayPalTransactionSearchReply(PayPalTransactionSearchReply value) {
        this.payPalTransactionSearchReply = value;
    }

    /**
     * Obtiene el valor de la propiedad emvReply.
     * 
     * @return
     *     possible object is
     *     {@link EmvReply }
     *     
     */
    public EmvReply getEmvReply() {
        return emvReply;
    }

    /**
     * Define el valor de la propiedad emvReply.
     * 
     * @param value
     *     allowed object is
     *     {@link EmvReply }
     *     
     */
    public void setEmvReply(EmvReply value) {
        this.emvReply = value;
    }

    /**
     * Obtiene el valor de la propiedad originalTransaction.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransaction }
     *     
     */
    public OriginalTransaction getOriginalTransaction() {
        return originalTransaction;
    }

    /**
     * Define el valor de la propiedad originalTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransaction }
     *     
     */
    public void setOriginalTransaction(OriginalTransaction value) {
        this.originalTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad hostedDataCreateReply.
     * 
     * @return
     *     possible object is
     *     {@link HostedDataCreateReply }
     *     
     */
    public HostedDataCreateReply getHostedDataCreateReply() {
        return hostedDataCreateReply;
    }

    /**
     * Define el valor de la propiedad hostedDataCreateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedDataCreateReply }
     *     
     */
    public void setHostedDataCreateReply(HostedDataCreateReply value) {
        this.hostedDataCreateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad hostedDataRetrieveReply.
     * 
     * @return
     *     possible object is
     *     {@link HostedDataRetrieveReply }
     *     
     */
    public HostedDataRetrieveReply getHostedDataRetrieveReply() {
        return hostedDataRetrieveReply;
    }

    /**
     * Define el valor de la propiedad hostedDataRetrieveReply.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedDataRetrieveReply }
     *     
     */
    public void setHostedDataRetrieveReply(HostedDataRetrieveReply value) {
        this.hostedDataRetrieveReply = value;
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
     * Obtiene el valor de la propiedad additionalProcessorResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalProcessorResponse() {
        return additionalProcessorResponse;
    }

    /**
     * Define el valor de la propiedad additionalProcessorResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalProcessorResponse(String value) {
        this.additionalProcessorResponse = value;
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
     * Obtiene el valor de la propiedad vcReply.
     * 
     * @return
     *     possible object is
     *     {@link VCReply }
     *     
     */
    public VCReply getVcReply() {
        return vcReply;
    }

    /**
     * Define el valor de la propiedad vcReply.
     * 
     * @param value
     *     allowed object is
     *     {@link VCReply }
     *     
     */
    public void setVcReply(VCReply value) {
        this.vcReply = value;
    }

    /**
     * Obtiene el valor de la propiedad decryptVisaCheckoutDataReply.
     * 
     * @return
     *     possible object is
     *     {@link DecryptVisaCheckoutDataReply }
     *     
     */
    public DecryptVisaCheckoutDataReply getDecryptVisaCheckoutDataReply() {
        return decryptVisaCheckoutDataReply;
    }

    /**
     * Define el valor de la propiedad decryptVisaCheckoutDataReply.
     * 
     * @param value
     *     allowed object is
     *     {@link DecryptVisaCheckoutDataReply }
     *     
     */
    public void setDecryptVisaCheckoutDataReply(DecryptVisaCheckoutDataReply value) {
        this.decryptVisaCheckoutDataReply = value;
    }

    /**
     * Obtiene el valor de la propiedad getVisaCheckoutDataReply.
     * 
     * @return
     *     possible object is
     *     {@link GetVisaCheckoutDataReply }
     *     
     */
    public GetVisaCheckoutDataReply getGetVisaCheckoutDataReply() {
        return getVisaCheckoutDataReply;
    }

    /**
     * Define el valor de la propiedad getVisaCheckoutDataReply.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVisaCheckoutDataReply }
     *     
     */
    public void setGetVisaCheckoutDataReply(GetVisaCheckoutDataReply value) {
        this.getVisaCheckoutDataReply = value;
    }

    /**
     * Obtiene el valor de la propiedad binLookupReply.
     * 
     * @return
     *     possible object is
     *     {@link BinLookupReply }
     *     
     */
    public BinLookupReply getBinLookupReply() {
        return binLookupReply;
    }

    /**
     * Define el valor de la propiedad binLookupReply.
     * 
     * @param value
     *     allowed object is
     *     {@link BinLookupReply }
     *     
     */
    public void setBinLookupReply(BinLookupReply value) {
        this.binLookupReply = value;
    }

    /**
     * Obtiene el valor de la propiedad issuerMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerMessage() {
        return issuerMessage;
    }

    /**
     * Define el valor de la propiedad issuerMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerMessage(String value) {
        this.issuerMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link Token }
     *     
     */
    public Token getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link Token }
     *     
     */
    public void setToken(Token value) {
        this.token = value;
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
     * Obtiene el valor de la propiedad paymentAccountReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountReference() {
        return paymentAccountReference;
    }

    /**
     * Define el valor de la propiedad paymentAccountReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountReference(String value) {
        this.paymentAccountReference = value;
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
     * Gets the value of the network property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the network property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Network }
     * 
     * 
     */
    public List<Network> getNetwork() {
        if (network == null) {
            network = new ArrayList<Network>();
        }
        return this.network;
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
     * Obtiene el valor de la propiedad apOrderReply.
     * 
     * @return
     *     possible object is
     *     {@link APOrderReply }
     *     
     */
    public APOrderReply getApOrderReply() {
        return apOrderReply;
    }

    /**
     * Define el valor de la propiedad apOrderReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APOrderReply }
     *     
     */
    public void setApOrderReply(APOrderReply value) {
        this.apOrderReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apCancelReply.
     * 
     * @return
     *     possible object is
     *     {@link APCancelReply }
     *     
     */
    public APCancelReply getApCancelReply() {
        return apCancelReply;
    }

    /**
     * Define el valor de la propiedad apCancelReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APCancelReply }
     *     
     */
    public void setApCancelReply(APCancelReply value) {
        this.apCancelReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apBillingAgreementReply.
     * 
     * @return
     *     possible object is
     *     {@link APBillingAgreementReply }
     *     
     */
    public APBillingAgreementReply getApBillingAgreementReply() {
        return apBillingAgreementReply;
    }

    /**
     * Define el valor de la propiedad apBillingAgreementReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APBillingAgreementReply }
     *     
     */
    public void setApBillingAgreementReply(APBillingAgreementReply value) {
        this.apBillingAgreementReply = value;
    }

    /**
     * Obtiene el valor de la propiedad customerVerificationStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerVerificationStatus() {
        return customerVerificationStatus;
    }

    /**
     * Define el valor de la propiedad customerVerificationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerVerificationStatus(String value) {
        this.customerVerificationStatus = value;
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
     * Obtiene el valor de la propiedad acquirerMerchantNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerMerchantNumber() {
        return acquirerMerchantNumber;
    }

    /**
     * Define el valor de la propiedad acquirerMerchantNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerMerchantNumber(String value) {
        this.acquirerMerchantNumber = value;
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
     * Obtiene el valor de la propiedad issuerMessageAction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerMessageAction() {
        return issuerMessageAction;
    }

    /**
     * Define el valor de la propiedad issuerMessageAction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerMessageAction(String value) {
        this.issuerMessageAction = value;
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
     * Obtiene el valor de la propiedad routing.
     * 
     * @return
     *     possible object is
     *     {@link Routing }
     *     
     */
    public Routing getRouting() {
        return routing;
    }

    /**
     * Define el valor de la propiedad routing.
     * 
     * @param value
     *     allowed object is
     *     {@link Routing }
     *     
     */
    public void setRouting(Routing value) {
        this.routing = value;
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
     * Obtiene el valor de la propiedad apCreateMandateReply.
     * 
     * @return
     *     possible object is
     *     {@link APCreateMandateReply }
     *     
     */
    public APCreateMandateReply getApCreateMandateReply() {
        return apCreateMandateReply;
    }

    /**
     * Define el valor de la propiedad apCreateMandateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APCreateMandateReply }
     *     
     */
    public void setApCreateMandateReply(APCreateMandateReply value) {
        this.apCreateMandateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apMandateStatusReply.
     * 
     * @return
     *     possible object is
     *     {@link APMandateStatusReply }
     *     
     */
    public APMandateStatusReply getApMandateStatusReply() {
        return apMandateStatusReply;
    }

    /**
     * Define el valor de la propiedad apMandateStatusReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APMandateStatusReply }
     *     
     */
    public void setApMandateStatusReply(APMandateStatusReply value) {
        this.apMandateStatusReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apUpdateMandateReply.
     * 
     * @return
     *     possible object is
     *     {@link APUpdateMandateReply }
     *     
     */
    public APUpdateMandateReply getApUpdateMandateReply() {
        return apUpdateMandateReply;
    }

    /**
     * Define el valor de la propiedad apUpdateMandateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APUpdateMandateReply }
     *     
     */
    public void setApUpdateMandateReply(APUpdateMandateReply value) {
        this.apUpdateMandateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apImportMandateReply.
     * 
     * @return
     *     possible object is
     *     {@link APImportMandateReply }
     *     
     */
    public APImportMandateReply getApImportMandateReply() {
        return apImportMandateReply;
    }

    /**
     * Define el valor de la propiedad apImportMandateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APImportMandateReply }
     *     
     */
    public void setApImportMandateReply(APImportMandateReply value) {
        this.apImportMandateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad apRevokeMandateReply.
     * 
     * @return
     *     possible object is
     *     {@link APRevokeMandateReply }
     *     
     */
    public APRevokeMandateReply getApRevokeMandateReply() {
        return apRevokeMandateReply;
    }

    /**
     * Define el valor de la propiedad apRevokeMandateReply.
     * 
     * @param value
     *     allowed object is
     *     {@link APRevokeMandateReply }
     *     
     */
    public void setApRevokeMandateReply(APRevokeMandateReply value) {
        this.apRevokeMandateReply = value;
    }

    /**
     * Obtiene el valor de la propiedad getMasterpassDataReply.
     * 
     * @return
     *     possible object is
     *     {@link GetMasterpassDataReply }
     *     
     */
    public GetMasterpassDataReply getGetMasterpassDataReply() {
        return getMasterpassDataReply;
    }

    /**
     * Define el valor de la propiedad getMasterpassDataReply.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMasterpassDataReply }
     *     
     */
    public void setGetMasterpassDataReply(GetMasterpassDataReply value) {
        this.getMasterpassDataReply = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentNetworkMerchantID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNetworkMerchantID() {
        return paymentNetworkMerchantID;
    }

    /**
     * Define el valor de la propiedad paymentNetworkMerchantID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNetworkMerchantID(String value) {
        this.paymentNetworkMerchantID = value;
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
     * Obtiene el valor de la propiedad giftCardActivationReply.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardActivationReply }
     *     
     */
    public GiftCardActivationReply getGiftCardActivationReply() {
        return giftCardActivationReply;
    }

    /**
     * Define el valor de la propiedad giftCardActivationReply.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardActivationReply }
     *     
     */
    public void setGiftCardActivationReply(GiftCardActivationReply value) {
        this.giftCardActivationReply = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardBalanceInquiryReply.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardBalanceInquiryReply }
     *     
     */
    public GiftCardBalanceInquiryReply getGiftCardBalanceInquiryReply() {
        return giftCardBalanceInquiryReply;
    }

    /**
     * Define el valor de la propiedad giftCardBalanceInquiryReply.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardBalanceInquiryReply }
     *     
     */
    public void setGiftCardBalanceInquiryReply(GiftCardBalanceInquiryReply value) {
        this.giftCardBalanceInquiryReply = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardRedemptionReply.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardRedemptionReply }
     *     
     */
    public GiftCardRedemptionReply getGiftCardRedemptionReply() {
        return giftCardRedemptionReply;
    }

    /**
     * Define el valor de la propiedad giftCardRedemptionReply.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardRedemptionReply }
     *     
     */
    public void setGiftCardRedemptionReply(GiftCardRedemptionReply value) {
        this.giftCardRedemptionReply = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardVoidReply.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardVoidReply }
     *     
     */
    public GiftCardVoidReply getGiftCardVoidReply() {
        return giftCardVoidReply;
    }

    /**
     * Define el valor de la propiedad giftCardVoidReply.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardVoidReply }
     *     
     */
    public void setGiftCardVoidReply(GiftCardVoidReply value) {
        this.giftCardVoidReply = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardReversalReply.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardReversalReply }
     *     
     */
    public GiftCardReversalReply getGiftCardReversalReply() {
        return giftCardReversalReply;
    }

    /**
     * Define el valor de la propiedad giftCardReversalReply.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardReversalReply }
     *     
     */
    public void setGiftCardReversalReply(GiftCardReversalReply value) {
        this.giftCardReversalReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ccCheckStatusReply.
     * 
     * @return
     *     possible object is
     *     {@link CCCheckStatusReply }
     *     
     */
    public CCCheckStatusReply getCcCheckStatusReply() {
        return ccCheckStatusReply;
    }

    /**
     * Define el valor de la propiedad ccCheckStatusReply.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCheckStatusReply }
     *     
     */
    public void setCcCheckStatusReply(CCCheckStatusReply value) {
        this.ccCheckStatusReply = value;
    }

    /**
     * Obtiene el valor de la propiedad ecAVSReply.
     * 
     * @return
     *     possible object is
     *     {@link ECAVSReply }
     *     
     */
    public ECAVSReply getEcAVSReply() {
        return ecAVSReply;
    }

    /**
     * Define el valor de la propiedad ecAVSReply.
     * 
     * @param value
     *     allowed object is
     *     {@link ECAVSReply }
     *     
     */
    public void setEcAVSReply(ECAVSReply value) {
        this.ecAVSReply = value;
    }

    /**
     * Obtiene el valor de la propiedad abortReply.
     * 
     * @return
     *     possible object is
     *     {@link AbortReply }
     *     
     */
    public AbortReply getAbortReply() {
        return abortReply;
    }

    /**
     * Define el valor de la propiedad abortReply.
     * 
     * @param value
     *     allowed object is
     *     {@link AbortReply }
     *     
     */
    public void setAbortReply(AbortReply value) {
        this.abortReply = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved.
     * 
     * @return
     *     possible object is
     *     {@link ReplyReserved }
     *     
     */
    public ReplyReserved getReserved() {
        return reserved;
    }

    /**
     * Define el valor de la propiedad reserved.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyReserved }
     *     
     */
    public void setReserved(ReplyReserved value) {
        this.reserved = value;
    }

	@Override
	public String toString() {
		return "ReplyMessage [merchantReferenceCode=" + merchantReferenceCode + ", requestID=" + requestID
				+ ", decision=" + decision + ", reasonCode=" + reasonCode + ", missingField=" + missingField
				+ ", invalidField=" + invalidField + ", requestToken=" + requestToken + ", purchaseTotals="
				+ purchaseTotals + ", deniedPartiesMatch=" + deniedPartiesMatch + ", ccAuthReply=" + ccAuthReply
				+ ", octReply=" + octReply + ", verificationReply=" + verificationReply + ", ccSaleReply=" + ccSaleReply
				+ ", ccSaleCreditReply=" + ccSaleCreditReply + ", ccSaleReversalReply=" + ccSaleReversalReply
				+ ", ccIncrementalAuthReply=" + ccIncrementalAuthReply + ", serviceFeeCalculateReply="
				+ serviceFeeCalculateReply + ", ccCaptureReply=" + ccCaptureReply + ", ccCreditReply=" + ccCreditReply
				+ ", ccAuthReversalReply=" + ccAuthReversalReply + ", ccAutoAuthReversalReply="
				+ ccAutoAuthReversalReply + ", ccDCCReply=" + ccDCCReply + ", ccDCCUpdateReply=" + ccDCCUpdateReply
				+ ", ecDebitReply=" + ecDebitReply + ", ecCreditReply=" + ecCreditReply + ", ecAuthenticateReply="
				+ ecAuthenticateReply + ", payerAuthEnrollReply=" + payerAuthEnrollReply + ", payerAuthValidateReply="
				+ payerAuthValidateReply + ", taxReply=" + taxReply + ", encryptedPayment=" + encryptedPayment
				+ ", encryptPaymentDataReply=" + encryptPaymentDataReply + ", dmeReply=" + dmeReply + ", afsReply="
				+ afsReply + ", davReply=" + davReply + ", exportReply=" + exportReply + ", fxRatesReply="
				+ fxRatesReply + ", bankTransferReply=" + bankTransferReply + ", bankTransferRefundReply="
				+ bankTransferRefundReply + ", bankTransferRealTimeReply=" + bankTransferRealTimeReply
				+ ", directDebitMandateReply=" + directDebitMandateReply + ", directDebitReply=" + directDebitReply
				+ ", directDebitValidateReply=" + directDebitValidateReply + ", directDebitRefundReply="
				+ directDebitRefundReply + ", paySubscriptionCreateReply=" + paySubscriptionCreateReply
				+ ", paySubscriptionUpdateReply=" + paySubscriptionUpdateReply + ", paySubscriptionEventUpdateReply="
				+ paySubscriptionEventUpdateReply + ", paySubscriptionRetrieveReply=" + paySubscriptionRetrieveReply
				+ ", paySubscriptionDeleteReply=" + paySubscriptionDeleteReply + ", payPalPaymentReply="
				+ payPalPaymentReply + ", payPalCreditReply=" + payPalCreditReply + ", voidReply=" + voidReply
				+ ", pinlessDebitReply=" + pinlessDebitReply + ", pinlessDebitValidateReply="
				+ pinlessDebitValidateReply + ", pinlessDebitReversalReply=" + pinlessDebitReversalReply
				+ ", payPalButtonCreateReply=" + payPalButtonCreateReply + ", payPalPreapprovedPaymentReply="
				+ payPalPreapprovedPaymentReply + ", payPalPreapprovedUpdateReply=" + payPalPreapprovedUpdateReply
				+ ", riskUpdateReply=" + riskUpdateReply + ", fraudUpdateReply=" + fraudUpdateReply
				+ ", caseManagementActionReply=" + caseManagementActionReply + ", decisionReply=" + decisionReply
				+ ", payPalRefundReply=" + payPalRefundReply + ", payPalAuthReversalReply=" + payPalAuthReversalReply
				+ ", payPalDoCaptureReply=" + payPalDoCaptureReply + ", payPalEcDoPaymentReply="
				+ payPalEcDoPaymentReply + ", payPalEcGetDetailsReply=" + payPalEcGetDetailsReply
				+ ", payPalEcSetReply=" + payPalEcSetReply + ", payPalAuthorizationReply=" + payPalAuthorizationReply
				+ ", payPalEcOrderSetupReply=" + payPalEcOrderSetupReply + ", payPalUpdateAgreementReply="
				+ payPalUpdateAgreementReply + ", payPalCreateAgreementReply=" + payPalCreateAgreementReply
				+ ", payPalDoRefTransactionReply=" + payPalDoRefTransactionReply + ", chinaPaymentReply="
				+ chinaPaymentReply + ", chinaRefundReply=" + chinaRefundReply + ", boletoPaymentReply="
				+ boletoPaymentReply + ", pinDebitPurchaseReply=" + pinDebitPurchaseReply + ", pinDebitCreditReply="
				+ pinDebitCreditReply + ", pinDebitReversalReply=" + pinDebitReversalReply + ", apInitiateReply="
				+ apInitiateReply + ", apCheckStatusReply=" + apCheckStatusReply + ", receiptNumber=" + receiptNumber
				+ ", additionalData=" + additionalData + ", solutionProviderTransactionID="
				+ solutionProviderTransactionID + ", apReply=" + apReply + ", shipTo=" + shipTo + ", billTo=" + billTo
				+ ", apAuthReply=" + apAuthReply + ", apSessionsReply=" + apSessionsReply + ", apAuthReversalReply="
				+ apAuthReversalReply + ", apCaptureReply=" + apCaptureReply + ", apOptionsReply=" + apOptionsReply
				+ ", apRefundReply=" + apRefundReply + ", apSaleReply=" + apSaleReply + ", apCheckoutDetailsReply="
				+ apCheckoutDetailsReply + ", apTransactionDetailsReply=" + apTransactionDetailsReply
				+ ", apConfirmPurchaseReply=" + apConfirmPurchaseReply + ", promotion=" + promotion
				+ ", promotionGroup=" + promotionGroup + ", payPalGetTxnDetailsReply=" + payPalGetTxnDetailsReply
				+ ", payPalTransactionSearchReply=" + payPalTransactionSearchReply + ", emvReply=" + emvReply
				+ ", originalTransaction=" + originalTransaction + ", hostedDataCreateReply=" + hostedDataCreateReply
				+ ", hostedDataRetrieveReply=" + hostedDataRetrieveReply + ", salesSlipNumber=" + salesSlipNumber
				+ ", additionalProcessorResponse=" + additionalProcessorResponse + ", jpo=" + jpo + ", card=" + card
				+ ", paymentNetworkToken=" + paymentNetworkToken + ", vcReply=" + vcReply
				+ ", decryptVisaCheckoutDataReply=" + decryptVisaCheckoutDataReply + ", getVisaCheckoutDataReply="
				+ getVisaCheckoutDataReply + ", binLookupReply=" + binLookupReply + ", issuerMessage=" + issuerMessage
				+ ", token=" + token + ", issuer=" + issuer + ", recipient=" + recipient + ", feeProgramIndicator="
				+ feeProgramIndicator + ", installment=" + installment + ", paymentAccountReference="
				+ paymentAccountReference + ", authIndicator=" + authIndicator + ", ucaf=" + ucaf + ", network="
				+ network + ", invoiceHeader=" + invoiceHeader + ", apOrderReply=" + apOrderReply + ", apCancelReply="
				+ apCancelReply + ", apBillingAgreementReply=" + apBillingAgreementReply
				+ ", customerVerificationStatus=" + customerVerificationStatus + ", personalID=" + personalID
				+ ", acquirerMerchantNumber=" + acquirerMerchantNumber + ", pos=" + pos + ", issuerMessageAction="
				+ issuerMessageAction + ", customerID=" + customerID + ", routing=" + routing
				+ ", transactionLocalDateTime=" + transactionLocalDateTime + ", apCreateMandateReply="
				+ apCreateMandateReply + ", apMandateStatusReply=" + apMandateStatusReply + ", apUpdateMandateReply="
				+ apUpdateMandateReply + ", apImportMandateReply=" + apImportMandateReply + ", apRevokeMandateReply="
				+ apRevokeMandateReply + ", getMasterpassDataReply=" + getMasterpassDataReply
				+ ", paymentNetworkMerchantID=" + paymentNetworkMerchantID + ", wallet=" + wallet + ", cashbackAmount="
				+ cashbackAmount + ", giftCard=" + giftCard + ", giftCardActivationReply=" + giftCardActivationReply
				+ ", giftCardBalanceInquiryReply=" + giftCardBalanceInquiryReply + ", giftCardRedemptionReply="
				+ giftCardRedemptionReply + ", giftCardVoidReply=" + giftCardVoidReply + ", giftCardReversalReply="
				+ giftCardReversalReply + ", ccCheckStatusReply=" + ccCheckStatusReply + ", ecAVSReply=" + ecAVSReply
				+ ", abortReply=" + abortReply + ", reserved=" + reserved + "]";
	}

    
    
}

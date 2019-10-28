
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Installment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Installment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstInstallmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountFunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountRequestedPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expenses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expensesPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feesPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxesPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalCosts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalCostsPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthlyInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annualInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annualFinancingCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstInstallmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimumTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maximumTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gracePeriodDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gracePeriodDurationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Installment", propOrder = {
    "sequence",
    "totalCount",
    "totalAmount",
    "frequency",
    "amount",
    "planType",
    "firstInstallmentDate",
    "amountFunded",
    "amountRequestedPercentage",
    "expenses",
    "expensesPercentage",
    "fees",
    "feesPercentage",
    "taxes",
    "taxesPercentage",
    "insurance",
    "insurancePercentage",
    "additionalCosts",
    "additionalCostsPercentage",
    "monthlyInterestRate",
    "annualInterestRate",
    "annualFinancingCost",
    "paymentType",
    "invoiceData",
    "downPayment",
    "firstInstallmentAmount",
    "minimumTotalCount",
    "maximumTotalCount",
    "gracePeriodDuration",
    "gracePeriodDurationType"
})
public class Installment {

    protected String sequence;
    protected String totalCount;
    protected String totalAmount;
    protected String frequency;
    protected String amount;
    protected String planType;
    protected String firstInstallmentDate;
    protected String amountFunded;
    protected String amountRequestedPercentage;
    protected String expenses;
    protected String expensesPercentage;
    protected String fees;
    protected String feesPercentage;
    protected String taxes;
    protected String taxesPercentage;
    protected String insurance;
    protected String insurancePercentage;
    protected String additionalCosts;
    protected String additionalCostsPercentage;
    protected String monthlyInterestRate;
    protected String annualInterestRate;
    protected String annualFinancingCost;
    protected String paymentType;
    protected String invoiceData;
    protected String downPayment;
    protected String firstInstallmentAmount;
    protected String minimumTotalCount;
    protected String maximumTotalCount;
    protected String gracePeriodDuration;
    protected String gracePeriodDurationType;

    /**
     * Obtiene el valor de la propiedad sequence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Define el valor de la propiedad sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCount() {
        return totalCount;
    }

    /**
     * Define el valor de la propiedad totalCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCount(String value) {
        this.totalCount = value;
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
     * Obtiene el valor de la propiedad frequency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Define el valor de la propiedad frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
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
     * Obtiene el valor de la propiedad planType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * Define el valor de la propiedad planType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanType(String value) {
        this.planType = value;
    }

    /**
     * Obtiene el valor de la propiedad firstInstallmentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstInstallmentDate() {
        return firstInstallmentDate;
    }

    /**
     * Define el valor de la propiedad firstInstallmentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstInstallmentDate(String value) {
        this.firstInstallmentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad amountFunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountFunded() {
        return amountFunded;
    }

    /**
     * Define el valor de la propiedad amountFunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountFunded(String value) {
        this.amountFunded = value;
    }

    /**
     * Obtiene el valor de la propiedad amountRequestedPercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountRequestedPercentage() {
        return amountRequestedPercentage;
    }

    /**
     * Define el valor de la propiedad amountRequestedPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountRequestedPercentage(String value) {
        this.amountRequestedPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad expenses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpenses() {
        return expenses;
    }

    /**
     * Define el valor de la propiedad expenses.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpenses(String value) {
        this.expenses = value;
    }

    /**
     * Obtiene el valor de la propiedad expensesPercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpensesPercentage() {
        return expensesPercentage;
    }

    /**
     * Define el valor de la propiedad expensesPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpensesPercentage(String value) {
        this.expensesPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad fees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFees() {
        return fees;
    }

    /**
     * Define el valor de la propiedad fees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFees(String value) {
        this.fees = value;
    }

    /**
     * Obtiene el valor de la propiedad feesPercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeesPercentage() {
        return feesPercentage;
    }

    /**
     * Define el valor de la propiedad feesPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeesPercentage(String value) {
        this.feesPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad taxes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxes() {
        return taxes;
    }

    /**
     * Define el valor de la propiedad taxes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxes(String value) {
        this.taxes = value;
    }

    /**
     * Obtiene el valor de la propiedad taxesPercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxesPercentage() {
        return taxesPercentage;
    }

    /**
     * Define el valor de la propiedad taxesPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxesPercentage(String value) {
        this.taxesPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad insurance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     * Define el valor de la propiedad insurance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurance(String value) {
        this.insurance = value;
    }

    /**
     * Obtiene el valor de la propiedad insurancePercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurancePercentage() {
        return insurancePercentage;
    }

    /**
     * Define el valor de la propiedad insurancePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurancePercentage(String value) {
        this.insurancePercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalCosts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCosts() {
        return additionalCosts;
    }

    /**
     * Define el valor de la propiedad additionalCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCosts(String value) {
        this.additionalCosts = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalCostsPercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCostsPercentage() {
        return additionalCostsPercentage;
    }

    /**
     * Define el valor de la propiedad additionalCostsPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCostsPercentage(String value) {
        this.additionalCostsPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad monthlyInterestRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    /**
     * Define el valor de la propiedad monthlyInterestRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyInterestRate(String value) {
        this.monthlyInterestRate = value;
    }

    /**
     * Obtiene el valor de la propiedad annualInterestRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Define el valor de la propiedad annualInterestRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualInterestRate(String value) {
        this.annualInterestRate = value;
    }

    /**
     * Obtiene el valor de la propiedad annualFinancingCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualFinancingCost() {
        return annualFinancingCost;
    }

    /**
     * Define el valor de la propiedad annualFinancingCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualFinancingCost(String value) {
        this.annualFinancingCost = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Define el valor de la propiedad paymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceData() {
        return invoiceData;
    }

    /**
     * Define el valor de la propiedad invoiceData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceData(String value) {
        this.invoiceData = value;
    }

    /**
     * Obtiene el valor de la propiedad downPayment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownPayment() {
        return downPayment;
    }

    /**
     * Define el valor de la propiedad downPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownPayment(String value) {
        this.downPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad firstInstallmentAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstInstallmentAmount() {
        return firstInstallmentAmount;
    }

    /**
     * Define el valor de la propiedad firstInstallmentAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstInstallmentAmount(String value) {
        this.firstInstallmentAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumTotalCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumTotalCount() {
        return minimumTotalCount;
    }

    /**
     * Define el valor de la propiedad minimumTotalCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumTotalCount(String value) {
        this.minimumTotalCount = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumTotalCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumTotalCount() {
        return maximumTotalCount;
    }

    /**
     * Define el valor de la propiedad maximumTotalCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTotalCount(String value) {
        this.maximumTotalCount = value;
    }

    /**
     * Obtiene el valor de la propiedad gracePeriodDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGracePeriodDuration() {
        return gracePeriodDuration;
    }

    /**
     * Define el valor de la propiedad gracePeriodDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGracePeriodDuration(String value) {
        this.gracePeriodDuration = value;
    }

    /**
     * Obtiene el valor de la propiedad gracePeriodDurationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGracePeriodDurationType() {
        return gracePeriodDurationType;
    }

    /**
     * Define el valor de la propiedad gracePeriodDurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGracePeriodDurationType(String value) {
        this.gracePeriodDurationType = value;
    }

}

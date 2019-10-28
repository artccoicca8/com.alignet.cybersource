
package com.cybersource.schemas.transaction.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GECC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GECC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GECC", propOrder = {
    "saleType",
    "planNumber",
    "sequenceNumber",
    "promotionEndDate",
    "promotionPlan",
    "line"
})
public class GECC {

    protected String saleType;
    protected String planNumber;
    protected String sequenceNumber;
    protected String promotionEndDate;
    protected String promotionPlan;
    protected List<String> line;

    /**
     * Obtiene el valor de la propiedad saleType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleType() {
        return saleType;
    }

    /**
     * Define el valor de la propiedad saleType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleType(String value) {
        this.saleType = value;
    }

    /**
     * Obtiene el valor de la propiedad planNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNumber() {
        return planNumber;
    }

    /**
     * Define el valor de la propiedad planNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNumber(String value) {
        this.planNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define el valor de la propiedad sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionEndDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionEndDate() {
        return promotionEndDate;
    }

    /**
     * Define el valor de la propiedad promotionEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionEndDate(String value) {
        this.promotionEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionPlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionPlan() {
        return promotionPlan;
    }

    /**
     * Define el valor de la propiedad promotionPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionPlan(String value) {
        this.promotionPlan = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLine() {
        if (line == null) {
            line = new ArrayList<String>();
        }
        return this.line;
    }

}

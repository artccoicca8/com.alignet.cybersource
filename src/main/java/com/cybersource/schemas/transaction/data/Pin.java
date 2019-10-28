
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Pin complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Pin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entryCapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pin", propOrder = {
    "entryCapability"
})
public class Pin {

    protected String entryCapability;

    /**
     * Obtiene el valor de la propiedad entryCapability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryCapability() {
        return entryCapability;
    }

    /**
     * Define el valor de la propiedad entryCapability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryCapability(String value) {
        this.entryCapability = value;
    }

}

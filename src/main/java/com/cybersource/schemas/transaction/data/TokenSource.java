
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TokenSource complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TokenSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transientToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenSource", propOrder = {
    "transientToken"
})
public class TokenSource {

    protected String transientToken;

    /**
     * Obtiene el valor de la propiedad transientToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransientToken() {
        return transientToken;
    }

    /**
     * Define el valor de la propiedad transientToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransientToken(String value) {
        this.transientToken = value;
    }

}

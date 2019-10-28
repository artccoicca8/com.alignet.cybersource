
package com.cybersource.schemas.transaction.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para APUI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="APUI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colorBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorBorderSelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorButton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCheckbox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCheckboxCheckMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="borderRadius" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APUI", propOrder = {
    "colorBorder",
    "colorBorderSelected",
    "colorButton",
    "colorButtonText",
    "colorCheckbox",
    "colorCheckboxCheckMark",
    "colorHeader",
    "colorLink",
    "colorText",
    "borderRadius",
    "theme"
})
public class APUI {

    protected String colorBorder;
    protected String colorBorderSelected;
    protected String colorButton;
    protected String colorButtonText;
    protected String colorCheckbox;
    protected String colorCheckboxCheckMark;
    protected String colorHeader;
    protected String colorLink;
    protected String colorText;
    protected String borderRadius;
    protected String theme;

    /**
     * Obtiene el valor de la propiedad colorBorder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorBorder() {
        return colorBorder;
    }

    /**
     * Define el valor de la propiedad colorBorder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorBorder(String value) {
        this.colorBorder = value;
    }

    /**
     * Obtiene el valor de la propiedad colorBorderSelected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorBorderSelected() {
        return colorBorderSelected;
    }

    /**
     * Define el valor de la propiedad colorBorderSelected.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorBorderSelected(String value) {
        this.colorBorderSelected = value;
    }

    /**
     * Obtiene el valor de la propiedad colorButton.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorButton() {
        return colorButton;
    }

    /**
     * Define el valor de la propiedad colorButton.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorButton(String value) {
        this.colorButton = value;
    }

    /**
     * Obtiene el valor de la propiedad colorButtonText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorButtonText() {
        return colorButtonText;
    }

    /**
     * Define el valor de la propiedad colorButtonText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorButtonText(String value) {
        this.colorButtonText = value;
    }

    /**
     * Obtiene el valor de la propiedad colorCheckbox.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCheckbox() {
        return colorCheckbox;
    }

    /**
     * Define el valor de la propiedad colorCheckbox.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCheckbox(String value) {
        this.colorCheckbox = value;
    }

    /**
     * Obtiene el valor de la propiedad colorCheckboxCheckMark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCheckboxCheckMark() {
        return colorCheckboxCheckMark;
    }

    /**
     * Define el valor de la propiedad colorCheckboxCheckMark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCheckboxCheckMark(String value) {
        this.colorCheckboxCheckMark = value;
    }

    /**
     * Obtiene el valor de la propiedad colorHeader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorHeader() {
        return colorHeader;
    }

    /**
     * Define el valor de la propiedad colorHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorHeader(String value) {
        this.colorHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad colorLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorLink() {
        return colorLink;
    }

    /**
     * Define el valor de la propiedad colorLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorLink(String value) {
        this.colorLink = value;
    }

    /**
     * Obtiene el valor de la propiedad colorText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorText() {
        return colorText;
    }

    /**
     * Define el valor de la propiedad colorText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorText(String value) {
        this.colorText = value;
    }

    /**
     * Obtiene el valor de la propiedad borderRadius.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRadius() {
        return borderRadius;
    }

    /**
     * Define el valor de la propiedad borderRadius.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRadius(String value) {
        this.borderRadius = value;
    }

    /**
     * Obtiene el valor de la propiedad theme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Define el valor de la propiedad theme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

}

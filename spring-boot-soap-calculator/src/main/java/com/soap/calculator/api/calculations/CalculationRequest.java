//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.13 at 11:20:20 PM IST 
//


package com.soap.calculator.api.calculations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="input1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="input2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operation",
    "input1",
    "input2"
})
@XmlRootElement(name = "CalculationRequest")
public class CalculationRequest {

    @XmlElement(required = true)
    protected String operation;
    protected long input1;
    protected long input2;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the input1 property.
     * 
     */
    public long getInput1() {
        return input1;
    }

    /**
     * Sets the value of the input1 property.
     * 
     */
    public void setInput1(long value) {
        this.input1 = value;
    }

    /**
     * Gets the value of the input2 property.
     * 
     */
    public long getInput2() {
        return input2;
    }

    /**
     * Sets the value of the input2 property.
     * 
     */
    public void setInput2(long value) {
        this.input2 = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.14 at 03:06:44 PM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ValidationProcessArchivalData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationProcessArchivalData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion"&gt;
 *       &lt;attribute name="BestSignatureTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationProcessArchivalData")
public class XmlValidationProcessArchivalData
    extends XmlConstraintsConclusion
{

    @XmlAttribute(name = "BestSignatureTime", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date bestSignatureTime;

    /**
     * Gets the value of the bestSignatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBestSignatureTime() {
        return bestSignatureTime;
    }

    /**
     * Sets the value of the bestSignatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestSignatureTime(Date value) {
        this.bestSignatureTime = value;
    }

}

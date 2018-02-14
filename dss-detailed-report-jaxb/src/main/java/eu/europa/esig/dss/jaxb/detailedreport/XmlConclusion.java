//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.14 at 03:06:44 PM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.validation.policy.rules.Indication;
import eu.europa.esig.dss.validation.policy.rules.SubIndication;


/**
 * <p>Java class for Conclusion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conclusion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Indication" type="{http://dss.esig.europa.eu/validation/detailed-report}Indication"/&gt;
 *         &lt;element name="SubIndication" type="{http://dss.esig.europa.eu/validation/detailed-report}SubIndication" minOccurs="0"/&gt;
 *         &lt;element name="Errors" type="{http://dss.esig.europa.eu/validation/detailed-report}Name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Warnings" type="{http://dss.esig.europa.eu/validation/detailed-report}Name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Infos" type="{http://dss.esig.europa.eu/validation/detailed-report}Name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conclusion", propOrder = {
    "indication",
    "subIndication",
    "errors",
    "warnings",
    "infos"
})
public class XmlConclusion {

    @XmlElement(name = "Indication", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Indication indication;
    @XmlElement(name = "SubIndication", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected SubIndication subIndication;
    @XmlElement(name = "Errors")
    protected List<XmlName> errors;
    @XmlElement(name = "Warnings")
    protected List<XmlName> warnings;
    @XmlElement(name = "Infos")
    protected List<XmlName> infos;

    /**
     * Gets the value of the indication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Indication getIndication() {
        return indication;
    }

    /**
     * Sets the value of the indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndication(Indication value) {
        this.indication = value;
    }

    /**
     * Gets the value of the subIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SubIndication getSubIndication() {
        return subIndication;
    }

    /**
     * Sets the value of the subIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubIndication(SubIndication value) {
        this.subIndication = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlName }
     * 
     * 
     */
    public List<XmlName> getErrors() {
        if (errors == null) {
            errors = new ArrayList<XmlName>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlName }
     * 
     * 
     */
    public List<XmlName> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<XmlName>();
        }
        return this.warnings;
    }

    /**
     * Gets the value of the infos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlName }
     * 
     * 
     */
    public List<XmlName> getInfos() {
        if (infos == null) {
            infos = new ArrayList<XmlName>();
        }
        return this.infos;
    }

}

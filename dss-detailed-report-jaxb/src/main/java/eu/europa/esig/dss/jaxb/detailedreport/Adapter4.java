//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.14 at 03:06:44 PM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.validation.CertificateQualification;

public class Adapter4
    extends XmlAdapter<String, CertificateQualification>
{


    public CertificateQualification unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateQualificationParser.parse(value));
    }

    public String marshal(CertificateQualification value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateQualificationParser.print(value));
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 09:23:34 AM CEST 
//


package eu.europa.esig.jaxb.tsl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.esig.jaxb.tsl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PostalAddresses_QNAME = new QName("http://uri.etsi.org/02231/v2#", "PostalAddresses");
    private final static QName _PostalAddress_QNAME = new QName("http://uri.etsi.org/02231/v2#", "PostalAddress");
    private final static QName _ElectronicAddress_QNAME = new QName("http://uri.etsi.org/02231/v2#", "ElectronicAddress");
    private final static QName _Extension_QNAME = new QName("http://uri.etsi.org/02231/v2#", "Extension");
    private final static QName _TrustServiceStatusList_QNAME = new QName("http://uri.etsi.org/02231/v2#", "TrustServiceStatusList");
    private final static QName _TrustServiceProviderList_QNAME = new QName("http://uri.etsi.org/02231/v2#", "TrustServiceProviderList");
    private final static QName _SchemeInformation_QNAME = new QName("http://uri.etsi.org/02231/v2#", "SchemeInformation");
    private final static QName _TSLType_QNAME = new QName("http://uri.etsi.org/02231/v2#", "TSLType");
    private final static QName _SchemeOperatorName_QNAME = new QName("http://uri.etsi.org/02231/v2#", "SchemeOperatorName");
    private final static QName _SchemeName_QNAME = new QName("http://uri.etsi.org/02231/v2#", "SchemeName");
    private final static QName _SchemeInformationURI_QNAME = new QName("http://uri.etsi.org/02231/v2#", "SchemeInformationURI");
    private final static QName _SchemeTypeCommunityRules_QNAME = new QName("http://uri.etsi.org/02231/v2#", "SchemeTypeCommunityRules");
    private final static QName _SchemeTerritory_QNAME = new QName("http://uri.etsi.org/02231/v2#", "SchemeTerritory");
    private final static QName _PolicyOrLegalNotice_QNAME = new QName("http://uri.etsi.org/02231/v2#", "PolicyOrLegalNotice");
    private final static QName _NextUpdate_QNAME = new QName("http://uri.etsi.org/02231/v2#", "NextUpdate");
    private final static QName _PointersToOtherTSL_QNAME = new QName("http://uri.etsi.org/02231/v2#", "PointersToOtherTSL");
    private final static QName _OtherTSLPointer_QNAME = new QName("http://uri.etsi.org/02231/v2#", "OtherTSLPointer");
    private final static QName _ServiceDigitalIdentities_QNAME = new QName("http://uri.etsi.org/02231/v2#", "ServiceDigitalIdentities");
    private final static QName _AdditionalInformation_QNAME = new QName("http://uri.etsi.org/02231/v2#", "AdditionalInformation");
    private final static QName _DistributionPoints_QNAME = new QName("http://uri.etsi.org/02231/v2#", "DistributionPoints");
    private final static QName _TrustServiceProvider_QNAME = new QName("http://uri.etsi.org/02231/v2#", "TrustServiceProvider");
    private final static QName _TSPInformation_QNAME = new QName("http://uri.etsi.org/02231/v2#", "TSPInformation");
    private final static QName _TSPServices_QNAME = new QName("http://uri.etsi.org/02231/v2#", "TSPServices");
    private final static QName _TSPService_QNAME = new QName("http://uri.etsi.org/02231/v2#", "TSPService");
    private final static QName _ServiceInformation_QNAME = new QName("http://uri.etsi.org/02231/v2#", "ServiceInformation");
    private final static QName _ServiceStatus_QNAME = new QName("http://uri.etsi.org/02231/v2#", "ServiceStatus");
    private final static QName _ServiceSupplyPoints_QNAME = new QName("http://uri.etsi.org/02231/v2#", "ServiceSupplyPoints");
    private final static QName _ServiceTypeIdentifier_QNAME = new QName("http://uri.etsi.org/02231/v2#", "ServiceTypeIdentifier");
    private final static QName _ServiceDigitalIdentity_QNAME = new QName("http://uri.etsi.org/02231/v2#", "ServiceDigitalIdentity");
    private final static QName _ServiceHistory_QNAME = new QName("http://uri.etsi.org/02231/v2#", "ServiceHistory");
    private final static QName _ServiceHistoryInstance_QNAME = new QName("http://uri.etsi.org/02231/v2#", "ServiceHistoryInstance");
    private final static QName _ExpiredCertsRevocationInfo_QNAME = new QName("http://uri.etsi.org/02231/v2#", "ExpiredCertsRevocationInfo");
    private final static QName _AdditionalServiceInformation_QNAME = new QName("http://uri.etsi.org/02231/v2#", "AdditionalServiceInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.esig.jaxb.tsl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostalAddressListType }
     * 
     */
    public PostalAddressListType createPostalAddressListType() {
        return new PostalAddressListType();
    }

    /**
     * Create an instance of {@link PostalAddressType }
     * 
     */
    public PostalAddressType createPostalAddressType() {
        return new PostalAddressType();
    }

    /**
     * Create an instance of {@link ElectronicAddressType }
     * 
     */
    public ElectronicAddressType createElectronicAddressType() {
        return new ElectronicAddressType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link TrustStatusListType }
     * 
     */
    public TrustStatusListType createTrustStatusListType() {
        return new TrustStatusListType();
    }

    /**
     * Create an instance of {@link TrustServiceProviderListType }
     * 
     */
    public TrustServiceProviderListType createTrustServiceProviderListType() {
        return new TrustServiceProviderListType();
    }

    /**
     * Create an instance of {@link TSLSchemeInformationType }
     * 
     */
    public TSLSchemeInformationType createTSLSchemeInformationType() {
        return new TSLSchemeInformationType();
    }

    /**
     * Create an instance of {@link InternationalNamesType }
     * 
     */
    public InternationalNamesType createInternationalNamesType() {
        return new InternationalNamesType();
    }

    /**
     * Create an instance of {@link NonEmptyMultiLangURIListType }
     * 
     */
    public NonEmptyMultiLangURIListType createNonEmptyMultiLangURIListType() {
        return new NonEmptyMultiLangURIListType();
    }

    /**
     * Create an instance of {@link PolicyOrLegalnoticeType }
     * 
     */
    public PolicyOrLegalnoticeType createPolicyOrLegalnoticeType() {
        return new PolicyOrLegalnoticeType();
    }

    /**
     * Create an instance of {@link NextUpdateType }
     * 
     */
    public NextUpdateType createNextUpdateType() {
        return new NextUpdateType();
    }

    /**
     * Create an instance of {@link OtherTSLPointersType }
     * 
     */
    public OtherTSLPointersType createOtherTSLPointersType() {
        return new OtherTSLPointersType();
    }

    /**
     * Create an instance of {@link OtherTSLPointerType }
     * 
     */
    public OtherTSLPointerType createOtherTSLPointerType() {
        return new OtherTSLPointerType();
    }

    /**
     * Create an instance of {@link ServiceDigitalIdentityListType }
     * 
     */
    public ServiceDigitalIdentityListType createServiceDigitalIdentityListType() {
        return new ServiceDigitalIdentityListType();
    }

    /**
     * Create an instance of {@link AdditionalInformationType }
     * 
     */
    public AdditionalInformationType createAdditionalInformationType() {
        return new AdditionalInformationType();
    }

    /**
     * Create an instance of {@link NonEmptyURIListType }
     * 
     */
    public NonEmptyURIListType createNonEmptyURIListType() {
        return new NonEmptyURIListType();
    }

    /**
     * Create an instance of {@link TSPType }
     * 
     */
    public TSPType createTSPType() {
        return new TSPType();
    }

    /**
     * Create an instance of {@link TSPInformationType }
     * 
     */
    public TSPInformationType createTSPInformationType() {
        return new TSPInformationType();
    }

    /**
     * Create an instance of {@link TSPServicesListType }
     * 
     */
    public TSPServicesListType createTSPServicesListType() {
        return new TSPServicesListType();
    }

    /**
     * Create an instance of {@link TSPServiceType }
     * 
     */
    public TSPServiceType createTSPServiceType() {
        return new TSPServiceType();
    }

    /**
     * Create an instance of {@link TSPServiceInformationType }
     * 
     */
    public TSPServiceInformationType createTSPServiceInformationType() {
        return new TSPServiceInformationType();
    }

    /**
     * Create an instance of {@link ServiceSupplyPointsType }
     * 
     */
    public ServiceSupplyPointsType createServiceSupplyPointsType() {
        return new ServiceSupplyPointsType();
    }

    /**
     * Create an instance of {@link DigitalIdentityListType }
     * 
     */
    public DigitalIdentityListType createDigitalIdentityListType() {
        return new DigitalIdentityListType();
    }

    /**
     * Create an instance of {@link ServiceHistoryType }
     * 
     */
    public ServiceHistoryType createServiceHistoryType() {
        return new ServiceHistoryType();
    }

    /**
     * Create an instance of {@link ServiceHistoryInstanceType }
     * 
     */
    public ServiceHistoryInstanceType createServiceHistoryInstanceType() {
        return new ServiceHistoryInstanceType();
    }

    /**
     * Create an instance of {@link AdditionalServiceInformationType }
     * 
     */
    public AdditionalServiceInformationType createAdditionalServiceInformationType() {
        return new AdditionalServiceInformationType();
    }

    /**
     * Create an instance of {@link MultiLangNormStringType }
     * 
     */
    public MultiLangNormStringType createMultiLangNormStringType() {
        return new MultiLangNormStringType();
    }

    /**
     * Create an instance of {@link MultiLangStringType }
     * 
     */
    public MultiLangStringType createMultiLangStringType() {
        return new MultiLangStringType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link AnyType }
     * 
     */
    public AnyType createAnyType() {
        return new AnyType();
    }

    /**
     * Create an instance of {@link ExtensionsListType }
     * 
     */
    public ExtensionsListType createExtensionsListType() {
        return new ExtensionsListType();
    }

    /**
     * Create an instance of {@link NonEmptyMultiLangURIType }
     * 
     */
    public NonEmptyMultiLangURIType createNonEmptyMultiLangURIType() {
        return new NonEmptyMultiLangURIType();
    }

    /**
     * Create an instance of {@link DigitalIdentityType }
     * 
     */
    public DigitalIdentityType createDigitalIdentityType() {
        return new DigitalIdentityType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalAddressListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "PostalAddresses")
    public JAXBElement<PostalAddressListType> createPostalAddresses(PostalAddressListType value) {
        return new JAXBElement<PostalAddressListType>(_PostalAddresses_QNAME, PostalAddressListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "PostalAddress")
    public JAXBElement<PostalAddressType> createPostalAddress(PostalAddressType value) {
        return new JAXBElement<PostalAddressType>(_PostalAddress_QNAME, PostalAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "ElectronicAddress")
    public JAXBElement<ElectronicAddressType> createElectronicAddress(ElectronicAddressType value) {
        return new JAXBElement<ElectronicAddressType>(_ElectronicAddress_QNAME, ElectronicAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "Extension")
    public JAXBElement<ExtensionType> createExtension(ExtensionType value) {
        return new JAXBElement<ExtensionType>(_Extension_QNAME, ExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustStatusListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "TrustServiceStatusList")
    public JAXBElement<TrustStatusListType> createTrustServiceStatusList(TrustStatusListType value) {
        return new JAXBElement<TrustStatusListType>(_TrustServiceStatusList_QNAME, TrustStatusListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustServiceProviderListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "TrustServiceProviderList")
    public JAXBElement<TrustServiceProviderListType> createTrustServiceProviderList(TrustServiceProviderListType value) {
        return new JAXBElement<TrustServiceProviderListType>(_TrustServiceProviderList_QNAME, TrustServiceProviderListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSLSchemeInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "SchemeInformation")
    public JAXBElement<TSLSchemeInformationType> createSchemeInformation(TSLSchemeInformationType value) {
        return new JAXBElement<TSLSchemeInformationType>(_SchemeInformation_QNAME, TSLSchemeInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "TSLType")
    public JAXBElement<String> createTSLType(String value) {
        return new JAXBElement<String>(_TSLType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalNamesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "SchemeOperatorName")
    public JAXBElement<InternationalNamesType> createSchemeOperatorName(InternationalNamesType value) {
        return new JAXBElement<InternationalNamesType>(_SchemeOperatorName_QNAME, InternationalNamesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalNamesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "SchemeName")
    public JAXBElement<InternationalNamesType> createSchemeName(InternationalNamesType value) {
        return new JAXBElement<InternationalNamesType>(_SchemeName_QNAME, InternationalNamesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonEmptyMultiLangURIListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "SchemeInformationURI")
    public JAXBElement<NonEmptyMultiLangURIListType> createSchemeInformationURI(NonEmptyMultiLangURIListType value) {
        return new JAXBElement<NonEmptyMultiLangURIListType>(_SchemeInformationURI_QNAME, NonEmptyMultiLangURIListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonEmptyMultiLangURIListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "SchemeTypeCommunityRules")
    public JAXBElement<NonEmptyMultiLangURIListType> createSchemeTypeCommunityRules(NonEmptyMultiLangURIListType value) {
        return new JAXBElement<NonEmptyMultiLangURIListType>(_SchemeTypeCommunityRules_QNAME, NonEmptyMultiLangURIListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "SchemeTerritory")
    public JAXBElement<String> createSchemeTerritory(String value) {
        return new JAXBElement<String>(_SchemeTerritory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyOrLegalnoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "PolicyOrLegalNotice")
    public JAXBElement<PolicyOrLegalnoticeType> createPolicyOrLegalNotice(PolicyOrLegalnoticeType value) {
        return new JAXBElement<PolicyOrLegalnoticeType>(_PolicyOrLegalNotice_QNAME, PolicyOrLegalnoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "NextUpdate")
    public JAXBElement<NextUpdateType> createNextUpdate(NextUpdateType value) {
        return new JAXBElement<NextUpdateType>(_NextUpdate_QNAME, NextUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherTSLPointersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "PointersToOtherTSL")
    public JAXBElement<OtherTSLPointersType> createPointersToOtherTSL(OtherTSLPointersType value) {
        return new JAXBElement<OtherTSLPointersType>(_PointersToOtherTSL_QNAME, OtherTSLPointersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherTSLPointerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "OtherTSLPointer")
    public JAXBElement<OtherTSLPointerType> createOtherTSLPointer(OtherTSLPointerType value) {
        return new JAXBElement<OtherTSLPointerType>(_OtherTSLPointer_QNAME, OtherTSLPointerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDigitalIdentityListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "ServiceDigitalIdentities")
    public JAXBElement<ServiceDigitalIdentityListType> createServiceDigitalIdentities(ServiceDigitalIdentityListType value) {
        return new JAXBElement<ServiceDigitalIdentityListType>(_ServiceDigitalIdentities_QNAME, ServiceDigitalIdentityListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "AdditionalInformation")
    public JAXBElement<AdditionalInformationType> createAdditionalInformation(AdditionalInformationType value) {
        return new JAXBElement<AdditionalInformationType>(_AdditionalInformation_QNAME, AdditionalInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonEmptyURIListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "DistributionPoints")
    public JAXBElement<NonEmptyURIListType> createDistributionPoints(NonEmptyURIListType value) {
        return new JAXBElement<NonEmptyURIListType>(_DistributionPoints_QNAME, NonEmptyURIListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "TrustServiceProvider")
    public JAXBElement<TSPType> createTrustServiceProvider(TSPType value) {
        return new JAXBElement<TSPType>(_TrustServiceProvider_QNAME, TSPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSPInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "TSPInformation")
    public JAXBElement<TSPInformationType> createTSPInformation(TSPInformationType value) {
        return new JAXBElement<TSPInformationType>(_TSPInformation_QNAME, TSPInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSPServicesListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "TSPServices")
    public JAXBElement<TSPServicesListType> createTSPServices(TSPServicesListType value) {
        return new JAXBElement<TSPServicesListType>(_TSPServices_QNAME, TSPServicesListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSPServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "TSPService")
    public JAXBElement<TSPServiceType> createTSPService(TSPServiceType value) {
        return new JAXBElement<TSPServiceType>(_TSPService_QNAME, TSPServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSPServiceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "ServiceInformation")
    public JAXBElement<TSPServiceInformationType> createServiceInformation(TSPServiceInformationType value) {
        return new JAXBElement<TSPServiceInformationType>(_ServiceInformation_QNAME, TSPServiceInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "ServiceStatus")
    public JAXBElement<String> createServiceStatus(String value) {
        return new JAXBElement<String>(_ServiceStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceSupplyPointsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "ServiceSupplyPoints")
    public JAXBElement<ServiceSupplyPointsType> createServiceSupplyPoints(ServiceSupplyPointsType value) {
        return new JAXBElement<ServiceSupplyPointsType>(_ServiceSupplyPoints_QNAME, ServiceSupplyPointsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "ServiceTypeIdentifier")
    public JAXBElement<String> createServiceTypeIdentifier(String value) {
        return new JAXBElement<String>(_ServiceTypeIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigitalIdentityListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "ServiceDigitalIdentity")
    public JAXBElement<DigitalIdentityListType> createServiceDigitalIdentity(DigitalIdentityListType value) {
        return new JAXBElement<DigitalIdentityListType>(_ServiceDigitalIdentity_QNAME, DigitalIdentityListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "ServiceHistory")
    public JAXBElement<ServiceHistoryType> createServiceHistory(ServiceHistoryType value) {
        return new JAXBElement<ServiceHistoryType>(_ServiceHistory_QNAME, ServiceHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceHistoryInstanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "ServiceHistoryInstance")
    public JAXBElement<ServiceHistoryInstanceType> createServiceHistoryInstance(ServiceHistoryInstanceType value) {
        return new JAXBElement<ServiceHistoryInstanceType>(_ServiceHistoryInstance_QNAME, ServiceHistoryInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "ExpiredCertsRevocationInfo")
    public JAXBElement<XMLGregorianCalendar> createExpiredCertsRevocationInfo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExpiredCertsRevocationInfo_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalServiceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2#", name = "AdditionalServiceInformation")
    public JAXBElement<AdditionalServiceInformationType> createAdditionalServiceInformation(AdditionalServiceInformationType value) {
        return new JAXBElement<AdditionalServiceInformationType>(_AdditionalServiceInformation_QNAME, AdditionalServiceInformationType.class, null, value);
    }

}

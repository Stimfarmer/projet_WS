//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 01:16:20 PM UTC 
//


package jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxb package. 
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

    private final static QName _Utilisateurs_QNAME = new QName("http://www.example.org/database", "utilisateurs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UtilisateursType }
     * 
     */
    public UtilisateursType createUtilisateursType() {
        return new UtilisateursType();
    }

    /**
     * Create an instance of {@link EnregistrementsType }
     * 
     */
    public EnregistrementsType createEnregistrementsType() {
        return new EnregistrementsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilisateursType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/database", name = "utilisateurs")
    public JAXBElement<UtilisateursType> createUtilisateurs(UtilisateursType value) {
        return new JAXBElement<UtilisateursType>(_Utilisateurs_QNAME, UtilisateursType.class, null, value);
    }

}

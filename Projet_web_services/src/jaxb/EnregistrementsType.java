//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.03.20 à 01:43:27 PM CET 
//


package jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour enregistrementsType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="enregistrementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email_utilisateur">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mdp_utilisateur">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *               &lt;minLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="type_utilisateur">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="admin"/>
 *               &lt;enumeration value="client"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nom_utilisateur">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prenom_utilisateur">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enregistrementsType", propOrder = {
    "emailUtilisateur",
    "mdpUtilisateur",
    "typeUtilisateur",
    "nomUtilisateur",
    "prenomUtilisateur"
})
public class EnregistrementsType {

    @XmlElement(name = "email_utilisateur", required = true)
    protected String emailUtilisateur;
    @XmlElement(name = "mdp_utilisateur", required = true)
    protected String mdpUtilisateur;
    @XmlElement(name = "type_utilisateur", required = true)
    protected String typeUtilisateur;
    @XmlElement(name = "nom_utilisateur", required = true)
    protected String nomUtilisateur;
    @XmlElement(name = "prenom_utilisateur", required = true)
    protected String prenomUtilisateur;

    /**
     * Obtient la valeur de la propriété emailUtilisateur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailUtilisateur() {
        return emailUtilisateur;
    }

    /**
     * Définit la valeur de la propriété emailUtilisateur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailUtilisateur(String value) {
        this.emailUtilisateur = value;
    }

    /**
     * Obtient la valeur de la propriété mdpUtilisateur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdpUtilisateur() {
        return mdpUtilisateur;
    }

    /**
     * Définit la valeur de la propriété mdpUtilisateur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdpUtilisateur(String value) {
        this.mdpUtilisateur = value;
    }

    /**
     * Obtient la valeur de la propriété typeUtilisateur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeUtilisateur() {
        return typeUtilisateur;
    }

    /**
     * Définit la valeur de la propriété typeUtilisateur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeUtilisateur(String value) {
        this.typeUtilisateur = value;
    }

    /**
     * Obtient la valeur de la propriété nomUtilisateur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    /**
     * Définit la valeur de la propriété nomUtilisateur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomUtilisateur(String value) {
        this.nomUtilisateur = value;
    }

    /**
     * Obtient la valeur de la propriété prenomUtilisateur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    /**
     * Définit la valeur de la propriété prenomUtilisateur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomUtilisateur(String value) {
        this.prenomUtilisateur = value;
    }

}

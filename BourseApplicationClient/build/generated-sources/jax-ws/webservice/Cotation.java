
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour cotation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cotation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeSociete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateCotation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="numCotation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="valAction" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotation", propOrder = {
    "codeSociete",
    "dateCotation",
    "numCotation",
    "valAction"
})
public class Cotation {

    protected String codeSociete;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCotation;
    protected int numCotation;
    protected float valAction;

    /**
     * Obtient la valeur de la propriété codeSociete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSociete() {
        return codeSociete;
    }

    /**
     * Définit la valeur de la propriété codeSociete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSociete(String value) {
        this.codeSociete = value;
    }

    /**
     * Obtient la valeur de la propriété dateCotation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCotation() {
        return dateCotation;
    }

    /**
     * Définit la valeur de la propriété dateCotation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCotation(XMLGregorianCalendar value) {
        this.dateCotation = value;
    }

    /**
     * Obtient la valeur de la propriété numCotation.
     * 
     */
    public int getNumCotation() {
        return numCotation;
    }

    /**
     * Définit la valeur de la propriété numCotation.
     * 
     */
    public void setNumCotation(int value) {
        this.numCotation = value;
    }

    /**
     * Obtient la valeur de la propriété valAction.
     * 
     */
    public float getValAction() {
        return valAction;
    }

    /**
     * Définit la valeur de la propriété valAction.
     * 
     */
    public void setValAction(float value) {
        this.valAction = value;
    }

}

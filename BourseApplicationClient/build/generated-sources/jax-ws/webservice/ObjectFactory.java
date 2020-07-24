
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _Liste_QNAME = new QName("http://webservice/", "liste");
    private final static QName _ListeResponse_QNAME = new QName("http://webservice/", "listeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Liste }
     * 
     */
    public Liste createListe() {
        return new Liste();
    }

    /**
     * Create an instance of {@link ListeResponse }
     * 
     */
    public ListeResponse createListeResponse() {
        return new ListeResponse();
    }

    /**
     * Create an instance of {@link Cotation }
     * 
     */
    public Cotation createCotation() {
        return new Cotation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Liste }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "liste")
    public JAXBElement<Liste> createListe(Liste value) {
        return new JAXBElement<Liste>(_Liste_QNAME, Liste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "listeResponse")
    public JAXBElement<ListeResponse> createListeResponse(ListeResponse value) {
        return new JAXBElement<ListeResponse>(_ListeResponse_QNAME, ListeResponse.class, null, value);
    }

}

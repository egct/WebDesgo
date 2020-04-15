
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para direccionDDPLote complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="direccionDDPLote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CALLEP_DLOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_DLOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="INTERSECCION_DLOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NO_DLOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "direccionDDPLote", propOrder = {
    "callepdlote",
    "iddlote",
    "intersecciondlote",
    "nodlote"
})
public class DireccionDDPLote {

    @XmlElement(name = "CALLEP_DLOTE")
    protected String callepdlote;
    @XmlElement(name = "ID_DLOTE")
    protected Integer iddlote;
    @XmlElement(name = "INTERSECCION_DLOTE")
    protected String intersecciondlote;
    @XmlElement(name = "NO_DLOTE")
    protected String nodlote;

    /**
     * Obtiene el valor de la propiedad callepdlote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALLEPDLOTE() {
        return callepdlote;
    }

    /**
     * Define el valor de la propiedad callepdlote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALLEPDLOTE(String value) {
        this.callepdlote = value;
    }

    /**
     * Obtiene el valor de la propiedad iddlote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDDLOTE() {
        return iddlote;
    }

    /**
     * Define el valor de la propiedad iddlote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDDLOTE(Integer value) {
        this.iddlote = value;
    }

    /**
     * Obtiene el valor de la propiedad intersecciondlote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERSECCIONDLOTE() {
        return intersecciondlote;
    }

    /**
     * Define el valor de la propiedad intersecciondlote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERSECCIONDLOTE(String value) {
        this.intersecciondlote = value;
    }

    /**
     * Obtiene el valor de la propiedad nodlote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNODLOTE() {
        return nodlote;
    }

    /**
     * Define el valor de la propiedad nodlote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNODLOTE(String value) {
        this.nodlote = value;
    }

}

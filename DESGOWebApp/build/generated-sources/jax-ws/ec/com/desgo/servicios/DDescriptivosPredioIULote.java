
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dDescriptivosPredioIULote complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dDescriptivosPredioIULote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_DDPLOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ID_DLOTE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NOMBREEDIFICIO_DDPLOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRESECTOR_DDPLOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGIMENTENECIA_DDPLOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TIPOPREDIO_DDPLOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USOPREDIO_DDPLOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dDPLote" type="{http://servicios.desgo.com.ec/}direccionDDPLote" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDescriptivosPredioIULote", propOrder = {
    "idddplote",
    "iddlote",
    "nombreedificioddplote",
    "nombresectorddplote",
    "regimenteneciaddplote",
    "tipopredioddplote",
    "usopredioddplote",
    "ddpLote"
})
public class DDescriptivosPredioIULote {

    @XmlElement(name = "ID_DDPLOTE")
    protected Integer idddplote;
    @XmlElement(name = "ID_DLOTE")
    protected Integer iddlote;
    @XmlElement(name = "NOMBREEDIFICIO_DDPLOTE")
    protected String nombreedificioddplote;
    @XmlElement(name = "NOMBRESECTOR_DDPLOTE")
    protected String nombresectorddplote;
    @XmlElement(name = "REGIMENTENECIA_DDPLOTE")
    protected String regimenteneciaddplote;
    @XmlElement(name = "TIPOPREDIO_DDPLOTE")
    protected String tipopredioddplote;
    @XmlElement(name = "USOPREDIO_DDPLOTE")
    protected String usopredioddplote;
    @XmlElement(name = "dDPLote")
    protected DireccionDDPLote ddpLote;

    /**
     * Obtiene el valor de la propiedad idddplote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDDDPLOTE() {
        return idddplote;
    }

    /**
     * Define el valor de la propiedad idddplote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDDDPLOTE(Integer value) {
        this.idddplote = value;
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
     * Obtiene el valor de la propiedad nombreedificioddplote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREEDIFICIODDPLOTE() {
        return nombreedificioddplote;
    }

    /**
     * Define el valor de la propiedad nombreedificioddplote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREEDIFICIODDPLOTE(String value) {
        this.nombreedificioddplote = value;
    }

    /**
     * Obtiene el valor de la propiedad nombresectorddplote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRESECTORDDPLOTE() {
        return nombresectorddplote;
    }

    /**
     * Define el valor de la propiedad nombresectorddplote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRESECTORDDPLOTE(String value) {
        this.nombresectorddplote = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenteneciaddplote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGIMENTENECIADDPLOTE() {
        return regimenteneciaddplote;
    }

    /**
     * Define el valor de la propiedad regimenteneciaddplote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGIMENTENECIADDPLOTE(String value) {
        this.regimenteneciaddplote = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopredioddplote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPREDIODDPLOTE() {
        return tipopredioddplote;
    }

    /**
     * Define el valor de la propiedad tipopredioddplote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPREDIODDPLOTE(String value) {
        this.tipopredioddplote = value;
    }

    /**
     * Obtiene el valor de la propiedad usopredioddplote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSOPREDIODDPLOTE() {
        return usopredioddplote;
    }

    /**
     * Define el valor de la propiedad usopredioddplote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSOPREDIODDPLOTE(String value) {
        this.usopredioddplote = value;
    }

    /**
     * Obtiene el valor de la propiedad ddpLote.
     * 
     * @return
     *     possible object is
     *     {@link DireccionDDPLote }
     *     
     */
    public DireccionDDPLote getDDPLote() {
        return ddpLote;
    }

    /**
     * Define el valor de la propiedad ddpLote.
     * 
     * @param value
     *     allowed object is
     *     {@link DireccionDDPLote }
     *     
     */
    public void setDDPLote(DireccionDDPLote value) {
        this.ddpLote = value;
    }

}

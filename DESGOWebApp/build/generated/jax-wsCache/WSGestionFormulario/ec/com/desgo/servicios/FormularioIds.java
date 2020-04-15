
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formularioIds complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formularioIds"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caracterizacionC_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="caracterizacionL_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codigo_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="economica_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="elementosC_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="estado_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="graficosP_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idFormulario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idUsuario_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="identificacionL_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="identificacionU_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="limites_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mapa_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mejora_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="responsables_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="vivienda_F" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formularioIds", propOrder = {
    "caracterizacionCF",
    "caracterizacionLF",
    "codigoF",
    "economicaF",
    "elementosCF",
    "estadoF",
    "graficosPF",
    "idFormulario",
    "idUsuarioF",
    "identificacionLF",
    "identificacionUF",
    "limitesF",
    "mapaF",
    "mejoraF",
    "responsablesF",
    "viviendaF"
})
public class FormularioIds {

    @XmlElement(name = "caracterizacionC_F")
    protected Integer caracterizacionCF;
    @XmlElement(name = "caracterizacionL_F")
    protected Integer caracterizacionLF;
    @XmlElement(name = "codigo_F")
    protected Integer codigoF;
    @XmlElement(name = "economica_F")
    protected Integer economicaF;
    @XmlElement(name = "elementosC_F")
    protected Integer elementosCF;
    @XmlElement(name = "estado_F")
    protected Integer estadoF;
    @XmlElement(name = "graficosP_F")
    protected Integer graficosPF;
    protected Integer idFormulario;
    @XmlElement(name = "idUsuario_F")
    protected Integer idUsuarioF;
    @XmlElement(name = "identificacionL_F")
    protected Integer identificacionLF;
    @XmlElement(name = "identificacionU_F")
    protected Integer identificacionUF;
    @XmlElement(name = "limites_F")
    protected Integer limitesF;
    @XmlElement(name = "mapa_F")
    protected Integer mapaF;
    @XmlElement(name = "mejora_F")
    protected Integer mejoraF;
    @XmlElement(name = "responsables_F")
    protected Integer responsablesF;
    @XmlElement(name = "vivienda_F")
    protected Integer viviendaF;

    /**
     * Obtiene el valor de la propiedad caracterizacionCF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaracterizacionCF() {
        return caracterizacionCF;
    }

    /**
     * Define el valor de la propiedad caracterizacionCF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaracterizacionCF(Integer value) {
        this.caracterizacionCF = value;
    }

    /**
     * Obtiene el valor de la propiedad caracterizacionLF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaracterizacionLF() {
        return caracterizacionLF;
    }

    /**
     * Define el valor de la propiedad caracterizacionLF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaracterizacionLF(Integer value) {
        this.caracterizacionLF = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoF() {
        return codigoF;
    }

    /**
     * Define el valor de la propiedad codigoF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoF(Integer value) {
        this.codigoF = value;
    }

    /**
     * Obtiene el valor de la propiedad economicaF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEconomicaF() {
        return economicaF;
    }

    /**
     * Define el valor de la propiedad economicaF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEconomicaF(Integer value) {
        this.economicaF = value;
    }

    /**
     * Obtiene el valor de la propiedad elementosCF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElementosCF() {
        return elementosCF;
    }

    /**
     * Define el valor de la propiedad elementosCF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElementosCF(Integer value) {
        this.elementosCF = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstadoF() {
        return estadoF;
    }

    /**
     * Define el valor de la propiedad estadoF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstadoF(Integer value) {
        this.estadoF = value;
    }

    /**
     * Obtiene el valor de la propiedad graficosPF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGraficosPF() {
        return graficosPF;
    }

    /**
     * Define el valor de la propiedad graficosPF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGraficosPF(Integer value) {
        this.graficosPF = value;
    }

    /**
     * Obtiene el valor de la propiedad idFormulario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFormulario() {
        return idFormulario;
    }

    /**
     * Define el valor de la propiedad idFormulario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFormulario(Integer value) {
        this.idFormulario = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuarioF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUsuarioF() {
        return idUsuarioF;
    }

    /**
     * Define el valor de la propiedad idUsuarioF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUsuarioF(Integer value) {
        this.idUsuarioF = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionLF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdentificacionLF() {
        return identificacionLF;
    }

    /**
     * Define el valor de la propiedad identificacionLF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdentificacionLF(Integer value) {
        this.identificacionLF = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionUF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdentificacionUF() {
        return identificacionUF;
    }

    /**
     * Define el valor de la propiedad identificacionUF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdentificacionUF(Integer value) {
        this.identificacionUF = value;
    }

    /**
     * Obtiene el valor de la propiedad limitesF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimitesF() {
        return limitesF;
    }

    /**
     * Define el valor de la propiedad limitesF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimitesF(Integer value) {
        this.limitesF = value;
    }

    /**
     * Obtiene el valor de la propiedad mapaF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMapaF() {
        return mapaF;
    }

    /**
     * Define el valor de la propiedad mapaF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMapaF(Integer value) {
        this.mapaF = value;
    }

    /**
     * Obtiene el valor de la propiedad mejoraF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMejoraF() {
        return mejoraF;
    }

    /**
     * Define el valor de la propiedad mejoraF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMejoraF(Integer value) {
        this.mejoraF = value;
    }

    /**
     * Obtiene el valor de la propiedad responsablesF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponsablesF() {
        return responsablesF;
    }

    /**
     * Define el valor de la propiedad responsablesF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponsablesF(Integer value) {
        this.responsablesF = value;
    }

    /**
     * Obtiene el valor de la propiedad viviendaF.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getViviendaF() {
        return viviendaF;
    }

    /**
     * Define el valor de la propiedad viviendaF.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setViviendaF(Integer value) {
        this.viviendaF = value;
    }

}

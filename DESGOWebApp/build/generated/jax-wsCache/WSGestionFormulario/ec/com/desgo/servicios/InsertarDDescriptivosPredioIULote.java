
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarDDescriptivosPredio_IULote complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarDDescriptivosPredio_IULote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dDescriptivosPredio_IULote" type="{http://servicios.desgo.com.ec/}dDescriptivosPredioIULote" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarDDescriptivosPredio_IULote", propOrder = {
    "dDescriptivosPredioIULote"
})
public class InsertarDDescriptivosPredioIULote {

    @XmlElement(name = "dDescriptivosPredio_IULote")
    protected DDescriptivosPredioIULote dDescriptivosPredioIULote;

    /**
     * Obtiene el valor de la propiedad dDescriptivosPredioIULote.
     * 
     * @return
     *     possible object is
     *     {@link DDescriptivosPredioIULote }
     *     
     */
    public DDescriptivosPredioIULote getDDescriptivosPredioIULote() {
        return dDescriptivosPredioIULote;
    }

    /**
     * Define el valor de la propiedad dDescriptivosPredioIULote.
     * 
     * @param value
     *     allowed object is
     *     {@link DDescriptivosPredioIULote }
     *     
     */
    public void setDDescriptivosPredioIULote(DDescriptivosPredioIULote value) {
        this.dDescriptivosPredioIULote = value;
    }

}

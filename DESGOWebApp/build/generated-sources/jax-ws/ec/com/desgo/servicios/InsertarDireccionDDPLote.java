
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarDireccion_DDPLote complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarDireccion_DDPLote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="direccion_DDPLote" type="{http://servicios.desgo.com.ec/}direccionDDPLote" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarDireccion_DDPLote", propOrder = {
    "direccionDDPLote"
})
public class InsertarDireccionDDPLote {

    @XmlElement(name = "direccion_DDPLote")
    protected DireccionDDPLote direccionDDPLote;

    /**
     * Obtiene el valor de la propiedad direccionDDPLote.
     * 
     * @return
     *     possible object is
     *     {@link DireccionDDPLote }
     *     
     */
    public DireccionDDPLote getDireccionDDPLote() {
        return direccionDDPLote;
    }

    /**
     * Define el valor de la propiedad direccionDDPLote.
     * 
     * @param value
     *     allowed object is
     *     {@link DireccionDDPLote }
     *     
     */
    public void setDireccionDDPLote(DireccionDDPLote value) {
        this.direccionDDPLote = value;
    }

}

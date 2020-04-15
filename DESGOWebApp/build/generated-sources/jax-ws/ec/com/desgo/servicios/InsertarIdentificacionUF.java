
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarIdentificacionU_F complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarIdentificacionU_F"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacionU_F" type="{http://servicios.desgo.com.ec/}identificacionUF" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarIdentificacionU_F", propOrder = {
    "identificacionUF"
})
public class InsertarIdentificacionUF {

    @XmlElement(name = "identificacionU_F")
    protected IdentificacionUF identificacionUF;

    /**
     * Obtiene el valor de la propiedad identificacionUF.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionUF }
     *     
     */
    public IdentificacionUF getIdentificacionUF() {
        return identificacionUF;
    }

    /**
     * Define el valor de la propiedad identificacionUF.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionUF }
     *     
     */
    public void setIdentificacionUF(IdentificacionUF value) {
        this.identificacionUF = value;
    }

}

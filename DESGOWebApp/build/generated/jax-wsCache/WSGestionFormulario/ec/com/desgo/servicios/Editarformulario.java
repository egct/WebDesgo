
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para editarformulario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="editarformulario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formulario" type="{http://servicios.desgo.com.ec/}formulario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editarformulario", propOrder = {
    "formulario"
})
public class Editarformulario {

    protected Formulario formulario;

    /**
     * Obtiene el valor de la propiedad formulario.
     * 
     * @return
     *     possible object is
     *     {@link Formulario }
     *     
     */
    public Formulario getFormulario() {
        return formulario;
    }

    /**
     * Define el valor de la propiedad formulario.
     * 
     * @param value
     *     allowed object is
     *     {@link Formulario }
     *     
     */
    public void setFormulario(Formulario value) {
        this.formulario = value;
    }

}

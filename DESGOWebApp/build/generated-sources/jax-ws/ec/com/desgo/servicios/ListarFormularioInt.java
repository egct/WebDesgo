
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listarFormularioInt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listarFormularioInt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formularioIds" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iulote" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarFormularioInt", propOrder = {
    "formularioIds",
    "iulote"
})
public class ListarFormularioInt {

    protected int formularioIds;
    protected int iulote;

    /**
     * Obtiene el valor de la propiedad formularioIds.
     * 
     */
    public int getFormularioIds() {
        return formularioIds;
    }

    /**
     * Define el valor de la propiedad formularioIds.
     * 
     */
    public void setFormularioIds(int value) {
        this.formularioIds = value;
    }

    /**
     * Obtiene el valor de la propiedad iulote.
     * 
     */
    public int getIulote() {
        return iulote;
    }

    /**
     * Define el valor de la propiedad iulote.
     * 
     */
    public void setIulote(int value) {
        this.iulote = value;
    }

}

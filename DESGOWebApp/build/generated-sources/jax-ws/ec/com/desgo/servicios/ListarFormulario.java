
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listarFormulario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listarFormulario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{http://servicios.desgo.com.ec/}user" minOccurs="0"/&gt;
 *         &lt;element name="formularioIds" type="{http://servicios.desgo.com.ec/}formularioIds" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarFormulario", propOrder = {
    "user",
    "formularioIds"
})
public class ListarFormulario {

    protected User user;
    protected FormularioIds formularioIds;

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad formularioIds.
     * 
     * @return
     *     possible object is
     *     {@link FormularioIds }
     *     
     */
    public FormularioIds getFormularioIds() {
        return formularioIds;
    }

    /**
     * Define el valor de la propiedad formularioIds.
     * 
     * @param value
     *     allowed object is
     *     {@link FormularioIds }
     *     
     */
    public void setFormularioIds(FormularioIds value) {
        this.formularioIds = value;
    }

}

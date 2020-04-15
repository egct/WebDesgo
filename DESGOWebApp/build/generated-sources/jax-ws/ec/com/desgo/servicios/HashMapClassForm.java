
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hashMapClassForm complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hashMapClassForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="form" type="{http://servicios.desgo.com.ec/}formularioIds" minOccurs="0"/&gt;
 *         &lt;element name="us" type="{http://servicios.desgo.com.ec/}user" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hashMapClassForm", propOrder = {
    "form",
    "us"
})
public class HashMapClassForm {

    protected FormularioIds form;
    protected User us;

    /**
     * Obtiene el valor de la propiedad form.
     * 
     * @return
     *     possible object is
     *     {@link FormularioIds }
     *     
     */
    public FormularioIds getForm() {
        return form;
    }

    /**
     * Define el valor de la propiedad form.
     * 
     * @param value
     *     allowed object is
     *     {@link FormularioIds }
     *     
     */
    public void setForm(FormularioIds value) {
        this.form = value;
    }

    /**
     * Obtiene el valor de la propiedad us.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUs() {
        return us;
    }

    /**
     * Define el valor de la propiedad us.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUs(User value) {
        this.us = value;
    }

}

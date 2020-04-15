
package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asigUserFormulario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asigUserFormulario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idForm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asigUserFormulario", propOrder = {
    "idUser",
    "idForm"
})
public class AsigUserFormulario {

    protected int idUser;
    protected int idForm;

    /**
     * Obtiene el valor de la propiedad idUser.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Define el valor de la propiedad idUser.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Obtiene el valor de la propiedad idForm.
     * 
     */
    public int getIdForm() {
        return idForm;
    }

    /**
     * Define el valor de la propiedad idForm.
     * 
     */
    public void setIdForm(int value) {
        this.idForm = value;
    }

}


package ec.com.desgo.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiopruebaAWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambiopruebaAWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pruebaaws" type="{http://servicios.desgo.com.ec/}pruebaAws" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiopruebaAWS", propOrder = {
    "pruebaaws"
})
public class CambiopruebaAWS {

    protected PruebaAws pruebaaws;

    /**
     * Obtiene el valor de la propiedad pruebaaws.
     * 
     * @return
     *     possible object is
     *     {@link PruebaAws }
     *     
     */
    public PruebaAws getPruebaaws() {
        return pruebaaws;
    }

    /**
     * Define el valor de la propiedad pruebaaws.
     * 
     * @param value
     *     allowed object is
     *     {@link PruebaAws }
     *     
     */
    public void setPruebaaws(PruebaAws value) {
        this.pruebaaws = value;
    }

}

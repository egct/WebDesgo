
package ec.com.desgo.servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSGestionFormulario", targetNamespace = "http://servicios.desgo.com.ec/", wsdlLocation = "http://amazonwebservicedesgo-env.eba-gbkikqgc.us-east-1.elasticbeanstalk.com:80/WSGestionFormulario?wsdl")
public class WSGestionFormulario_Service
    extends Service
{

    private final static URL WSGESTIONFORMULARIO_WSDL_LOCATION;
    private final static WebServiceException WSGESTIONFORMULARIO_EXCEPTION;
    private final static QName WSGESTIONFORMULARIO_QNAME = new QName("http://servicios.desgo.com.ec/", "WSGestionFormulario");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://amazonwebservicedesgo-env.eba-gbkikqgc.us-east-1.elasticbeanstalk.com:80/WSGestionFormulario?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSGESTIONFORMULARIO_WSDL_LOCATION = url;
        WSGESTIONFORMULARIO_EXCEPTION = e;
    }

    public WSGestionFormulario_Service() {
        super(__getWsdlLocation(), WSGESTIONFORMULARIO_QNAME);
    }

    public WSGestionFormulario_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSGESTIONFORMULARIO_QNAME, features);
    }

    public WSGestionFormulario_Service(URL wsdlLocation) {
        super(wsdlLocation, WSGESTIONFORMULARIO_QNAME);
    }

    public WSGestionFormulario_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSGESTIONFORMULARIO_QNAME, features);
    }

    public WSGestionFormulario_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSGestionFormulario_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSGestionFormulario
     */
    @WebEndpoint(name = "WSGestionFormularioPort")
    public WSGestionFormulario getWSGestionFormularioPort() {
        return super.getPort(new QName("http://servicios.desgo.com.ec/", "WSGestionFormularioPort"), WSGestionFormulario.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSGestionFormulario
     */
    @WebEndpoint(name = "WSGestionFormularioPort")
    public WSGestionFormulario getWSGestionFormularioPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicios.desgo.com.ec/", "WSGestionFormularioPort"), WSGestionFormulario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSGESTIONFORMULARIO_EXCEPTION!= null) {
            throw WSGESTIONFORMULARIO_EXCEPTION;
        }
        return WSGESTIONFORMULARIO_WSDL_LOCATION;
    }

}

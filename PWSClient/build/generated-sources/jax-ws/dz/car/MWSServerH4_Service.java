
package dz.car;

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
@WebServiceClient(name = "MWSServerH4", targetNamespace = "http://Car.dz/", wsdlLocation = "http://localhost:8080/PWSServerH4/MWSServerH4?wsdl")
public class MWSServerH4_Service
    extends Service
{

    private final static URL MWSSERVERH4_WSDL_LOCATION;
    private final static WebServiceException MWSSERVERH4_EXCEPTION;
    private final static QName MWSSERVERH4_QNAME = new QName("http://Car.dz/", "MWSServerH4");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/PWSServerH4/MWSServerH4?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MWSSERVERH4_WSDL_LOCATION = url;
        MWSSERVERH4_EXCEPTION = e;
    }

    public MWSServerH4_Service() {
        super(__getWsdlLocation(), MWSSERVERH4_QNAME);
    }

    public MWSServerH4_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MWSSERVERH4_QNAME, features);
    }

    public MWSServerH4_Service(URL wsdlLocation) {
        super(wsdlLocation, MWSSERVERH4_QNAME);
    }

    public MWSServerH4_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MWSSERVERH4_QNAME, features);
    }

    public MWSServerH4_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MWSServerH4_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MWSServerH4
     */
    @WebEndpoint(name = "MWSServerH4Port")
    public MWSServerH4 getMWSServerH4Port() {
        return super.getPort(new QName("http://Car.dz/", "MWSServerH4Port"), MWSServerH4.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MWSServerH4
     */
    @WebEndpoint(name = "MWSServerH4Port")
    public MWSServerH4 getMWSServerH4Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://Car.dz/", "MWSServerH4Port"), MWSServerH4.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MWSSERVERH4_EXCEPTION!= null) {
            throw MWSSERVERH4_EXCEPTION;
        }
        return MWSSERVERH4_WSDL_LOCATION;
    }

}
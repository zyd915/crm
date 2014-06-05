package com.deppon.oa.error;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2012-05-07T21:07:23.275+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "ErrorServiceService", 
                  wsdlLocation = "http://192.168.17.250:8080/eos-default/ErrorService?wsdl",
                  targetNamespace = "http://www.primeton.com/ErrorService") 
public class ErrorServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.primeton.com/ErrorService", "ErrorServiceService");
    public final static QName ErrorServicePort = new QName("http://www.primeton.com/ErrorService", "ErrorServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.17.250:8080/eos-default/ErrorService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ErrorServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.17.250:8080/eos-default/ErrorService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ErrorServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ErrorServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ErrorServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ErrorService
     */
    @WebEndpoint(name = "ErrorServicePort")
    public ErrorService getErrorServicePort() {
        return super.getPort(ErrorServicePort, ErrorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ErrorService
     */
    @WebEndpoint(name = "ErrorServicePort")
    public ErrorService getErrorServicePort(WebServiceFeature... features) {
        return super.getPort(ErrorServicePort, ErrorService.class, features);
    }

}
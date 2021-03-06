package com.deppon.erp.waybill;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2013-03-18T11:32:24.203+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "Erp2crmServiceImplService", 
                  wsdlLocation = "http://192.168.14.181:8080/eas544ws/services/erp2crmService?wsdl",
                  targetNamespace = "http://impl.service.cms.ws.deppon.com/") 
public class Erp2CrmServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.cms.ws.deppon.com/", "Erp2crmServiceImplService");
    public final static QName Erp2CrmServiceImplPort = new QName("http://impl.service.cms.ws.deppon.com/", "Erp2crmServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.14.181:8080/eas544ws/services/erp2crmService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Erp2CrmServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.14.181:8080/eas544ws/services/erp2crmService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Erp2CrmServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Erp2CrmServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Erp2CrmServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IErp2CrmService
     */
    @WebEndpoint(name = "Erp2crmServiceImplPort")
    public IErp2CrmService getErp2CrmServiceImplPort() {
        return super.getPort(Erp2CrmServiceImplPort, IErp2CrmService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IErp2CrmService
     */
    @WebEndpoint(name = "Erp2crmServiceImplPort")
    public IErp2CrmService getErp2CrmServiceImplPort(WebServiceFeature... features) {
        return super.getPort(Erp2CrmServiceImplPort, IErp2CrmService.class, features);
    }

}

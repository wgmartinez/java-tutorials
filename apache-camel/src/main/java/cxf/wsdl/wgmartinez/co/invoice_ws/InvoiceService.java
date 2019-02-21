package cxf.wsdl.wgmartinez.co.invoice_ws;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-02-10T15:37:38.339+11:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "InvoiceService",
                  wsdlLocation = "file:/Volumes/MiniDrive/projects/java-tutorials/apache-camel/src/main/resources/wsdl/invoices.wsdl",
                  targetNamespace = "http://co.wgmartinez.wsdl/invoice-ws/")
public class InvoiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://co.wgmartinez.wsdl/invoice-ws/", "InvoiceService");
    public final static QName InvoiceServicePortTypeSoap11 = new QName("http://co.wgmartinez.wsdl/invoice-ws/", "InvoiceServicePortTypeSoap11");
    static {
        URL url = null;
        try {
            url = new URL("file:/Volumes/MiniDrive/projects/java-tutorials/apache-camel/src/main/resources/wsdl/invoices.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InvoiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Volumes/MiniDrive/projects/java-tutorials/apache-camel/src/main/resources/wsdl/invoices.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InvoiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InvoiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InvoiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public InvoiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public InvoiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public InvoiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns InvoiceServicePortType
     */
    @WebEndpoint(name = "InvoiceServicePortTypeSoap11")
    public InvoiceServicePortType getInvoiceServicePortTypeSoap11() {
        return super.getPort(InvoiceServicePortTypeSoap11, InvoiceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InvoiceServicePortType
     */
    @WebEndpoint(name = "InvoiceServicePortTypeSoap11")
    public InvoiceServicePortType getInvoiceServicePortTypeSoap11(WebServiceFeature... features) {
        return super.getPort(InvoiceServicePortTypeSoap11, InvoiceServicePortType.class, features);
    }

}
package julnarot;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.CXFBusFactory;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.http.HTTPTransportFactory;

public class PublicService {
    public static void main(String[] args) {
        // Crear el bus y registrar el transporte HTTP
        Bus bus = CXFBusFactory.getDefaultBus();
        HTTPTransportFactory httpTransportFactory = new HTTPTransportFactory();
        bus.getExtension(HTTPTransportFactory.class);

        // Implementar el servicio
        HelloServiceImpl implementor = new HelloServiceImpl();
        String address = "http://0.0.0.0:8080/hello";

        // Publicar el servicio
        EndpointImpl endpoint = new EndpointImpl(bus, implementor);
        endpoint.publish(address);
        System.out.println("Service published at " + address);
    
    }
}

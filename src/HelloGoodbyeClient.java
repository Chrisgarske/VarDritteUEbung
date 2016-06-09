
import javax.xml.ws.WebServiceRef;

public class HelloGoodbyeClient {

    @WebServiceRef(wsdlLocation="http://localhost:3000/Var/HelloGoodbyeService?wsdl")

    private static HelloGoodbyeService service;

    public void main(String[] args){

        try{
            HelloGoodbye port = service.getHelloGoodbyePort();
            String name = "Paganella";
            String result = port.sayHello(name);
            System.out.println("Result = " +result);
            System.out.println("Result = " +port.sayGoodbye(name));
        }
        catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService() public class HelloGoodbye {

    @WebMethod public String sayHello(@WebParam( name = "name") String name) {
        return "Hello" + name;
    }

    @WebMethod public String sayGoodbye(@WebParam(name = "name") String name){
        return "Goodbye" + name;
    }


}
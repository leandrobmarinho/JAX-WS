package ws;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WebServiceInterface {

	@WebMethod
	String print();

}
package ws;
import javax.jws.WebService;

@WebService(endpointInterface = "ws.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface{

	@Override
	public String print() {
		return "Hello JAX-WS";
	}

}
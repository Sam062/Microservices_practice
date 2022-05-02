package base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private ConnectHelloClient helloClient;
	@Autowired
	private ConnectHiClient hiClient;
	
	@GetMapping("/internal/{name}")
	public String connectInterService(@PathVariable("name")String name) {
		String hello = helloClient.sendRequestToHelloService(name);
		String hi = hiClient.sendRequestToHiService(name);
		
		StringBuilder sb = new StringBuilder("INTERNAL RESPONSE : ");
		
		return sb.append(hello).append(", ").append(hi).toString();
	}

}

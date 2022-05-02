package base;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Hello-Service")
public interface ConnectHelloClient {
	
	@GetMapping("/hello/{name}")
	public String sendRequestToHelloService(@PathVariable("name")String name);

}

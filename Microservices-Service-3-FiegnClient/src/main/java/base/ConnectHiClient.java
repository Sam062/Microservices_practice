package base;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Hi-Service")
public interface ConnectHiClient {
	
	@GetMapping("/hi/{name}")
	public String sendRequestToHiService(@PathVariable("name")String name);

}

package base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1Controller {
	
	@GetMapping("/hello")
	public String getMsg() {
		return "Hello client one";
	}

}

package base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello/{name}")
	public String getHello(@PathVariable("name")String name) {
		return "Hello, "+name;
	}

}

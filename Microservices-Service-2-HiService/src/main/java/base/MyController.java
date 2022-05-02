package base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hi/{name}")
	public String getHi(@PathVariable("name")String name) {
		return "Hi, "+name;
	}

}

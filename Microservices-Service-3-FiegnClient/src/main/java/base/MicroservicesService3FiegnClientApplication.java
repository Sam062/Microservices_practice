package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroservicesService3FiegnClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesService3FiegnClientApplication.class, args);
	}

}

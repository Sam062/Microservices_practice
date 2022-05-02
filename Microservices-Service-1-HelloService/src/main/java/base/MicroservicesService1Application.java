package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicesService1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesService1Application.class, args);
	}

}

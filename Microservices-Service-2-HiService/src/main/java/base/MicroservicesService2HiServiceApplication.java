package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesService2HiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesService2HiServiceApplication.class, args);
	}

}

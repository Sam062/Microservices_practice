package base.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockService {

	public String calculateStockPrice(String cname, Integer quantity) {
		String URI = "http://localhost:9696/getstockamount/{cname}/{quantity}";

		return WebClient.create().get().uri(URI, cname, quantity).retrieve().bodyToMono(String.class).block();
	}

}

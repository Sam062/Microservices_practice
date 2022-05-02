package base.stockService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Stock-Service", url = "http://localhost:9695")
public interface IStockService {
	
	@GetMapping("/getstockprice/{companyName}")
	public ResponseEntity<String> getStockPrice(@PathVariable("companyName")String name);

}

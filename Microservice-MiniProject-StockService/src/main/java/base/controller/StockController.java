package base.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
	
	@GetMapping("/getstockprice/{companyName}")
	public ResponseEntity<String> getStockPrice(@PathVariable("companyName")String name) {
		String price="";
		switch (name.toUpperCase()) {
		case "HCL":
			price="190.9";
			break;
		case "INFOSYS":
			price="156.3";
			break;
		case "IVY":
			price="160.2";
			break;
		case "ORACLE":
			price="67.3";
			break;
		default:
			price=null;
			break;
		}
		if(price!=null)
			return new ResponseEntity<>(price, HttpStatus.OK);
		else
			return new ResponseEntity<>("No Data Found!",HttpStatus.NO_CONTENT);
	}

}

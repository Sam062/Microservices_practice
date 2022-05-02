package base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import base.stockService.IStockService;

@RestController
public class StockAmtCalController {

	@Autowired
	private IStockService stockService;

	@GetMapping("/getstockamount/{cname}/{quantity}")
	public ResponseEntity<String> calculateStockPrice(@PathVariable("cname") String cname,
			@PathVariable("quantity") String quantity) {

		ResponseEntity<String> stockPrice = stockService.getStockPrice(cname);
		if (stockPrice.getStatusCode() == HttpStatus.OK) {
			return new ResponseEntity<>(
					"Total Price =" + Double.valueOf(stockPrice.getBody().toString()) * Integer.valueOf(quantity),
					HttpStatus.OK);
		} else if (stockPrice.getStatusCode() == HttpStatus.NO_CONTENT) {
			return new ResponseEntity<>("No Content!", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("SOMETHING WENT WRONG!", HttpStatus.BAD_REQUEST);

	}

}

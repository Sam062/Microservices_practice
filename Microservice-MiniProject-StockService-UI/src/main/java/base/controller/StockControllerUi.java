package base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import base.service.StockService;

@Controller
public class StockControllerUi {

	@Autowired
	private StockService service;

	@GetMapping("/")
	public String loadForm() {
		return "index";
	}

	@GetMapping("/getTotalCost")
	public String getTotalCost(HttpServletRequest req, Model model) {
		System.out.println("***************** INSIDE GET TOTAL COST *************");
		
		String cname = req.getParameter("cname");
		Integer qnty = Integer.valueOf(req.getParameter("qnty"));

		String price = service.calculateStockPrice(cname, qnty);

		model.addAttribute("price", price);
		return "index";

	}

}

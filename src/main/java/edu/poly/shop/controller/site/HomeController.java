package edu.poly.shop.controller.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("admin/index")
	public String index() {
		return "admin/index";
	}
}

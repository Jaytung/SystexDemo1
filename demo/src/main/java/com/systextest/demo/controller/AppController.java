package com.systextest.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping("/")
	public String HomePage() {
		return "index";
	}
	@GetMapping("item1")
	public String item1() {
		return "item1";
	}

	@GetMapping("/item3")
	public String Item3() {
		return "item3";
	}

	@GetMapping("/item4")
	public String Item4() {
		return "item4";
	}
	
	@GetMapping("/item5")
	public String Item5() {
		return "item5";
	}
	
	@GetMapping("/item6")
	public String Item6() {
		return "item6";
	}
	@GetMapping("/item7")
	public String Item7() {
		return "item7";
	}
	@GetMapping("/item8")
	public String Item8() {
		return "item8";
	}
	

	
}

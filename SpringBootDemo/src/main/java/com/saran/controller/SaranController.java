package com.saran.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaranController {
	
	
	@GetMapping("/1")
	public String myBusinessLogic() {
		return "<h1 style=color:blue>Welcome to my BusinessLogic11111111</h1>";
	}
	
	@GetMapping("/2")
	public String myBusinessLogic2() {
		return "<h1 style=color:red>Welcome to my BusinessLogic22222</h1>";
	}

}

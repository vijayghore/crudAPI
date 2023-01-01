package com.crudAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeAPI {
	@RequestMapping("welcome")
	public String welcome() {
		return "Welcome to Spring boot Api";
	}
}

package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	private String message;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		message = "welcome";
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/home")
	public String home(Map<String, Object> model) {
		message = "Home";
		model.put("message", this.message);
		return "home";
	}

}
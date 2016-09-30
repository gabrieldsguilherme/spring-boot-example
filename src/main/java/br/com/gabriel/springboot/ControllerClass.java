package br.com.gabriel.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
}

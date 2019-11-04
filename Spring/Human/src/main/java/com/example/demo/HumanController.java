package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/human")
	public String human(@RequestParam(value="name") String nameQuer) {
		return "Hello "+nameQuer;
	}

}

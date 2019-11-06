package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ResultController {
	@RequestMapping("/")
	public String survey() {
		return "survey.jsp";
	}

}

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("time",new Date());
		return "time.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("date",new Date());
		return "date.jsp";
	}
	

}

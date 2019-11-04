package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	@RequestMapping("{Dojo}")
	public String DojoVar(@PathVariable("Dojo") String Dojo) {
		if(Dojo.equals("dojo")) {
			return "The Dojo is Awsome";
		} else if(Dojo.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}else if(Dojo.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}else {
			return "Nothing To Display";
		}
	}

}

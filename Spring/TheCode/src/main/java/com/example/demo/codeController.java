package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class codeController {
	
	@RequestMapping
	("/code")
	    public String dashboard() {
	      // ... any code to process before rendering
	      return "code.jsp";
	    }

}

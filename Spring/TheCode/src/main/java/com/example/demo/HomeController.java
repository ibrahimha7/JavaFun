package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/err")
	public String FlashMsg(RedirectAttributes redirectattruibte) {
		redirectattruibte.addFlashAttribute("error","Try Hard Next Time");
		return "redirect:/";
		
	}
	
    @RequestMapping(value="/try", method=RequestMethod.POST)
    public String login(@RequestParam(value="code") String code) {
        if(code.equals("bushido")) {
        	return "redirect:/code";
        }else {
        	return "redirect:/err";
        	
        }
        
  }
    
    
}

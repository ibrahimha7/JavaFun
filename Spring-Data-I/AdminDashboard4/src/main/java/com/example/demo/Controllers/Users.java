package com.example.demo.Controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Services.UserService;
import com.example.demo.models.User;
import com.example.demo.validator.UserValidator;

@Controller

public class Users {

	private UserService userService;

	private UserValidator userValidator;

	// NEW
	public Users(UserService userService, UserValidator userValidator) {
		this.userService = userService;
		this.userValidator = userValidator;
	}
	
	//Register User Route
	@RequestMapping("/registration")
	public String registerForm(@Valid @ModelAttribute("user") User user) {
		return "registrationPage.jsp";
	}
	//Register User Post
	 @PostMapping("/registration")
	    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
	        // NEW
	        userValidator.validate(user, result);
	        if (result.hasErrors()) {
	            return "registrationPage.jsp";
	        }
	        
	        userService.saveWithUserRole(user);
	        return "redirect:/login";
	    }
	 
	 //Admin Register Route
	 @RequestMapping("/registrationAsAdmin")
		public String registerFormAdmin(@Valid @ModelAttribute("user") User user) {
			return "regAsAdmin.jsp";
		}
	//Admin Register Post
	 @PostMapping("/registrationAsAdmin")
	    public String registrationAdmin(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
	        userValidator.validate(user, result);
	        if (result.hasErrors()) {
	            return "regAsAdmin.jsp";
	        }
	        userService.saveUserWithAdminRole(user);
	        return "redirect:/login";
	    }
	     
	    // NEW 
	    @RequestMapping("/admin")
	    public String adminPage(Principal principal, Model model) {
	        String username = principal.getName();
	        model.addAttribute("currentUser", userService.findByUsername(username));
	        return "adminPage.jsp";
	    }

	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		if (error != null) {
			model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
		}
		if (logout != null) {
			model.addAttribute("logoutMessage", "Logout Successful!");
		}
		return "loginPage.jsp";
	}

	@RequestMapping(value = { "/", "/home" })
	public String home(Principal principal, Model model) {
		String username = principal.getName();
		model.addAttribute("currentUser", userService.findByUsername(username));
		return "homePage.jsp";
	}

}

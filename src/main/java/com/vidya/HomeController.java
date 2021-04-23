package com.vidya;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	
	 @GetMapping("/")
	  public String home(Map<String, Object> map) {
	    return "home";
	  }

	  @GetMapping("/showLoginPage")
	  public String showLoginPage(ModelMap model) {
	    model.addAttribute(new Login());

	    return "login";
	  }

	  @GetMapping("/showRegistrationPage")
	  public String showRegistrationPage(ModelMap model) {
	    model.addAttribute(new User());

	    return "registration";
	  }

}

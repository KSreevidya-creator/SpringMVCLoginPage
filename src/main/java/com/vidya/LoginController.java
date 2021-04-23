package com.vidya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vidya.service.UserService;
@Controller
public class LoginController {
	/*
	 * @RequestMapping("/add") public ModelAndView add(HttpServletRequest req,
	 * HttpServletResponse res){ // System.out.println("i am in controller class");
	 * 
	 * int i=Integer.parseInt(req.getParameter("t1")); int
	 * j=Integer.parseInt(req.getParameter("t2"));
	 * 
	 * int k= i+j;
	 * 
	 * ModelAndView mv=new ModelAndView(); mv.setViewName("display.jsp");
	 * mv.addObject("result", k); return mv; }
	 */
@Autowired
public UserService userService;


@PostMapping(value = "/loginProcess")
public String login(@ModelAttribute("login") Login login, BindingResult bindingResult, ModelMap model) {

  User user = userService.validateUser(login);

  boolean isValidUser = false;

  if (null != user && user.getUsername().equals(login.getUsername())
      && user.getPassword().equals(login.getPassword())) {
    isValidUser = true;
    model.addAttribute("username", user.getUsername());
  }

  return isValidUser ? "welcome" : "login";
}
/*
 * @RequestMapping(value="/login") public ModelAndView login(HttpServletRequest
 * req, HttpServletResponse res) { ModelAndView mv= new ModelAndView("login");
 * mv.addObject("login", new Object()); System.out.println(mv); return mv;
 * 
 * }
 */

}

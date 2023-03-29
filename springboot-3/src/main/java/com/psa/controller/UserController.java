package com.psa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
     @RequestMapping(value="/login",method=RequestMethod.GET)
     public String UserLogin() {
    	 return "login";
     }
     
    // @RequestMapping(value="/login",method=RequestMethod.POST)
     @PostMapping("/login")
     public String welcomepage(@RequestParam String useremail,@RequestParam String userpassword) {
		System.out.println(useremail);
		if(useremail.equals("chiragraj@gmail.com") && userpassword.equals("chirag")) {
			return "welcome";
		}
		else {
			return "welcome";
		}
    	 
     }
}

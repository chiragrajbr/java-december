package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    // @RequestMapping(value="/login",method=RequestMethod.GET)
     @GetMapping("/login")
     public String UserLogin() {
    	 return "login";
     }
}


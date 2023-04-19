package com.jpa.one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class one {
	
@GetMapping("/login")
public String getLogin() {
	return "Login";
} 
}

package com.example.demo.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.bean.helloBean;
@Component


public class One implements CommandLineRunner {
@Autowired
helloBean h2;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	h2.sayhi();
	}

}

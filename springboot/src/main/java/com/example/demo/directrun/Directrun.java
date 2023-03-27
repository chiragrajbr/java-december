package com.example.demo.directrun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component

public class Directrun implements CommandLineRunner {

	
		public void start(){
			System.out.println("started");
		}
		public void end() {
			System.out.println("ended");
		}

	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		start();
		end();
		
	}
	

}

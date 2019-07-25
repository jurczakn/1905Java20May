package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.model.BaseballCard;
import com.revature.service.BaseballCardService;

@SpringBootApplication
public class BaseballCardServiceApplication implements CommandLineRunner {

	private BaseballCardService cardService;
	
	@Autowired
	public void setCardService(BaseballCardService cardService) {
		this.cardService = cardService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BaseballCardServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		cardService.saveBaseballCard(new BaseballCard(1, null, null, 2019, "Ronald Acuna", "Braves"));
		
	}
	
}

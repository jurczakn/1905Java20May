package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.BaseballCard;
import com.revature.service.BaseballCardService;

@RestController("/card")
public class BaseballCardController {
	
	BaseballCardService bCardService;

	@Autowired
	public void setbCardService(BaseballCardService bCardService) {
		this.bCardService = bCardService;
	}
	
	 
	
	@GetMapping
	public List<BaseballCard> getAllCards() {
		return bCardService.getAllBaseballCards();
	}
	
	@PostMapping
	public void createCard(@RequestBody BaseballCard card) {
		bCardService.saveBaseballCard(card);
	}

}

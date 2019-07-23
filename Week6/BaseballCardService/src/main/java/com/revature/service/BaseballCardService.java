package com.revature.service;

import java.util.List;

import com.revature.model.BaseballCard;

public interface BaseballCardService {
	
	public List<BaseballCard> getAllBaseballCards();
	
	public void saveBaseballCard(BaseballCard baseballCard);

}

package com.revature.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Player;

@Service
public class PlayerServiceFinder {
	
	public Player getPlayer(String playerName) {
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8081/player/";
		
		ResponseEntity<Player> responseEntity = 
				restTemplate.exchange(
						url + playerName, 
						HttpMethod.GET, 
						null, 
						Player.class);
		
		Player player = responseEntity.getBody();
		System.out.println(responseEntity.getStatusCodeValue());
		
		return player;
		
	}

}

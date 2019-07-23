package com.revature.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Team;
@Service
public class TeamServiceFinder {
	

public Team getTeam(String teamName) {
		
		/*
		 * RestTemplate restTemplate = new RestTemplate(); String url =
		 * "http://localhost:8081/team/";
		 * 
		 * ResponseEntity<Team> responseEntity = restTemplate.exchange( url + teamName,
		 * HttpMethod.GET, null, Team.class);
		 * 
		 * Team team = responseEntity.getBody();
		 * System.out.println(responseEntity.getStatusCodeValue());
		 * 
		 * return team;
		 */
	return null;
		
	}

}

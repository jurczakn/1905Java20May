package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.model.Player;
import com.revature.model.Team;
import com.revature.service.PlayerService;

@SpringBootApplication
public class BaseballServiceApplication implements CommandLineRunner{

	PlayerService playerService;
	
	@Autowired
	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BaseballServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		playerService.savePlayer(new Player("Ronald Acuna", .348, 100, 63, new Team("Atlanta", "Braves", 40)));
	}

}

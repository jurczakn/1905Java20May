package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Player;
import com.revature.model.Team;
import com.revature.service.PlayerService;

@RestController("/player")
public class PlayerController {

	PlayerService playerService;
	
	@Autowired
	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}
	
	@GetMapping
	public List<Player> getAllPlayers() {
		return this.playerService.getAllPlayers();
	}
	
	@PostMapping
	public void createPlayer(@RequestBody Player player) {
		playerService.savePlayer(player);
	}
	
	@GetMapping("/player/{playerName}")
	public Player getPlayer(@PathVariable String playerName) {
		return playerService.getPlayer(playerName);
	}
	
	@DeleteMapping("/player/{playerName}/team/{teamName}")
	public String deletePlayer(@PathVariable String playerName, @PathVariable String teamName) {
		Player dropPlayer = new Player();
		dropPlayer.setName(playerName);
		playerService.dropPlayer(dropPlayer);
		return "successful";
	}
	
}

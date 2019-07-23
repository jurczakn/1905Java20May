package com.revature.service;

import java.util.List;

import com.revature.model.Player;
import com.revature.model.Team;

public interface PlayerService {
	
	public void savePlayer(Player player);
	
	public List<Player> getAllPlayers();
	
	public Player getPlayer(String name);
	
	public List<Player> getTeamPlayers(Team team);
	
	public void transferPlayer(Player player, Team team);
	
	public void updatePlayer(Player player);
	
	public void dropPlayer(Player player);

}

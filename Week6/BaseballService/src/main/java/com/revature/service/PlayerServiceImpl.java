package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Player;
import com.revature.model.Team;
import com.revature.repo.PlayerRepository;
import com.revature.repo.TeamRepository;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	private PlayerRepository playerRepo;
	
	private TeamRepository teamRepo;
	
	@Autowired
	public void setPlayerRepo(PlayerRepository playerRepo) {
		this.playerRepo = playerRepo;
	}
	
	@Autowired
	public void setTeamRepo(TeamRepository teamRepo) {
		this.teamRepo = teamRepo;
	}

	@Override
	public void savePlayer(Player player) {
		playerRepo.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		return playerRepo.findAll();
	}

	@Override
	public Player getPlayer(String name) {
		return playerRepo.findOne(name);
	}

	@Override
	public List<Player> getTeamPlayers(Team team) {
		return playerRepo.getPlayersByTeam(team);
	}

	@Override
	@Transactional
	public void transferPlayer(Player player, Team team) {
		player.getTeam().setNumberOfPlayers(player.getTeam().getNumberOfPlayers()-1);
		teamRepo.save(player.getTeam());
		player.setTeam(team);
		team.setNumberOfPlayers(team.getNumberOfPlayers()+1);
		teamRepo.save(team);
		playerRepo.save(player);
	}

	@Override
	public void updatePlayer(Player player) {
		playerRepo.save(player);
	}

	@Override
	public void dropPlayer(Player player) {
		playerRepo.delete(player);
	}

}

package com.revature.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Player;
import com.revature.model.Team;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String>{
	
	public List<Player> getPlayersByTeam(Team team);

}

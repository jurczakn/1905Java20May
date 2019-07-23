package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.BaseballCard;
import com.revature.repo.BaseballCardRepository;

@Service
public class BaseballCardServiceImpl implements BaseballCardService {
	
	private BaseballCardRepository baseballCardRepo;
	
	private PlayerServiceFinder playerService;
	
	private TeamServiceFinder teamServiceFinder;

	@Autowired
	public void setPlayerService(PlayerServiceFinder playerService) {
		this.playerService = playerService;
	}
	@Autowired
	public void setBaseballCardRepository(BaseballCardRepository baseballCardRepo) {
		this.baseballCardRepo = baseballCardRepo;
	}
	@Autowired
	public void setTeamServiceFinder(TeamServiceFinder teamServiceFinder) {
		this.teamServiceFinder = teamServiceFinder;
	}

	@Override
	public List<BaseballCard> getAllBaseballCards() {
		List<BaseballCard> bCards = baseballCardRepo.findAll();
		
		for (BaseballCard card : bCards) {
			card.setTeam(teamServiceFinder.getTeam(card.getTeamName()));
			card.setPlayer(playerService.getPlayer(card.getPlayerName()));
		}
		
		return bCards;
	}

	@Override
	public void saveBaseballCard(BaseballCard baseballCard) {
		baseballCardRepo.save(baseballCard);
	}

}

package com.revature.ui;

import com.revature.pojo.BlackJackGame;
import com.revature.services.BlackJackGameService;
import com.revature.services.BlackJackGameServiceImpl;

public class DisplayScores implements Screen{

	private static BlackJackGameService gameService = new BlackJackGameServiceImpl();
	
	@Override
	public void display(BlackJackGame game) {
		System.out.println("Dealer score: " + gameService.getScore(game.getDealer()));
		for (int i = 0; i < game.getPlayers().size(); i ++) {
			System.out.println("Player " + (i+1) + " score: " + gameService.getScore(game.getPlayers().get(i)));
		}
	}

}

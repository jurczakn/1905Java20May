package com.revature.services;

import com.revature.pojo.BlackJackGame;
import com.revature.pojo.Player;

public interface BlackJackGameService {
	
	public BlackJackGame initializeGame(int numberOfPlayer, int numberOfDecks);
	
	public void playHand(BlackJackGame game);
	
	public void endGame(BlackJackGame game);
	
	public int getScore(Player p);
	
}

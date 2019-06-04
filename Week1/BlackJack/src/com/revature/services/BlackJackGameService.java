package com.revature.services;

import com.revature.pojo.BlackJackGame;

public interface BlackJackGameService {
	
	public BlackJackGame initializeGame(int numberOfPlayer, int numberOfDecks);
	
	public void playHand();
	
	public void endGame();
	
}

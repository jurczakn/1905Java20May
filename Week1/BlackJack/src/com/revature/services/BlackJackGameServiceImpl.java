package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.BlackJackGame;
import com.revature.pojo.Deck;
import com.revature.pojo.Player;

public class BlackJackGameServiceImpl implements BlackJackGameService{

	DeckService ds = new DeckServiceImpl();
	
	@Override
	public BlackJackGame initializeGame(int numberOfPlayer, int numberOfDecks) {
		BlackJackGame game = new BlackJackGame();
		Deck deck = new Deck();
		ds.populateDeck(numberOfDecks, deck);
		game.setDeck(deck);
		game.setDealer(new Player());
		List<Player> playerList = new ArrayList<Player>();
		for (int j = 0; j < numberOfPlayer; j++) {
			playerList.add(new Player());
		}
		game.setPlayers(playerList);
		return game;
	}

	@Override
	public void playHand() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endGame() {
		// TODO Auto-generated method stub
		
	}

}

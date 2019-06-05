package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.BlackJackGame;
import com.revature.pojo.Card;
import com.revature.pojo.Deck;
import com.revature.pojo.Player;
import com.revature.ui.DisplayScores;
import com.revature.ui.InputUtil;
import com.revature.ui.PlayerPointsScreen;
import com.revature.ui.Screen;

public class BlackJackGameServiceImpl implements BlackJackGameService{

	DeckService ds = new DeckServiceImpl();
	PlayerService ps = new PlayerServiceImpl();
	private static final int BUST = 21;
	private static Screen displayScores = new DisplayScores();
	private static Screen playerPointsScreen = new PlayerPointsScreen();
	
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
	public void playHand(BlackJackGame game) {
		
		//if deck is too empty, shuffle
		if (game.getDeck().getCards().size() < 20) {
			ds.populateDeck(1, game.getDeck());
			ds.shuffle(game.getDeck());
		}
		
		//give inital hands
		for (Player p : game.getPlayers()) {
			ps.dealCard(p, ds.draw(game.getDeck()));
			ps.dealCard(p, ds.draw(game.getDeck()));
		}
		
		//Deal dealer cards
		ps.dealCard(game.getDealer(), ds.draw(game.getDeck()));
		
		//Diplay hands to the user
		//TODO
		
		//Players play hands
		for (int i = 0; i < game.getPlayers().size(); i++) {
			playerPlay(game, i);
		}
		
		//Dealer plays hand
		//TODO
		
		//Calculate winners
		calcWinners(game);
		
	}
	
	private void calcWinners(BlackJackGame game) {
		for (Player p : game.getPlayers()) {
			if (getScore(p) <= BUST && getScore(p) > getScore(game.getDealer())) {
				System.out.println("Congrats you won!!!!!");
				System.out.println(p);
				ps.addPoints(p, 10);
			} else {
				System.out.println("Sorry you lost");
				ps.removePoints(p, 10);
			}
		}
		playerPointsScreen.display(game);
	}
	
	private void playerPlay(BlackJackGame game, int playerNumber) {
		
		int playerChoice = 0;
		
		do {
			
			displayScores.display(game);
			System.out.println("Player " + playerNumber + 1 + ":");
			System.out.println("Do you want to hit [1] or stand [2]");
			playerChoice = InputUtil.getNumber(1, 2);
			if (playerChoice == 1) {
				ps.dealCard(game.getPlayers().get(playerNumber), ds.draw(game.getDeck()));
			}
			
		} while (playerChoice != 2 && (getScore(game.getPlayers().get(playerNumber)) <= BUST));
		
	}
	
	@Override
	public int getScore(Player p) {
		int score = 0;
		for (Card c: p.getHand()) {
			score += Integer.parseInt(c.getRank());
		}
		return score;
	}

	@Override
	public void endGame(BlackJackGame game) {
		
	}

}

package com.revature.driver;

import com.revature.pojo.BlackJackGame;
import com.revature.services.BlackJackGameService;
import com.revature.services.BlackJackGameServiceImpl;
import com.revature.ui.InputUtil;
import com.revature.ui.PromptNumberOfDecks;
import com.revature.ui.PromptNumberOfPlayers;
import com.revature.ui.Screen;
import com.revature.ui.WelcomeScreen;

public class Driver {

	private static Screen welcome = new WelcomeScreen();
	private static Screen numberOfPlayerScreen = new PromptNumberOfPlayers();
	private static Screen numberOfDecksScreen = new PromptNumberOfDecks();
	private static BlackJackGameService gameService = new BlackJackGameServiceImpl();
	
	public static void main(String[] args) {
		BlackJackGame game = null;
		welcome.display(game);
		numberOfPlayerScreen.display(game);
		int numberOfPlayers = InputUtil.getNumber(1, 4);
		numberOfDecksScreen.display(game);
		int numberOfDecks = InputUtil.getNumber(1, 3);
		game = gameService.initializeGame(numberOfPlayers, numberOfDecks);
		int cont = 1;
		do {
			gameService.playHand(game);
			System.out.println("Would you like to play again? yes[1] no[2]");
			cont = InputUtil.getNumber(1, 2);
		} while (cont != 2);
	}

}

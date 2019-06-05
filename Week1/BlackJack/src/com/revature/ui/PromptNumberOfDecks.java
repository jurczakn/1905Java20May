package com.revature.ui;

import com.revature.pojo.BlackJackGame;

public class PromptNumberOfDecks implements Screen {

	private static final String msg = "How many Decks do you want to play with?";
	
	@Override
	public void display(BlackJackGame game) {
		System.out.println(msg);
	}

}

package com.revature.ui;

import com.revature.pojo.BlackJackGame;

public class PromptNumberOfPlayers implements Screen {

	private static final String msg = "How many Players will ther be?";
	
	@Override
	public void display(BlackJackGame game) {
		System.out.println(msg);
	}

}

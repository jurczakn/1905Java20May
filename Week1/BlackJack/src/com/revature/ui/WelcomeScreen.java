package com.revature.ui;

import com.revature.pojo.BlackJackGame;

public class WelcomeScreen implements Screen {

	public static final String WELCOME_MESSAGE = "Welcome to our Game\nLet's play some BlackJack";
	
	@Override
	public void display(BlackJackGame game) {
		System.out.println(WELCOME_MESSAGE);
	}

}

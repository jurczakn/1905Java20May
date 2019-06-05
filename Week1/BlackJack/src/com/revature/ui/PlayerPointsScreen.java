package com.revature.ui;

import com.revature.pojo.BlackJackGame;

public class PlayerPointsScreen implements Screen {

	@Override
	public void display(BlackJackGame game) {
		
		for (int i = 0; i < game.getPlayers().size(); i ++) {
			System.out.println("Player " + i + " points: " + game.getPlayers().get(i).getScore());
		}

	}

}

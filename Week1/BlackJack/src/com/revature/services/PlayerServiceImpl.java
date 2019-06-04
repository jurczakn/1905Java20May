package com.revature.services;

import java.util.ArrayList;

import com.revature.pojo.Card;
import com.revature.pojo.Player;

public class PlayerServiceImpl implements PlayerService {

	@Override
	public void dealCard(Player p, Card c) {
		p.getHand().add(c);
	}

	@Override
	public void resetHand(Player p) {
		p.setHand(new ArrayList<Card>());
	}

	@Override
	public void addPoints(Player p, int points) {
		p.setScore(p.getScore() + points);
	}

	@Override
	public void removePoints(Player p, int points) {
		p.setScore(p.getScore() - points);
	}



}

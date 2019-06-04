package com.revature.services;

import com.revature.pojo.Card;
import com.revature.pojo.Player;

public interface PlayerService {
	
	public void dealCard(Player p, Card c);
	
	public void resetHand(Player p);
	
	public void addPoints(Player p, int points);
	
	public void removePoints(Player p, int points);

}

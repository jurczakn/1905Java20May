package com.revature.services;

import com.revature.pojo.Card;
import com.revature.pojo.Deck;

public interface DeckService {
	
	public void shuffle(Deck deck);
	
	public void populateDeck(int i, Deck deck);
	
	public Card draw(Deck deck);

}

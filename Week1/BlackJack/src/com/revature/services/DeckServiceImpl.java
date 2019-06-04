package com.revature.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.revature.pojo.Card;
import com.revature.pojo.Deck;

public class DeckServiceImpl implements DeckService {

	@Override
	public void shuffle(Deck deck) {
		Collections.shuffle(deck.getCards());
	}

	@Override
	public void populateDeck(int i, Deck deck) {
		List<Card> newCards = new ArrayList<Card>();

		for (int j = 0; j < i; j++) {
			newCards.add(new Card("Spade", "1"));
			newCards.add(new Card("Spade", "2"));
			newCards.add(new Card("Spade", "3"));
			newCards.add(new Card("Spade", "4"));
			newCards.add(new Card("Spade", "5"));
			newCards.add(new Card("Spade", "6"));
			newCards.add(new Card("Spade", "7"));
			newCards.add(new Card("Spade", "8"));
			newCards.add(new Card("Spade", "9"));
			newCards.add(new Card("Spade", "10"));
		}
		deck.setCards(newCards);
	}

	@Override
	public Card draw(Deck deck) {
		Card newCard = deck.getCards().get(0);
		deck.getCards().remove(0);
		return newCard;
	}

}

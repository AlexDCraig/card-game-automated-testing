package edu.osu.cs362;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

// test every cardcollection method but permute
public class CardCollectionTest  {
	@Test
	public void CardCollectionTest()
	{
		// TEST: Make sure that CardCollection correctly initializes
		// the card to 0 if given nothing 
		// TEST PASSED: CardCollection successfully holds 0 cards

		CardCollection c1 = new CardCollection();
		List<Card> c = c1.getCards();

		for (int i =0; i < c.size(); i++)
		{
			assertEquals((c.get(i)), 0);
		}
		
		// TEST: Make sure CardCollection correctly holds a card
		// if it is given one at initialization
		// TEST PASSED: CardCollection successfully holds 1 card
		Card.Face f10 = Card.Face.TWO;
		Card.Suit s10 = Card.Suit.CLUB;
		Card c10 = new Card(f10, s10);
		CardCollection cc1 = new CardCollection(c10);
		List<Card> tempList = cc1.getCards();
		
		assertEquals((tempList.get(0)), c10);
	}

	@Test
	public void getCardsTest()
	{
		// We have already seen what happens when we give CardCollection		// 0 cards and 1 card and get the cards back
		// TEST: Give CardCollection 4 cards 
		// TEST PASSED: the CardCollection class is able to hold
		// (within reason) an unlimited number of Cards and getCards()
		// accurately returns its list
		Card.Face f11 = Card.Face.JACK;
		Card.Suit s11 = Card.Suit.CLUB;
		Card.Face f12 = Card.Face.TWO;
		Card.Suit s12 = Card.Suit.DIAMOND;
		Card.Face f13 = Card.Face.THREE;
		Card.Suit s13 = Card.Suit.SPADE;
		Card.Face f14 = Card.Face.FOUR;
		Card.Suit s14 = Card.Suit.HEART;
		Card c11 = new Card(f11, s11);
		Card c12 = new Card(f12, s12);
		Card c13 = new Card(f13, s13);
		Card c14 = new Card(f14, s14);

		CardCollection cc2 = new CardCollection();

		cc2.add(c11);
		cc2.add(c12);
		cc2.add(c13);
		cc2.add(c14);

		List<Card> tempList2 = cc2.getCards(); 

		assertEquals((tempList2.get(0)), c11);
		assertEquals((tempList2.get(1)), c12);
		assertEquals((tempList2.get(2)), c13);
		assertEquals((tempList2.get(3)), c14);
	}

	@Test
	public void addCardTest()
	{
		// We tested add to see if it would give us 4 Cards correctly
		// We haven't seen if we give a card to CardCollection in its
		// constructor and then add another card if it works
		// TEST: Give card over constructor, then add 2 cards to it
		// to see if add works after the constructor
		// TEST PASSES, add works for all conditions based on this test
		// and the ones ahead of it
		Card.Face f11 = Card.Face.JACK;
		Card.Suit s11 = Card.Suit.CLUB;
		Card.Face f12 = Card.Face.TWO;
		Card.Suit s12 = Card.Suit.DIAMOND;
		Card.Face f13 = Card.Face.THREE;
		Card.Suit s13 = Card.Suit.SPADE;

		Card c11 = new Card(f11, s11);
		Card c12 = new Card(f12, s12);
		Card c13 = new Card(f13, s13);

		CardCollection newCollect = new CardCollection(c11);
		newCollect.add(c12);
		newCollect.add(c13);	

		List<Card> tempList2 = newCollect.getCards(); 

		assertEquals((tempList2.get(0)), c11);
		assertEquals((tempList2.get(1)), c12);
		assertEquals((tempList2.get(2)), c13);
	
	}

	@Test
	public void addListTest()
	{
		Card.Face f11 = Card.Face.JACK;
		Card.Suit s11 = Card.Suit.CLUB;
		Card.Face f12 = Card.Face.TWO;
		Card.Suit s12 = Card.Suit.DIAMOND;
		Card.Face f13 = Card.Face.THREE;
		Card.Suit s13 = Card.Suit.SPADE;

		Card c11 = new Card(f11, s11);
		Card c12 = new Card(f12, s12);
		Card c13 = new Card(f13, s13);

		List<Card> tempList2 = new ArrayList<Card>();
		tempList2.add(c11);
		tempList2.add(c12);
		tempList2.add(c13);

		// TEST: CardCollection is empty, give it a list of 3 Cards
		// TEST PASSES: if CardCollection is empty it can accept a list
		// of theoretically any size and retain it successfully
		CardCollection newCollect = new CardCollection();
		newCollect.add(tempList2);
		List<Card> tempList3 = newCollect.getCards();

		for (int i = 0; i < tempList3.size(); i++)
		{
			assertEquals((tempList3.get(i)), (tempList2.get(i)));
		}  

		// TEST: CardCollection is not empty, give it a list of 3 Cards
		Card.Face f14 = Card.Face.FOUR;
		Card.Suit s14 = Card.Suit.HEART;
		Card c14 = new Card(f14, s14);
		CardCollection otherCollect = new CardCollection(c14);
		otherCollect.add(tempList2);
		List<Card> tempList4 = otherCollect.getCards();
		
		assertEquals((tempList4.get(0)), c14); 
		assertEquals((tempList4.get(1)), tempList2.get(0));
		assertEquals((tempList4.get(2)), tempList2.get(1));
		assertEquals((tempList4.get(3)), tempList2.get(2));
		
	}

	@Test
	public void discardCardTest()
	{
		Card.Face f11 = Card.Face.JACK;
		Card.Suit s11 = Card.Suit.CLUB;
		Card.Face f12 = Card.Face.TWO;
		Card.Suit s12 = Card.Suit.DIAMOND;
		Card.Face f13 = Card.Face.THREE;
		Card.Suit s13 = Card.Suit.SPADE;
		Card.Face f14 = Card.Face.FOUR;
		Card.Suit s14 = Card.Suit.HEART;
		Card.Face f15 = Card.Face.FIVE;
		Card.Suit s15 = Card.Suit.HEART;
		Card.Face f16 = Card.Face.FIVE; // duplicate
		Card.Suit s16 = Card.Suit.HEART;
		Card.Face f17 = Card.Face.FOUR; // duplicate
		Card.Suit s17 = Card.Suit.HEART;

		Card c11 = new Card(f11, s11);
		Card c12 = new Card(f12, s12);
		Card c13 = new Card(f13, s13);
		Card c14 = new Card(f14, s14);
		Card c15 = new Card(f15, s15);
		Card c16 = new Card(f16, s16); // duplicate of c15
		Card c17 = new Card(f17, s17); // duplicate of c14

		// TEST: pull from an empty hand
		// This crashes the program
		/*
		CardCollection c20 = new CardCollection();
		c20.discardCard(0);
		*/

		// TEST: pull the first card in a hand of multiple cards
		// Test passes, the first card after pulling the original first
		// card is the second card
		CardCollection c21 = new CardCollection(c11);
		c21.add(c12);
		c21.add(c13);
		c21.discardCard(0);
		List<Card> list1 = c21.getCards();
		assertEquals(list1.get(0), c12);


		// TEST: pull the middle card
		// TEST PASSES, you can pull out a card in the middle
		// and it successfully shifts elements
		CardCollection c22 = new CardCollection(c11);
		c22.add(c12);
		c22.add(c13);
		c22.add(c14);
		c22.add(c15);
		c22.discardCard(2); 
// remove the third card (c13- three of spades) in a hand of 5
// position 2 should now hold c14 because it should move each successive card bsck one index, the final index should now be 3, index 1 should still contain c12
		List<Card> list2 = c22.getCards();
		assertEquals(list2.get(2), c14);
		assertEquals(list2.get(1), c12);
		// causes an error because the last index is shuffled down
		// assertEquals(list2.get(4), 0);
		
		// TEST: pull the last card
		// TEST PASSES, removing the last card successfully alters
		// the array
		CardCollection c23 = new CardCollection(c11);
		c23.add(c12);
		c23.add(c13);
		c23.add(c14);
		c23.add(c15);
		c23.discardCard(4);
		List<Card> list3 = c23.getCards();
		// goes out of bounds and throws an error
		// assertEquals(list3.get(4), 0);
		assertEquals(list3.get(3), c14);	

		// TEST: add 3 cards, remove a card, add 2 cards, remove a card
		// TEST PASSES: successfully add and removes cards
		CardCollection c24 = new CardCollection(c11);
		c24.add(c12);
		c24.add(c13);
		c24.discardCard(1);
		c24.add(c14);
		c24.add(c15);
		c24.discardCard(2);
		List<Card> list4 = c24.getCards();
		assertEquals(list4.get(0), c11);
		assertEquals(list4.get(1), c13);
		assertEquals(list4.get(2), c15);

		// TEST: Add 7 cards where 2 are duplicates
		CardCollection c25 = new CardCollection(c11);
		c25.add(c12);
		c25.add(c13);
		c25.add(c14); // matched by c17
		c25.add(c15); // matched by c16
		c25.add(c16); // matched by c15
		c25.add(c17); // matched by c14
		c25.discardCard(5);
		List<Card> list5= c25.getCards();
	
		assertEquals(list5.get(0), c11);
		assertEquals(list5.get(1), c12);
		assertEquals(list5.get(2), c13);
		assertEquals(list5.get(3), c14);
		assertEquals(list5.get(4), c15);
		assertEquals(list5.get(5), c17);

		// TEST: Add two full decks, check that it deletes element 4 ok
		CardCollection c26 = new CardCollection();
		Card cardWithTwoDecks = new Card(f11, s11);
		c26.add(cardWithTwoDecks.newDeck());
		c26.add(cardWithTwoDecks.newDeck());
		List<Card> twiceDeck = c26.getCards();
		c26.discardCard(4);
		List<Card> checkCards = c26.getCards();
		assertEquals((checkCards.get(4)), (twiceDeck.get(5))); 
		//assertEquals((checkCards.get(55)), (twiceDeck.get(4)));
	}
}

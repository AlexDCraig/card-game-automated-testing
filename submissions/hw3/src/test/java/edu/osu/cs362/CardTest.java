package edu.osu.cs362;

import static org.junit.Assert.*;
import org.junit.Test;


public class CardTest  {
  	@Test
    	public void testCard() 
	{
		// TEST PASSES
		Card.Face f1 = Card.Face.TWO;
		Card.Suit s1 = Card.Suit.CLUB;
		Card c1 = new Card(f1, s1);

		// Test to make sure the constructor works
		// If the two cards are equal then the constructor does what 
		// it should
		Card.Face f2 = Card.Face.TWO;
		Card.Suit s2 = Card.Suit.CLUB;
		Card c2 = new Card(f2, s2);

		assertEquals((c1.equals(c2)), true);
		
		// COMPILE ERROR when you feed it invalid enum values	
		/*Card.Face f2 = Card.Face.ZERO;
		Card.Suit s2 = Card.Suit.WHATEVER;
		Card c2 = new Card(f2, s2);*/
	}

	@Test
	public void testEquals()
	{
		// Up there, we already did testEquals for if they were equal
		// Let's test to see if they aren't if it returns false
		// TEST PASSES
		Card.Face f3 = Card.Face.FOUR;
		Card.Suit s3 = Card.Suit.SPADE;
		Card c3 = new Card(f3, s3);

		Card.Face f4 = Card.Face.FIVE;
		Card.Suit s4 = Card.Suit.DIAMOND;
		Card c4 = new Card(f4, s4);

		assertEquals((c3.equals(c4)), false);
	}

	@Test
	public void testToString()
	{
		// See if it is true when it should be
		// TEST PASSES
		Card.Face f5 = Card.Face.SIX;
		Card.Suit s5 = Card.Suit.SPADE;
		Card c5 = new Card(f5, s5);

		String str = c5.toString();

		assertEquals(str, "SIXSPADE");

		// see if its false when it should be
		// TEST FAILS, correct rejection
		/*
		Card.Face f6 = Card.Face.TWO;
		Card.Suit s6 = Card.Suit.SPADE;
		Card c6 = new Card(f6, s6);

		String str1 = c6.toString();

		assertEquals(str1, "THREEDIAMOND");*/		
	}

	@Test
	public void testVisibility()
	{
		Card.Face f7 = Card.Face.SIX;
		Card.Suit s7 = Card.Suit.SPADE;
		Card c7 = new Card(f7, s7);

		// Set it to be not visible and test it
		// TEST PASSES
		c7.setVisible(false);
		assertEquals((c7.isVisible()), false);

		// opposite
		// TEST PASSES
		c7.setVisible(true);
		assertEquals((c7.isVisible()), true);
	}
}

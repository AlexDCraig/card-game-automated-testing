/* package edu.osu.blackjack;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class CardTest
{
	@Test
	public void testCard()
	{
		Card.Face f1 = Card.Face.TWO;
		Card.Suit s1 = Card.Suit.CLUB;
		Card c1 = new Card(f1, s1);

		Card.Face f2 = Card.Face.TWO;
		Card.Suit s2 = Card.Suit.CLUB;
		Card c2 = new Card(f2, s2);

		assertEquals((c1.equals(c2)), false);

	}

	@Test
	public void testEquals()
	{
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
		Card.Face f5 = Card.Face.SIX;
		Card.Suit s5 = Card.Suit.SPADE;
		Card c5 = new Card(f5, s5);

		String str = c5.toString();

		assertEquals(str, "SIXSPADE");

		// checking correct rejection
		Card.Face f6 = Card.Face.TWO;
		Card.Suit s6 = Card.Suit.SPADE;
		Card c6 = new Card(f6, s6);

		String str1 = c6.toString();

		assertEquals(str1, "THREEDIAMOND");
	} 

	@Test
	public void testVisibility()
	{
		Card.Face f7 = Card.Face.SIX;
		Card.Suit s7 = Card.Suit.SPADE;
		Card c7 = new Card(f7, s7);

		c7.setVisible(false);
		assertEquals((c7.isVisible()), false);

		c7.setVisible(true);
		assertEquals((c7.isVisible()), true);
	}
}*/

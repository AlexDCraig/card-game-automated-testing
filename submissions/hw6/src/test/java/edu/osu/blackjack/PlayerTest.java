/* package edu.osu.blackjack;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class PlayerTest
{
	@Test
	public void testAcceptCard()
	{
		Card.Face f3 = Card.Face.FOUR;
		Card.Suit s3 = Card.Suit.SPADE;
		Card c3 = new Card(f3, s3);

		Player p1 = new Player();
		p1.acceptCard(c3);
		List<Card> hand1 = p1.getHand();
		assertEquals((hand1.get(hand1.size() - 1)), c3);
	}

	@Test
	public void testMakeBet()
	{
		Player p1 = new Player();
		assertEquals((p1.makeBet()), 10);
	}

	@Test
	public void testDoubleDownBet()
	{
		Player p1 = new Player();
		p1.makeBet();
		assertEquals((p1.doubleDownBet()), 20);
	}

	@Test
	public void testMakeInsuranceBet()
	{
		Player p1 = new Player();
		p1.moveMoneyToInsurance(10);
		assertEquals((p1.makeInsuranceBet()), 10);
	}

	@Test
	public void testGetCurrentBet()
	{
		Player p1 = new Player();
		p1.makeBet();
		assertEquals((p1.getCurrentBet()), 10);
	}

	@Test
	public void testMoveMoneyToBet()
	{
		Player p1 = new Player();
		p1.moveMoneyToBet(20);
		assertEquals((p1.getCurrentBet()), 20);
	}

	@Test
	public void testNextHand()
	{
		Player p1 = new Player();
		p1.nextHand();
		assertEquals((p1.currentWallet), null);
		assertEquals((p1.getCurrentBet()), null);
		assertEquals((p1.currentInsurance), null);
	}
} */ 	

/*package edu.osu.blackjack;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;
import java.util.*;

public class DealerTest
{
	@Test
	public void testDealer()
	{
		Dealer d = new Dealer();
		List<Card> l1 = d.getHand();
		assertEquals((l1.get(0)), "TWOCLUB");
		d.shuffleDeck();
	}

	@Test
	public void testAcceptCard()
	{
		Dealer d = new Dealer();
		Card.Face f5 = Card.Face.SIX;
		Card.Suit s5 = Card.Suit.SPADE;
		Card c5 = new Card(f5, s5);
		d.acceptCard(c5);
		List<Card> l1 = d.getHand();
		assertEquals((l1.get(l1.size() - 1)), "SIXSPADE");
	}

	@Test
	public void testDealCard()
	{
		Dealer d = new Dealer();
		Player p = new Player();
		List<Card> l1 = d.getHand();
		d.dealCard(p);
		List<Card> l2 = p.getHand();
		assertEquals((l1.get(0)), (l2.get(0)));
	}

	@Test
	public void testCompareHand()
	{
		Dealer d = new Dealer();
		Player p = new Player();
		p.makeBet();
		p.moveMoneyToInsurance(20);
		d.dealCard(p);
		d.dealCard(p);
		d.compareHandAndSettle(p);
	}

	@Test
	public void testIsInsurance()
	{
		Dealer d = new Dealer();
		d.shuffleDeck();
		assertEquals((d.isInsuranceAvailable()), true);
	}

	@Test
	public void testDumpDeck()
	{
		Dealer d = new Dealer();
		List<Card> l1 = d.getHand();
		d.dumpDeck(l1);
	}
 
}
*/		
	
	

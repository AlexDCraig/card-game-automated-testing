package edu.osu.blackjack;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import org.junit.Before;
import java.util.Random;

public class BlackjackTest
{
	final int lowerPlayerBound = 1;
	final int upperPlayerBound = 4;
	private Random random;

	@Before
	public void initRandom()
	{
		long seed = System.currentTimeMillis();
		random = new Random(seed);
	}

	public int generateRandomInt(int lbound, int ubound)
	{
		return random.nextInt(ubound - lbound) + lbound;
	}

	// player's wallet will be between 0 and 1000
	public int generateWalletAmount()
	{
		int wallet = generateRandomInt(0, 1000);
		return wallet;
	}

	@Test
	public void testDrawCard()
	{
		// Test this 100 times
		for (int i = 0; i < 100; i++)
		{
			Dealer d1 = new Dealer(); // empty dealer hand
			d1.shuffleDeck(); // random deck
		
			Player p1 = new Player();
			p1.reset(); // make sure player has empty current hand
			p1.changeCurrentWallet(generateWalletAmount());

		//	SimpleBlackjack game = new SimpleBlackjack(d1, p1);
		//	game.playRound();
			
		}
	}
}
	

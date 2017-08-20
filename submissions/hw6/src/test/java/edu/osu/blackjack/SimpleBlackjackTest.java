/* File to test the SimpleBlackjack test using Mockito. */

/*

package edu.osu.blackjack;


import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;

public class SimpleBlackjackTest 
{
    	@Test
    	public void testHits()
	{
		// TEST 1: Start with 2 cards, hit 7 times, e.g. have 9 cards
		// RESULT: Fails, expects 9 but has 8
		DealerAction dt = mock(DealerAction.class);
		PlayerAction pa = mock(PlayerAction.class);

		when(pa.getAction()).thenReturn(PlayerAction.ActionType.HIT)
               		.thenReturn(PlayerAction.ActionType.HIT)
                   	.thenReturn(PlayerAction.ActionType.HIT)
                            .thenReturn(PlayerAction.ActionType.HIT)
                            .thenReturn(PlayerAction.ActionType.HIT)
                            .thenReturn(PlayerAction.ActionType.HIT)	
	                    .thenReturn(PlayerAction.ActionType.HIT)	   
	                    .thenReturn(PlayerAction.ActionType.STAND);	                          
		
		SimpleBlackjack j = new SimpleBlackjack(dt,new PlayerAction[]{pa});
		j.playRound();
		verify(dt, times(9)).dealCard(pa);
	}

	@Test
	public void testInitialDealCard()
	{

		// TEST 2: Make sure a player starts with 2 cards
		// RESULT: Fails, should start a player with 2 cards but this starts a player with 1
		DealerAction d = mock(DealerAction.class);
		PlayerAction p = mock(PlayerAction.class);

		when(p.getAction()).thenReturn(PlayerAction.ActionType.STAND);

		SimpleBlackjack j1 = new SimpleBlackjack(d, new PlayerAction[] {p});
		j1.playRound();
		verify(d, times(2)).dealCard(p);
	}

	@Test
	public void testCurrentBet()
	{	
	
		// TEST 3: Make sure dealer calls isInsuranceAvailable() when a player wants to make an insurance bet
		// RESULT: Passes
		DealerAction d1 = mock(DealerAction.class);
		PlayerAction p1 = mock(PlayerAction.class);

		when(p1.getAction()).thenReturn(PlayerAction.ActionType.STAND);
		when(p1.makeInsuranceBet()).thenReturn(10);
			
		SimpleBlackjack j2 = new SimpleBlackjack(d1, new PlayerAction[] {p1});
		j2.playRound();
		verify(d1, times(1)).isInsuranceAvailable();
	}

	@Test
	public void testOrder()
	{

		// TEST 4:
		// InOrder tests to see whether the actions occurred once and in order
		// 1 player hits then stands. Then another player hits then stands.
		// RESULT: FAILS. Looks like the Dealer class hits the same player twice, doesn't play rounds
		DealerAction d2 = mock(DealerAction.class);
		PlayerAction p2 = mock(PlayerAction.class);
		PlayerAction p3 = mock(PlayerAction.class);

		InOrder inOrder = inOrder(p2,p3);
		
		when(p2.getAction()).thenReturn(PlayerAction.ActionType.HIT)
			.thenReturn(PlayerAction.ActionType.STAND);	

               	when(p3.getAction()).thenReturn(PlayerAction.ActionType.HIT)
			.thenReturn(PlayerAction.ActionType.STAND);       		

		SimpleBlackjack j3 = new SimpleBlackjack(d2,new PlayerAction[]{p2,p3});
		j3.playRound();
		
		inOrder.verify(p2).getAction();
		inOrder.verify(p3).getAction();

    	}

	@Test
	public void testCompareHandAndSettle()	
	{
		// TEST 5: See if the dealer hits the correct # of times in order to see if the dealer still has cards to deal
		// after compareHandAndSettle() has been called once before
		// RESULT: Failure, when the dealer hits compareHandAndSettle it has no more cards (i.e. the hand is empty)

		DealerAction d = mock(DealerAction.class);
		PlayerAction p = mock(PlayerAction.class);
		PlayerAction p1 = mock(PlayerAction.class);

		when(p.getAction()).thenReturn(PlayerAction.ActionType.HIT)
			.thenReturn(PlayerAction.ActionType.HIT)
			.thenReturn(PlayerAction.ActionType.STAND);

		when(p1.getAction()).thenReturn(PlayerAction.ActionType.HIT)
			.thenReturn(PlayerAction.ActionType.HIT)
			.thenReturn(PlayerAction.ActionType.STAND);

		SimpleBlackjack j = new SimpleBlackjack(d, new PlayerAction[] { p, p1 });
		j.playRound();

		verify(d, times(4)).dealCard(d);
	}

}*/

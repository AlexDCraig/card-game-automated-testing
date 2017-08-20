package edu.osu.blackjack;



public class SimpleBlackjack {
	public enum ActionType {HIT , DOUBLE, STAND};
	private int numPlayers;
	
	DealerAction dealer;
	PlayerAction[] players ;

	
	public SimpleBlackjack(DealerAction d, PlayerAction[] ip){
		this.dealer = d;
		this.players = ip;
	}
	
	public void playRound(){

		dealer.shuffleDeck();
		
		for(PlayerAction p: players ){
			p.makeBet();
		}
		
		for(PlayerAction p: players ){
			dealer.dealCard(dealer);
			dealer.dealCard(p);
			/* these two lines fix bug report #1, #2 but not #3. Players should start with 2 cards */
			dealer.dealCard(dealer);
			dealer.dealCard(p);
		}
	
		if(dealer.isInsuranceAvailable()){
			for(PlayerAction p: players ){
				p.makeInsuranceBet();
			}
		}

		for(PlayerAction p: players ){
			boolean turnOver = false;
			while(!turnOver){
				PlayerAction.ActionType a = p.getAction();	
				switch(a){
					case HIT:
						dealer.dealCard(p);		
						break;
					case DOUBLE:
						p.doubleDownBet();
						dealer.dealCard(p);
						turnOver = true;
						break;
					case STAND: // stand
						turnOver = true;
						break;
				}
		
			}
		}

		for(PlayerAction p: players){
			dealer.compareHandAndSettle(p);
		}
	}
}

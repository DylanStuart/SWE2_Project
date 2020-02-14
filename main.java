//package SWE2_Project;

import java.util.Scanner;


public class main {
	
    static Scanner scan = new Scanner(System.in);
    	public static void main(String[] args) {
             
	        Deck A = new Deck();
	        A.MakeDeck(A);
	        A.Shuffle();
	        int option = -1;
         
	        
         
	        Game C = new Game();
	        Statistics stat = new Statistics();
	        Bet User = new Bet();
			Bet.set_num_players(2);
			Bet dealer  = new Bet();
	        boolean test = true;
	        while(test)
	        {
	        	System.out.println("Please choose one of the following options :");
		        System.out.println("(1). Start Game. ");
		        System.out.println("(2). Place bets. ");
		        System.out.println("(3). View statistics " );
		        System.out.println("(4). Add Player ");
		        System.out.println("(5). Exit ");
		        option = scan.nextInt();
		        
	        	switch(option){
	        	case 1:
	        		C = new Game();
			        Hand Player = new Hand();
			        Hand Dealer = new Hand();
			        C.PlayGame(Player, Dealer, A);
			        break;
				case 2:
					//Bet User = new Bet();
					//Bet.set_num_players(2);
					//Bet dealer  = Bet.add_player_bet();
					//Bet player2  = Bet.add_player_bet();
					User.update_user_bet();
					dealer.update_bet(25);
					//int num = stat.gamesWon(C);
					if(C.value > 21 || (C.value <= C.dealerValue && C.dealerValue <= 21))
					{
						User.total = User.total - (dealer.bet + User.bet);
						dealer.total = dealer.total + (dealer.bet + User.bet);
					}
					else if(C.dealerValue > 21 || (C.dealerValue < C.value && C.value <= 21))
					{
						User.total = User.total + (dealer.bet + User.bet);
						dealer.total = dealer.total - (dealer.bet + User.bet);
					}
					
					//System.out.println(player2.total);
					System.out.println("User total score:" + User.total);
					System.out.println("Dealer total score:" + dealer.total);
					break;
				case 3:
					
				    stat.gamesPlayed(C);
				    stat.gamesWon(C);
				    stat.gamesLost(C);
				    stat.percentages(C);
				    break;
				case 4:
					System.out.println("Adding player 2 to the Game ");
					System.out.println("Starting game now...");
					Hand Player1_1 =  new Hand();
				    Hand Player2 = new Hand();
				    Hand Dealer1_1 = new Hand();
				    AddPlayer B = new AddPlayer();
				    B.PlayGame2(Player1_1,Player2,Dealer1_1,A);
				    break;
				case 5:
					test = false;
				    break; 
				}
	        }
    	}
}

package SWE2_Project;

import java.util.Scanner;
public class main {
     public static void main(String[] args) {
        boolean end = false;

        while (true) {
            Deck A = new Deck();

            Game C = new Game();
            A.MakeDeck(A);
            A.Shuffle();
            Hand Player = new Hand();
            Hand Dealer = new Hand();
            C.PlayGame(Player, Dealer, A);
            Bet B = new Bet();
            Statistics stat = new Statistics();

            stat.gamesPlayed(C);
            stat.gamesWon(C);
            stat.gamesLost(C);
            stat.percentages(C);


        }
//        Hand Player2 = new Hand();
//        AddPlayer B = new AddPlayer();
//          B.PlayGame(Player,Player2,Dealer,A);
        
        
        
    
}
}



package SWE2_Project;

import java.util.Scanner;


public class main {
    static Scanner scan = new Scanner(System.in);
     public static void main(String[] args) {
             
        Deck A = new Deck();
       
        A.MakeDeck(A);
        A.Shuffle();
         int option = -1;
         
         System.out.println("Please choose one of the following options :");
         System.out.println("(1). Start Game. ");
         System.out.println("(2). Place bets. ");
         System.out.println("(3). View statistics " );
         System.out.println("(4). Add Player ");
         System.out.println("(5). Exit ");
         option = scan.nextInt();
         
         
         switch(option){
          case 1:
        Game C = new Game();
        Hand Player = new Hand();
        Hand Dealer = new Hand();
        C.PlayGame(Player, Dealer, A);
              break;
          case 2:
              break;
          case 3:
              break;
          case 4:
          AddPlayer B = new AddPlayer();
          B.PlayGame(Player,Player2,Dealer,A);
              break;
          case 5:
              break;
          
                 
         
     }
         
         
         
         
     
        
        
        
        
        
    
}
}


        
        
        
        
    


package in.beingzero.javawebservice;

/**
 *
 * @author kryst
 */
import java.util.Scanner;
public class Game {
    static Scanner scan = new Scanner(System.in);
    int value = 0;
    int dealerValue = 0;
    public static int gCount;
    public static int gWin ;
    public static int gLose ;

    public int gamePlayed() {
         return gCount;
    }
     public int playerWin() {
         return gWin;
    }
    public int playerLose() {
         return gLose;
    }
    public void PlayGame(Hand Player, Hand Dealer, Deck A){
        gCount++;
        Player.DealHand(A);
        Dealer.DealHand(A);
        
        //int k = Dealer.HandCount(); //removed due to Dealer. HAndcount never used
        int k;
        //int choice;
        Boolean WinOrLose = true;
        Boolean choice1;
        System.out.println("YOUR HAND IS:");
        Player.PrintHand();
        int i;
        int gameCount = Player.HandCount();    // I tried putting this loop in his own method, but i was getting an error for some reason
        for (i = 0; i < gameCount; i++){ 
         value = value + Player.getValue(i);
         dealerValue = dealerValue +Dealer.getValue(i);
        }
        System.out.println("YOUR CURRENT SCORE IS:" + value );
        //Shows the player 1 card from the dealer
        System.out.println("THE ONE CARD YOU CAN SEE FROM DEALER IS:");
        Dealer.PrintHandDealer();
        choice1 = wantToHit();
       
        // loop to keep adding cards to the player hand as long as they choose hit
            while(choice1 == false && WinOrLose == true){
            value = 0;
            int j = Player.HandCount();
            Player.DealHand(A);
            Player.PrintHand();
            for (i = 0; i < j; i++){ 
                value = value + Player.getValue(i);
            }
        // a WinOrLose method is called to check if the player is going over 21
            System.out.println("YOUR CURRENT SCORE IS: " + value );
            WinOrLose = CheckScore(value);
            if(WinOrLose == false){
            gLose++;
            System.out.println("YOU LOSE");
            break;
            }  
            choice1 = wantToHit();
        }
           
            while(choice1 == true && dealerValue <= 17 && dealerValue < value ){
                System.out.println("The Dealer will now hit to match or beat your score");
                k = Dealer.HandCount();
                Dealer.DealHand(A);
                System.out.println("The Dealers Full hand after hitting is :");
                Dealer.PrintHandDealer();
     
                for (i = 2; i < k; i++){ 
                    dealerValue= dealerValue + Dealer.getValue(i);
                    
                    System.out.println("THE DEALERS CURRENT SCORE IS:" + dealerValue);
                    if(dealerValue >= 17){
                        if(dealerValue > 21){
                            gWin++;
                            System.out.println("THE DEALER BUSTS & YOU WIN!");
                            System.out.println("YOUR CURRENT SCORE IS: " + value );
                        }
                        break;
                    }
                    System.out.println("THE DEALER WILL HIT AGAIN");
                    
                }
            }
            //if neather the player or the dealer busts we will compair the scores.
            if(dealerValue <= 21 && value <= 21){
                if(dealerValue >= value) {
                    gLose++;
                    System.out.println("SORRY THE DEALER'S SCORE IS HIGHER OR TIED");
                    System.out.println("The dealer current score is " + dealerValue);
                    System.out.println("Your current score is " + value );
                    System.out.println("THE DEALER WINS & YOU LOOSE");      
                }
                else{
                    gWin++;
                    System.out.println("THE PLAYER'S SCORE IS HIGHER");
                    System.out.println("YOUR CURRENT SCORE IS: " + value );
                    System.out.println("***YOU WIN!!!***");
                }   
            }
    }
    public boolean CheckScore(int value){
        if(value > 21){
            return false;
        }
        else{
            return true;
        }
        }
    public boolean wantToHit() {
        System.out.println("Would you like to Stay(1) or Hit(2)?");
        while (true) {
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    System.out.println("Please choose 1 or 2");
                    break;
            }
        }
    }

    

}

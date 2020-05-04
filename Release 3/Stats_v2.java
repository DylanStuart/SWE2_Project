import java.util.Scanner;
public class Statistics {
    static int win;
    static int lose;
    static int gameCount;
    static int earnings;
//    Game A = new Game();
    Statistics () {
        this.win = 0;
        this.lose = 0;
        this.gameCount = 0;
        this.earnings = 0;
    }

    public static int gamesPlayed (Game A) {
        gameCount = A.gamePlayed();//gameCount+
        System.out.println("Game count from Stats: " + gameCount);
        return gameCount;
    }

    public static int gamesWon (Game A) {
        win = A.playerWin();//win + 
        System.out.println("Game(s) won from stats: " + win);
//        earnings = earnings + B.getBet();
//        System.out.println("Game earnings: " + earnings);
        return win;
    }


    public int gamesLost (Game A) {
        lose = A.playerLose();//lose + 
        System.out.println("Game(s) lost from stats: " + lose);
//        earnings = earnings - B.getBet();
//        System.out.println("Game earnings: " + earnings);
        return lose;
  }


    public void percentages (Game A) {
        float percentages = (int)((float)win/(float)gameCount * 100);
        System.out.println("Your win percentage is: "+ percentages+ "%");
         float percentagesL = (int)((float)lose/(float)gameCount * 100);
        System.out.println("Your loss percentage is: "+ percentagesL+ "%");
        
            if( percentages < 20){
                System.out.println("Your win percentage requires you to keep playing this game as an Hobby ONLY!");
            }
            if(percentages >= 20 && percentages <50){
                System.out.println("Keep trying and you might can gain some experience!");
            }
            if(percentages >= 50 && percentages <75){
                System.out.println("Keep trying and you might can play professionally!");
            }
             if(percentages >= 75 && percentages <=100){
                System.out.println("Have you ever thought about playing professionally!");
            }
            
            }
            
    
}

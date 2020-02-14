
package SWE2_Project;

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
        gameCount = gameCount+A.gamePlayed();
        System.out.println("Game count from Stats: " + gameCount);
        return gameCount;
    }

    public static int gamesWon (Game A) {
        win = win + A.playerWin();
        System.out.println("Game(s) won from stats: " + win);
//        earnings = earnings + B.getBet();
//        System.out.println("Game earnings: " + earnings);
        return win;
    }


    public int gamesLost (Game A) {
        lose = lose + A.playerLose();
        System.out.println("Game(s) lost from stats: " + lose);
//        earnings = earnings - B.getBet();
//        System.out.println("Game earnings: " + earnings);
        return lose;
  }


    public void percentages (Game A) {
        float percentages = (int)((float)win/(float)gameCount * 100);
        System.out.println("Your win percentage is: "+ percentages+ "%");
    }
}


package SWE2_Project;

import java.util.Scanner;
public class Statistics {
    static int win;
    static int lose;
    static int gameCount;
//    Game A = new Game();
    Statistics () {
        this.win = 0;
        this.lose = 0;
        this.gameCount = 0;
    }

    public static int gamesPlayed (Game A) {
        gameCount = A.gamePlayed();
        System.out.println("Game count from Stats: " + gameCount);
        return gameCount;
    }

    public static int gamesWon (Game A) {
        win = A.playerWin();
        System.out.println("Game(s) won from stats: " + win);
        return win;
    }


    public int gamesLost (Game A) {
        lose = A.playerLose();
        System.out.println("Game(s) lost from stats: " + lose);
        return lose;
  }
//
//    public void percentages () {
//        System.out.println("Your win percentage is: "+ win/gameCount);
//    }
}

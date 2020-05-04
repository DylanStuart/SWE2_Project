package in.beingzero.javawebservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kryst
 */
@WebService(serviceName = "StatisticsWebServ")
public class StatisticsWebServ {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    static int win;
    static int lose;
    static int gameCount;
    static int earnings;
//    Game A = new Game();
    @WebMethod(operationName = "Statistics")
    StatisticsWebServ () {
        StatisticsWebServ.win = 0;
        StatisticsWebServ.lose = 0;
        StatisticsWebServ.gameCount = 0;
        StatisticsWebServ.earnings = 0;
    }
    @WebMethod(operationName = "gamesPlayed")
    public static int gamesPlayed (@WebParam(name = "game")Game A) {
        gameCount = A.gamePlayed();//gameCount+
        System.out.println("Game count from Stats: " + gameCount);
        return gameCount;
    }
    @WebMethod(operationName = "gameswon")
    public static int gamesWon (@WebParam(name = "game")Game A) {
        win = A.playerWin();//win + 
        System.out.println("Game(s) won from stats: " + win);
//        earnings = earnings + B.getBet();
//        System.out.println("Game earnings: " + earnings);
        return win;
    }

    @WebMethod(operationName = "gameslost")
    public int gamesLost (@WebParam(name = "game")Game A) {
        lose = A.playerLose();//lose + 
        System.out.println("Game(s) lost from stats: " + lose);
//        earnings = earnings - B.getBet();
//        System.out.println("Game earnings: " + earnings);
        return lose;
  }

    @WebMethod(operationName = "percentages")
    public void percentages (@WebParam(name = "game")Game A) {
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

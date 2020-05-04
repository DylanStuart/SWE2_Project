package in.beingzero.javawebservice;

import java.util.Scanner;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kryst
 */
@WebService(serviceName = "BetWebServ")
public class BetWebServ {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
   

	public int bet;
	public int total;
	
	public static int num_players;
        @WebMethod(operationName = "bet")
	BetWebServ(){}
        @WebMethod(operationName = "bet")
	BetWebServ(@WebParam(name = "firstnum")int a,@WebParam(name = "secondNum") int b)
	{
		System.out.println("Choose a bet: (0),(25),(50) or (75).");
		Scanner input = new Scanner(System.in);
		String x = input.next();
		while(!x.equals("0") & !x.equals("25") & !x.equals("50") & !x.equals("75"))
		{
			System.out.println("Please select either: (0),(25),(50) or (75).");
			x = input.next();
		}	
		bet = Integer.parseInt(x);
		//total = 100 - bet;
		//input.close();
	}
        @WebMethod(operationName = "bet")
	BetWebServ(@WebParam(name = "firstnum")int a)
	{
		bet = 25;
		//total = 100 - bet;
	}
        @WebMethod(operationName = "update_bet")
	public void update_bet(@WebParam(name = "firstnum")int a)
	{
		bet = a;
		//total = total - bet;
	}
         @WebMethod(operationName = "update_user_bet")
	public void update_user_bet()
	{
		System.out.println("Choose a bet: (0),(25),(50) or (75).");
		Scanner input = new Scanner(System.in);
		String x = input.next();
		while(!x.equals("0") & !x.equals("25") & !x.equals("50") & !x.equals("75"))
		{
			System.out.println("Please select either: (0),(25),(50) or (75).");
			x = input.next();
		}	
		bet = Integer.parseInt(x);
		//total = total - bet;
		//input.close();
	}
         @WebMethod(operationName = "set_num")
	public static void set_num_players(@WebParam(name = "firstnum")int num)
	{
		num_players = num;
	}
         @WebMethod(operationName = "add_player_bet")
	public static BetWebServ add_player_bet()
	{
		BetWebServ ai = new BetWebServ(num_players);
		return ai;
	}
         @WebMethod(operationName = "getBet")
	public int getBet()
	{
		return bet;
	}
	

}

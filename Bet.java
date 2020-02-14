import java.util.Scanner;
public class Bet {

	public int bet;
	public int total;
	
	public static int num_players;
	Bet()
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
		total = 100 - bet;
		//input.close();
	}
	Bet(int a)
	{
		bet = 25;
		total = 100 - bet;
	}
	public void update_bet(int a)
	{
		bet = a;
		total = total - bet;
	}
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
		total = total - bet;
		//input.close();
	}
	public static void set_num_players(int num)
	{
		num_players = num;
	}
	public static Bet add_player_bet()
	{
		Bet ai = new Bet(num_players);
		return ai;
	}
	public int getBet()
	{
		return bet;
	}
	
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AddPlayerTest {
    
    public AddPlayerTest() {
    }

    public void setUp() {
    }
    
 
    public void tearDown() {
    }

  
 
    public void testPlayerWin() {
        System.out.println("playerWin");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.playerWin();
        assertEquals(expResult, result);
        
    }

   

    public void testPlayerLose() {
        System.out.println("playerLose");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.playerLose();
        assertEquals(expResult, result);
       
    }

   

    public void testPlayGame() {
        System.out.println("PlayGame2");
        Hand Player = new Hand();
        Hand Dealer = new Hand();
        Card B = new Card("bo",1);
        Deck A =  new Deck();
       
        
        assertNull(A.pop());
        
    }


    public void testCheckScore() {
        System.out.println("CheckScore");
        int value = 0;
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.CheckScore(value);
        assertEquals(expResult, result);
       
    }
    
}

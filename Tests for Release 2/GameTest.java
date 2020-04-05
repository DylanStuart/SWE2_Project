/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dstua
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gamePlayed method, of class Game.
     */
    @Test
    public void testGamePlayed() {
        System.out.println("gamePlayed");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.gamePlayed();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of playerWin method, of class Game.
     */
    @Test
    public void testPlayerWin() {
        System.out.println("playerWin");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.playerWin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of playerLose method, of class Game.
     */
    @Test
    public void testPlayerLose() {
        System.out.println("playerLose");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.playerLose();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of PlayGame method, of class Game.
     */
    @Test
    public void testPlayGame() {
        System.out.println("PlayGame");
        Hand Player = new Hand();
        Hand Dealer = new Hand();
        Card B = new Card("bo",1);
        Deck A =  new Deck();
       
        
        assertNull(A.pop());
        
    }

    /**
     * Test of CheckScore method, of class Game.
     */
    @Test
    public void testCheckScore() {
        System.out.println("CheckScore");
        int value = 0;
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.CheckScore(value);
        assertEquals(expResult, result);
       
    }
    
}

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
public class AddPlayerTest {
    
    public AddPlayerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of PlayGame2 method, of class AddPlayer.
     */
    @Test
    public void testPlayGame2() {
        System.out.println("PlayGame2");
         Hand Player = new Hand();
        Hand Dealer = new Hand();
        Card B = new Card("bo",1);
        Deck A =  new Deck();
       
        
        assertNull(A.pop());
    }

    /**
     * Test of CheckScore method, of class AddPlayer.
     */
    @Test
    public void testCheckScore() {
        System.out.println("CheckScore");
        int value = 0;
        AddPlayer instance = new AddPlayer();
        boolean expResult = true;
        boolean result = instance.CheckScore(value);
        assertEquals(expResult, result);
      
    }
    
}

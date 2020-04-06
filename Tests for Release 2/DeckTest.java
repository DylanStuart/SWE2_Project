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
public class DeckTest {
    
    public DeckTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Push method, of class Deck.
     */
    @Test
    public void testPush() {
        System.out.println("Push");
        Card x = null;
        Deck instance = new Deck();
        instance.Push(x);
       
    }

    /**
     * Test of pop method, of class Deck.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.pop();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("Shuffle");
         Hand Player = new Hand();
        Hand Dealer = new Hand();
        Card B = new Card("bo",1);
        Deck A =  new Deck();
       
        
        assertNull(A.pop());
        
    }

    /**
     * Test of sizeCount method, of class Deck.
     */
    @Test
    public void testSizeCount() {
        System.out.println("sizeCount");
        int x = 0;
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.sizeCount(x);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of MakeDeck method, of class Deck.
     */
    @Test
    public void testMakeDeck() {
        System.out.println("MakeDeck");
          Hand Player = new Hand();
        Hand Dealer = new Hand();
        Card B = new Card("bo",1);
        Deck A =  new Deck();
       
        
        assertNull(A.pop());
           }

    /**
     * Test of printDeck method, of class Deck.
     */
    @Test
    public void testPrintDeck() {
        System.out.println("printDeck");
        Deck A = null;
        Deck instance = new Deck();
        instance.printDeck(A);
     
    }
    
}

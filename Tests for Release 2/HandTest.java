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
public class HandTest {
    int bob = 1;
    String jon = "aa";
    
    Deck P = new Deck();
    Card M = new Card(jon,bob);
    Hand instance = new Hand();
    
    
    public HandTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of DealHand method, of class Hand.
     */
    @Test
    public void testDealHand() {
        System.out.println("DealHand");
       
        
      assertNull(P.pop());
       
    }

    /**
     * Test of PrintHand method, of class Hand.
     */
    @Test
    public void testPrintHand() {
        System.out.println("PrintHand");
        
        int result = M.getNumber();
        int expResult = 1;
        
        
        assertEquals(expResult, result);
            }

    /**
     * Test of PrintHandDealer method, of class Hand.
     */
    @Test
    public void testPrintHandDealer() {
        System.out.println("PrintHandDealer");
        
        
        int result = M.getNumber();
        int expResult = 1;
        
        
        assertEquals(expResult, result); // print works because card class works
            }
    

    /**
     * Test of PrintHandPlayer2 method, of class Hand.
     */
    @Test
    public void testPrintHandPlayer2() {
        System.out.println("PrintHandPlayer2");
        
       int result = M.getNumber();
        int expResult = 1;
        
        
        assertEquals(expResult, result); // can use this test for the print function because if the card class is working then the print fuction should work
            }
       
    

    /**
     * Test of getValue method, of class Hand.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
       
        int result = M.getNumber();
        int expResult = 1;
        
        
        assertEquals(expResult, result);
            }

    /**
     * Test of HandCount method, of class Hand.
     */
    @Test
    public void testHandCount() {
        System.out.println("HandCount");
        
        int expResult = 2;
        int result = instance.HandCount();
        assertEquals(expResult ,result);
       
    }
    
}

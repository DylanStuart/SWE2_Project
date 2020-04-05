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
public class CardTest {
    int bob = 1;
     String s = "jack";
     Card H = new Card(s,bob);
    
    public CardTest() {
        
       
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        
        String expResult = "jack";
       
        String result = H.getSuit();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getNumber method, of class Card.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
      
        int expResult = 1;
        int result = H.getNumber();
        assertEquals(expResult, result);
       
    }

   
    
}

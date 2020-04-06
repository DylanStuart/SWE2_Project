/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe2_project;

import SWE2_Project.Bet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @Andrew Harper
 */
public class BetTest {
    
    public BetTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update_bet method, of class Bet.
     */
    @Test
    public void testUpdate_bet() {
        System.out.println("Test Case 1");
        int a = 0;
        Bet instance = new Bet();
        instance.update_bet(a);
        int ans = instance.bet;
        int expect = 0;
        assertEquals(expect, ans);
    }
    @Test
    public void testUpdate_bet2() {
        System.out.println("Test Case 2");
        int a2 = 0;
        Bet instance2 = new Bet();
        instance2.update_bet(a2);
        int ans2 = instance2.bet;
        int expect2 = 0;
        assertEquals(expect2, ans2);
    }



    /**
     * Test of set_num_players method, of class Bet.
     */
    @Test
    public void testSet_num_players() {
        System.out.println("Test Case 3");
        int num = 2;
        Bet.set_num_players(num);
        int ans = Bet.num_players;
        int expect = 2;
        assertEquals(expect, ans);
    }
    @Test
    public void testSet_num_players2() {
        System.out.println("Test Case 4");
        int num2 = -1;
        Bet.set_num_players(num2);
        int ans2 = Bet.num_players;
        int expect2 = -1;
        assertEquals(expect2, ans2);
    }
    
}



/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

//package swe2_project;


import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;



/**

 *

 * @author Nathanael R

 */

public class StatisticsTest {



    public StatisticsTest() {

    }



    @Before

    public void setUp() {

    }



    @After

    public void tearDown() {

    }



    /**

     * Test of gamesPlayed method, of class Statistics.

     */

    @Test

    public void testGamesPlayed() {

        System.out.println("gamesPlayed");

        Game A = new Game();

        int expResult = 0;

        int result = Statistics.gamesPlayed(A);

        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.

        //fail("The test case is a prototype.");

    }



    /**

     * Test of gamesWon method, of class Statistics.

     */

    @Test

    public void testGamesWon() {

        System.out.println("gamesWon");

        Game A = new Game();

        int expResult = 0;

        int result = Statistics.gamesWon(A);

        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.

        //fail("The test case is a prototype.");

    }



    /**

     * Test of gamesLost method, of class Statistics.

     */

    @Test

    public void testGamesLost() {

        System.out.println("gamesLost");

        Game A = new Game();

        Statistics instance = new Statistics();

        int expResult = 0;

        int result = instance.gamesLost(A);

        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.

        //fail("The test case is a prototype.");

    }



    /**

     * Test of percentages method, of class Statistics.

     */

    @Test

    public void testPercentages() {

        System.out.println("percentages");

        Game A = new Game();

        Statistics instance = new Statistics();

        instance.percentages(A);

        // TODO review the generated test code and remove the default call to fail.

        //fail("The test case is a prototype.");

    }



}

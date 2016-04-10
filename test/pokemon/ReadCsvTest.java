/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GMI
 */
public class ReadCsvTest {
    
    public ReadCsvTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAttack1 method, of class ReadCsv.
     */
    @Test
    public void testGetAttack1() {
        System.out.println("getAttack1");
        int choix;
        int ligne = 0;
        int expResult = 0;
        int result;
        // on teste les 5 choix du joueur 
        for (choix = 1; choix <=5; choix++) {
        result = ReadCsv.getAttack1(choix, ligne);
        if ( result > 0) { expResult = 1; }
         assertEquals(expResult,1);
        } 
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAttack2 method, of class ReadCsv.
     */
    @Test
    public void testGetAttack2() {
        System.out.println("getAttack2");
        int ligne = 0;
        int expResult = 0;
        int result = ReadCsv.getAttack2(ligne);
        if (result > 0) { expResult = 1; } 
        assertEquals(expResult,1);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getpokemon1 method, of class ReadCsv.
     */
    @Test
    public void testGetpokemon1() {
        System.out.println("getpokemon1");
        int ligne = 0;
        int expResult = 0;
        int result = ReadCsv.getpokemon1(ligne);
        if (result >= 1 && result <= 11) { expResult = 1; }
        assertEquals(expResult, 1);
        
    }

    /**
     * Test of getpokemon2 method, of class ReadCsv.
     */
    @Test
    public void testGetpokemon2() {
        System.out.println("getpokemon2");
        int ligne = 0;
        int expResult = 0;
        int result = ReadCsv.getpokemon2(ligne);
        if (result >= 1 && result <= 11) { expResult = 1; }
        assertEquals(expResult, 1);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

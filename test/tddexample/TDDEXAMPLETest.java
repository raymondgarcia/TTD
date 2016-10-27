/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vpvenezuela
 */
public class TDDEXAMPLETest {
    
    public TDDEXAMPLETest() {
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
     * Test of main method, of class TDDEXAMPLE.
     */
    @Test
    public void testDollarMultiplication(){
        Money money = Money.dollar(5);
        assertEquals(Money.dollar(10), money.times(2));     
        assertEquals(Money.dollar(15), money.times(3));
    }
    
    @Test
     public void testBolivarMultiplication(){
        Money money = Money.bolivar(5);
        assertEquals(Money.bolivar(10), money.times(2));     
        assertEquals(Money.bolivar(15), money.times(3));
     }
    
    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.dollar(5).equals(Money.bolivar(5)));
    }
    
  @Test
  public void testCurrency(){
      assertEquals("USD", Money.dollar(5).getCurrency());  
      assertEquals("BS", Money.bolivar(5).getCurrency());  
  }
  
   @Test
  public void testSSumCurrecy(){
      assertEquals(Money.dollar(10), Money.dollar(5).add(Money.dollar(5)));  
  }
    
}

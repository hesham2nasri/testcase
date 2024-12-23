/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.leecottrell.simpleclasstest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author User
 */
public class SimpleClassTest {
    
    private static SimpleClass test;
    public SimpleClassTest() {
    }

    @BeforeAll
    
    public static void setupTest()
    {
        test = new SimpleClass();
    }
    @Test
    public void testAddEm() 
    {
        //SimpleClass test =new SimpleClass();
        int expected
                =4;
        int actual;
        
        
        actual=test.addEm(1, 2);
        
        assertEquals(expected,actual,"Addem does not work correctly");
        
    }
    
}

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
 * @ User
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
     //This Function will test the SubEm Function if they give the expected value of the athirmatic operation Sub(-)
    public void testSddEm() 
    {
        //SimpleClass test =new SimpleClass();
        int expected
                =5;
        int actual;
        
        
        actual=test.addEm(4, 1);
        
        assertEquals(expected,actual,"Addem does not work ");
        
    }
    
}

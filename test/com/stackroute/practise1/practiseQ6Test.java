package com.stackroute.practise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class practiseQ6Test {
    practiseQ6 obj;
    @Before
    public void setUp() throws Exception {
        obj=new practiseQ6();
    }

    @Test
    public void checkCharSmallletterCorrect() {
        String result=obj.checkChar('a');
        String expected="Small letter";
        assertEquals(expected,result);
    }
    @Test
    public void checkCharSmallletterInCorrect() {
        String result=obj.checkChar('9');
        String expected="Small letter";
        assertEquals(expected,result);
    }
    @Test
    public void checkCharCapitalletterCorrect() {
        String result=obj.checkChar('A');
        String expected="Capital letter";
        assertEquals(expected,result);
    }
    @Test
    public void checkCharCapitalletterInCorrect() {
        String result=obj.checkChar('a');
        String expected="Capital letter";
        assertEquals(expected,result);
    }
    @Test
    public void checkCharDigit() {
        String result=obj.checkChar('3');
        String expected="digit";
        assertEquals(expected,result);
    }
    @Test
    public void checkCharSpecialletter() {
        String result=obj.checkChar('@');
        String expected="Special symbol";
        assertEquals(expected,result);
    }
}
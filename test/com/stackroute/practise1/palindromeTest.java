package com.stackroute.practise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {

    @Test
    public void palindromeTest1(){
        Palindrome pal=new Palindrome();
        boolean result=pal.palindrome("lal");
        assertTrue(result);
    }
    @Test
    public void palindromeTest2(){
        Palindrome pal=new Palindrome();
        boolean result=pal.palindrome("nitin");
        assertFalse(result);
    }
}
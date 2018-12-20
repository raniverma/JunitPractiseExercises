package com.stackroute.practise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class practiseQ1Test {

    @Test
    public void palindromeTest1(){
        practiseQ1 pal=new practiseQ1();
        boolean result=pal.palindrome("lal");
        assertTrue(result);
    }
    @Test
    public void palindromeTest2(){
        practiseQ1 pal=new practiseQ1();
        boolean result=pal.palindrome("nitin");
        assertFalse(result);
    }
}
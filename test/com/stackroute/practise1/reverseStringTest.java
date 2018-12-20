package com.stackroute.practise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class reverseStringTest {
    ReverseString obj;
    @Before
    public void setUp() throws Exception {
        obj=new ReverseString();
    }

    @Test
    public void reverseStringInCorrect() {
        String expected="ram";
        String result=obj.reverseString("ram");
        assertEquals(expected,result);
    }
    @Test
    public void reverseStringCorrect() {
        String expected="mar";
        String result=obj.reverseString("ram");
        assertEquals(expected,result);
    }
}
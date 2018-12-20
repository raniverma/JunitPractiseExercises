package com.stackroute.practise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class practiseQ9Test {
    practiseQ9 obj;
    @Before
    public void setUp() throws Exception {
        obj=new practiseQ9();
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
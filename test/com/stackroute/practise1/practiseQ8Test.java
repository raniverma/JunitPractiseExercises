package com.stackroute.practise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class practiseQ8Test {
    practiseQ8 obj;
    @Before
    public void setUp() throws Exception {
        obj=new practiseQ8();
    }

    @Test
    public void searchTargetLessThanTarget() {
        String expected="Number guessed is less than original number.";
        String result=obj.searchTarget(34);
        assertEquals(expected,result);
    }

    @Test
    public void searchTargetMoreThanTarget() {
        String expected="Number guessed is more than original number.";
        String result=obj.searchTarget(101);
        assertEquals(expected,result);
    }
    @Test
    public void searchTargetEquals() {
        String expected="Number guessed matches the original number.";
        String result=obj.searchTarget(100);
        assertEquals(expected,result);
    }

}
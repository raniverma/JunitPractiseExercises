package com.stackroute.practise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class practiseQ5Test {
    practiseQ5 obj;

    @Before
    public void create(){
        obj=new practiseQ5();
    }

    @Test
    public void  sumOfIntegersEnteredNumbersOnlyTest(){
        long result=obj.sumOfIntegers("10 10 10 10");
        long expected=40;
        assertEquals(expected,result);
    }
    @Test
    public void  sumOfIntegersEnteredNotNumbersOnlyTest(){
        long result=obj.sumOfIntegers("10ab 10 10 10");
        long expected=40;
        assertEquals(expected,result);
    }

}
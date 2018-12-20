package com.stackroute.practise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class practiseQ7Test {
    practiseQ7 obj;
    @Before
    public void setUp() throws Exception {
        obj=new practiseQ7();
    }

    @Test
    public void checkSumOfEvenDigitsInCorrect() {
        boolean result=obj.CheckSumOfEvenDigits("8989898989");
        assertTrue(result);
    }

    @Test
    public void checkSumOfEvenDigitsCorrect() {
        boolean result=obj.CheckSumOfEvenDigits("1234567");
        assertTrue(result);
    }

}
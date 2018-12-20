package com.stackroute.practise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class numbersPrintTest {
    NumbersPrint obj;

    @Before
    public void create(){
        obj=new NumbersPrint();
    }

    @Test
    public void numbersPrintCorrect() {
        String expected="122333";
        String actual=obj.numbersPrint(3);
        assertEquals("output not correct",expected,actual);
    }
    @Test
    public void numbersPrintErrorCorrect() {
        String expected="error";
        String actual=obj.numbersPrint(0);
        assertEquals("output not correct",expected,actual);
    }
    @Test
    public void numbersPrintErrorWrong() {
        String expected="Error";
        String actual=obj.numbersPrint(0);
        assertEquals("output not correct",expected,actual);
    }
    @Test
    public void numbersPrintWrong() {
        String expected="1223334444";
        String actual=obj.numbersPrint(3);
        assertEquals("output not correct",expected,actual);
    }
}
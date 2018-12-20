package com.stackroute.practise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class practiseQ3Test {
    practiseQ3 obj;

    @Before
    public void create(){
        obj=new practiseQ3();
    }

    @Test
    public void checkEachCharTypeCorrect() {
        String arr[]=obj.checkEachCharType("abc");
        String expected[]={"Vowel","Consonant","Consonant"};
        assertArrayEquals("output not correct",expected,arr);
    }
    @Test
    public void checkEachCharTypeInCorrect() {
        String arr[]=obj.checkEachCharType("ccc");
        String expected[]={"Vowel","Consonant","Consonant"};
        assertArrayEquals("output not correct",expected,arr);
    }
}
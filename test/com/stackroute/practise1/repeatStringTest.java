package com.stackroute.practise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class repeatStringTest {
    RepeatString obj;
    @Before
    public void setUp() throws Exception {
        obj=new RepeatString();
    }

    @Test
    public void repeatStringInCorrect() {
        String expected="ramramramram";
        String result=obj.repeatString("ram",2);
        assertEquals(expected,result);
    }

    @Test
    public void repeatStringCorrect() {
        String expected="stackrouterouterouterouterouteroute";
        String result=obj.repeatString("stackroute",5);
        assertEquals(expected,result);
    }

}
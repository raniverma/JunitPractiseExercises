package com.stackroute.practise1;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class tomJerryTest {
    TomJerry obj;

    @Before
    public void create(){
        obj=new TomJerry();
    }

    @Test
    public void oddNotBetween20and30() {
        String ans=obj.tomJerry(3);
        assertEquals(ans,"jerry");
    }
    @Test
    public void evenNotBetween20and30() {
        String ans=obj.tomJerry(14);
        assertEquals(ans,"Other");
    }
    @Test
    public void oddBetween20and30() {
        String ans=obj.tomJerry(23);
        assertEquals(ans,"Tom");
    }
    @Test
    public void evenBetween20and30() {
        String ans=obj.tomJerry(24);
        assertEquals(ans,"Jerry");
    }
}
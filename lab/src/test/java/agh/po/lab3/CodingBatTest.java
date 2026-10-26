package agh.po.lab3;

import static org.junit.Assert.*;
public class CodingBatTest {

    CodingBat obj =new CodingBat();
    @org.junit.Test
    public void startHi() {
        assertEquals(true, obj.startHi("hi start"));
        assertEquals(false, obj.startHi("bob hi"));
        assertEquals(true, obj.startHi("hihihihih"));
    }

    @org.junit.Test
    public void sleepIn() {
        assertEquals(true, obj.sleepIn(true, true));
        assertEquals(false, obj.sleepIn(true, false));
        assertEquals(true, obj.sleepIn(false, true));
    }

    @org.junit.Test
    public void countEvens() {
        assertEquals(1, obj.countEvens(new int[]{1,2,3}));
        assertEquals(2, obj.countEvens(new int[]{1,2,7,6,3}));
        assertEquals(3, obj.countEvens(new int[]{5,8,6,10}));
    }

    @org.junit.Test
    public void helloName() {
        assertEquals("Hello Bob!", obj.helloName("Bob"));
        assertEquals("Hello Marta!", obj.helloName("Marta"));
        assertEquals("Hello Zdzisław!", obj.helloName("Zdzisław"));
    }
}
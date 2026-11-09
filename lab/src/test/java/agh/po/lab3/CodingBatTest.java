package agh.po.lab3;


import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
public class CodingBatTest {

    CodingBat obj = new CodingBat();

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

    @org.junit.Test
    public void mapAB() {
        assertEquals(Map.of("a","Hi","b","There","ab","HiThere"), obj.mapAB(new HashMap<>(Map.of("a","Hi","b","There"))));
        assertEquals(Map.of("a","Map","b","Map","ab","MapMap"), obj.mapAB(new HashMap<>(Map.of("a","Map","b","Map"))));
        assertEquals(Map.of("a","tak","b","nie","ab","taknie"), obj.mapAB(new HashMap<>(Map.of("a","tak","b","nie"))));
    }

    @org.junit.Test
    public void worldLen() {
            assertEquals(Map.of("a", 1, "cc", 2), obj.wordLen(new String[]{"a", "cc"}));
            assertEquals(Map.of("aasda", 5, "ccdddq", 6), obj.wordLen(new String[]{"aasda", "ccdddq"}));
            assertEquals(Map.of("aaas", 4, "ffs", 3, "acadf", 5, "bbba", 4), obj.wordLen(new String[]{"aaas", "ffs", "acadf", "bbba"}));
        }
    }

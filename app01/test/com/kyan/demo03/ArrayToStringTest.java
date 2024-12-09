package com.kyan.demo03;

//import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayToStringTest {

    @Test
    public void testArrayToString() {
        ArrayToString a2s = new ArrayToString();
        String[] str = {"qwe", "asd", "zxc"};
        assertEquals("[qwe, asd, zxc]", a2s.arrayToString(str));
    }
}
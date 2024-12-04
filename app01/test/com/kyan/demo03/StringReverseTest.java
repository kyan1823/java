package com.kyan.demo03;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {

    @Test
    void testCheckString() {
        StringReverse str = new StringReverse();
        boolean test = str.checkString("asdfdsa");
        assertTrue(test);
    }
}
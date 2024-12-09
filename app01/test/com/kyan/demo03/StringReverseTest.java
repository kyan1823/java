package com.kyan.demo03;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;


public class StringReverseTest {

    @Test
    public void testCheckString() {
        assertTrue(new StringReverse().checkString("asdfdsa"));
    }
    
    @Test
    public void testCase1() {
    	assertThat(false,equalTo(new StringReverse().checkString("qwe")));
    }
}
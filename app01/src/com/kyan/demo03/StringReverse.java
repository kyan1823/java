package com.kyan.demo03;

public class StringReverse {
    public static boolean checkString(String str) {

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        if (sb.toString().equals(str)) {
            return true;
        }else {
            return false;
        }
    }
}

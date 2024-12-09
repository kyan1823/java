package com.kyan.demo03;

public class ArrayToString {
    public static String arrayToString(String[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                sb.append(arr[i]).append(", ");
            }else{
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

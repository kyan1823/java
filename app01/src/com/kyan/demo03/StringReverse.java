package com.kyan.demo03;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input string");
        String s = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb.toString());
    }
}

package com.kyan.demo;

public class demo01 {
    public static void main(String[] args) {
        //a, b, c
        //a*100 + b*10 + c = a^3 + b^3 + c^3
        for (int i = 100; i <= 999; i++) {
            int q = i/100;
            int w = (i/10%10);
            int e = i%10;
            if (q*q*q+e*e*e+w*w*w==i){
                System.out.println(i);
            }

        }
    }
}

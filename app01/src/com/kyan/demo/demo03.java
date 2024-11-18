package com.kyan.demo;

public class demo03 {
    public static void main(String[] args) {
        for (int r = 0; r < 4; r++) {
            for (int b = 0; b < 4; b++) {
                for (int y = 0; y < 7; y++) {
                    if(r+b+y==8){
                        System.out.println("r="+r+",b="+b+",y="+y);
                    }
                }
            }
        }
    }
}

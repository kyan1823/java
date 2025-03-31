package com.kyan.t0331;

import java.util.Scanner;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random r = new Random();
        int target = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("请输入猜测的数字（1~100）：");
            int guess = sc.nextInt();

            if (guess > target) {
                System.out.println("猜大了");
            } else if (guess < target) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了！");
                break;
            }
        }
    }
}

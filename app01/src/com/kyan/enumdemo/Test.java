package com.kyan.enumdemo;

public class Test {
    public static void main(String[] args) {
        move(Direction.RIGHT);
    }

    public static void move(Direction direction) {
        switch (direction) {
            case UP:
                System.out.println("UP");
                break;
            case DOWN:
                System.out.println("DOWN");
                break;
            case LEFT:
                System.out.println("LEFT");
                break;
            case RIGHT:
                System.out.println("RIGHT");
                break;
        }
    }
}

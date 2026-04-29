package com.jhstocker.ocp.chapter3_controlflow;

public class LoopExample {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        int x = 0;

        while (x < 3) {
            System.out.println(x);
            x++;
        }

        int y = 0;

        do {
            System.out.println(y);
            y++;
        } while (y < 3);
    }
}
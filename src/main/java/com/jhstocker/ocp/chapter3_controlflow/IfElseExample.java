package com.jhstocker.ocp.chapter3_controlflow;

public class IfElseExample {

    public static void main(String[] args) {

        int x = 10;

        if (x > 5)
            System.out.println("Greater");
        System.out.println("Always runs"); // 🤯

        if (x > 20)
            System.out.println("A");
        else
            System.out.println("B");
    }
}
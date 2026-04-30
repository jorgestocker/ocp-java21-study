package com.jhstocker.ocp.chapter4_methods;

public class PassByValueExample {

    public static void main(String[] args) {

        int x = 10;
        change(x);
        System.out.println(x); // ?
    }

    public static void change(int x) {
        x = 20;
    }
}
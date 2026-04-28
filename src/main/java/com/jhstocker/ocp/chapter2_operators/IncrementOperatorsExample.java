package com.jhstocker.ocp.chapter2_operators;

public class IncrementOperatorsExample {

    public static void main(String[] args) {

        int x = 5;

        System.out.println(x++); // ?
        System.out.println(x);   // ?

        int y = 5;

        System.out.println(++y); // ?
        System.out.println(y);   // ?

        int z = 5;
        System.out.println(z++ + ++z); //

    }
}
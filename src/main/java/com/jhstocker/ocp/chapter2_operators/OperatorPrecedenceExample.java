package com.jhstocker.ocp.chapter2_operators;

public class OperatorPrecedenceExample {

    public static void main(String[] args) {

        int result = 2 + 3 * 4;
        System.out.println(result); // ?

        int result2 = (2 + 3) * 4;
        System.out.println(result2); // ?

        boolean test = true || false && false;
        System.out.println(test); // ?

    }
}
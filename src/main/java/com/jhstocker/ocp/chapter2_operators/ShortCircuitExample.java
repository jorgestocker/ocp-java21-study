package com.jhstocker.ocp.chapter2_operators;

public class ShortCircuitExample {

    public static void main(String[] args) {

        int x = 0;

        if (true || ++x > 0) {
            System.out.println("Short-circuit");
        }

        System.out.println(x); // ?

        int y = 0;

        if (true | ++y > 0) {
            System.out.println("No short-circuit");
        }

        System.out.println(y); // ?


    }

}

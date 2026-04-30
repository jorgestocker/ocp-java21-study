package com.jhstocker.ocp.chapter4_methods;

public class VarArgsExample {

    public static void main(String[] args) {

        sum(1, 2, 3);
        sum();
    }

    public static void sum(int... numbers) {

        int total = 0;

        for (int n : numbers) {
            total += n;
        }

        System.out.println(total);
    }
}
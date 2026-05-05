package com.jhstocker.ocp.chapter6_interfaces_records_sealed.interfaces;

interface A {
    default void test() {
        System.out.println("A");
    }
}

interface B {
    default void test() {
        System.out.println("B");
    }
}

public class DefaultConflictExample implements A, B {

    public void test() {
        A.super.test();
    }

    public static void main(String[] args) {
        new DefaultConflictExample().test();
    }
}
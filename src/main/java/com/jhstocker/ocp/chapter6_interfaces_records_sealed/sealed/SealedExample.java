package com.jhstocker.ocp.chapter6_interfaces_records_sealed.sealed;

public class SealedExample {

    public static void main(String[] args) {

        Animal a = new Dog();
        System.out.println(a.getClass().getSimpleName());
    }
}
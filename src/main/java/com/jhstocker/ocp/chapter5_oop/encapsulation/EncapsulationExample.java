package com.jhstocker.ocp.chapter5_oop.encapsulation;

public class EncapsulationExample {

    public static void main(String[] args) {

        Person p = new Person();

        p.setName("Jorge");
        p.setAge(30);

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
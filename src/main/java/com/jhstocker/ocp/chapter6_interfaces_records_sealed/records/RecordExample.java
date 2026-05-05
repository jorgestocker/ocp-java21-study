package com.jhstocker.ocp.chapter6_interfaces_records_sealed.records;

public class RecordExample {

    public static void main(String[] args) {

        Person p = new Person("Jorge", 30);

        System.out.println(p.name());
        System.out.println(p.age());
        System.out.println(p);
    }
}
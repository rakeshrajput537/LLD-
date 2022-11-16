package com.lld.constructor;

public class Person {
    int age;
    String name;
    public Person(int age){
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}

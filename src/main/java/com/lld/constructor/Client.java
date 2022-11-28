package com.lld.constructor;


class Per{
    int age;
    String s;
}
public class Client {
    public static void main(String[] args) {
        Student st = new Student(); // default constructor

//        Person p = new Person(); -> default constructor will not work if we have created own constructor
        Person p1 = new Person(20);
        Person p2 = new Person("P2 person");
        Person p3 = new Person(35, "P3 person");
        
    }
}

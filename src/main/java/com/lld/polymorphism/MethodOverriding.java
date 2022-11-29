package com.lld.polymorphism;

class A{
    void printHello(){
        System.out.println("Hello from A");
    }
}

class B extends A{
    void printHello(){
        System.out.println("Hello from B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.printHello();

        A aa = new B();
        aa.printHello();  // Decide at run time.  o/p: Hello from B
    }
}

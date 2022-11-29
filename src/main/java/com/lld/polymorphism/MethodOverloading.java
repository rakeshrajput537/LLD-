package com.lld.polymorphism;

public class MethodOverloading {
    MethodOverloading(){
        System.out.println("No parameterized constructor");
    }
    MethodOverloading(int a){
        System.out.println("int parameter");
    }

    MethodOverloading(String s){
        System.out.println("string parameter");
    }

    MethodOverloading(int a, String s){
        System.out.println("int and string parameter");
    }
    MethodOverloading(String s, int a){
        System.out.println("string and int parameter");
    }
    public static void main(String[] args) {
        MethodOverloading a = new MethodOverloading();
        MethodOverloading b = new MethodOverloading(10);
        MethodOverloading c = new MethodOverloading("Third");
        MethodOverloading d = new MethodOverloading(10, "thord");
        MethodOverloading e =new MethodOverloading("Third", 10);

        // Decide at compile time so know as compile time polymorphism
    }
}

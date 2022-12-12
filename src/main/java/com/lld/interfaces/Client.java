package com.lld.interfaces;

public class Client {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(100);
        stack.push(10);
        stack.push(20);
        System.out.printf("stack top: "+stack.top());
        stack.pop();
        System.out.printf("stack top: "+stack.top());
        stack.pop();
    }
}

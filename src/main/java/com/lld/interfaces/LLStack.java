package com.lld.interfaces;

public class LLStack implements Stack{

    private class Node {
        int data;
        Node nextNode;

        public Node(){
        }
        public Node(int value){
            this.data = value;
            this.nextNode = null;
        }
    }
    Node top;

    public LLStack(){
        this.top = null;
    }
    @Override
    public void push(int value) {
        Node newNode = new Node(value);
        this.top = newNode;
    }

    @Override
    public void pop() {

    }

    @Override
    public boolean isEmpty() {
        return  (this.top == null);
    }

    @Override
    public int top() {
        return this.top.data;
    }
}

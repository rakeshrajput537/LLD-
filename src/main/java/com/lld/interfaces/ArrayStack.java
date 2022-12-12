package com.lld.interfaces;

public class ArrayStack implements Stack{
    private int capacity;
    private int arr[];
    public ArrayStack(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
    }

    private int size = 0;
    @Override
    public void push(int value) {
        if (size < capacity){
            arr[size] = value;
            size++;
        }
    }

    @Override
    public void pop() {
        if (size > 0) size--;
    }

    @Override
    public boolean isEmpty() {
        return (size <= 0);
    }

    @Override
    public int top() {
        if (!isEmpty()) return arr[size - 1];
        else return -1;
    }
}

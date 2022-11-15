package com.lld.aceessmodifiers;

public class Bachha {
    private int id;
    String name; // default
    protected String gender;
    public int age;
    public String batch;

    public void changeBatch(String newBatch){
        this.batch = newBatch;
    }
}

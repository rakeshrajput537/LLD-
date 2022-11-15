package com.lld.introOOP;

public class Client {
    public static void main(String[] args) {
        Student raka = new Student();
        Student saki = new Student();

        raka.name = "Raka";
        saki.name = "Saki";
        raka.changeBatch("Nov 22");
        saki.changeBatch("Dec 22");
    }
}

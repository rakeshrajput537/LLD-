package com.lld.accessmodifiershelper;

import com.lld.aceessmodifiers.Bachha;



public class Client {
    public static void main(String[] args) {
        Bachha b1 = new Bachha();
        // b1.name -> not able to access as it is default and only accessible inside the same package
        // b1.id -> private so only accessible inside the same class
        // b1.gender -> protected not allowed in other packer
        b1.batch = "Jan 2023";
        b1.age = 25;
        b1.changeBatch("Feb 2023");
    }
}

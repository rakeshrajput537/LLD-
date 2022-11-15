package com.lld.aceessmodifiers;

public class Client {
    public static void main(String[] args) {
        Bachha s1 = new Bachha();
        //s1.age not working as age is private
        s1.name = "Raka"; // Accessible because name is default, it can be access inside the  same package
        s1.batch = "March 2023";
        s1.age = 25;
        s1.gender = "Male";
        s1.changeBatch("Apr 2023");
    }
}

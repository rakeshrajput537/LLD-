package com.lld.accessmodifiershelper;

import com.lld.aceessmodifiers.Bachha;

public class BachhaChild extends Bachha {
    void doSomething(){
        gender = "Female"; // Protected  can be accessible only through child class in other class
    }
    void doSomething2(){
        Bachha bb = new Bachha();
        // for bb object only public are going to visible
        // bb.gender this will not work, it will be considered as a third party code // Little tricky
    }
}

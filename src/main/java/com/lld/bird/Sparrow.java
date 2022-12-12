package com.lld.bird;

public class Sparrow implements Flyable, Eatable {
    @Override
    public void makeEat() {
        System.out.printf("I am Eating");
    }

    @Override
    public void maleFly() {
        System.out.printf("I am flying");
    }
}

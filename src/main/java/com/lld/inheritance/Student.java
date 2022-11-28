package com.lld.inheritance;

public class Student extends User {
    private double psp;

    public double getPsp(){
        return psp;
    }

    public void setPsp(double  newPsp){
        this.psp = newPsp;
    }
}

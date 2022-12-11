package com.lld.designpatterns.singleton.usingenum;

public enum DatabaseEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

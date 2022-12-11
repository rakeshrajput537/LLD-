package com.lld.designpatterns.singleton.lazyloading;

public class Database {
    private static Database instance = null;
    private Database(){}
    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
}



// Problem with lazy loading
// Concurrency problem when objects are creating by two thread at a time but work fine withs single thread

// We can create object like => Database db1 = Database.getInstance()
// We can create object like => Database db2 = Database.getInstance()

// both db1 and db2 has the same value in single thread but in multi threading concurrency issue my occur

package com.lld.designpatterns.singleton.doublechecklocking;

public class Database {
    private static Database instance = null;
    private Database(){}
    public static Database getInstance(){
        if (instance == null){
            synchronized(Database.class){
                if (instance == null) instance = new Database();
            }
        }
        return instance;
    }
}


// Concurrency handled but problem is with only in serialization and deserialization
// and this can be solved by enum
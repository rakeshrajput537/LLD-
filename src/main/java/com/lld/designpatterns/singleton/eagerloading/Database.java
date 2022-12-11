package com.lld.designpatterns.singleton.eagerloading;

public class Database {
    private static Database instance = new Database(); // this will load during the application startup
    private Database(){}
    public static Database getInstance(){
        return instance;
    }
};



// Problem with EagerLoading
// Slow application startup time but does not matter
// some time impossible to create instance when we need fev values from functions

// We can create object like => Database db1 = Database.getInstance()
// We can create object like => Database db2 = Database.getInstance()

// both db1 and db2 has the same value;
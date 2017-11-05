package com.example.dylan.taxtimewithfriends.Objects;

/**
 * Created by z5056635 on 11/10/2017.
 */

public class Driver {

    private int rowID;
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public Driver(int rowID, String name) {
        this.rowID = rowID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getRowID() {
        return rowID;
    }

    public void setRowID(int rowID) {
        this.rowID = rowID;
    }
}

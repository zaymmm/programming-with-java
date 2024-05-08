package com.mm.bee.tech;

public class Constructors {

    public static final String TAG = "Constructors";

    public String serialNo;

    private String name;

    private String address;

    // default constructor
    public Constructors(){

    }

    // custom constructor
    public Constructors(String name){
        this.name = name;
    }

    public Constructors(String name, String address){
        this.name = name;
        this.address = address;
    }


    // getter and setter methods
    public String getName(){
        return this.name;
    }

    // public void setName(String name){
    //     this.name = name;
    // }

    public String getAddress(){
        return this.address;
    }

    // public void setAddress(String address){
    //     this.address = address;
    // }
}

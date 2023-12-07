package com.bee.tech.java8.defaultinterface;

public interface InterfaceI {
    void show();

    default void message(){
        System.out.println(">>> InterfaceI.message() >>>");
    }

    // static method
    static void alert(){
        System.out.println(">>> InterfaceI.alert() >>>");
    }
}

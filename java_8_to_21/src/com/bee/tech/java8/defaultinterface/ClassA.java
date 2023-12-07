package com.bee.tech.java8.defaultinterface;

public class ClassA implements InterfaceI, InterfaceJ{

    @Override
    public void show() {
        // common method signature
        System.out.println(">>> ClassA.show() >>>");
    }
}
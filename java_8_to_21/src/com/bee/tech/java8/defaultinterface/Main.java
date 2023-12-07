package com.bee.tech.java8.defaultinterface;

public class Main {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.show();

        ClassB classB = new ClassB();
        classB.show();
        // output will be ClassB.message() because Class has more power compared to Interface
        classB.message();

        InterfaceI.alert();
    }
}

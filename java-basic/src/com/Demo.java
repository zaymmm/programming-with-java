package com;

import com.mm.bee.tech.Constructors;

public class Demo {

    public static void main(String[] args) {
        Constructors obj1;
        Constructors obj2;
        
        System.out.println(">>>>" + Constructors.TAG);

        obj1  = new Constructors("Chan Chan");
        System.out.println(obj1.getName());

        obj2 = new Constructors("Zay", "Yangon");
        System.out.println(String.format("======\nName:%s\nAddress:%s\nSerialNo:%d\n=====", obj1.getName(), obj2.getName(), 001));
    }
    
}
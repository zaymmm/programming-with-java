package com.bee.tech.java8.foreach;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // External loops
        for(Integer num : numbers){
            System.out.println("External loops: " + num);
        }

        // Internal loops
        numbers.forEach(num -> System.out.println("Internal loops: " + num)); // lambda expression
        // should be used while working with huge amounts of data
    }
}

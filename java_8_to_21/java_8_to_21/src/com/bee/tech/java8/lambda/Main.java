package com.bee.tech.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        values.forEach(i -> System.out.println("Lambda: " + i)); // Lambda

        // Consumer
        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Consumer1: " + integer);
            }
        };
        values.forEach(c);

        Consumer<Integer> consumer = (Integer integer) -> System.out.println("Consumer2: " + integer);
        values.forEach(consumer);
    }
}

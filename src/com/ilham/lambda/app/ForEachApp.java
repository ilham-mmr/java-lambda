package com.ilham.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("ilham", "udin","maman");

        // for loop
        for(var value : list ){
            System.out.println(value);
        }

        // foreach anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // using lambda
        list.forEach(value-> System.out.println(value));

        // lambda method reference

        list.forEach(System.out::println);
    }
}

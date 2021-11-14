package com.ilham.lambda.app;

import java.util.Locale;
import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        // it will throw java.lang.NullPointerException
        sayHello(null);
    }

    public static void sayHello(String name) {
//        String nameUpper = name.toUpperCase(Locale.ROOT);
//        System.out.println("hi " + nameUpper);
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalUpper = optionalName.map(value -> value.toUpperCase(Locale.ROOT));
        optionalUpper.ifPresent(value -> System.out.println("hello " + value));
    }
}

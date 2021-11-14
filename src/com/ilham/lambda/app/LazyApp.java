package com.ilham.lambda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        test(60, () -> getName());
    }

    public static void test(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("congrats  you got" + name.get());
        } else {
            System.out.println("try again");
        }

    }

    public static String getName() {
        System.out.println("the method is called");
        return "hi";
    }
}

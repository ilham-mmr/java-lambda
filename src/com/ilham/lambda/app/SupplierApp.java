package com.ilham.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";

        System.out.println(supplier.get());
    }
}

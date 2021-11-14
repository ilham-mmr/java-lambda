package com.ilham.lambda;

import com.ilham.lambda.util.StringUtil;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {

    public static void main(String[] args) {
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("hi"));
        new MethodReferenceApp().run();

        new MethodReferenceApp().run2();

//        parameter method reference
//        Function<String, String> functionUpper = (String value) -> value.toUpperCase();

        Function<String, String> functionUpper = String::toUpperCase;

    }


    public void run() {
        // non static method reference
        // anonymous
//        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return MethodReferenceApp.this.isLowerCase(s);
//            }
//        };
        // lambda
//        Predicate<String> predicateIsLowerCase = s -> MethodReferenceApp.this.isLowerCase(s);

        // method reference
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("hidudeSSee"));

    }


    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("appyey"));

    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }

        return true;
    }
}

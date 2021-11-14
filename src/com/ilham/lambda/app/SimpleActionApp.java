package com.ilham.lambda.app;

import com.ilham.lambda.SimpleAction;

public class SimpleActionApp {

    public static void main(String[] args) {
        // anonymous class
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Hello " + name;
            }
        };
        // using lambda
//        SimpleAction simpleAction2 = (name) -> {
//          return "Hello " + name;
//        };
        // very simple syntax
        SimpleAction simpleAction2 = name -> "hello" + name;

        System.out.println(simpleAction.action("udin"));
        System.out.println(simpleAction2.action("mamang"));
    }
}

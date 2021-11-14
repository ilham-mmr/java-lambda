## what is lambda?

lambda is just a simplified version of anonymous class

## lambda requirements

- an interface
- have one abstract method
- add @FunctionalInterface on interface
- min java 8

## Java util function

- interface Consumer<T>
  - void accept(T t);
- interface Function<T,R>
  - R apply(T t);
- interface Predicate<T>
  - boolean test(T t);
- interface Supplier<T>
  - T get();
- and many more

## Method Reference

- static method reference
- non-static method reference
- object method reference
- parameter method reference
  - if we call a method in parameter, the method should not have a parameter

## lambda in collection

- iterable.forEach
- Collection.removeIf
- Map.foreach

## lazy parameter

- it will be executed when accessed

## Optional class

- used as a wrapper for a value that can be null
- designed to easily work with an object that can be null

### Reference

- https://www.youtube.com/watch?v=AtF2EHZ1fXo

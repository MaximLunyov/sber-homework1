package org.example;

public class Child extends Parent {
    static void printStatic1() {
        System.out.println("Child:static 1");
    }

    static void printStatic2() {
        System.out.println("Child:static 2");
    }

    @Override
    public void printNonStatic1() {
        System.out.println("Child:instance 1");
    }

    @Override
    public void printNonStatic2() {
        System.out.println("Child:instance 2");
    }

    public Child() {
        System.out.println("Child:constructor");
    }

    public Child(String name) {
        super(name);
        System.out.println("Child:name-constructor");
    }
}

package org.example;

public abstract class Parent {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent(String name) {
        this.name = name;
        System.out.println("Parent:name-constructor");
    }

    public Parent() {
        System.out.println("Parent:constructor");
    }

    public void printNonStatic1() {
        System.out.println("Parent:instance 1");
    }

    public void printNonStatic2() {
        System.out.println("Parent:instance 2");
    }

    static void printStatic1() {
        System.out.println("Parent:static 1");
    }

    static void printStatic2() {
        System.out.println("Parent:static 2");
    }
}

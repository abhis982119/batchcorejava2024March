package com.batch2024.corejava.oops.polymorphism.compiletimepolymorphism.basic;

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m1(10);
        a.m1(10,20);
        a.m1('c');
    }
}

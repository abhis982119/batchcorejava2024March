package com.batch2024.corejava.elements.constructor.chaining.basic;

public class Runner {

    public static void main(String[] args) {
        A ab = new B();  // A-defaultConstructor
                         //B-defaultConstructor

        B b = new B();  // A-defaultConstructor
                       //B-defaultConstructor

        A a = new A();  // A-defaultConstructor
    }
}

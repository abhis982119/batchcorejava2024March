package com.batch2024.corejava.elements.constructor.chaining.sameclassconstructor;

public class A {

    public A() {
        this(10);
      //  this(10,20); // call to this must be first statement in constructor
        System.out.println("A-defaultConstructor");
       // this(10); // call to this must be first statement in constructor
    }


    public A(int b) {
        this(10,20);
        System.out.println("A(int)- Constructor");

    }


    public A(int b, int c) {
        System.out.println("A(int, int)- Constructor");
    }

}

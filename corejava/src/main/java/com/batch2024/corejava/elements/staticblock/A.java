package com.batch2024.corejava.elements.staticblock;

public class A {

    static{ //staic  block
        System.out.println("A-staticblock");
    }


    { //instance block
        System.out.println("A-instanceblock");
    }

    int age ;

    public A(int age) {   // constructor
        this.age = age;
        System.out.println("A-constructor");
    }

    public void m1(){ //instance-method
        System.out.println("A-m1()");
    }
}

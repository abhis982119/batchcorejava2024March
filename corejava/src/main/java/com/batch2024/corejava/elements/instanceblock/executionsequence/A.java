package com.batch2024.corejava.elements.instanceblock.executionsequence;

public class A {

    { //instance block
        System.out.println("A-instanceblock");
    }

     int age ;

    public A(int age) {
        this.age = age;
        System.out.println("A-constructor");
    }

    public void m1(){
        System.out.println("A-m1()");
    }
}

package com.batch2024.corejava.oops.polymorphism.runtimepolymorphism.basic;

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        a.m1();  // A-m1()


        A b = new B();
        b.m1();    // B-m1()


  /*      B ba = new A();
        ba.m1();   // Error*/


        B b2 = new B();
        b2.m1();  // B-m1()

    }
}

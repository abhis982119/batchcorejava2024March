package com.batch2024.corejava.oops.polymorphism.runtimepolymorphism.interview.referencevariablevisiblemethods;

public class Runner {

    public static void main(String[] args) {


        A a = new B();
        a.m1();    // B-m1()
       // a.m2();  // cannot find symbol


 /*       B b = new A();
        b.m2();
*/
    }
}

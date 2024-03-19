package com.batch2024.corejava.elements.methods.instancemethods.basics;

public class Runner {

    public static  void main(String[] args) {

        A a = new A();
        a.m1();   // instance-method call using reference-variable

        //a.m2();
        A.m2();  // static-method call using class-name
    }
}

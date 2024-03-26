package com.batch2024.corejava.elements.constructor.initializinginstancevariable;

import lombok.ToString;

@ToString
public class A {

    private int age ;

    public A(int age) {
         this.age = age;
    }

    public  void m1(){
        System.out.println("A-m1()");
    }

}

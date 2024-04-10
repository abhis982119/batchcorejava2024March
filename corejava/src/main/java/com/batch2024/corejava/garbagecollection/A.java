package com.batch2024.corejava.garbagecollection;

import com.batch2024.corejava.oops.polymorphism.compiletimepolymorphism.interview.MyMath;

public class A extends Object{

    public void m1(){
        System.out.println("A-m1()");
    }

    @Override
    public void finalize(){
        System.out.println("A object deleted");
    //    int a = 1 / 0;  // No exception will be printed in finalize method
        System.out.println("End method line");
    }
}

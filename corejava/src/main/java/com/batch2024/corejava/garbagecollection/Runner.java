package com.batch2024.corejava.garbagecollection;

public class Runner{

    public static void main(String[] args)  throws InterruptedException{
        A a = new A();
        a.m1();

        a = null;

        System.gc();  // request Garbage collector to start garbage collection

        Thread.sleep(3000);

    }
}

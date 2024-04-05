package com.batch2024.corejava.oops.polymorphism.compiletimepolymorphism.interview;

public class MyMath {

    public int  add(int a, int b){
        System.out.println("int-add()");
        return a+b;
    }


      public int add(byte a, byte b){
        System.out.println("byte-add()");
        return a+b;
    }

    public int add(short a, short b){
        System.out.println("short-add()");
        return a+b;
    }


    public long add(long a, long b){
        System.out.println("long-add()");
        return a+b;
    }



//Multiplication

    public short multiply(short a, short b ){
        System.out.println("short-multiply()");
        return (short) (a * b);
    }



 /*   public float add(float a, float b){
        System.out.println("float-add()");
        return a+b;
    }*/

    public double add(double a, double b){
        System.out.println("double-add()");
        return a+b;
    }




    public int add(byte a, short b, int c){
        System.out.println("MyMath-add(byte,short, int");
        return a+b;
    }


    public int add(int a, short b, byte c ){
        System.out.println("MyMath-add(int, short, byte");
        return a+b;
    }



    public double add(int a, float b, double d){
        System.out.println("MyMath-add(int a, float b, double d)");
        return a+b+d;
    }

    public double add(double d, float a, int b){
        System.out.println("MyMath-add(double d, float a, int b)");
        return a+b+d;
    }


}

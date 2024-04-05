package com.batch2024.corejava.oops.polymorphism.compiletimepolymorphism.interview;

public class Runner {

    public static void main(String[] args) {
        MyMath math = new MyMath();
        math.add(10,20) ; //int-add() as, Default handler for math integers are int in java
        math.add((byte)10,(byte)20) ;
        math.add((short)10,(short)20) ;
        math.add(10l, 10l);


        math.multiply( (short)10000,(short)20000);


     //   math.add(21400000000, 21400000000); //  integer number too large






        math.add(10.0, 20.0); //double-add(), as for math decimal numbers default java primitive datatype is double
        math.add(10.0f, 20.0f); // float will be called





     //   math.add(10, 20, 30); //no suitable method found for add(int,int,int)


       //math.add(10, 20,30 );      // reference to add is ambiguous
       //   math.add(10.0f, 20, 30.0); //   no suitable method found for add(float,int,double)
          math.add(10, 10.0f, 10.0); //  int,float, double
          math.add(10.0, 10.0f, 10); // double, float, int
        //  math.add(10.0, 10.0, 10.0); //   no suitable method found for add(float,int,double)


    }
}

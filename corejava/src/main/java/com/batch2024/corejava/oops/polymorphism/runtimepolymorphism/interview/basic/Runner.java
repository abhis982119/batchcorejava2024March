package com.batch2024.corejava.oops.polymorphism.runtimepolymorphism.interview.basic;

public class Runner {

    public static void main(String[] args) {

        A ab = new B();
        ab.m1();
     //   ab.m2(); // cannot find symbol
    //    ab.m3();  // cannot find symbol

        A ac = new C();
         ac.m1();
   //       ac.m2(); // cannot find symbol
   //      ac.m3(); // cannot find symbol

        B  b = new C();
        b.m1();


        A a = new A();
        a.m1();

    }
}

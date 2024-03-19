package com.batch2024.corejava.elements.methods.instancemethods.nestedmethodnotallowed;

public class A {


   public void m1(){   // instance-method
       System.out.println("A-m1();");
   }

   public void m2(){

   /*    public void m3() {            // Nested-methods are not allowed in java
           System.out.println("A-m3()");
       }*/
       System.out.println("A-m2()");
   }
}

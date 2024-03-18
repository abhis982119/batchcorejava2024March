package com.batch2024.corejava.elements.variables.localvariable.model;

public class A {




    public void m1(){  //method   // memeory-allocate
        int a = 10;  //local-variable  // 4 byte

        System.out.println("value of a :" + a);

    }  // memerory de-allocated


    public void m2(){
      //  System.out.println("value of a :" + a);   //java: cannot find symbol
    }
}

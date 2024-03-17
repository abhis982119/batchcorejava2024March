package com.batch2024.corejava.elements.variables.localvariable;

public class VariableAccessRunner {

    public static void main(String[] args) {

        int a = 10;
        System.out.println("value of a : "  + a);             // 10

        if(true){
               int b = 20;
               System.out.println("value of b : "  + b);      //20
        }

         System.out.println("value of a : "  + a);  //10
  //       System.out.println("value of b : "  + b);  java: cannot find symbol
        //  symbol:   variable b
    }
}

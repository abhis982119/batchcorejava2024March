package com.batch2024.corejava.elements.variables.localvariable;

public class OnlyFinalModifierAllowedWithLocalVariable {



    public static void main(String[] args) {
       // public int a = 10;  //java: illegal start of expression
  //      static public int a = 10;  //java: illegal start of expression
        final int a = 10;
        System.out.println("value of a : " + a);
    }
}

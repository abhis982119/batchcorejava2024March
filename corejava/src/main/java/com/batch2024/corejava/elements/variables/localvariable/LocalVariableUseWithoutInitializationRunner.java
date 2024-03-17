package com.batch2024.corejava.elements.variables.localvariable;

public class LocalVariableUseWithoutInitializationRunner {
/*
We must initialize local-variable before using else there will be compile time error
 */
    public static void main(String[] args) {
        int a ;  //decalaration
       // System.out.println(a); // java: variable a might not have been initialized

    }
}

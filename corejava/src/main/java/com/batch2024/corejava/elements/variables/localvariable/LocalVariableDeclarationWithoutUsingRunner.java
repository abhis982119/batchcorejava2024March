package com.batch2024.corejava.elements.variables.localvariable;

public class LocalVariableDeclarationWithoutUsingRunner {
/*
If local variable is declared by not used, then there will be no compile-time error
 */
    public static void main(String[] args) {
        int a ; //declaration

        int b = 20;
        System.out.println("value of b =  " + b);
    }
}

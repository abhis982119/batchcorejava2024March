package com.batch2024.corejava.elements.variables.staticvariable;

public class StaticVariableRunner {

    public static void main(String[] args) {
        A a = new A();
        a.m1();



        //With reference-variable
        System.out.println("Static variable access with reference-variable : " + a.a);

        //With Class-Name
        System.out.println("Static variable access with class-name : " + A.a);
    }
}

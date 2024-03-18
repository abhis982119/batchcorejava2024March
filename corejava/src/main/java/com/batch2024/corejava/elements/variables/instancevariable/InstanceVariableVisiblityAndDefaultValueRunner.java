package com.batch2024.corejava.elements.variables.instancevariable;

public class InstanceVariableVisiblityAndDefaultValueRunner {

    public static void main(String[] args) {
        A a = new A();
        a.m1();


        System.out.println("Direct access using object-reference : " + a.a);
        System.out.println("Direct access using object-reference : " + a.b);

    }
}

/*




 */
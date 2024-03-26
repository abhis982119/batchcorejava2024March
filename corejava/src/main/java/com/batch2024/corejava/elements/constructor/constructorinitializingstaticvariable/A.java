package com.batch2024.corejava.elements.constructor.constructorinitializingstaticvariable;

import lombok.ToString;

public class A {

    static  int age;


    public A(int age) {
       A.age = age; // NOT RECOMMENTDED,
                    // contructor are used to initialize instance-variable
    }


    @Override
    public String toString() {
        return "A{"
                +"age : " + age +
                "}";
    }
}

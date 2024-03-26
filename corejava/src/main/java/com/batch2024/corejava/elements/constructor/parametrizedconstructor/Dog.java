package com.batch2024.corejava.elements.constructor.parametrizedconstructor;

import lombok.ToString;

@ToString
public class Dog {


    private String breed;

    private String color;

    private String name;


    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }


}

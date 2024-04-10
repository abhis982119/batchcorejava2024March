package com.batch2024.corejava.finalkeyword.withvariable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Dog {

    private final  String breed;

    private final String color;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

}

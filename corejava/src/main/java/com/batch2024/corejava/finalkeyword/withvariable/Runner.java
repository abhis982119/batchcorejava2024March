package com.batch2024.corejava.finalkeyword.withvariable;

public class Runner {

    public static void main(String[] args) {
        Dog husky = new Dog("Husky", "Grey");

        System.out.println(husky);


        husky.setName("leo");
        System.out.println(husky);
    }
}

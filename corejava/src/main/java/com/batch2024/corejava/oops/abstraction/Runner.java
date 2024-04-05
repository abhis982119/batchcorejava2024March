package com.batch2024.corejava.oops.abstraction;

import java.util.Arrays;

/*
Abstraction : Implementation hiding
 */
public class Runner {

    public static void main(String[] args) {
        EmailService.sendEmail("Abstraction", Arrays.asList("yogesh@gmail.com"), "body", "random@gmail.com");
    }
}

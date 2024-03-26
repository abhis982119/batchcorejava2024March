package com.batch2024.corejava.elements.instanceblock.initializeinstancevarible;

import jdk.jfr.Timespan;
import lombok.ToString;

/*
To initialize instance-variable
 */
@ToString
public class Husky {

    //instance-block
    {
        breed = "Husky"; // initialize the instance-variable hardcoded
    }


    private String breed ;

    private String color;

    private String name;

    public Husky(String color) {
        this.color = color;
    }
}


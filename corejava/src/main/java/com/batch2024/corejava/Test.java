package com.batch2024.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("abc.txt");
            Thread.sleep(2000);
        }
        catch(FileNotFoundException | InterruptedException a)
        { System.out.println("exception info="+a);
        }
    }
}

package com.batch2024.corejava.elements.methods.staticmethods;

/*
 Instance-Context-Area ---canAccess--> static-context-area

 Static-Context-Area ----connnotAccess--> instance-context-area
 */
public class Employee {


    private static String companyName = "TCS";
    private String name = "Noor";  //instance-variable // default-value : null



    public void printEmployeeName(){
         System.out.println("company name : " + companyName);
         System.out.println("Employee name : " + name);
    }


    public static void printCompanyName(){
        System.out.println(companyName);
    }
}

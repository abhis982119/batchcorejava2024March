package com.batch2024.corejava.oops.abstraction;

import java.util.List;

public class EmailService {


    public static void sendEmail(String subject, List<String> recipientList, String body, String sender){
        System.out.println("Mail send successfully to recipients : " + recipientList);
    }
}

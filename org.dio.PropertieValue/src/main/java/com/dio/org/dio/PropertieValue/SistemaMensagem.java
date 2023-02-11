package com.dio.org.dio.PropertieValue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    //
    @Value("${name:DefaultName}")
    private String name;
    @Value("${email}")
    private String email;
    @Value("${telephones}")
    private List<Long> telephones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Message send by: "+ name
        + "\nEmail: "+ email
        + "\nPhone for contact: "+ telephones);
        System.out.println("your registration has been approved");
    }
}

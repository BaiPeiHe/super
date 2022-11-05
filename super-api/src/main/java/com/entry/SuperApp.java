package com.entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SuperApp {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(SuperApp.class, args);
    }
}

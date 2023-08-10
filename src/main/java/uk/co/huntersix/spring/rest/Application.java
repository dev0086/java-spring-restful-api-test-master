package uk.co.huntersix.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "uk.co.huntersix.spring.rest.model, uk.co.huntersix.spring.rest.controller, uk.co.huntersix.spring.rest.referencedata")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
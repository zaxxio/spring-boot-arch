package org.wsd;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "org.wsd")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
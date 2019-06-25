package me.mingshan.spring.boot.starter.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author mingshan
 */
@SpringBootApplication
@ComponentScan(basePackages = {"me.mingshan.spring.boot"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

package me.mingshan.spring.boot.starter.test;

import me.mingshan.spring.boot.autoconfigure.StarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author mingshan
 */
@Component
public class Runner implements ApplicationRunner {
    @Autowired
    private StarterService starterService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String[] splitArray = starterService.split(",");
        for (String str : splitArray) {
            System.out.println(str);
        }
    }
}

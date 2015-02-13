package com.taurenk.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by tauren on 2/13/15.
 */

/*
ComponentScan tells Spring to search package for children classes marked with @Component
This picks up the GreetingController because @RestController is a kind of @Copoonent.
*/
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

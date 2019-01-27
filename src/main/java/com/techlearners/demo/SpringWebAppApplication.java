package com.techlearners.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringWebAppApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringWebAppApplication.class, args);

        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

    }

}


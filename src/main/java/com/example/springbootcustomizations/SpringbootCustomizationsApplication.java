package com.example.springbootcustomizations;

import com.example.springbootcustomizations.api.LoggerApi;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootCustomizationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCustomizationsApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(LoggerApi logapi) {
        System.out.println("Command Line Runner");
        return args -> { logapi.generateLog("myCommandLog"); };
    }

    @Bean
    public ApplicationRunner applicationRunner(LoggerApi logapi) {
        System.out.println("Application Runner");
        return args -> { logapi.generateLog("myApplicationLog"); };
    }
}

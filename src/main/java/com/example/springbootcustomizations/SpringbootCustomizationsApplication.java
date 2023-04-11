package com.example.springbootcustomizations;

import com.example.springbootcustomizations.service.HelloWorldService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootCustomizationsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(SpringbootCustomizationsApplication.class, args);
        HelloWorldService service = context.getBean(HelloWorldService.class);
        System.out.println(service.getMessage());
    }
}

package com.example.springbootcustomizations.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(4)
public class ApplicationRunnerImpl2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunnerImpl2 ## arguments: ");
        Arrays.stream(args.getSourceArgs()).forEach(System.out::println);
    }
}

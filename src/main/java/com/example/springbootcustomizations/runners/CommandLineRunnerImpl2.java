package com.example.springbootcustomizations.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(2)
public class CommandLineRunnerImpl2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunnerImpl2 ## arguments: ");
        Arrays.stream(args).forEach(System.out::println);
    }
}

package com.example.springbootcustomizations.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(1)
public class CommandLineRunnerImpl1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner ## arguments: ");
        Arrays.stream(args).forEach(System.out::println);
    }
}

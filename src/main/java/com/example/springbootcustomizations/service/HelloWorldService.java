package com.example.springbootcustomizations.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String getMessage(){
        return "Hello World!";
    }
}

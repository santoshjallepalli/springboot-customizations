package com.example.springbootcustomizations.api;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class XMLLoggerApiImpl implements LoggerApi{
    @Override
    public void generateLog(String name) {
        System.out.println("Generating XML log file ..."+name+".xml");
    }
}

package com.example.springbootcustomizations.api;

public class JSONLoggerApiImpl implements LoggerApi {
    @Override
    public void generateLog(String name) {
        System.out.println("Generating JSON log file ..."+name+".json");
    }
}

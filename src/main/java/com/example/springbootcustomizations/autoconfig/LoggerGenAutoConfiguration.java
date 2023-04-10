package com.example.springbootcustomizations.autoconfig;

import com.example.springbootcustomizations.api.JSONLoggerApiImpl;
import com.example.springbootcustomizations.api.LoggerApi;
import com.example.springbootcustomizations.api.XMLLoggerApiImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(LoggerApi.class)
public class LoggerGenAutoConfiguration {

    @Bean
    @ConditionalOnBean
    public XMLLoggerApiImpl xmlLog() {
        return new XMLLoggerApiImpl();
    }

    @Bean
    @ConditionalOnMissingBean
    public JSONLoggerApiImpl jsonLog() {
        return new JSONLoggerApiImpl();
    }



}

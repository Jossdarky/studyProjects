package com.jossdarky.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jossdarky.dependencyinjection.model.service.CalculatorBadOperationService;
import com.jossdarky.dependencyinjection.model.service.ICalculatorService;

@Configuration
public class AppConfig {

    @Bean("badOperationService")
    public CalculatorBadOperationService calculatorBadOperationService(){
        return new CalculatorBadOperationService();
    }
    
}

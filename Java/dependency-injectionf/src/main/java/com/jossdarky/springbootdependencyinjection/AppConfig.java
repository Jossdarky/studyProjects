package com.jossdarky.springbootdependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jossdarky.springbootdependencyinjection.model.service.CalculatorBadOperationService;
import com.jossdarky.springbootdependencyinjection.model.service.ICalculatorService;

@Configuration
public class AppConfig {

    @Bean("badOperationService")
    public ICalculatorService calculatorBadOperationService(){
        return new CalculatorBadOperationService();
    }
    
}

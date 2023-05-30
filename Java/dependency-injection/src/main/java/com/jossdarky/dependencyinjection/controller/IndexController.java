package com.jossdarky.dependencyinjection.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jossdarky.dependencyinjection.model.service.CalculatorBadOperationService;
import com.jossdarky.dependencyinjection.model.service.ICalculatorService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Controller
public class IndexController {

    // **1**
    // Injection by attribute, in class CalculatorManualService has @Service anotation for register an instance of it
    // anotation
    @Autowired
    @Qualifier("manualService")
    ICalculatorService calculatorManualService;
    // **END 1**


    // **2**
    // Injection by constructor, in class CalculatorBigNumbersService has @Service anotation for register an instance of it
    // anotation
    ICalculatorService calculatorBigNumbersService;

    @Autowired
    public IndexController(@Qualifier("bigNumberService") ICalculatorService calculatorBigNumbersService) {
        this.calculatorBigNumbersService = calculatorBigNumbersService;
    }
    // **END 2**

    // **3**
    // Injection by setter, in class CalculatorMathService has @Service anotation for register an instance of it
    
    ICalculatorService calculatorMathService;

    @Autowired
    @Qualifier("mathService")
    public void setCalculatorMathService(ICalculatorService calculatorMathService) {
        this.calculatorMathService = calculatorMathService;
    }
    // **END 3**

    // **EXTRA 1**
    // In class AppConfig has created and registered the component
    @Autowired
    @Qualifier("badOperationService")
    CalculatorBadOperationService calculatorBadOperationService;
    // **END EXTRA 1**

    // **EXTRA 2**
    // lifecycle components
    List<Double> numbers;
    char operator;

    @PostConstruct
    public void init(){
        numbers = Arrays.asList(0.0, 10.0, 5.0, 9.0, 10.0, 2.0, 3.0, 5.0, 7.0, 9.0);
        operator = '+';
    }

    @PreDestroy
    public void destroy(){
        numbers = null;
        operator = ' ';
    }
    // **END EXTRA 2**

    

    @GetMapping({ "/index", "/", "" })
    public String index(Model model) {
        Double result = 0.0;
        switch (operator) {
            case '+':
                result = calculatorManualService.addition(numbers);
                break;
            case '-':
                result = calculatorManualService.subtraction(numbers);
                break;
            case '*':
                result = calculatorManualService.multiplication(numbers);
                break;
            case '/':
                result = calculatorManualService.division(numbers);
                break;
            default:
                break;
        }
        model.addAttribute("result", result);
        return "ind";
    }

}

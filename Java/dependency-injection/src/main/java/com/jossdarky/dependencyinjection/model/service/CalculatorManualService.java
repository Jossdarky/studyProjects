package com.jossdarky.dependencyinjection.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service("manualService")
public class CalculatorManualService implements ICalculatorService{

    @Override
    public double addition(List<Double> numbers) {
        return 2.0;
    }

    @Override
    public double subtraction(List<Double> numbers) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subtraction'");
    }

    @Override
    public double multiplication(List<Double> numbers) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiplication'");
    }

    @Override
    public double division(List<Double> numbers) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'division'");
    }

}

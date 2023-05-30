package com.jossdarky.dependencyinjection.model.service;

import java.util.List;

public class CalculatorBadOperationService implements ICalculatorService{

    @Override
    public double addition(List<Double> numbers) {
        return 4.0;
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

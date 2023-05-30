package com.jossdarky.dependencyinjection.model.service;

import java.util.List;

public interface ICalculatorService {
    public double addition(List<Double> numbers);

    public double subtraction(List<Double> numbers);

    public double multiplication(List<Double> numbers);

    public double division(List<Double> numbers);
}

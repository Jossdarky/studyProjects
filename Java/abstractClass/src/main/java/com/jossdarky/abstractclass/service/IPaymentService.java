package com.jossdarky.abstractclass.service;

import com.jossdarky.abstractclass.processor.IPaymentProcessor;

public interface IPaymentService {

    public void processPayment(String processPayment);

    public void setPaymentProcessor(IPaymentProcessor paymentProcessor);

}

package com.jossdarky.abstractclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.jossdarky.abstractclass.client.PaymentRequest;
import com.jossdarky.abstractclass.processor.IPaymentProcessor;
import com.jossdarky.abstractclass.processor.PayPolPaymentProcessor;

@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private IPaymentProcessor paymentProcessor;

    @Override
    public void processPayment(String processPayment) {
        if("PayUx".equals(processPayment)){
            paymentProcessor = ApplicationContext.getBean("PayPolPaymentProcessor", IPaymentProcessor.class);
        }
        if("PayPol".equals(processPayment)){
        }
    }

    @Override
    public void setPaymentProcessor(IPaymentProcessor paymentProcessor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPaymentProcessor'");
    }

}

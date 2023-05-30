package com.jossdarky.abstractclass.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jossdarky.abstractclass.client.IPaymentClient;
import com.jossdarky.abstractclass.client.PaymentRequest;

@Component
@Qualifier("PayUxPaymentProcessor")
public class PayUxPaymentProcessor extends AbstractPaymentProcessor {
    
    @Autowired
    public PayUxPaymentProcessor(IPaymentClient client) {
        this.client = client;
    }

    @Override
    public void processPayment(PaymentRequest request) {
        // Lógica específica de Stripe
    }
}
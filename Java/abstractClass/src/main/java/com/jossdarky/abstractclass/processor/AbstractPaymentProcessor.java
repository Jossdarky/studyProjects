package com.jossdarky.abstractclass.processor;

import com.jossdarky.abstractclass.client.IPaymentClient;
import com.jossdarky.abstractclass.client.PaymentResponse;

/**
 * SOLID - Dependency Inversion Principle
 * PaymentProcessor high level module
 * PaymentClient(PayPol, PayUx) low level modules
 */
public abstract class AbstractPaymentProcessor implements IPaymentProcessor{
    protected IPaymentClient client;

    public void initialize() {
        // Lógica de inicialización común
        client.initialize();
    }

    public void validateResponse(PaymentResponse response) {
        // Lógica de validación común
        client.validateResponse(response);
    }
}

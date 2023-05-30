package com.jossdarky.abstractclass.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PayUxClient")
public class PayUxClient implements IPaymentClient {
    @Override
    public void initialize() {
        // Lógica de inicialización de PayUx
    }

    @Override
    public void validateResponse(PaymentResponse response) {
        // Lógica de validación de respuesta de PayUx
    }
}
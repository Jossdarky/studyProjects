package com.jossdarky.abstractclass.processor;

import com.jossdarky.abstractclass.client.PaymentRequest;

public interface IPaymentProcessor {
    void processPayment(PaymentRequest request);
}

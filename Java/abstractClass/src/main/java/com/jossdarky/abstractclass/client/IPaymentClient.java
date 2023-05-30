package com.jossdarky.abstractclass.client;

public interface IPaymentClient {
    void initialize();
    void validateResponse(PaymentResponse response);
}

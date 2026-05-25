package com.paystream.payment_service.exception;

public class PaymentNotFoundException extends RuntimeException{

    public PaymentNotFoundException(Long id) {
        super("Payment Not Found with id: " + id);
    }
}

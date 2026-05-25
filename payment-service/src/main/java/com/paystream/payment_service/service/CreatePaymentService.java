package com.paystream.payment_service.service;

import com.paystream.payment_service.dto.PaymentRequest;
import com.paystream.payment_service.dto.PaymentResponse;

public interface CreatePaymentService {

    PaymentResponse createPayment(PaymentRequest paymentRequest);

    PaymentResponse getPayment(Long paymentId);
}

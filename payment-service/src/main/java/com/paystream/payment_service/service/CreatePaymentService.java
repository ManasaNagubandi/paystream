package com.paystream.payment_service.service;

import com.paystream.payment_service.dto.PaymentRequest;
import com.paystream.payment_service.dto.PaymentResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CreatePaymentService {

    PaymentResponse createPayment(PaymentRequest paymentRequest);

    PaymentResponse getPayment(Long paymentId);

    Page<PaymentResponse> getAllPayments(Pageable pageable);
}

package com.paystream.payment_service.controller;

import com.paystream.payment_service.dto.PaymentRequest;
import com.paystream.payment_service.dto.PaymentResponse;
import com.paystream.payment_service.service.CreatePaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final CreatePaymentService createPaymentService;

    @PostMapping("/create")
    public PaymentResponse createPayment(@Valid @RequestBody PaymentRequest paymentRequest) {
        return createPaymentService.createPayment(paymentRequest);
    }
}

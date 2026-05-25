package com.paystream.payment_service.controller;

import com.paystream.payment_service.dto.PaymentRequest;
import com.paystream.payment_service.dto.PaymentResponse;
import com.paystream.payment_service.service.CreatePaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final CreatePaymentService createPaymentService;

    @PostMapping("/create")
    public PaymentResponse createPayment(@Valid @RequestBody PaymentRequest paymentRequest) {
        return createPaymentService.createPayment(paymentRequest);
    }

    @GetMapping("/{paymentId}")
    public PaymentResponse getPayment(@PathVariable Long paymentId) {
        return createPaymentService.getPayment(paymentId);
    }

    @GetMapping("/allPayments")
    public Page<PaymentResponse> getAllPayments(Pageable pageable) {
        return createPaymentService.getAllPayments(pageable);
    }
}

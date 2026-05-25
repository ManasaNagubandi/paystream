package com.paystream.payment_service.service;

import com.paystream.payment_service.dto.PaymentRequest;
import com.paystream.payment_service.dto.PaymentResponse;
import com.paystream.payment_service.entity.Payment;
import com.paystream.payment_service.exception.PaymentNotFoundException;
import com.paystream.payment_service.mapper.PaymentMapper;
import com.paystream.payment_service.repository.PaymentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CreatePaymentServiceImpl implements CreatePaymentService{

    private static final String SUCCESS_STATUS = "SUCCESS";
    private final PaymentRepository paymentRepository;

    public CreatePaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public PaymentResponse createPayment(PaymentRequest paymentRequest) {

        Payment payment = Payment.builder()
                .sender(paymentRequest.getSender())
                .receiver(paymentRequest.getReceiver())
                .amount(paymentRequest.getAmount())
                .status(SUCCESS_STATUS)
                .build();

        Payment savedPayment = paymentRepository.save(payment);

        return PaymentMapper.paymentResponse(savedPayment);
    }

    @Override
    public PaymentResponse getPayment(Long paymentId) {
        Payment payment = paymentRepository.findById(paymentId).orElseThrow(() -> new PaymentNotFoundException(paymentId));
        return PaymentMapper.paymentResponse(payment);
    }

    @Override
    public Page<PaymentResponse> getAllPayments(Pageable pageable) {
        return paymentRepository.findAll(pageable)
                .map(payment -> PaymentMapper.paymentResponse(payment));
    }
}

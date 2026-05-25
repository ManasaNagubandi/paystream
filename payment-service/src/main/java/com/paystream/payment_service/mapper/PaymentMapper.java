package com.paystream.payment_service.mapper;

import com.paystream.payment_service.dto.PaymentResponse;
import com.paystream.payment_service.entity.Payment;

public class PaymentMapper {

    public static PaymentResponse paymentResponse(Payment payment) {
        return PaymentResponse.builder()
                .id(payment.getId())
                .sender(payment.getSender())
                .receiver(payment.getReceiver())
                .amount(payment.getAmount())
                .status(payment.getStatus())
                .build();
    }
}

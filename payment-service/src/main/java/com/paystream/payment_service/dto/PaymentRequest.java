package com.paystream.payment_service.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NonNull;

@Data
public class PaymentRequest {

    @NonNull
    private String sender;

    @NonNull
    private String receiver;

    @Positive
    private Double amount;
}

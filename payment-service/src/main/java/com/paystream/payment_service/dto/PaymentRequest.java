package com.paystream.payment_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PaymentRequest {

    @NotBlank
    private String sender;

    @NotBlank
    private String receiver;

    @Positive
    private Double amount;
}

package com.paystream.payment_service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentResponse {

    private Long id;

    private String sender;

    private String receiver;

    private Double amount;

    private String status;
}

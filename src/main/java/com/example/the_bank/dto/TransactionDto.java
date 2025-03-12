package com.example.the_bank.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransactionDto {
    String transactionType;
    BigDecimal amount;
    String accountNumber;
    String status;
}



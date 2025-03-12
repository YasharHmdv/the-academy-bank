package com.example.the_bank.service;

import com.example.the_bank.dto.TransactionDto;
import com.example.the_bank.entity.Transaction;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}

package com.example.transaction_demo.service;

import com.example.transaction_demo.entity.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Transaction transaction);
    List<Transaction> readTransaction();
    String updateTransaction(Long id, Transaction transaction);

    String deleteTransaction(Long id);
}

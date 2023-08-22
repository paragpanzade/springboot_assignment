package com.example.transaction_demo.repository;

import com.example.transaction_demo.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}

package com.example.transaction_demo.controller;

import com.example.transaction_demo.entity.Transaction;
import com.example.transaction_demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @PostMapping("/create")
    public ResponseEntity<Transaction> createProduct(@RequestBody Transaction transaction){
        return ResponseEntity.ok().body(this.transactionService.createTransaction(transaction));
    }
    @GetMapping("/read")
    public List<Transaction> readProduct(){
        return this.transactionService.readTransaction();
    }

    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") Long id, @RequestBody Transaction transaction){
        return this.transactionService.updateTransaction(id, transaction);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        return this.transactionService.deleteTransaction(id);
    }
}

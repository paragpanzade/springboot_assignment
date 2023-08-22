package com.example.transaction_demo.serviceImpl;

import com.example.transaction_demo.entity.Transaction;
import com.example.transaction_demo.repository.TransactionRepository;
import com.example.transaction_demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository trans_repo;
    @Override
    public Transaction createTransaction(Transaction transaction) {
        return trans_repo.save(transaction);
    }

    @Override
    public List<Transaction> readTransaction() {
        return trans_repo.findAll();
    }

    @Override
    public String updateTransaction(Long id, Transaction transaction) {
        if (trans_repo.existsById(id)){
            trans_repo.save(transaction);
            return "Transaction Updated Successfully.";
        }
        else {
            return "Data not found!!!";
        }
    }

    @Override
    public String deleteTransaction(Long id) {
        if (trans_repo.existsById(id)){
            trans_repo.deleteById(id);
            return "Transaction Delete Successfully.";
        }
        else {
            return "Data not found!!!";
        }
    }
}

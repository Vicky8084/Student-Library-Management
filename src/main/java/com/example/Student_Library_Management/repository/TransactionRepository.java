package com.example.Student_Library_Management.repository;

import com.example.Student_Library_Management.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}

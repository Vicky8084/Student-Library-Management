package com.Library.StudentLibraryManagementDatabaseSystem.repository;

import com.Library.StudentLibraryManagementDatabaseSystem.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}

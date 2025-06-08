package com.Library.StudentLibraryManagementDatabaseSystem.converter;

import com.Library.StudentLibraryManagementDatabaseSystem.model.Transaction;
import com.Library.StudentLibraryManagementDatabaseSystem.requestDto.TransactionRequestDto;

public class TransactionConverter {
    public static Transaction convertTransactionRequestDtoIntoTransaction(TransactionRequestDto transactionRequestDto){
        Transaction transaction=new Transaction();
        transaction.setDueDate(transactionRequestDto.getDueDate());
        transaction.setFine(transactionRequestDto.getFine());
        transaction.setTransactionType(transactionRequestDto.getTransactionType());
        return transaction;
    }
}

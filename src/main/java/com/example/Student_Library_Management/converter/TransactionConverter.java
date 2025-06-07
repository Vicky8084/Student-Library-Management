package com.example.Student_Library_Management.converter;

import com.example.Student_Library_Management.model.Transaction;
import com.example.Student_Library_Management.requestDto.TransactionRequestDto;

public class TransactionConverter {

    public static Transaction convertTransactionRequestDtoIntoTransaction(TransactionRequestDto transactionRequestDto){
        Transaction transaction=new Transaction();
        transaction.setDueDate(transactionRequestDto.getDueDate());
        transaction.setFine(transactionRequestDto.getFine());
        transaction.setTransactionType(transactionRequestDto.getTransactionType());

        return transaction;
    }
}

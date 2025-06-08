package com.Library.StudentLibraryManagementDatabaseSystem.requestDto;

import com.Library.StudentLibraryManagementDatabaseSystem.enums.TransactionType;

public class TransactionRequestDto {

    private String dueDate;
    private int fine;
    private TransactionType transactionType;
    private int cardId;
    private int BookId;

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }
}

package com.Library.StudentLibraryManagementDatabaseSystem.model;

import com.Library.StudentLibraryManagementDatabaseSystem.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "transaction_date",nullable = false)
    @CreationTimestamp
    private String transactionDate;

    @Column(name = "due_date",nullable = false)
    private String dueDate;

    @Column(name = "fine",nullable = false)
    private int fine;

    @Column(name = "transaction_type",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private TransactionType transactionType;

    @JsonBackReference
    @JoinColumn
    @ManyToOne
    private Card card;

    @JsonBackReference
    @JoinColumn
    @ManyToOne
    private Book book;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

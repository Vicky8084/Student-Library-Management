package com.demo.Example.Student_Library_Management.model;

import com.demo.Example.Student_Library_Management.enums.TransactionType;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="transaction_date",nullable = false)
    private Date transactionDate;

    @Column(name="fine")
    private double fine;

    @Column(name="due_date",nullable = false)
    private  String dueDate;

    @Column(name="transaction_type",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private TransactionType transactionType;
}

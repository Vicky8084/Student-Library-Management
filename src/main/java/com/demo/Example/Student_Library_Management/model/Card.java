package com.demo.Example.Student_Library_Management.model;

import com.demo.Example.Student_Library_Management.enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name="card")
public class Card {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="card_status",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    @Column(name="blood_group",nullable = false)
    private String bloodGroup;

    @Column(name="created_data",nullable = false)
    @CreationTimestamp
    private Date createdDate;

    @Column(name="update_date",nullable = false)
    @UpdateTimestamp
    private Date updateDate;
}

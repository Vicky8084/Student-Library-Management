package com.Library.StudentLibraryManagementDatabaseSystem.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="card_status",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private String cardStatus;

    @Column(name="created_date",nullable = false)
    @CreationTimestamp
    private String createdate;

    @Column(name="update_date",nullable = false)
    @UpdateTimestamp
    private String updateDate;
}

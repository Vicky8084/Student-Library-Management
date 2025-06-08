package com.Library.StudentLibraryManagementDatabaseSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="email",unique = true)
    private String email;

    @Column(name="mobile_number",unique = true)
    private String mobileNumer;

    @Column(name="address",nullable = false)
    private String address;
}

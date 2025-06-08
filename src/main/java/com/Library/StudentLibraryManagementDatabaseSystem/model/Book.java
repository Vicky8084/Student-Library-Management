package com.Library.StudentLibraryManagementDatabaseSystem.model;

import com.Library.StudentLibraryManagementDatabaseSystem.enums.Category;
import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="title",unique = true)
    private String title;

    @Column(name="publisher_name",nullable = false)
    private String publisherName;

    @Column(name="publish_date",nullable = false)
    private String publishDate;

    @Column(name="price",nullable = false)
    private double price;

    @Column(name="page",nullable = false)
    private int page;


    @Column(name="category",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Category category;

    @Column(name="rackNumber",nullable = false)
    private String rackNumber;

}

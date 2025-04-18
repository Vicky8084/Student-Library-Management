package com.demo.Example.Student_Library_Management.model;

import com.demo.Example.Student_Library_Management.enums.Category;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="book")
public class Book {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="title",nullable = false)
    private String title;

    @Column(name="pages",nullable = false)
    private int pages;

    @Column(name="publisher_name",nullable = false)
    private String publisherName;

    @Column(name="publish_date",nullable = false)
    private String publishDate;

    @Column(name="edition",nullable = false)
    private String edition;

    @Column(name="category",nullable = false)
    @Enumerated(value =EnumType.STRING )
    private Category category;

    @Column(name="price",nullable = false)
    private double price;

    @Column(name="rack_no",nullable = false)
    private String rackNo;

    @Column(name="availability",nullable = false)
    private String availability;
}

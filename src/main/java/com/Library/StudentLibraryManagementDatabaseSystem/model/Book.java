package com.Library.StudentLibraryManagementDatabaseSystem.model;

import com.Library.StudentLibraryManagementDatabaseSystem.enums.Category;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

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

    @Column(name="availability",nullable = false)
    private boolean availability;

    @Column(name="rackNumber",nullable = false)
    private String rackNumber;

    @JsonBackReference
    @JoinColumn
    @ManyToOne
    private Card card;

    @JsonManagedReference
    @OneToMany(mappedBy = "book")
    private List<Transaction> transactionList;

    @JsonBackReference
    @JoinColumn
    @ManyToOne
    private Author author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(String rackNumber) {
        this.rackNumber = rackNumber;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

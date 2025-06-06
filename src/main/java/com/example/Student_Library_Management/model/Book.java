package com.example.Student_Library_Management.model;

import com.example.Student_Library_Management.enums.Category;
import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="title",nullable = false)
    private String title;

    @Column(name="publisher_name",nullable = false)
    private String publisherName;

    @Column(name="publish_date",nullable = false)
    private String publishDate;

    @Column(name="page",nullable = false)
    private int page;

    @Column(name="price",nullable = false)
    private double price;

    @Column(name="availability",nullable = false)
    private Boolean availability;

    @Column(name="category",nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name="rack_number",nullable = false)
    private String rackNumber;

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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(String rackNumber) {
        this.rackNumber = rackNumber;
    }
}

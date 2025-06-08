package com.Library.StudentLibraryManagementDatabaseSystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

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

    @JsonBackReference
    @OneToMany(mappedBy = "author")
    private List<Book> bookList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumer() {
        return mobileNumer;
    }

    public void setMobileNumer(String mobileNumer) {
        this.mobileNumer = mobileNumer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}

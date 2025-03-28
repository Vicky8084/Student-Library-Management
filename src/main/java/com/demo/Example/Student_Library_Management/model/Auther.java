package com.demo.Example.Student_Library_Management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="auther")
public class Auther {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="gender")
    private int gender;

    @Column(name="country")
    private String country;

    @Column(name="rating")
    private  double rating;
}

package com.example.Student_Library_Management.repository;

import com.example.Student_Library_Management.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}

package com.example.Student_Library_Management.repository;

import com.example.Student_Library_Management.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}

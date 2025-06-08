package com.Library.StudentLibraryManagementDatabaseSystem.repository;

import com.Library.StudentLibraryManagementDatabaseSystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}

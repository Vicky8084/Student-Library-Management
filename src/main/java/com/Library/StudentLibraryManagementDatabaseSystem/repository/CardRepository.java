package com.Library.StudentLibraryManagementDatabaseSystem.repository;

import com.Library.StudentLibraryManagementDatabaseSystem.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {
}

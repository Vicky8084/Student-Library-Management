package com.Library.StudentLibraryManagementDatabaseSystem.repository;

import com.Library.StudentLibraryManagementDatabaseSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}

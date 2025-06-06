package com.example.Student_Library_Management.repository;

import com.example.Student_Library_Management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

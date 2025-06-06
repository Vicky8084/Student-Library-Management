package com.example.Student_Library_Management.repository;

import com.example.Student_Library_Management.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer>  {
}

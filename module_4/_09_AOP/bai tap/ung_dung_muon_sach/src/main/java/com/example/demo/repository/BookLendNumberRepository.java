package com.example.demo.repository;

import com.example.demo.model.BookLendNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookLendNumberRepository extends JpaRepository<BookLendNumber,Integer> {
}

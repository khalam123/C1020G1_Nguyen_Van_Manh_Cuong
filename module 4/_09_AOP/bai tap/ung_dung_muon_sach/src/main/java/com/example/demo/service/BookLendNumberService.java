package com.example.demo.service;

import com.example.demo.model.BookLendNumber;

import java.util.List;

public interface BookLendNumberService {
    List<BookLendNumber> findAll();
    void save(BookLendNumber bookLendNumber);
}

package com.example.demo.service.impl;

import com.example.demo.model.BookLendNumber;
import com.example.demo.repository.BookLendNumberRepository;
import com.example.demo.service.BookLendNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookLendNumberServiceImpl implements BookLendNumberService {

    @Autowired
    private BookLendNumberRepository bookLendNumberRepository;

    @Override
    public List<BookLendNumber> findAll() {
        return bookLendNumberRepository.findAll();
    }

    @Override
    public void save(BookLendNumber bookLendNumber) {
        bookLendNumberRepository.save(bookLendNumber);
    }

}

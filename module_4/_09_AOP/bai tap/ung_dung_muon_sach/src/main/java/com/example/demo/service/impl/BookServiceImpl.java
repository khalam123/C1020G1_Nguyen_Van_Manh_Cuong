package com.example.demo.service.impl;

import com.example.demo.model.Book;
import com.example.demo.model.BookLendNumber;
import com.example.demo.repository.BookLendNumberRepository;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookLendNumberRepository bookLendNumberRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }


    @Override
    public Book findById(Integer id){
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public String borrow(Integer id) throws Exception {
        Book book = findById(id);
        if (book.getCount() == 0) {
            throw new Exception("Out of Book !");
        } else {
            book.setCount(book.getCount() - 1);
            BookLendNumber bookLendNumber = new BookLendNumber();
            bookLendNumber.setId((int) (Math.random() * 100));
            bookLendNumber.setLendNumber((int) ((Math.random() * 99999) + 10000));
            bookLendNumberRepository.save(bookLendNumber);
            return String.valueOf(bookLendNumber.getLendNumber());
        }
    }

    @Override
    public String giveBack(Integer lendNumber, Integer id) {
        List<BookLendNumber> bookLendNumberList = bookLendNumberRepository.findAll();
        boolean check = false;
        for (BookLendNumber bookLendNumber : bookLendNumberList) {
            if (bookLendNumber.getLendNumber().equals(lendNumber)) {
                check = true;
                Book book = findById(id);
                book.setCount(book.getCount() + 1);
                this.bookLendNumberRepository.delete(bookLendNumber);
                break;
            }
        }
        if (check) {
            return "Give Back Complete !";
        } else {
            return "Book Lend Number is not exist !";
        }
    }
}

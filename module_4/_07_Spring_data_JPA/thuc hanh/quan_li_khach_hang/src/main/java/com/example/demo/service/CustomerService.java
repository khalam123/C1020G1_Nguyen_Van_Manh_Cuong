package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(int id);
    void save(Customer customer);
    void remove(int id);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

}

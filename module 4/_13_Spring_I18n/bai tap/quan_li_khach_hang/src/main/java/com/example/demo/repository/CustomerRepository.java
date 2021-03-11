package com.example.demo.repository;

import com.example.demo.model.Customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

}

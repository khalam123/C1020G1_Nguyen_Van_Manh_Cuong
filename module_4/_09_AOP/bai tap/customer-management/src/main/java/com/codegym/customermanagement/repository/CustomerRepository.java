package com.codegym.customermanagement.repository;

import com.codegym.customermanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

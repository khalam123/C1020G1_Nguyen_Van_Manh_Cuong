package case_study.service;

import case_study.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
    Customer findById(Integer id);
    void save(Customer customer);
    void remove(Integer id);
}

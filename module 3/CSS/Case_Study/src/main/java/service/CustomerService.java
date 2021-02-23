package service;

import bean.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    void update(Customer customer);
    List<Customer> findAll();
    Customer findById(String id);
    List<Customer> selectAllCustomer();
    void deleteCustomer(String id);
    List<Customer> search(String id);
//    String callTransaction();
}

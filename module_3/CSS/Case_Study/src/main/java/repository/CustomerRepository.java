package repository;

import bean.Customer;

import java.util.List;

public interface CustomerRepository {
    void save(Customer customer);
    void update(Customer customer);
    List<Customer> findAll();
    List<Customer> selectAllCustomer();
    Customer findById(String id);
    void deleteCustomer(String id);
    List<Customer> search(String id);
    String callTransaction();
}

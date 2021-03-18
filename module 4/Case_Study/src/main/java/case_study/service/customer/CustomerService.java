package case_study.service.customer;

import case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    List<Customer> findAll();
    Customer findById(Integer id);
    void save(Customer customer);
    void remove(Integer id);
    Page<Customer> findAllInputText(String keyword, Pageable pageable);
}

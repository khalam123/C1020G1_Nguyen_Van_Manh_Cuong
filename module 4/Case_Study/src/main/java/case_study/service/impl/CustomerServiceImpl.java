package case_study.service.impl;

import case_study.model.Customer;
import case_study.repository.CustomerReposiroty;
import case_study.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerReposiroty customerReposiroty;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerReposiroty.findAll(pageable);
    }

    @Override
    public List<Customer> findAll() {
        return customerReposiroty.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerReposiroty.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerReposiroty.save(customer);
    }

    @Override
    public void remove(Integer id) {
        customerReposiroty.deleteById(id);
    }
}

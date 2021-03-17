package case_study.repository.customer;

import case_study.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReposiroty extends JpaRepository<Customer,Integer> {
//    Page<Customer> findAllByTextContaining(String text, Pageable pageable);
}

package case_study.repository;

import case_study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReposiroty extends JpaRepository<Customer,Integer> {
//    Page<Customer> findAllByTextContaining(String text, Pageable pageable);
}

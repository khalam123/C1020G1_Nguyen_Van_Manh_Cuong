package case_study.repository;

import case_study.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReposiroty extends JpaRepository<Customer,Integer> {
}

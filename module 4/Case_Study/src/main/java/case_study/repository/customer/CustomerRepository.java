package case_study.repository.customer;

import case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query(value = "select * " +
            "from customer c " +
            "where concat(c.name,c.gender ,c.id_card,c.phone,c.email) like %?1%",
            nativeQuery = true)
    Page<Customer> findAllInputText(String keyword, Pageable pageable);
}

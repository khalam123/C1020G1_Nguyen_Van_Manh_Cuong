package case_study.repository.employee;

import case_study.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value = "select * " +
            "from employee e " +
            "where concat(e.name,e.address,e.id_card,e.phone,e.email) like %?1%",
            nativeQuery = true)
    Page<Employee> findAllInputText(String keyword, Pageable pageable);
}

package case_study.service.employee;

import case_study.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    List<Employee> findAll();
    Employee findById(Integer id);
    void save(Employee employee);
    void remove(Integer id);
}

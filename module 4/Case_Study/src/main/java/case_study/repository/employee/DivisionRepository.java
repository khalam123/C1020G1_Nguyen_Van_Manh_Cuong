package case_study.repository.employee;

import case_study.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division,Integer> {
}

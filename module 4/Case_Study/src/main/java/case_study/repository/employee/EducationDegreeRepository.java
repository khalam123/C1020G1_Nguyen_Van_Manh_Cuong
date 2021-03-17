package case_study.repository.employee;

import case_study.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationDegreeRepository extends JpaRepository<EducationDegree, Integer> {
}

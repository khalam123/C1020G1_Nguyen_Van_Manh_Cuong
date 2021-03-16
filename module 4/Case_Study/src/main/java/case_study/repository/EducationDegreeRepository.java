package case_study.repository;

import case_study.model.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationDegreeRepository extends JpaRepository<EducationDegree, Integer> {
}

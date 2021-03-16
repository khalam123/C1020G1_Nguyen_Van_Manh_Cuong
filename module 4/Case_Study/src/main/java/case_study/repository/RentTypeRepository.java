package case_study.repository;

import case_study.model.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentTypeRepository extends JpaRepository<RentType,Integer> {
}

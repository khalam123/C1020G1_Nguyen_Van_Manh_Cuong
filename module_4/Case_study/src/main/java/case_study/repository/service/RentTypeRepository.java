package case_study.repository.service;

import case_study.model.service.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentTypeRepository extends JpaRepository<RentType,Integer> {
}

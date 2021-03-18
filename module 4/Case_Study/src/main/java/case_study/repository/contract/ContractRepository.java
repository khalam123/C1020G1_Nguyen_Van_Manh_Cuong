package case_study.repository.contract;

import case_study.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Integer> {

    Page<Contract> findAllByStartDateBeforeAndEndDateAfter(String startDate, String endDate, Pageable pageable);
    @Query(value = "select * " +
            "from contract c " +
            "where concat(c.start_date,c.end_date) like %?1%",
            nativeQuery = true)
    Page<Contract> findAllInputText(String keyword, Pageable pageable);
}

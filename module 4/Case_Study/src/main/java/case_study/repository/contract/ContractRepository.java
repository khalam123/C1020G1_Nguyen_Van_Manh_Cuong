package case_study.repository.contract;

import case_study.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract,Integer> {

    Page<Contract> findAllByContractStartDateBeforeAndContractEndDateAfter(String startDate, String endDate, Pageable pageable);
}

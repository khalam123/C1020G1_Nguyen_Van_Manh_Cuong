package case_study.service.contract;

import case_study.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractService {
    Page<Contract> findAllByContract(String str, Pageable pageable);
    List<Contract> findAll();
    Contract findById(Integer id);
    void save(Contract contract);
}

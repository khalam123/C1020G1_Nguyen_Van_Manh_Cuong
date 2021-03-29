package case_study.service.contract;

import case_study.model.contract.ContractDetail;

import java.util.List;

public interface ContractDetailService {
    List<ContractDetail> findAll();
    ContractDetail findById(Integer id);
    void save(ContractDetail contractDetail);
}

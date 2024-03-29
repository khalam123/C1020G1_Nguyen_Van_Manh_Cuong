package case_study.service.contract.impl;

import case_study.model.contract.AttachService;
import case_study.repository.contract.AttachServiceRepository;
import case_study.service.contract.AttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceServiceImpl implements AttachServiceService {
    @Autowired
    private AttachServiceRepository attachServiceRepository;
    @Override
    public List<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }
}

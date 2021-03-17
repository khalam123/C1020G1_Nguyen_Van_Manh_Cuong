package case_study.service.impl;

import case_study.model.ServiceResort;
import case_study.repository.ServiceResortRepository;
import case_study.service.ServiceResortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceResortServiceImpl implements ServiceResortService {
    @Autowired
    private ServiceResortRepository serviceResortRepository;
    @Override
    public Page<ServiceResort> findAll(Pageable pageable) {
        return serviceResortRepository.findAll(pageable);
    }

    @Override
    public List<ServiceResort> findAll() {
        return serviceResortRepository.findAll();
    }

    @Override
    public ServiceResort findById(Integer id) {
        return serviceResortRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ServiceResort serviceResort) {
        serviceResortRepository.save(serviceResort);
    }
}

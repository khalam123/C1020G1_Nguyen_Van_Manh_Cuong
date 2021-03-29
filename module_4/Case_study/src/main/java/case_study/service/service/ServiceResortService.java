package case_study.service.service;

import case_study.model.service.ServiceResort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceResortService  {
    Page<ServiceResort> findAll(Pageable pageable);
    List<ServiceResort> findAll();
    ServiceResort findById(Integer id);
    void save(ServiceResort serviceResort);
}

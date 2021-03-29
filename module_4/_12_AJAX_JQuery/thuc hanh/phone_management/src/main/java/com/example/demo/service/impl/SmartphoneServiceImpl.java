package com.example.demo.service.impl;

import com.example.demo.model.SmartPhone;
import com.example.demo.repository.SmartphoneRepository;
import com.example.demo.service.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {

    @Autowired
    private SmartphoneRepository smartphoneRepository;
    @Override
    public Iterable<SmartPhone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public SmartPhone findById(Integer id) {
        return smartphoneRepository.findById(id).orElse(null);
    }

    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        return smartphoneRepository.save(smartPhone);
    }

    @Override
    public SmartPhone remove(Integer id) {
        SmartPhone smartPhone = findById(id);
        smartphoneRepository.deleteById(id);
        return smartPhone;
    }
}

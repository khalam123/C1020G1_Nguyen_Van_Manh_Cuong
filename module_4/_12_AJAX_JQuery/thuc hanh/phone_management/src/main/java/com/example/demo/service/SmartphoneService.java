package com.example.demo.service;

import com.example.demo.model.SmartPhone;

public interface SmartphoneService {
    Iterable<SmartPhone> findAll();
    SmartPhone findById(Integer id);
    SmartPhone save(SmartPhone smartPhone);
    SmartPhone remove(Integer id);

}

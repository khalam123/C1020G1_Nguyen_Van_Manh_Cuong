package com.example.demo.repository;

import com.example.demo.model.SmartPhone;
import org.springframework.data.repository.CrudRepository;

public interface SmartphoneRepository extends CrudRepository<SmartPhone, Integer> {
}

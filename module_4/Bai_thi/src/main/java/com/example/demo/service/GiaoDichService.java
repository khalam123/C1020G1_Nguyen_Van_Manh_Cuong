package com.example.demo.service;

import com.example.demo.model.GiaoDich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GiaoDichService {
    Page<GiaoDich> findAll(Pageable pageable);
    List<GiaoDich> findAll();
    GiaoDich findById(Integer id);
    void save(GiaoDich giaoDich);
    void remove(Integer id);
    Page<GiaoDich> findAllInputText(String keyword, Pageable pageable);
}

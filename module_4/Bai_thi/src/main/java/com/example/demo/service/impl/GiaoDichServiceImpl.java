package com.example.demo.service.impl;

import com.example.demo.model.GiaoDich;
import com.example.demo.repository.GiaoDichRepository;
import com.example.demo.service.GiaoDichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiaoDichServiceImpl implements GiaoDichService {
    @Autowired
    private GiaoDichRepository giaoDichRepository;

    @Override
    public Page<GiaoDich> findAll(Pageable pageable) {
        return giaoDichRepository.findAll(pageable);
    }

    @Override
    public List<GiaoDich> findAll() {
        return giaoDichRepository.findAll();
    }

    @Override
    public GiaoDich findById(Integer id) {
        return giaoDichRepository.findById(id).orElse(null);
    }

    @Override
    public void save(GiaoDich giaoDich) {
        giaoDichRepository.save(giaoDich);
    }

    @Override
    public void remove(Integer id) {
        giaoDichRepository.deleteById(id);
    }

    @Override
    public Page<GiaoDich> findAllInputText(String keyword, Pageable pageable) {
        return giaoDichRepository.findAllInputText(keyword,pageable);
    }
}

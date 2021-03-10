package com.example.demo.service;

import com.example.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
//    Iterable<Category> findAll();
    List<Category> findAll();
    Category findById(int id);
    void save(Category category);
    void remove(int id);
    Page<Category> findAll(Pageable pageable);
}

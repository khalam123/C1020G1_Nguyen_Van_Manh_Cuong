package com.example.demo.service;

import com.example.demo.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();
    Category findById(int id);
    void save(Category category);
    void remove(int id);
}

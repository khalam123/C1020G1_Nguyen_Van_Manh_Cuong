package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;


public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    Blog findById(int id);
    void save(Blog blog);
    void remove(int id);
    Page<Blog> findAllTextContaining(String text,Pageable pageable);
}

package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.List;


public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    List<Blog> findAll();

    Blog findById(int id);
    void save(Blog blog);
    void remove(int id);
    Page<Blog> findAllTextContaining(String text,Pageable pageable);
    List<Blog> findAllTextContaining(String text);
}

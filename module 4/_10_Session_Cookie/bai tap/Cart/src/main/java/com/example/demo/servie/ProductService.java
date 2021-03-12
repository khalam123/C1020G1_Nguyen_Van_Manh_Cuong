package com.example.demo.servie;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
    Iterable<Product> findAll();

    Product findById(Integer id);

    void save(Product product);

    void remove(Integer id);

    void deleteProduct(Integer id, List<Product> productList);

    void removeAll(List<Product> productList);
}

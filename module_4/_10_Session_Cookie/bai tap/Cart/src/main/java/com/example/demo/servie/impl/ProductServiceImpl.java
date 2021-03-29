package com.example.demo.servie.impl;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.servie.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public void deleteProduct(Integer id, List<Product> productList) {
        int posProduct = -1;
        for (int i = 0; i < productList.size(); i++){
            if (id == productList.get(i).getId()) {
                posProduct = i;
                break;
            }
        }
        productList.remove(posProduct);
    }

    @Override
    public void removeAll(List<Product> productList) {
        if (productList.size() != 0){
            productList.removeAll(new ArrayList<>());
        }
    }
}

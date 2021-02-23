package service;

import bean.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    void update(Product product);
    List<Product> findAll();
    void deleteProduct(int id);
}

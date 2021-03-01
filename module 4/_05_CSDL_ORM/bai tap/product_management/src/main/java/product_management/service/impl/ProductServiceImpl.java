package product_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product_management.model.Product;
import product_management.repository.ProductRepository;
import product_management.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return this.productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void update(Integer id, Product product) {
        productRepository.update(id,product);
    }

    @Override
    public void remove(Integer id) {
        productRepository.remove(id);
    }
}

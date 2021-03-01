package product_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product_management.model.Product;
import product_management.repository.ProductRepository;
import product_management.service.ProductService;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    private static Map<Integer, Product> productMap;

    static {
        productMap = new TreeMap<>();
        productMap.put(1, new Product(1, "Iphone 8", 3000));
        productMap.put(2, new Product(2, "Iphone X", 4000));
        productMap.put(3, new Product(3, "Iphone 11", 5000));
    }

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
//        Integer id = (int) (Math.random() * 1000);
//        student.setId(id);
//
//        studentMap.put(id, student);
        this.productRepository.save(product);
    }
}

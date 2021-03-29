package service.Impl;

import bean.Product;
import responsitory.Impl.ProductRepositoryImpl;
import responsitory.ProductRepository;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductRepositoryImpl();
    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }


    @Override
    public void deleteProduct(int id) {
        productRepository.deleteProduct(id);
    }

}

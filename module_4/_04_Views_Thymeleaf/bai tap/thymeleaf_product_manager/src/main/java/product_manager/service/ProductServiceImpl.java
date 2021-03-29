package product_manager.service;

import org.springframework.stereotype.Service;
import product_manager.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone", "Apple", "USA"));
        products.put(2, new Product(2, "MacBook", "Apple", "USA"));
        products.put(3, new Product(3, "SamSung", "SamSung", "Korea"));
        products.put(4, new Product(4, "V-mart Phone", "Vin Group", "VN"));
        products.put(5, new Product(5, "Xiaomi", "Xiaomi", "Chinese"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}

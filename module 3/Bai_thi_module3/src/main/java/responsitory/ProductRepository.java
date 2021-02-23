package responsitory;

import bean.Product;

import java.util.List;

public interface ProductRepository {
    void save(Product product);
    void update(Product product);
    List<Product> findAll();
    void deleteProduct(int id);
}

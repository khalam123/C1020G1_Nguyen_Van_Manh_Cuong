package product_management.repository.impl;

import org.springframework.stereotype.Repository;
import product_management.model.Product;
import product_management.repository.ProductRepository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery =
                BaseRepository.entityManager.createQuery("select p from product p", Product.class);

        return typedQuery.getResultList();
    }

    @Override
    public Product findById(Integer id) {
        return BaseRepository.entityManager.find(Product.class, id);
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }
}

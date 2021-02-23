package responsitory.Impl;

import bean.Product;
import responsitory.ProductRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private BaseRepository baseRepository = new BaseRepository();

    private static final String INSERT_SQL = "insert into product" + " (product_name," +
            "product_price,product_discount,product_stock) " +
            " values" + "(?,?,?,?)";

    private final String SQL_FIND_ALL = "select * " +
            "from product";
    @Override
    public void save(Product product) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(INSERT_SQL);
            preparedStatement.setString(1, product.getProduct_name());
            preparedStatement.setInt(2, product.getProduct_price());
            preparedStatement.setInt(3, product.getProduct_discount());
            preparedStatement.setInt(4, product.getProduct_stock());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement(SQL_FIND_ALL);

            ResultSet resultSet = preparedStatement.executeQuery();

            Product product = null;
            while (resultSet.next()) {
                product = new Product();
                product.setProduct_name(resultSet.getString("product_name"));
                product.setProduct_price(resultSet.getInt("product_price"));
                product.setProduct_discount(resultSet.getInt("product_discount"));
                product.setProduct_stock(resultSet.getInt("product_stock"));

                productList.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }

    @Override
    public void deleteProduct(int id) {

    }
}

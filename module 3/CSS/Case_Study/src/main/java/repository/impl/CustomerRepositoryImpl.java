package repository.impl;

import bean.Customer;
import repository.CustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CustomerRepositoryImpl implements CustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();

    private static Map<Integer, Customer> customerMap = new TreeMap<>();

    private final String SQL_FIND_ALL = "select customer_id, customer_name, customer_birthday, customer_gender, customer_id_card," +
            "customer_phone, customer_email, customer_address, customer_type " +
            "from customer";
    private final String SQL_FIND_BY_ID = "select * " +
            "from customer " +
            "where customer_id = ? ";
    private static final String INSERT_SQL = "insert into customer" + " (customer_id,customer_name," +
        "customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type) " +
        " values" + "(?,?,?,?,?,?,?,?,?)";
    private static final String SELECT_ALL_CUSTOMER = "select * from customer ";
    private static final String DELETE_CUSTOMER_SQL = "delete from customer where customer_id =?";
    private static final String UPDATE_CUSTOMER = "update customer set customer_name=?,customer_birthday=?," +
            "customer_gender=?,customer_id_card=?,customer_phone=?,customer_email=?,customer_address=?,customer_type=? where customer_id = ?";
    private static final String SEARCH = "select * from customer where customer_id =?";
    @Override
    public void save(Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(INSERT_SQL);
            preparedStatement.setString(1, customer.getCustomer_id());
            preparedStatement.setString(2, customer.getCustomer_name());
            preparedStatement.setString(3, customer.getCustomer_birthday());
            preparedStatement.setString(4, customer.getCustomer_gender());
            preparedStatement.setString(5, customer.getCustomer_id_card());
            preparedStatement.setString(6, customer.getCustomer_phone());
            preparedStatement.setString(7, customer.getCustomer_email());
            preparedStatement.setString(8, customer.getCustomer_address());
            preparedStatement.setString(9, customer.getCustomer_type());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Customer customer) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection().prepareStatement(UPDATE_CUSTOMER);
            preparedStatement.setString(1, customer.getCustomer_name());
            preparedStatement.setString(2, customer.getCustomer_birthday());
            preparedStatement.setString(3, customer.getCustomer_gender());
            preparedStatement.setString(4, customer.getCustomer_id_card());
            preparedStatement.setString(5, customer.getCustomer_phone());
            preparedStatement.setString(6, customer.getCustomer_email());
            preparedStatement.setString(7, customer.getCustomer_address());
            preparedStatement.setString(8, customer.getCustomer_type());
            preparedStatement.setString(9, customer.getCustomer_id());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement(SQL_FIND_ALL);

            ResultSet resultSet = preparedStatement.executeQuery();

            // bufferedReader.readLine()
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomer_id(resultSet.getString("customer_id"));
                customer.setCustomer_name(resultSet.getString("customer_name"));
                customer.setCustomer_birthday(resultSet.getString("customer_birthday"));
                customer.setCustomer_gender(resultSet.getString("customer_gender"));
                customer.setCustomer_id_card(resultSet.getString("customer_id_card"));
                customer.setCustomer_phone(resultSet.getString("customer_phone"));
                customer.setCustomer_email(resultSet.getString("customer_email"));
                customer.setCustomer_address(resultSet.getString("customer_address"));
                customer.setCustomer_type(resultSet.getString("customer_type"));

                customerList.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerList;
    }



    @Override
    public Customer findById(String id) {
        Customer customer = new Customer();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement(SQL_FIND_BY_ID);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                customer.setCustomer_id(resultSet.getString("customer_id"));
                customer.setCustomer_name(resultSet.getString("customer_name"));
                customer.setCustomer_birthday(resultSet.getString("customer_birthday"));
                customer.setCustomer_gender(resultSet.getString("customer_gender"));
                customer.setCustomer_id_card(resultSet.getString("customer_id_card"));
                customer.setCustomer_phone(resultSet.getString("customer_phone"));
                customer.setCustomer_email(resultSet.getString("customer_email"));
                customer.setCustomer_address(resultSet.getString("customer_address"));
                customer.setCustomer_type(resultSet.getString("customer_type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public void deleteCustomer(String id) {
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = this.baseRepository.getConnection().prepareStatement(DELETE_CUSTOMER_SQL);
            preparedStatement.setString(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> search(String id) {
        List<Customer> customer = new ArrayList<>();
        try{
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SEARCH);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer1 = null;
            while(resultSet.next()){
                customer1 = new Customer();
                customer1.setCustomer_id(resultSet.getString("customer_id"));
                customer1.setCustomer_name(resultSet.getString("customer_name"));
                customer1.setCustomer_birthday(resultSet.getString("customer_birthday"));
                customer1.setCustomer_gender(resultSet.getString("customer_gender"));
                customer1.setCustomer_id_card(resultSet.getString("customer_id_card"));
                customer1.setCustomer_phone(resultSet.getString("customer_phone"));
                customer1.setCustomer_email(resultSet.getString("customer_email"));
                customer1.setCustomer_address(resultSet.getString("customer_address"));
                customer1.setCustomer_type(resultSet.getString("customer_type"));
                customer.add(customer1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        try {
             preparedStatement =
                    this.baseRepository.getConnection().prepareStatement(SQL_FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;

            while (resultSet.next()) {
                customer = new Customer();
                String id =resultSet.getString("customer_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String id_card = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                String customer_type = resultSet.getString("customer_type");
                customers.add(new Customer(id,name,birthday,gender,id_card,phone,email,address,customer_type));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }


    @Override
    public String callTransaction() {
        return null;
    }
}

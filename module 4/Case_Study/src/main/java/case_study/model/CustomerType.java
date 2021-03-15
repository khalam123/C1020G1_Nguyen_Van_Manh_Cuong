package case_study.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerType_id;
    private String customerType_name;

    @OneToMany(mappedBy = "customerType", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(Integer customerType_id, String customerType_name, List<Customer> customers) {
        this.customerType_id = customerType_id;
        this.customerType_name = customerType_name;
        this.customers = customers;
    }

    public Integer getCustomerType_id() {
        return customerType_id;
    }

    public void setCustomerType_id(Integer customerType_id) {
        this.customerType_id = customerType_id;
    }

    public String getCustomerType_name() {
        return customerType_name;
    }

    public void setCustomerType_name(String customerType_name) {
        this.customerType_name = customerType_name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}

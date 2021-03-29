package case_study.model.customer;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Pattern(regexp = "(KH\\-+)[0-9]{4}",message = "Customer Code follow format KH-xxxx")
    
    private String customerCode;
    private String name;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String birthday;
    private String gender;

    @Pattern(regexp = "[0-9]{9}", message = "Try again follow format XXXXXXXXX")
    private String id_card;

    @Pattern(regexp = "^(090+|091+|(\\(\\+84\\)(90))+|(\\(\\+84\\)(91))+)[0-9]{7}$", message = "Follow format (+84)90xxxxxxx or 090xxxxxxx")
    private String phone;

    @Email(message = "Try again follow format abc@abc.com")
    private String email;
    private String address;

    @ManyToOne
    @JoinColumn(name = "customerType_id", referencedColumnName = "customerType_id")
    @JsonManagedReference
    private CustomerType customerType;


    public Customer() {
    }

    public Customer(Integer id, @Pattern(regexp = "(KH\\-+)[0-9]{4}", message = "Customer Code follow format KH-xxxx") String customerCode, String name, String birthday, String gender, @Pattern(regexp = "[0-9]{9}", message = "Try again follow format XXXXXXXXX") String id_card, @Pattern(regexp = "^(090+|091+|(\\(\\+84\\)(90))+|(\\(\\+84\\)(91))+)[0-9]{7}$", message = "Follow format (+84)90xxxxxxx or 090xxxxxxx") String phone, @Email(message = "Try again follow format abc@abc.com") String email, String address, CustomerType customerType) {
        this.id = id;
        this.customerCode = customerCode;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.id_card = id_card;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}

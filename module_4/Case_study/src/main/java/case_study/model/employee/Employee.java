package case_study.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @DateTimeFormat(pattern = "dd/MM/yyy")
    private String birthday;

    @Pattern(regexp = "[0-9]{9}", message = "Try again follow format XXXXXXXXX")
    private String id_card;
    @Min(value = 1, message = "Salary must be >0")

    private String salary;
    @Pattern(regexp = "^(090+|091+|(\\(\\+84\\)(90))+|(\\(\\+84\\)(91))+)[0-9]{7}$" , message = "Follow format (+84)90xxxxxxx or 090xxxxxxx")
    private String phone;

    @Email(message = "Try again format email follow abc@abc.com")
    private String email;
    private String address;

    @ManyToOne
    @JoinColumn(name = "position_id",referencedColumnName = "id")
    @JsonManagedReference
    private Position position;

    @ManyToOne
    @JoinColumn(name = "division_id",referencedColumnName = "id")
    @JsonManagedReference
    private Division division;

    @ManyToOne
    @JoinColumn(name = "education_degree_id",referencedColumnName = "id")
    @JsonBackReference
    private EducationDegree educationDegree;

    @OneToOne(mappedBy = "employee")
    private User user;


    public Employee() {
    }

    public Employee(Integer id, String name, String birthday, @Pattern(regexp = "[0-9]{9}", message = "Try again follow format XXXXXXXXX") String id_card, @Min(value = 1, message = "Salary must be >0") String salary, @Pattern(regexp = "^(090+|091+|(\\(\\+84\\)(90))+|(\\(\\+84\\)(91))+)[0-9]{7}$", message = "Follow format (+84)90xxxxxxx or 090xxxxxxx") String phone, @Email(message = "Try again format email follow abc@abc.com") String email, String address, Position position, Division division, EducationDegree educationDegree, User user) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.id_card = id_card;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.position = position;
        this.division = division;
        this.educationDegree = educationDegree;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

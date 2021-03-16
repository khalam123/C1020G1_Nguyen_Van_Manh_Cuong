package case_study.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String birthday;
    private String id_card;
    private String salary;
    private String phone;
    @Email
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

    public Employee() {
    }

    public Employee(Integer id, String name, String birthday, String id_card, String salary, String phone,
                    @Email String email, String address, Position position, Division division, EducationDegree educationDegree) {
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
}

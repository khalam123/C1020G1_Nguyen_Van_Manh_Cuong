package case_study.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double cost;

    @OneToMany(mappedBy = "rentType",cascade = CascadeType.ALL)
    @JsonBackReference
    List<ServiceResort> serviceResorts;


    public RentType() {
    }

    public RentType(Integer id, String name, double cost, List<ServiceResort> serviceResorts) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.serviceResorts = serviceResorts;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<ServiceResort> getServiceResorts() {
        return serviceResorts;
    }

    public void setServiceResorts(List<ServiceResort> serviceResorts) {
        this.serviceResorts = serviceResorts;
    }
}
